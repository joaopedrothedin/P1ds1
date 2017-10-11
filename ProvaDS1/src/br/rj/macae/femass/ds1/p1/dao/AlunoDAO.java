/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.ds1.p1.dao;

import br.rj.macae.femass.ds1.p1.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoaoPedroThedin
 */
public class AlunoDAO {
    public void adicionar(Object o) throws SQLException {
        Aluno aluno = (Aluno) o;
        Connection conn = null;
        try {
            conn = FabricaConexao.getConexao();

            String sql = "INSERT INTO public.aluno(\n" +
"	nome, idade, massa, estatura, sexo)\n" +
"	VALUES (?, ?, ?, ?, ?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores         
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setFloat(3, aluno.getMassa());
            stmt.setFloat(4, aluno.getEstatura());
            stmt.setString(5, aluno.getSexo());
            
            
            
            stmt.executeUpdate();
            stmt.close();
            
        } catch (SQLException e) {
            throw new SQLException("Eroo ao tentar cadastrar o aluno. \n" + e.getMessage());
        }
    }

    public void alterar(Object o) throws SQLException {
        Aluno aluno = (Aluno) o;
        Connection conn = null;
        try {
            conn = FabricaConexao.getConexao();

            String sql = "UPDATE aluno "
                + "SET nome = ?, "
                + "idade = ?, "
                + "massa = ?, "
                + "estatura = ?, "
                + "sexo = ?, "
                + "WHERE id = ? ";
            

            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores         
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setFloat(3, aluno.getMassa());
            stmt.setFloat(4, aluno.getEstatura());
            stmt.setString(5, aluno.getSexo());
            stmt.setLong(6, aluno.getId());
            stmt.executeUpdate();
            stmt.close();
            
        } catch (SQLException e) {
            throw new SQLException("Eroo ao tentar alterar o Aluno. \n" + e.getMessage());
        }
    }

    public List listarAlunos() throws SQLException
    {
        String sql = "Select id, nome, idade, , massa, estatura, sexo, from aluno";
        Statement statement = FabricaConexao.getConexao().createStatement();
        ResultSet rs = statement.executeQuery(sql);
        
        List <Aluno> alunos = new ArrayList<>();
        
        while (rs.next())
        {
            
            Aluno e = new Aluno();
            e.setId(rs.getLong("Id"));
            e.setNome(rs.getString("nome"));
            e.setIdade(rs.getInt("idade"));
            e.setMassa(rs.getFloat("massa"));
            e.setEstatura(rs.getFloat("estatura"));
            e.setSexo(rs.getString("sexo"));
            
            alunos.add(e);
            
            
        }
        return alunos;
    }

}
