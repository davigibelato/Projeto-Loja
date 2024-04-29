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
import model.BEAN.Pedido;
import model.BEAN.Usuario;

/**
 *
 * @author Joao Guilherme
 */
public class PedidoDAO {

    /* try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "";
            
            stmt = conexao.prepareStatement(query);
            
            
            rs.close();
            stmt.close();
            conexao.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
                   
        }
     */
    public void create(Pedido p) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO pedido (usuario, endereco_entrega, data_pedido, valor_total) VALUES (?, ?, ?, ?)");
            stmt.setInt(1, p.getUsuario());
            stmt.setInt(2, p.getEndereco_entrega());
            stmt.setTimestamp(3, p.getData_pedido());
            stmt.setFloat(4, p.getValor_total());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public List<Pedido> lerPedidos(Usuario u) {
        List<Pedido> pedidos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM pedido WHERE usuario = ?");
            stmt.setInt(1, u.getIdUsuario());

            rs = stmt.executeQuery();
            while (rs.next()) {
                Pedido p = new Pedido();
                p.setIdPedido(rs.getInt("idPedido"));
                p.setUsuario(rs.getInt("usuario"));
                p.setEndereco_entrega(rs.getInt("endereco_entrega"));
                p.setValor_total(rs.getFloat("valor_total"));
                p.setData_pedido(rs.getTimestamp("data_pedido"));
                pedidos.add(p);
            }
            

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return pedidos;
    }

}
