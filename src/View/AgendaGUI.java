/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.AgendaController;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author uso
 */
public class AgendaGUI extends javax.swing.JFrame {
    private final AgendaController controller;
    
    public AgendaGUI() {
        initComponents();
        controller = new AgendaController(this);
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
        TabAgenda = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableAgendaTabela = new javax.swing.JTable();
        jButtonAgendaVoltar = new javax.swing.JButton();
        TabConfirmacao = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableConfirmacaoTabela = new javax.swing.JTable();
        jButtonConfirmacaoConfirmar = new javax.swing.JButton();
        jButtonConfirmacaoCancelar = new javax.swing.JButton();
        jLabelNomeConfirmacaoCliente = new javax.swing.JLabel();
        jTextFieldConfirmacaoData = new javax.swing.JTextField();
        jLabelConfirmacaoHora = new javax.swing.JLabel();
        jLabelConfirmacaoData = new javax.swing.JLabel();
        jTextFieldConfirmacaoHora = new javax.swing.JTextField();
        jTextFieldConfirmacaoProcedimento = new javax.swing.JTextField();
        jLabelConfirmacaoProcedimento = new javax.swing.JLabel();
        jLabelConfirmacaoProcedimento2 = new javax.swing.JLabel();
        jTextFieldConfirmacaoProcedimento2 = new javax.swing.JTextField();
        jDateChooserConfirmacao = new com.toedter.calendar.JDateChooser();
        jButtonConfirmacaoVoltar = new javax.swing.JButton();
        TabAgendamento2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgendamentoTabela = new javax.swing.JTable();
        jLabelAgendamentoHora = new javax.swing.JLabel();
        jTextFieldAgendamentoID = new javax.swing.JTextField();
        jComboBoxAgendamentoCliente = new javax.swing.JComboBox<>();
        jLabelAgendamentoID = new javax.swing.JLabel();
        jLabelAgendamentoNome = new javax.swing.JLabel();
        jLabelAgendamentoProcedimento = new javax.swing.JLabel();
        jComboBoxAgendamentoProcedimento = new javax.swing.JComboBox<>();
        jLabelAgendamentoProcedimento2 = new javax.swing.JLabel();
        jComboBoxAgendamentoProcedimento2 = new javax.swing.JComboBox<>();
        jLabelAgendamentoCliente = new javax.swing.JLabel();
        jButtonAgendamentoAgendar = new javax.swing.JButton();
        jLabelAgendamentoData = new javax.swing.JLabel();
        jTextFieldAgendamentoPreco2 = new javax.swing.JTextField();
        jTextFieldAgendamentoPreco = new javax.swing.JTextField();
        jLabelAgendamentoPreco2 = new javax.swing.JLabel();
        jLabelAgendamentoPreco = new javax.swing.JLabel();
        jLabelAgendamentoTotal = new javax.swing.JLabel();
        jTextFieldAgendamentoPrecoTotal = new javax.swing.JTextField();
        jLabelAgendamentoRS = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAgendamentoOBS = new javax.swing.JTextArea();
        jLabelOBSAgendamento = new javax.swing.JLabel();
        jLabelAgendamentoLocal = new javax.swing.JLabel();
        jComboBoxAgendamentoLocal = new javax.swing.JComboBox<>();
        jLabelAgendamentoPrecoLocal = new javax.swing.JLabel();
        jTextFieldAgendamentoPrecoLocal = new javax.swing.JTextField();
        jDateChooserAgendamentoData = new com.toedter.calendar.JDateChooser();
        jFormattedTextFieldAgendamentoHora = new javax.swing.JFormattedTextField();
        jButtonAgendamentoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(766, 580));
        setPreferredSize(new java.awt.Dimension(766, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabAgenda.setBackground(new java.awt.Color(51, 51, 51));
        TabAgenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableAgendaTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTableAgendaTabela);

        TabAgenda.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 97, 710, 410));

        jButtonAgendaVoltar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonAgendaVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgendaVoltar.setText("VOLTAR");
        jButtonAgendaVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaVoltarActionPerformed(evt);
            }
        });
        TabAgenda.add(jButtonAgendaVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, 40));

        jTabbedPane1.addTab("Agenda", TabAgenda);

        TabConfirmacao.setBackground(new java.awt.Color(51, 51, 51));
        TabConfirmacao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableConfirmacaoTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableConfirmacaoTabela);

        TabConfirmacao.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 357, 710, 140));

        jButtonConfirmacaoConfirmar.setBackground(new java.awt.Color(0, 153, 0));
        jButtonConfirmacaoConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonConfirmacaoConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmacaoConfirmar.setText("Confirmar");
        TabConfirmacao.add(jButtonConfirmacaoConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 180, -1));

        jButtonConfirmacaoCancelar.setBackground(new java.awt.Color(153, 0, 0));
        jButtonConfirmacaoCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonConfirmacaoCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmacaoCancelar.setText("Cancelar");
        TabConfirmacao.add(jButtonConfirmacaoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 180, -1));

        jLabelNomeConfirmacaoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNomeConfirmacaoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeConfirmacaoCliente.setText("NomeCliente");
        TabConfirmacao.add(jLabelNomeConfirmacaoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 520, -1));

        jTextFieldConfirmacaoData.setEditable(false);
        jTextFieldConfirmacaoData.setText("15/14/2002");
        TabConfirmacao.add(jTextFieldConfirmacaoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, 20));

        jLabelConfirmacaoHora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelConfirmacaoHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfirmacaoHora.setText("Hora");
        TabConfirmacao.add(jLabelConfirmacaoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, 20));

        jLabelConfirmacaoData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelConfirmacaoData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfirmacaoData.setText("Data");
        TabConfirmacao.add(jLabelConfirmacaoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, 20));

        jTextFieldConfirmacaoHora.setEditable(false);
        jTextFieldConfirmacaoHora.setText("12:35");
        TabConfirmacao.add(jTextFieldConfirmacaoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, -1, 20));

        jTextFieldConfirmacaoProcedimento.setEditable(false);
        TabConfirmacao.add(jTextFieldConfirmacaoProcedimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 270, -1));

        jLabelConfirmacaoProcedimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelConfirmacaoProcedimento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfirmacaoProcedimento.setText("Procedimento");
        TabConfirmacao.add(jLabelConfirmacaoProcedimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabelConfirmacaoProcedimento2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelConfirmacaoProcedimento2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfirmacaoProcedimento2.setText("Procedimento2");
        TabConfirmacao.add(jLabelConfirmacaoProcedimento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jTextFieldConfirmacaoProcedimento2.setEditable(false);
        TabConfirmacao.add(jTextFieldConfirmacaoProcedimento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 270, -1));

        jDateChooserConfirmacao.setDateFormatString("yyyy/MM/dd");
        TabConfirmacao.add(jDateChooserConfirmacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 130, -1));

        jButtonConfirmacaoVoltar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonConfirmacaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmacaoVoltar.setText("VOLTAR");
        jButtonConfirmacaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmacaoVoltarActionPerformed(evt);
            }
        });
        TabConfirmacao.add(jButtonConfirmacaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, 40));

        jTabbedPane1.addTab("Confirmação", TabConfirmacao);

        TabAgendamento2.setBackground(new java.awt.Color(51, 51, 51));
        TabAgendamento2.setMinimumSize(new java.awt.Dimension(600, 500));
        TabAgendamento2.setPreferredSize(new java.awt.Dimension(600, 500));
        TabAgendamento2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableAgendamentoTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableAgendamentoTabela);

        TabAgendamento2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 710, 120));

        jLabelAgendamentoHora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAgendamentoHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoHora.setText("Hora");
        TabAgendamento2.add(jLabelAgendamentoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jTextFieldAgendamentoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAgendamentoIDActionPerformed(evt);
            }
        });
        TabAgendamento2.add(jTextFieldAgendamentoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, 20));

        jComboBoxAgendamentoCliente.setEditable(true);
        jComboBoxAgendamentoCliente.setMaximumRowCount(300);
        jComboBoxAgendamentoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "asdasd", "asdasdas", "tyry", "wersdf", "qwezxfsadc", "z\\cxcz", "asdasd", "asdasdas", "asdasd", "asdasdas", "dasdasd", "asdasd", "asd", "asda", "sdas", "d", "asd", "as", "da", "sd", "as", "das", "d" }));
        jComboBoxAgendamentoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAgendamentoClienteActionPerformed(evt);
            }
        });
        TabAgendamento2.add(jComboBoxAgendamentoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 200, 20));

        jLabelAgendamentoID.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabelAgendamentoID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoID.setText("ID");
        TabAgendamento2.add(jLabelAgendamentoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabelAgendamentoNome.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabelAgendamentoNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoNome.setText("nome");
        TabAgendamento2.add(jLabelAgendamentoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 30, -1));

        jLabelAgendamentoProcedimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAgendamentoProcedimento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoProcedimento.setText("Procedimento");
        TabAgendamento2.add(jLabelAgendamentoProcedimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jComboBoxAgendamentoProcedimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxAgendamentoProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAgendamentoProcedimentoActionPerformed(evt);
            }
        });
        TabAgendamento2.add(jComboBoxAgendamentoProcedimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 220, -1));

        jLabelAgendamentoProcedimento2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAgendamentoProcedimento2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoProcedimento2.setText("Procedimento2");
        TabAgendamento2.add(jLabelAgendamentoProcedimento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jComboBoxAgendamentoProcedimento2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TabAgendamento2.add(jComboBoxAgendamentoProcedimento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 220, -1));

        jLabelAgendamentoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAgendamentoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoCliente.setText("Cliente");
        TabAgendamento2.add(jLabelAgendamentoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jButtonAgendamentoAgendar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAgendamentoAgendar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAgendamentoAgendar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgendamentoAgendar.setText("Agendar");
        jButtonAgendamentoAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendamentoAgendarActionPerformed(evt);
            }
        });
        TabAgendamento2.add(jButtonAgendamentoAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 290, 40));

        jLabelAgendamentoData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAgendamentoData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoData.setText("Data");
        TabAgendamento2.add(jLabelAgendamentoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        TabAgendamento2.add(jTextFieldAgendamentoPreco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 60, -1));
        TabAgendamento2.add(jTextFieldAgendamentoPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 60, -1));

        jLabelAgendamentoPreco2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAgendamentoPreco2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoPreco2.setText("R$");
        TabAgendamento2.add(jLabelAgendamentoPreco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        jLabelAgendamentoPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAgendamentoPreco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoPreco.setText("R$");
        TabAgendamento2.add(jLabelAgendamentoPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));

        jLabelAgendamentoTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAgendamentoTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoTotal.setText("TOTAL");
        TabAgendamento2.add(jLabelAgendamentoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));
        TabAgendamento2.add(jTextFieldAgendamentoPrecoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 190, -1));

        jLabelAgendamentoRS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAgendamentoRS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoRS.setText("R$");
        TabAgendamento2.add(jLabelAgendamentoRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jTextAreaAgendamentoOBS.setColumns(20);
        jTextAreaAgendamentoOBS.setLineWrap(true);
        jTextAreaAgendamentoOBS.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAgendamentoOBS);

        TabAgendamento2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 200, -1));

        jLabelOBSAgendamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelOBSAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOBSAgendamento.setText("OBS ");
        TabAgendamento2.add(jLabelOBSAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabelAgendamentoLocal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAgendamentoLocal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoLocal.setText("Local");
        TabAgendamento2.add(jLabelAgendamentoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        jComboBoxAgendamentoLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TabAgendamento2.add(jComboBoxAgendamentoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 220, -1));

        jLabelAgendamentoPrecoLocal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAgendamentoPrecoLocal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamentoPrecoLocal.setText("R$");
        TabAgendamento2.add(jLabelAgendamentoPrecoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));
        TabAgendamento2.add(jTextFieldAgendamentoPrecoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 60, -1));

        jDateChooserAgendamentoData.setDateFormatString("yyyy/MM/dd");
        TabAgendamento2.add(jDateChooserAgendamentoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 200, -1));

        try {
            jFormattedTextFieldAgendamentoHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TabAgendamento2.add(jFormattedTextFieldAgendamentoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 200, -1));

        jButtonAgendamentoVoltar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonAgendamentoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgendamentoVoltar.setText("VOLTAR");
        jButtonAgendamentoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendamentoVoltarActionPerformed(evt);
            }
        });
        TabAgendamento2.add(jButtonAgendamentoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, 40));

        jTabbedPane1.addTab("Agendamento", TabAgendamento2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 550));

        setSize(new java.awt.Dimension(766, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAgendamentoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAgendamentoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAgendamentoIDActionPerformed

    private void jButtonAgendamentoAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendamentoAgendarActionPerformed
        controller.mostrarNaTela();
    }//GEN-LAST:event_jButtonAgendamentoAgendarActionPerformed

    private void jButtonAgendaVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaVoltarActionPerformed
        controller.voltarAoMenuPrincipal();
    }//GEN-LAST:event_jButtonAgendaVoltarActionPerformed

    private void jButtonConfirmacaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmacaoVoltarActionPerformed
        controller.voltarAoMenuPrincipal();
    }//GEN-LAST:event_jButtonConfirmacaoVoltarActionPerformed

    private void jButtonAgendamentoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendamentoVoltarActionPerformed
        controller.voltarAoMenuPrincipal();
    }//GEN-LAST:event_jButtonAgendamentoVoltarActionPerformed

    private void jComboBoxAgendamentoProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAgendamentoProcedimentoActionPerformed
       
    }//GEN-LAST:event_jComboBoxAgendamentoProcedimentoActionPerformed

    private void jComboBoxAgendamentoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAgendamentoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAgendamentoClienteActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TabAgenda;
    private javax.swing.JPanel TabAgendamento2;
    private javax.swing.JPanel TabConfirmacao;
    private javax.swing.JButton jButtonAgendaVoltar;
    private javax.swing.JButton jButtonAgendamentoAgendar;
    private javax.swing.JButton jButtonAgendamentoVoltar;
    private javax.swing.JButton jButtonConfirmacaoCancelar;
    private javax.swing.JButton jButtonConfirmacaoConfirmar;
    private javax.swing.JButton jButtonConfirmacaoVoltar;
    private javax.swing.JComboBox<String> jComboBoxAgendamentoCliente;
    private javax.swing.JComboBox<String> jComboBoxAgendamentoLocal;
    private javax.swing.JComboBox<String> jComboBoxAgendamentoProcedimento;
    private javax.swing.JComboBox<String> jComboBoxAgendamentoProcedimento2;
    private com.toedter.calendar.JDateChooser jDateChooserAgendamentoData;
    private com.toedter.calendar.JDateChooser jDateChooserConfirmacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldAgendamentoHora;
    private javax.swing.JLabel jLabelAgendamentoCliente;
    private javax.swing.JLabel jLabelAgendamentoData;
    private javax.swing.JLabel jLabelAgendamentoHora;
    private javax.swing.JLabel jLabelAgendamentoID;
    private javax.swing.JLabel jLabelAgendamentoLocal;
    private javax.swing.JLabel jLabelAgendamentoNome;
    private javax.swing.JLabel jLabelAgendamentoPreco;
    private javax.swing.JLabel jLabelAgendamentoPreco2;
    private javax.swing.JLabel jLabelAgendamentoPrecoLocal;
    private javax.swing.JLabel jLabelAgendamentoProcedimento;
    private javax.swing.JLabel jLabelAgendamentoProcedimento2;
    private javax.swing.JLabel jLabelAgendamentoRS;
    private javax.swing.JLabel jLabelAgendamentoTotal;
    private javax.swing.JLabel jLabelConfirmacaoData;
    private javax.swing.JLabel jLabelConfirmacaoHora;
    private javax.swing.JLabel jLabelConfirmacaoProcedimento;
    private javax.swing.JLabel jLabelConfirmacaoProcedimento2;
    private javax.swing.JLabel jLabelNomeConfirmacaoCliente;
    private javax.swing.JLabel jLabelOBSAgendamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAgendaTabela;
    private javax.swing.JTable jTableAgendamentoTabela;
    private javax.swing.JTable jTableConfirmacaoTabela;
    private javax.swing.JTextArea jTextAreaAgendamentoOBS;
    private javax.swing.JTextField jTextFieldAgendamentoID;
    private javax.swing.JTextField jTextFieldAgendamentoPreco;
    private javax.swing.JTextField jTextFieldAgendamentoPreco2;
    private javax.swing.JTextField jTextFieldAgendamentoPrecoLocal;
    private javax.swing.JTextField jTextFieldAgendamentoPrecoTotal;
    private javax.swing.JTextField jTextFieldConfirmacaoData;
    private javax.swing.JTextField jTextFieldConfirmacaoHora;
    private javax.swing.JTextField jTextFieldConfirmacaoProcedimento;
    private javax.swing.JTextField jTextFieldConfirmacaoProcedimento2;
    // End of variables declaration//GEN-END:variables

    public JTextArea getjTextAreaAgendamentoOBS() {
        return jTextAreaAgendamentoOBS;
    }

    public void setjTextAreaAgendamentoOBS(JTextArea jTextAreaAgendamentoOBS) {
        this.jTextAreaAgendamentoOBS = jTextAreaAgendamentoOBS;
    }

    public JTextField getjTextFieldAgendamentoID() {
        return jTextFieldAgendamentoID;
    }

    public void setjTextFieldAgendamentoID(JTextField jTextFieldAgendamentoID) {
        this.jTextFieldAgendamentoID = jTextFieldAgendamentoID;
    }

    public JTextField getjTextFieldAgendamentoPreco() {
        return jTextFieldAgendamentoPreco;
    }

    public void setjTextFieldAgendamentoPreco(JTextField jTextFieldAgendamentoPreco) {
        this.jTextFieldAgendamentoPreco = jTextFieldAgendamentoPreco;
    }

    public JTextField getjTextFieldAgendamentoPreco2() {
        return jTextFieldAgendamentoPreco2;
    }

    public void setjTextFieldAgendamentoPreco2(JTextField jTextFieldAgendamentoPreco2) {
        this.jTextFieldAgendamentoPreco2 = jTextFieldAgendamentoPreco2;
    }

    public JTextField getjTextFieldAgendamentoPrecoLocal() {
        return jTextFieldAgendamentoPrecoLocal;
    }

    public void setjTextFieldAgendamentoPrecoLocal(JTextField jTextFieldAgendamentoPrecoLocal) {
        this.jTextFieldAgendamentoPrecoLocal = jTextFieldAgendamentoPrecoLocal;
    }

    public JTextField getjTextFieldAgendamentoPrecoTotal() {
        return jTextFieldAgendamentoPrecoTotal;
    }

    public void setjTextFieldAgendamentoPrecoTotal(JTextField jTextFieldAgendamentoPrecoTotal) {
        this.jTextFieldAgendamentoPrecoTotal = jTextFieldAgendamentoPrecoTotal;
    }

    public JComboBox<String> getjComboBoxAgendamentoCliente() {
        return jComboBoxAgendamentoCliente;
    }

    public void setjComboBoxAgendamentoCliente(JComboBox<String> jComboBoxAgendamentoCliente) {
        this.jComboBoxAgendamentoCliente = jComboBoxAgendamentoCliente;
    }

    public JComboBox<String> getjComboBoxAgendamentoLocal() {
        return jComboBoxAgendamentoLocal;
    }

    public void setjComboBoxAgendamentoLocal(JComboBox<String> jComboBoxAgendamentoLocal) {
        this.jComboBoxAgendamentoLocal = jComboBoxAgendamentoLocal;
    }

    public JComboBox<String> getjComboBoxAgendamentoProcedimento() {
        return jComboBoxAgendamentoProcedimento;
    }

    public void setjComboBoxAgendamentoProcedimento(JComboBox<String> jComboBoxAgendamentoProcedimento) {
        this.jComboBoxAgendamentoProcedimento = jComboBoxAgendamentoProcedimento;
    }

    public JComboBox<String> getjComboBoxAgendamentoProcedimento2() {
        return jComboBoxAgendamentoProcedimento2;
    }

    public void setjComboBoxAgendamentoProcedimento2(JComboBox<String> jComboBoxAgendamentoProcedimento2) {
        this.jComboBoxAgendamentoProcedimento2 = jComboBoxAgendamentoProcedimento2;
    }

    public JDateChooser getjDateChooserAgendamentoData() {
        return jDateChooserAgendamentoData;
    }

    public void setjDateChooserAgendamentoData(JDateChooser jDateChooserAgendamentoData) {
        this.jDateChooserAgendamentoData = jDateChooserAgendamentoData;
    }

    public JFormattedTextField getjFormattedTextFieldAgendamentoHora() {
        return jFormattedTextFieldAgendamentoHora;
    }

    public void setjFormattedTextFieldAgendamentoHora(JFormattedTextField jFormattedTextFieldAgendamentoHora) {
        this.jFormattedTextFieldAgendamentoHora = jFormattedTextFieldAgendamentoHora;
    }

    






}
