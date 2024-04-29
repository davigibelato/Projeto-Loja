package model.DAO;

import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.BEAN.Usuario;


public class UsuarioDAO {

    // Função para validar CPF
    private boolean validarCPF(String cpf) {
        // Verifica se o CPF tem 11 dígitos
        if (cpf == null || cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os caracteres são dígitos numéricos
        for (int i = 0; i < cpf.length(); i++) {
            if (!Character.isDigit(cpf.charAt(i))) {
                return false;
            }
        }

        // Verifica se todos os caracteres são iguais (CPF inválido)
        if ((cpf.charAt(0) == cpf.charAt(1)) && (cpf.charAt(1) == cpf.charAt(2)) &&
                (cpf.charAt(2) == cpf.charAt(3)) && (cpf.charAt(3) == cpf.charAt(4)) &&
                (cpf.charAt(4) == cpf.charAt(5)) && (cpf.charAt(5) == cpf.charAt(6)) &&
                (cpf.charAt(6) == cpf.charAt(7)) && (cpf.charAt(7) == cpf.charAt(8)) &&
                (cpf.charAt(8) == cpf.charAt(9)) && (cpf.charAt(9) == cpf.charAt(10))) {
            return false;
        }

        // CPF válido
        return true;
    }

    // Função para validar telefone
    private boolean validarTelefone(String telefone) {
        // Verifica se o telefone tem o formato (XX) XXXX-XXXX
        return telefone.matches("\\(\\d{2}\\)\\s\\d{4}-\\d{4}");
    }

    public Usuario login(Usuario user) {
        Usuario usuarioValido = new Usuario();
        try {
            Connection con = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = con.prepareStatement("SELECT * FROM usuario WHERE nome = ? AND senha = ?");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getSenha());
            rs = stmt.executeQuery();

            if (rs.next()) {
                usuarioValido.setIdUsuario(rs.getInt("idUsuario"));
                usuarioValido.setNome(rs.getString("nome"));
                usuarioValido.setSenha(rs.getString("senha"));
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
            usuarioValido.setIdUsuario(0);
            usuarioValido.setNome("");
            usuarioValido.setSenha("");
        }
        return usuarioValido;
    }

    public Usuario getUsuarioByEmail(String email) {
        Usuario u = new Usuario();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM usuario WHERE email = ?");
            stmt.setString(1, email);

            rs = stmt.executeQuery();

            if (rs.next()) {
                u.setIdUsuario(rs.getInt("idUsuario"));
                u.setNome(rs.getString("nome"));
                u.setEmail(email);
                u.setTelefone(rs.getString("telefone"));
                u.setCpf(rs.getString("cpf"));
            } else {
                System.out.println("Usuario não localizado.");
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return u;
    }

    public void create(Usuario u) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO usuario (nome, email, senha, cpf, telefone) values (?, ?, ?, ?, ?)");
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());
            stmt.setString(4, u.getCpf());
            stmt.setString(5, u.getTelefone());

            stmt.executeUpdate();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Usuario u) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("UPDATE usuario SET nome = ?, email = ?, senha = ?, cpf = ?, telefone = ? WHERE idUsuario = ?");
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());
            stmt.setString(4, u.getCpf());
            stmt.setString(5, u.getTelefone());
            stmt.setInt(6, u.getIdUsuario());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Usuario u) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("UPDATE usuario SET nome = ?, email = ?, senha = ?, cpf = ?, telefone = ? WHERE idUsuario = ?");
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, "");
            stmt.setString(4, u.getCpf());
            stmt.setString(5, u.getTelefone());
            stmt.setInt(6, u.getIdUsuario());

            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
