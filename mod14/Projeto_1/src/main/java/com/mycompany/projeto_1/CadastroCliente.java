/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author caior
 */
public class CadastroCliente extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private IClienteDAO clienteDAO = new ClienteMapDAO();

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        initCustomComponents();
    }

    private void initCustomComponents() {
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Endereço");
        modelo.addColumn("Telefone");

        tableCustomers.setModel(modelo);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textPhone = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAtt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomers = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jOptionsSair = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Cpf");

        textCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCpfActionPerformed(evt);
            }
        });

        jLabel3.setText("Endereço");

        jLabel4.setText("Telefone");

        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAtt.setText("Atualizar");
        btnAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttActionPerformed(evt);
            }
        });

        tableCustomers.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomers);

        jOptionsSair.setText("Opções");
        jOptionsSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionsSairActionPerformed(evt);
            }
        });

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jOptionsSair.add(menuSair);

        jMenuBar1.add(jOptionsSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtt)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textPhone)))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnAtt)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Deseja sair da aplicação?", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String cpf = textCpf.getText();
        int linhaSelecionada = tableCustomers.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int result =  JOptionPane.showConfirmDialog(null, "Deseja excluir este cliente?", "CUIDADO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (result == JOptionPane.YES_OPTION) {
                clienteDAO.excluir(cpf);
                modelo.removeRow(linhaSelecionada);

                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente foi selecionado");

        }
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String nome = textName.getText();
        String cpf = textCpf.getText();
        String end = textAddress.getText();
        String tel = textPhone.getText();

        if (!isCamposValidos(nome, cpf, end, tel)) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
            Cliente cliente = new Cliente(nome, cpf, tel, end);
            Boolean isCadastrado = clienteDAO.cadastrar(cliente);

            if (isCadastrado) {
                modelo.addRow(new Object[]{cliente.getNome(), cliente.getCpf(), cliente.getEnd(), cliente.getTel()});
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Cliente ja se encontra no cadastro!");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void limparCampos() {
        textName.setText("");
        textCpf.setText("");
        textAddress.setText("");
        textPhone.setText("");
    }

    private Boolean isCamposValidos(String ...campos) {
        if (campos == null || campos.length == 0) {
            return false;
        }

        for (String i : campos) {
            if (i == null || i.trim().isEmpty()) {
                return false;
            }
        }

        return true;
    }

    private void textCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCpfActionPerformed

    private void btnAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttActionPerformed
        String nome = textName.getText();
        String cpf = textCpf.getText();
        String end = textAddress.getText();
        String tel = textPhone.getText();

        int linhaSelecionada = tableCustomers.getSelectedRow();

        Cliente cliente = new Cliente(nome, cpf, tel, end);

        clienteDAO.alterar(cliente);
        modelo.removeRow(linhaSelecionada);
        modelo.addRow(new Object[]{cliente.getNome(), cliente.getCpf(), cliente.getEnd(), cliente.getTel()});
        limparCampos();
    }

    private void jOptionsSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionsSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOptionsSairActionPerformed

    private void tableCustomersMouseClicked(java.awt.event.MouseEvent evt) {                                            
        int linhaSelecionada = tableCustomers.getSelectedRow();
        String cpf = (String) tableCustomers.getValueAt(linhaSelecionada, 1);

        Cliente cliente = clienteDAO.consultar(cpf);

        textName.setText(cliente.getNome());
        textCpf.setText(cliente.getCpf());
        textAddress.setText(cliente.getEnd());
        textPhone.setText(cliente.getTel());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtt;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jOptionsSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JTable tableCustomers;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPhone;
    // End of variables declaration//GEN-END:variables
}