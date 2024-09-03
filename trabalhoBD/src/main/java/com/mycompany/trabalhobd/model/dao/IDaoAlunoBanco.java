/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhobd.model.dao;

import com.mycompany.trabalhobd.model.entidades.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class IDaoAlunoBanco {
    private Connection connection;
    
    public IDaoAlunoBanco(Connection connection) {
        this.connection = connection;
    }
     public void save(Object objT) {
        Aluno aluno = (Aluno) objT;
        String query  = "INSERT INTO aluno(cpf, nome, idade, matricula) VALUES(?, ?, ?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, aluno.getCpf());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getIdade());
            stmt.setString(4, aluno.getMatricula());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
        }
        
    }
     public void update(String cpfObgT, Object objT) {
       Aluno aluno = (Aluno) objT;   
        String query = "UPDATE aluno SET cpf = ?, nome = ?,idade = ?, matricula = ?, WHERE cpf = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, aluno.getCpf());
            stmt.setString(2,aluno.getNome());
            stmt.setString(3, aluno.getIdade());
            stmt.setString(4, aluno.getMatricula());
            stmt.setString(5, cpfObgT);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar a disciplina " + e.getMessage());
        }
    }
    public void delete(String cpfObgT) {
        String query = "DELETE FROM disciplina WHERE cpf = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, cpfObgT);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar a disciplina " + e.getMessage());
        }
    }
    public Object find(String cpfObgT) {
        String query = "SELECT * FROM aluno WHERE cpf = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, cpfObgT);
            try(ResultSet retorno = stmt.executeQuery()){
                if(retorno.next()){
                    return new Aluno(
                    retorno.getString("nome"),
                    retorno.getString("cpf"),
                    retorno.getString("idade"),
                    retorno.getString("matricula")
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar a disciplina " + e.getMessage());
        }
        return null;
    }
    public List findAll() {
        String query = "SELEC * FROM aluno";
        List<Aluno> disciplinas = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet retorno = stmt.executeQuery()) {

            while (retorno.next()) {
                disciplinas.add(new Aluno(
                    retorno.getString("nome"),
                    retorno.getString("cpf"),
                    retorno.getString("idade"),
                    retorno.getString("matricula")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar alunos: " + e.getMessage());
        }
        return disciplinas;
    }

}
