/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexao.Conexao;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.BEAN.Carrinho;
import model.BEAN.CarrinhoProduto;
import model.BEAN.Produto;
import model.BEAN.Usuario;



/**
 *
 * @author Joao Guilherme
 */
public class CarrinhoDAO {
    
    /*
    Esse método deve retornar todos os produtos de um usuário fornecido como
    parâmetro, portanto deve ser chamado na página que exibe o carrinho.  
    */
    private List<Produto> lerProdutos(Usuario u) {
        
        List<Produto> produtos = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT p.* FROM carrinho_produto AS cp JOIN produto AS p ON cp.produto = p.idProduto"
                    + " JOIN carrinho AS c ON cp.carrinho = c.idCarrinho JOIN usuario AS u ON c.usuario = u.idUsuario WHERE u.idUsuario = ?");
            stmt.setInt(1, u.getIdUsuario());
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setValor(rs.getFloat("valor"));
                p.setCategoria(rs.getInt("categoria"));
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
}
