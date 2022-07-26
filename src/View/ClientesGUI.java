/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ClienteController;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author uso
 */
public class ClientesGUI extends javax.swing.JFrame {

    private final ClienteController controller;

    /**
     * Creates new form ClientesGUI
     */
    public ClientesGUI() {
        initComponents();
        controller = new ClienteController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        TabClientes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonClientesVoltar = new javax.swing.JButton();
        TabCadastro = new javax.swing.JPanel();
        jLabelCadastroTitulo = new javax.swing.JLabel();
        jLabelCadastroNome = new javax.swing.JLabel();
        jLabelCadastroCPF = new javax.swing.JLabel();
        jLabelCadastroCelular = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelCadastroOBS = new javax.swing.JLabel();
        jTextFieldCadastroNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCadastroOBS = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCadastroTabela = new javax.swing.JTable();
        jButtonCadastroEditar = new javax.swing.JButton();
        jFormattedTextFieldCadastroCelular = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCadastroCPF = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jLabelCadastroID = new javax.swing.JLabel();
        jTextFieldCadastroID = new javax.swing.JTextField();
        jButtonCadastroVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(766, 580));
        setPreferredSize(new java.awt.Dimension(766, 580));

        TabClientes.setBackground(new java.awt.Color(51, 51, 51));
        TabClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Celular", "OBS"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        TabClientes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 710, 420));

        jButtonClientesVoltar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonClientesVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClientesVoltar.setText("VOLTAR");
        jButtonClientesVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesVoltarActionPerformed(evt);
            }
        });
        TabClientes.add(jButtonClientesVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, 40));

        jTabbedPane1.addTab("Clientes", TabClientes);

        TabCadastro.setBackground(new java.awt.Color(51, 51, 51));
        TabCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCadastroTitulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabelCadastroTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastroTitulo.setText("Cadastrar Cliente");
        TabCadastro.add(jLabelCadastroTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabelCadastroNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCadastroNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastroNome.setText("Nome");
        TabCadastro.add(jLabelCadastroNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabelCadastroCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCadastroCPF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastroCPF.setText("CPF");
        TabCadastro.add(jLabelCadastroCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabelCadastroCelular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCadastroCelular.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastroCelular.setText("Celular");
        TabCadastro.add(jLabelCadastroCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        TabCadastro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 211, -1, -1));

        jLabelCadastroOBS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCadastroOBS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastroOBS.setText("OBS");
        TabCadastro.add(jLabelCadastroOBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));
        TabCadastro.add(jTextFieldCadastroNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 220, -1));

        jTextAreaCadastroOBS.setColumns(20);
        jTextAreaCadastroOBS.setRows(5);
        jScrollPane1.setViewportView(jTextAreaCadastroOBS);

        TabCadastro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, 100));

        jTableCadastroTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableCadastroTabela);

        TabCadastro.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 710, 140));

        jButtonCadastroEditar.setBackground(new java.awt.Color(153, 0, 0));
        jButtonCadastroEditar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCadastroEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastroEditar.setText("Editar");
        jButtonCadastroEditar.setToolTipText("");
        TabCadastro.add(jButtonCadastroEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 230, 30));

        try {
            jFormattedTextFieldCadastroCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TabCadastro.add(jFormattedTextFieldCadastroCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 220, -1));

        try {
            jFormattedTextFieldCadastroCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadastroCPF.setToolTipText("");
        TabCadastro.add(jFormattedTextFieldCadastroCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 220, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cadastrar");
        TabCadastro.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 360, 30));

        jLabelCadastroID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCadastroID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastroID.setText("ID");
        TabCadastro.add(jLabelCadastroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 20, -1));

        jTextFieldCadastroID.setText("0");
        TabCadastro.add(jTextFieldCadastroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));

        jButtonCadastroVoltar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonCadastroVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastroVoltar.setText("VOLTAR");
        jButtonCadastroVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroVoltarActionPerformed(evt);
            }
        });
        TabCadastro.add(jButtonCadastroVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, 40));

        jTabbedPane1.addTab("Cadastro", TabCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setSize(new java.awt.Dimension(766, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClientesVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesVoltarActionPerformed
        controller.voltarAoMenuPrincipal();
    }//GEN-LAST:event_jButtonClientesVoltarActionPerformed

    private void jButtonCadastroVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroVoltarActionPerformed
        controller.voltarAoMenuPrincipal();
    }//GEN-LAST:event_jButtonCadastroVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ClientesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TabCadastro;
    private javax.swing.JPanel TabClientes;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCadastroEditar;
    private javax.swing.JButton jButtonCadastroVoltar;
    private javax.swing.JButton jButtonClientesVoltar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadastroCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadastroCelular;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCadastroCPF;
    private javax.swing.JLabel jLabelCadastroCelular;
    private javax.swing.JLabel jLabelCadastroID;
    private javax.swing.JLabel jLabelCadastroNome;
    private javax.swing.JLabel jLabelCadastroOBS;
    private javax.swing.JLabel jLabelCadastroTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableCadastroTabela;
    private javax.swing.JTextArea jTextAreaCadastroOBS;
    private javax.swing.JTextField jTextFieldCadastroID;
    private javax.swing.JTextField jTextFieldCadastroNome;
    // End of variables declaration//GEN-END:variables

    public JFormattedTextField getjFormattedTextFieldCadastroCPF() {
        return jFormattedTextFieldCadastroCPF;
    }

    public void setjFormattedTextFieldCadastroCPF(JFormattedTextField jFormattedTextFieldCadastroCPF) {
        this.jFormattedTextFieldCadastroCPF = jFormattedTextFieldCadastroCPF;
    }

    public JFormattedTextField getjFormattedTextFieldCadastroCelular() {
        return jFormattedTextFieldCadastroCelular;
    }

    public void setjFormattedTextFieldCadastroCelular(JFormattedTextField jFormattedTextFieldCadastroCelular) {
        this.jFormattedTextFieldCadastroCelular = jFormattedTextFieldCadastroCelular;
    }

    public JTextArea getjTextAreaCadastroOBS() {
        return jTextAreaCadastroOBS;
    }

    public void setjTextAreaCadastroOBS(JTextArea jTextAreaCadastroOBS) {
        this.jTextAreaCadastroOBS = jTextAreaCadastroOBS;
    }

    public JTextField getjTextFieldCadastroID() {
        return jTextFieldCadastroID;
    }

    public void setjTextFieldCadastroID(JTextField jTextFieldCadastroID) {
        this.jTextFieldCadastroID = jTextFieldCadastroID;
    }

    public JTextField getjTextFieldCadastroNome() {
        return jTextFieldCadastroNome;
    }

    public void setjTextFieldCadastroNome(JTextField jTextFieldCadastroNome) {
        this.jTextFieldCadastroNome = jTextFieldCadastroNome;
    }









}
