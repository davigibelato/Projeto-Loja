/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.Connection;
import conexao.Conexao;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.BEAN.Categoria;
import model.BEAN.Produto;

/**
 *
 * @author Joao Guilherme
 */
public class ProdutoDAO {

    public List<Produto> listarTodosDisponiveis() {
        List<Produto> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "SELECT * FROM produto AS p INNER JOIN estoque AS e ON p.idProduto = e.produto WHERE e.quantidade > 0";

            stmt = conexao.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getInt("categoria"));
                p.setValor(rs.getFloat("valor"));
                Blob imagemBlob = rs.getBlob("imagem");
                if (imagemBlob != null) {
                    byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());
                    p.setImagemBytes(imagemBytes);
                }
                produtos.add(p);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return produtos;
    }

    public List<Produto> listarTodos() {
        List<Produto> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "SELECT * FROM produto";

            stmt = conexao.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getInt("categoria"));
                p.setValor(rs.getFloat("valor"));
                Blob imagemBlob = rs.getBlob("imagem");
                if (imagemBlob != null) {
                    byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());
                    p.setImagemBytes(imagemBytes);
                }
                produtos.add(p);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return produtos;
    }

    public List<Produto> listarPorCategoria(Categoria c) {
        List<Produto> produtos = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "SELECT * FROM produto AS p INNER JOIN categoria AS c ON p.categoria = c.idCategoria WHERE c.nome = ?";

            stmt = conexao.prepareStatement(query);
            stmt.setString(1, c.getNome());

            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getInt("categoria"));
                p.setValor(rs.getFloat("valor"));
                Blob imagemBlob = rs.getBlob("imagem");
                if (imagemBlob != null) {
                    byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());
                    p.setImagemBytes(imagemBytes);
                }
                produtos.add(p);
            }
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public List<Produto> listarPorPesquisa(String search) {
        List<Produto> produtos = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produto WHERE nome LIKE '%?%'");
            stmt.setString(1, search);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getInt("categoria"));
                p.setValor(rs.getFloat("valor"));
                Blob imagemBlob = rs.getBlob("imagem");
                if (imagemBlob != null) {
                    byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());
                    p.setImagemBytes(imagemBytes);
                }
                produtos.add(p);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return produtos;
    }

    public void delete(int id) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("DELETE FROM produto WHERE idProduto = ?");
            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt = conexao.prepareStatement("DELETE FROM produto_imagem WHERE produto = ?");
            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean inserirProduto(Produto produto) {
        try (Connection conexao = Conexao.conectar();
                PreparedStatement ps = conexao.prepareStatement("INSERT INTO produto (nome, valor, categoria, imagem) VALUES (?, ?, ?, ?)")) {

            // Defina os parâmetros do PreparedStatement com os valores do produto
            ps.setString(1, produto.getNome());
            ps.setFloat(2, produto.getValor());
            ps.setInt(3, produto.getCategoria());
            ps.setBytes(4, produto.getImagemBytes()); // Defina a imagem como array de bytes

            // Execute o PreparedStatement
            int linhasAfetadas = ps.executeUpdate();

            // Verifique se a inserção foi bem-sucedida (verifique se uma linha foi afetada)
            return linhasAfetadas > 0;

        } catch (SQLException e) {
            // Você pode lidar com a exceção aqui, talvez registrando-a ou lançando-a novamente
            e.printStackTrace();
            return false;
        }
    }

    public Produto readById(int id) {
        Produto p = null;
        try (Connection conexao = Conexao.conectar();
                PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM produto WHERE idProduto = ?")) {

            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    p = new Produto();
                    p.setIdProduto(rs.getInt("idProduto"));
                    p.setNome(rs.getString("nome"));
                    p.setCategoria(rs.getInt("categoria"));
                    p.setValor(rs.getFloat("valor"));

                    Blob imagemBlob = rs.getBlob("imagem");
                    if (imagemBlob != null) {
                        byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());
                        p.setImagemBytes(imagemBytes);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

}
