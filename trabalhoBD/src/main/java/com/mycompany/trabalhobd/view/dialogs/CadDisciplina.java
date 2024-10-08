/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.trabalhobd.view.dialogs;

import com.mycompany.trabalhobd.connection.SQLiteConnector;
import com.mycompany.trabalhobd.controller.DisciplinaController;
import com.mycompany.trabalhobd.model.dao.IDao;
import com.mycompany.trabalhobd.model.dao.IDaoDisciplinaBanco;
import com.mycompany.trabalhobd.model.dao.IDaoDisciplinaFile;
import com.mycompany.trabalhobd.model.entidades.Disciplina;
import com.mycompany.trabalhobd.view.tableModels.TMCadDisciplina;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class CadDisciplina extends javax.swing.JDialog {

    private Boolean editando;
    private String codigoEditando;
    private IDao repositorio;
    private DisciplinaController disciplinaController;
    
    public CadDisciplina(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        
        repositorio = new IDaoDisciplinaFile("ListagemDisciplinas.json");
        
        //SQLiteConnector conector = new SQLiteConnector("banco.sqlite");
        //repositorio = new IDaoDisciplinaBanco(conector.getConnection());
        
        disciplinaController = new DisciplinaController(repositorio);
        editando = false;
        codigoEditando = null;
        
        initComponents();
        limparCampos();
        setLocationRelativeTo(parent);
        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtProfessorMinistrante = new javax.swing.JTextField();
        btnCadastrarDisciplina = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdDisciplina = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("CADASTRO DE DISCIPLINA");
        jPanel1.add(jLabel1);

        jLabel5.setText("CODIGO:");

        jLabel2.setText("NOME:");

        jLabel3.setText("PROFESSOR MINISTRANTE:");

        edtProfessorMinistrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtProfessorMinistranteActionPerformed(evt);
            }
        });

        btnCadastrarDisciplina.setText("CADASTRAR");
        btnCadastrarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarDisciplinaActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        grdDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(grdDisciplina);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrarDisciplina)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNovo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtProfessorMinistrante, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(edtProfessorMinistrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarDisciplina)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar)
                    .addComponent(btnNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void limparCampos(){
        edtCodigo.setText("");
        edtProfessorMinistrante.setText("");
        edtNome.setText("");
        
        habilitarCampos(false);
    }
    private void atualizarTabela(){
        List<Disciplina> disciplina = this.disciplinaController.findAllDisciplina();
        TMCadDisciplina tabelaDisciplina = new TMCadDisciplina(disciplina);
        grdDisciplina.setModel(tabelaDisciplina);
    }
    private void habilitarCampos(Boolean habilitar){
        edtCodigo.setEnabled(habilitar);
        edtProfessorMinistrante.setEnabled(habilitar);
        edtNome.setEnabled(habilitar);
    }
    private void objetoParaCampos(Disciplina disciplina){
        edtCodigo.setText(disciplina.getCodigo());
        edtProfessorMinistrante.setText(disciplina.getProfMinistrante());
        edtNome.setText(disciplina.getNome());
    }
    private void edtProfessorMinistranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtProfessorMinistranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtProfessorMinistranteActionPerformed

    private void btnCadastrarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarDisciplinaActionPerformed

        if(this.editando){
           disciplinaController.atualizarDisciplina(codigoEditando, edtCodigo.getText(), edtNome.getText(), edtProfessorMinistrante.getText());         
        }else{
            disciplinaController.adicionarDisciplina(edtCodigo.getText(), edtNome.getText(), edtProfessorMinistrante.getText());
        }
        limparCampos();
        habilitarCampos(false);
        editando = false;
        atualizarTabela();
    }//GEN-LAST:event_btnCadastrarDisciplinaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        Disciplina disciplinaEscolhido = this.getObjetoSelecionadoNaGrid();
       
       String CodEscolhido = disciplinaEscolhido.getCodigo();

        Disciplina disciplinaEditando = disciplinaController.findDisciplina(CodEscolhido);

        if (disciplinaEditando == null) {
            JOptionPane.showMessageDialog(this, "Não existe disciplina com esse codigo.");
            this.editando = false;
        } else {
            this.limparCampos();
            this.habilitarCampos(true);
            
            this.objetoParaCampos(disciplinaEditando);
            this.editando = true;
            this.codigoEditando = disciplinaEditando.getCodigo();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        String cod = JOptionPane.showInputDialog(this,"Informe o Cod da disciplina:");
        
        disciplinaController.deleteDisciplina(cod);
        atualizarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        edtCodigo.setText("");
        edtNome.setText("");
        edtProfessorMinistrante.setText("");
        habilitarCampos(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        habilitarCampos(true);
    }//GEN-LAST:event_btnNovoActionPerformed
    private void grdDisciplinaMouseClicked(java.awt.event.MouseEvent evt) {                                       
       Disciplina disciplina = this.getObjetoSelecionadoNaGrid();
       this.objetoParaCampos(disciplina);
    }
    
    public Disciplina getObjetoSelecionadoNaGrid() {
        int linhaSelecionada = grdDisciplina.getSelectedRow();

        if (linhaSelecionada >= 0) {
            TMCadDisciplina tmCadDisciplina = (TMCadDisciplina) grdDisciplina.getModel();

             Disciplina d = tmCadDisciplina.getObjetoDisciplina(linhaSelecionada);
            return d;
        }
        
        return null;
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarDisciplina;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtProfessorMinistrante;
    private javax.swing.JTable grdDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
