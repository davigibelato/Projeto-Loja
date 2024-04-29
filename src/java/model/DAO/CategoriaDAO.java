/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.BEAN.Categoria;

/**
 *
 * @author Joao Guilherme
 */
public class CategoriaDAO {

    public List<Categoria> listarTodos() {
        List<Categoria> categorias = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM categoria");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Categoria c = new Categoria();
                c.setIdCategoria(rs.getInt("idCategoria"));
                c.setNome(rs.getString("nome"));
                categorias.add(c);
            }
            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return categorias;
    }

    private Categoria readById(int id) {
        Categoria c = new Categoria();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM categoria WHERE idCategoria = ?");
            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            if (rs.next()) {
                c.setIdCategoria(id);
                c.setNome(rs.getString("nome"));
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;
    }

    private Categoria readByNome(String nome) {
        Categoria c = new Categoria();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM categoria WHERE nome = ?");
            stmt.setString(1, c.getNome());

            rs = stmt.executeQuery();

            if (rs.next()) {
                c.setIdCategoria(rs.getInt("idCategoria"));
                c.setNome(nome);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;
    }

    private Categoria readByNome(Categoria c) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM categoria WHERE nome = ?");
            stmt.setString(1, c.getNome());

            rs = stmt.executeQuery();

            if (rs.next()) {
                c.setIdCategoria(rs.getInt("idCategoria"));
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }
}
