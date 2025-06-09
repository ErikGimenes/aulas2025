/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuariosDao extends DaoAbstract {

    Connection cnt;

    public UsuariosDao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, pass;

            // url = "jdbc:mysql://10.7.0.51:33062/db_erik_gimenes";
            // user = "erik_gimenes";
            // pass = "erik_gimenes";
            url = "jdbc:mysql://localhost:3306/db_local";
            user = "Erik Gimenes";
            pass = "";

            cnt = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(Object object) {
        Usuarios usuarios = (Usuarios) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("INSERT INTO usuarios (idusuarios, nome, apelido, cpf, dataNascimento, senha, nivel, ativo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setInt(1, usuarios.getIdusuarios());
            pst.setString(2, usuarios.getNome());
            pst.setString(3, usuarios.getApelido());
            pst.setString(4, usuarios.getCpf());
            pst.setDate(5, new java.sql.Date(usuarios.getDataNascimento().getTime()));
            pst.setString(6, usuarios.getSenha());
            pst.setInt(7, usuarios.getNivel());
            pst.setString(8, usuarios.getAtivo());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        Usuarios usuarios = (Usuarios) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("UPDATE usuarios SET nome=?, apelido=?, cpf=?, dataNascimento=?, senha=?, nivel=?, ativo=? WHERE idusuarios=?");
            pst.setString(1, usuarios.getNome());
            pst.setString(2, usuarios.getApelido());
            pst.setString(3, usuarios.getCpf());
            pst.setDate(4, new java.sql.Date(usuarios.getDataNascimento().getTime()));
            pst.setString(5, usuarios.getSenha());
            pst.setInt(6, usuarios.getNivel());
            pst.setString(7, usuarios.getAtivo());
            pst.setInt(8, usuarios.getIdusuarios());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
        Usuarios usuarios = (Usuarios) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("DELETE FROM usuarios WHERE idusuarios=?");
            pst.setInt(1, usuarios.getIdusuarios());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object list(int id) {
        PreparedStatement pst;
        try {
            pst = cnt.prepareStatement("SELECT * FROM usuarios WHERE idusuarios=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                Usuarios usuarios = new Usuarios();
                usuarios.setIdusuarios(rs.getInt("idusuarios"));
                usuarios.setNome(rs.getString("nome"));
                usuarios.setApelido(rs.getString("apelido"));
                usuarios.setCpf(rs.getString("cpf"));
                usuarios.setDataNascimento(rs.getDate("dataNascimento"));
                usuarios.setSenha(rs.getString("senha"));
                usuarios.setNivel(rs.getInt("nivel"));
                usuarios.setAtivo(rs.getString("ativo"));
                return usuarios;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List listAll() {
        List<Usuarios> lista = new ArrayList<>();
        PreparedStatement pst;
        try {
            pst = cnt.prepareStatement("SELECT * FROM usuarios");
            ResultSet rs = pst.executeQuery();
            while (rs.next() == true) {
                Usuarios usuarios = new Usuarios();
                usuarios.setIdusuarios(rs.getInt("idusuarios"));
                usuarios.setNome(rs.getString("nome"));
                usuarios.setApelido(rs.getString("apelido"));
                usuarios.setCpf(rs.getString("cpf"));
                usuarios.setDataNascimento(rs.getDate("dataNascimento"));
                usuarios.setSenha(rs.getString("senha"));
                usuarios.setNivel(rs.getInt("nivel"));
                usuarios.setAtivo(rs.getString("ativo"));
                lista.add(usuarios);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.setIdusuarios(200);
        usuarios.setNome("erik");
        usuarios.setApelido("mpv");
        usuarios.setCpf("081.113.491-14");
        usuarios.setDataNascimento(new java.util.Date());
        usuarios.setSenha("123");
        usuarios.setNivel(1);
        usuarios.setAtivo("S");
        UsuariosDao usuariosDao = new UsuariosDao();
        usuariosDao.insert(usuarios);
        System.out.println("executou com sucesso.");
    }

}
