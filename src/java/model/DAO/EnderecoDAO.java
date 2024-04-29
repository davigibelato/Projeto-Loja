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
import model.BEAN.Endereco;

/**
 *
 * @author Joao Guilherme
 */
public class EnderecoDAO {

    public void create(Endereco end) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO endereco (estado, cidade, cep, rua, numero, complemento) values (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, end.getEstado());
            stmt.setString(2, end.getCidade());
            stmt.setString(3, end.getCep());
            stmt.setString(4, end.getRua());
            stmt.setString(5, end.getNumero());
            stmt.setString(6, end.getComplemento());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public void delete(Endereco end) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareStatement("DELETE FROM endereco WHERE idEndereco = ?");
            stmt.setInt(1, end.getIdEndereco());
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

}
