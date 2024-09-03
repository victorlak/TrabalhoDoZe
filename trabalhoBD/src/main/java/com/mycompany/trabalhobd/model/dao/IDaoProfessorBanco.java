/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhobd.model.dao;

import com.mycompany.trabalhobd.model.entidades.Professor;
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
public class IDaoProfessorBanco {
    private Connection connection;
    
    public IDaoProfessorBanco(Connection connection) {
        this.connection = connection;
    }
     public void save(Object objT) {
        Professor professor = (Professor) objT;
        String query  = "INSERT INTO professor(cpf, nome, idade, materia) VALUES(?, ?, ?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, professor.getCpf());
            stmt.setString(2, professor.getNome());
            stmt.setString(3, professor.getIdade());
            stmt.setString(4, professor.getMateria());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
        }
        
    }
     public void update(String cpfObgT, Object objT) {
       Professor professor = (Professor) objT;   
        String query = "UPDATE aluno SET cpf = ?, nome = ?,idade = ?, materia = ?, WHERE cpf = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, professor.getCpf());
            stmt.setString(2,professor.getNome());
            stmt.setString(3, professor.getIdade());
            stmt.setString(4, professor.getMateria());
            stmt.setString(5, cpfObgT);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar a disciplina " + e.getMessage());
        }
    }
    public void delete(String cpfObgT) {
        String query = "DELETE FROM aluno WHERE cpf = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, cpfObgT);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar a professor " + e.getMessage());
        }
    }
    public Object find(String cpfObgT) {
        String query = "SELECT * FROM aluno WHERE cpf = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, cpfObgT);
            try(ResultSet retorno = stmt.executeQuery()){
                if(retorno.next()){
                    return new Professor(
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
        String query = "SELEC * FROM professor";
        List<Professor> disciplinas = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet retorno = stmt.executeQuery()) {

            while (retorno.next()) {
                disciplinas.add(new Professor(
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
