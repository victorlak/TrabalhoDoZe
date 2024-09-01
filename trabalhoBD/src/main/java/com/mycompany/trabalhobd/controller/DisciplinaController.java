/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhobd.controller;

import com.mycompany.trabalhobd.model.dao.IDao;
import com.mycompany.trabalhobd.model.entidades.Disciplina;
import com.mycompany.trabalhobd.model.valid.ValidacaoDisciplina;

/**
 *
 * @author USUARIO
 */
public class DisciplinaController {
    private IDao repositorio;

    public DisciplinaController(IDao repositorio) {
        this.repositorio = repositorio;
    }
    
    public void adicionarDisciplina(String codigo, String nome, String professorMinistrante){
        ValidacaoDisciplina valid = new ValidacaoDisciplina();
        Disciplina novaDisciplina = valid.validar(codigo, nome, professorMinistrante);
        System.out.println("BBBBBBBBBBB");
        repositorio.save(novaDisciplina);
    }
    public void atualizarDisciplina(String codigo, String nome, String professorMinistrante){
        ValidacaoDisciplina valid = new ValidacaoDisciplina();
        Disciplina novaDisciplina = valid.validar(codigo, nome, professorMinistrante);
        repositorio.update(codigo,novaDisciplina);
    }
    public void deleteDisciplina(String codigo, String nome, String professorMinistrante){
        ValidacaoDisciplina valid = new ValidacaoDisciplina();
        Disciplina novaDisciplina = valid.validar(codigo, nome, professorMinistrante);
        repositorio.delete(codigo);
    }
    public void findDisciplina(String codigo, String nome, String professorMinistrante){
        ValidacaoDisciplina valid = new ValidacaoDisciplina();
        Disciplina novaDisciplina = valid.validar(codigo, nome, professorMinistrante);
        repositorio.find(codigo);
    }
    public void findAllDisciplina(){
        repositorio.findAll();
    }
}
