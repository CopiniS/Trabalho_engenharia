package entity.view;

import entity.controller.Main;
import entity.model.Hospede;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class panel_cadastroReserva extends javax.swing.JPanel {

    private List<Hospede> hospedeList = new ArrayList<>();
    
    public panel_cadastroReserva(List<Hospede> hospedeList) {
        initComponents();
        
        String undelineHome = "<HTML><u>Cadastro Reserva</u></HTML>";
        lb_Calendario.setText(undelineHome);
        
        menuSideBarBranco();
        removeSelecao();
        
        this.hospedeList = hospedeList;        
        preencherComboBox();
    }
    
    public void limparFTF(){
        ftf_Checkin.setText("");
        ftf_Checkout.setText("");
    }
    
    public void preencherComboBox(){
        for (Hospede h1 : hospedeList) {
            cb_nomeCadastrados.addItem(h1.getNome());
        }
    }
    
    public void menuSideBarBranco() {
        lb_Home.setForeground(Color.WHITE);
        lb_Cadastro.setForeground(Color.WHITE);
        lb_Calendario.setForeground(Color.WHITE);
        lb_Reservar.setForeground(Color.WHITE);
        lb_Mailing.setForeground(Color.WHITE);
        lb_DayUse.setForeground(Color.WHITE);
    }   
    
    public void removeSelecao(){
        lb_menuSelecionado.setVisible(false);
        lb_bkgCalendReserv.setVisible(false);
        lb_bkgReserv.setVisible(false);
        lb_bkgMailing.setVisible(false);
        lb_bkgDayUse.setVisible(false);
        lb_bkgCadastrar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_Mailing = new javax.swing.JLabel();
        lb_DayUse = new javax.swing.JLabel();
        lb_Cadastro = new javax.swing.JLabel();
        lb_Reservar = new javax.swing.JLabel();
        lb_Calendario = new javax.swing.JLabel();
        lb_Home = new javax.swing.JLabel();
        lb_logoSideBar = new javax.swing.JLabel();
        lb_bkgReserv = new javax.swing.JLabel();
        lb_bkgCadastrar = new javax.swing.JLabel();
        lb_bkgDayUse = new javax.swing.JLabel();
        lb_bkgMailing = new javax.swing.JLabel();
        lb_bkgCalendReserv = new javax.swing.JLabel();
        lb_menuSelecionado = new javax.swing.JLabel();
        lb_bkgSideBar = new javax.swing.JLabel();
        cb_nomeCadastrados = new javax.swing.JComboBox<>();
        lb_titCheckout = new javax.swing.JLabel();
        lb_titCheckin = new javax.swing.JLabel();
        lb_Salvar = new javax.swing.JLabel();
        ftf_Checkout = new javax.swing.JFormattedTextField();
        ftf_Checkin = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_linha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_telefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        lb_linha1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_acompanhantes = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_tipoQuarto = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setLayout(null);

        lb_Mailing.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_Mailing.setText("Mailing");
        lb_Mailing.setAlignmentY(0.0F);
        lb_Mailing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Mailing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_MailingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_MailingMouseExited(evt);
            }
        });
        add(lb_Mailing);
        lb_Mailing.setBounds(50, 350, 70, 20);

        lb_DayUse.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_DayUse.setText("Day Use");
        lb_DayUse.setAlignmentY(0.0F);
        lb_DayUse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_DayUse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_DayUseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_DayUseMouseExited(evt);
            }
        });
        add(lb_DayUse);
        lb_DayUse.setBounds(50, 310, 70, 20);

        lb_Cadastro.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_Cadastro.setText("Cadastrar Hóspedes");
        lb_Cadastro.setAlignmentY(0.0F);
        lb_Cadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_CadastroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_CadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_CadastroMouseExited(evt);
            }
        });
        add(lb_Cadastro);
        lb_Cadastro.setBounds(50, 270, 167, 20);

        lb_Reservar.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_Reservar.setText("Reservar/Hospedar");
        lb_Reservar.setAlignmentY(0.0F);
        lb_Reservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Reservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ReservarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_ReservarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_ReservarMouseExited(evt);
            }
        });
        add(lb_Reservar);
        lb_Reservar.setBounds(50, 230, 159, 20);

        lb_Calendario.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_Calendario.setText("Cadastro Reserva");
        lb_Calendario.setAlignmentY(0.0F);
        lb_Calendario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Calendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_CalendarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_CalendarioMouseExited(evt);
            }
        });
        add(lb_Calendario);
        lb_Calendario.setBounds(50, 190, 200, 20);

        lb_Home.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_Home.setText("Home");
        lb_Home.setAlignmentY(0.0F);
        lb_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_HomeMouseExited(evt);
            }
        });
        add(lb_Home);
        lb_Home.setBounds(50, 150, 60, 20);

        lb_logoSideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hotelIcon-reduzido.png"))); // NOI18N
        lb_logoSideBar.setText("jLabel1");
        add(lb_logoSideBar);
        lb_logoSideBar.setBounds(90, 30, 112, 42);

        lb_bkgReserv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SelectSideBar.png"))); // NOI18N
        lb_bkgReserv.setRequestFocusEnabled(false);
        add(lb_bkgReserv);
        lb_bkgReserv.setBounds(0, 220, 300, 41);

        lb_bkgCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SelectSideBar.png"))); // NOI18N
        lb_bkgCadastrar.setRequestFocusEnabled(false);
        add(lb_bkgCadastrar);
        lb_bkgCadastrar.setBounds(0, 260, 300, 41);

        lb_bkgDayUse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SelectSideBar.png"))); // NOI18N
        lb_bkgDayUse.setRequestFocusEnabled(false);
        add(lb_bkgDayUse);
        lb_bkgDayUse.setBounds(0, 300, 300, 41);

        lb_bkgMailing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SelectSideBar.png"))); // NOI18N
        lb_bkgMailing.setRequestFocusEnabled(false);
        add(lb_bkgMailing);
        lb_bkgMailing.setBounds(0, 340, 300, 41);

        lb_bkgCalendReserv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SelectSideBar.png"))); // NOI18N
        lb_bkgCalendReserv.setRequestFocusEnabled(false);
        add(lb_bkgCalendReserv);
        lb_bkgCalendReserv.setBounds(0, 180, 300, 41);

        lb_menuSelecionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SelectSideBar.png"))); // NOI18N
        lb_menuSelecionado.setRequestFocusEnabled(false);
        add(lb_menuSelecionado);
        lb_menuSelecionado.setBounds(0, 140, 300, 41);

        lb_bkgSideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SideBar.png"))); // NOI18N
        lb_bkgSideBar.setText("jLabel1");
        lb_bkgSideBar.setMaximumSize(new java.awt.Dimension(300, 768));
        lb_bkgSideBar.setPreferredSize(new java.awt.Dimension(300, 768));
        add(lb_bkgSideBar);
        lb_bkgSideBar.setBounds(0, 0, 300, 768);

        cb_nomeCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        cb_nomeCadastrados.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        cb_nomeCadastrados.setForeground(new java.awt.Color(0, 0, 0));
        cb_nomeCadastrados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cb_nomeCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_nomeCadastradosActionPerformed(evt);
            }
        });
        add(cb_nomeCadastrados);
        cb_nomeCadastrados.setBounds(550, 150, 570, 40);

        lb_titCheckout.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_titCheckout.setForeground(new java.awt.Color(0, 0, 0));
        lb_titCheckout.setText("Data do checkout:");
        add(lb_titCheckout);
        lb_titCheckout.setBounds(850, 220, 150, 30);

        lb_titCheckin.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_titCheckin.setForeground(new java.awt.Color(0, 0, 0));
        lb_titCheckin.setText("Data do check-in:");
        add(lb_titCheckin);
        lb_titCheckin.setBounds(550, 220, 150, 30);

        lb_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_Salvar.png"))); // NOI18N
        lb_Salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_SalvarMouseClicked(evt);
            }
        });
        add(lb_Salvar);
        lb_Salvar.setBounds(970, 690, 150, 30);

        ftf_Checkout.setBackground(new java.awt.Color(255, 255, 255));
        ftf_Checkout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ftf_Checkout.setForeground(new java.awt.Color(0, 0, 0));
        ftf_Checkout.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        ftf_Checkout.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        add(ftf_Checkout);
        ftf_Checkout.setBounds(850, 250, 270, 30);

        ftf_Checkin.setBackground(new java.awt.Color(255, 255, 255));
        ftf_Checkin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ftf_Checkin.setForeground(new java.awt.Color(0, 0, 0));
        ftf_Checkin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        ftf_Checkin.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        ftf_Checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftf_CheckinActionPerformed(evt);
            }
        });
        add(ftf_Checkin);
        ftf_Checkin.setBounds(550, 250, 270, 30);

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome:");
        add(jLabel1);
        jLabel1.setBounds(550, 430, 180, 30);

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Selecione um Hóspede:");
        add(jLabel2);
        jLabel2.setBounds(550, 120, 190, 30);

        lb_linha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/linha.png"))); // NOI18N
        add(lb_linha);
        lb_linha.setBounds(550, 400, 570, 10);

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Informações Hóspede");
        add(jLabel3);
        jLabel3.setBounds(550, 380, 270, 30);

        tf_nome.setBackground(new java.awt.Color(255, 255, 255));
        tf_nome.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_nome.setForeground(new java.awt.Color(102, 102, 102));
        tf_nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });
        add(tf_nome);
        tf_nome.setBounds(550, 460, 270, 30);

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telefone:");
        add(jLabel4);
        jLabel4.setBounds(850, 430, 180, 30);

        tf_telefone.setBackground(new java.awt.Color(255, 255, 255));
        tf_telefone.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_telefone.setForeground(new java.awt.Color(102, 102, 102));
        tf_telefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tf_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telefoneActionPerformed(evt);
            }
        });
        add(tf_telefone);
        tf_telefone.setBounds(850, 460, 270, 30);

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("E-mail:");
        add(jLabel5);
        jLabel5.setBounds(550, 500, 180, 30);

        tf_email.setBackground(new java.awt.Color(255, 255, 255));
        tf_email.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_email.setForeground(new java.awt.Color(102, 102, 102));
        tf_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_emailActionPerformed(evt);
            }
        });
        add(tf_email);
        tf_email.setBounds(550, 530, 270, 30);

        lb_linha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/linha.png"))); // NOI18N
        add(lb_linha1);
        lb_linha1.setBounds(550, 100, 570, 10);

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Data Reserva Hóspede");
        add(jLabel6);
        jLabel6.setBounds(550, 80, 270, 30);

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Acompanhantes:");
        add(jLabel7);
        jLabel7.setBounds(850, 500, 180, 30);

        tf_acompanhantes.setBackground(new java.awt.Color(255, 255, 255));
        tf_acompanhantes.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_acompanhantes.setForeground(new java.awt.Color(102, 102, 102));
        tf_acompanhantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tf_acompanhantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_acompanhantesActionPerformed(evt);
            }
        });
        add(tf_acompanhantes);
        tf_acompanhantes.setBounds(850, 530, 270, 30);

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo Quarto:");
        add(jLabel8);
        jLabel8.setBounds(550, 580, 180, 30);

        tf_tipoQuarto.setBackground(new java.awt.Color(255, 255, 255));
        tf_tipoQuarto.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_tipoQuarto.setForeground(new java.awt.Color(102, 102, 102));
        tf_tipoQuarto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tf_tipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tipoQuartoActionPerformed(evt);
            }
        });
        add(tf_tipoQuarto);
        tf_tipoQuarto.setBounds(550, 610, 270, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_MailingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MailingMouseEntered
        removeSelecao();
        lb_bkgMailing.setVisible(true);
    }//GEN-LAST:event_lb_MailingMouseEntered

    private void lb_MailingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MailingMouseExited
        removeSelecao();
    }//GEN-LAST:event_lb_MailingMouseExited

    private void lb_DayUseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_DayUseMouseEntered
        removeSelecao();
        lb_bkgDayUse.setVisible(true);
    }//GEN-LAST:event_lb_DayUseMouseEntered

    private void lb_DayUseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_DayUseMouseExited
        removeSelecao();
    }//GEN-LAST:event_lb_DayUseMouseExited

    private void lb_CadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CadastroMouseClicked
        Main.c1.getView().setTelaCadastro(new Panel_cadastroHospede(hospedeList));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaCadastro());
    }//GEN-LAST:event_lb_CadastroMouseClicked

    private void lb_CadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CadastroMouseEntered
        removeSelecao();
        lb_bkgCadastrar.setVisible(true);
    }//GEN-LAST:event_lb_CadastroMouseEntered

    private void lb_CadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CadastroMouseExited
        removeSelecao();
    }//GEN-LAST:event_lb_CadastroMouseExited

    private void lb_ReservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ReservarMouseClicked
        Main.c1.getView().setTelaReservar(new Panel_reservar(hospedeList));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaReservar());
    }//GEN-LAST:event_lb_ReservarMouseClicked

    private void lb_ReservarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ReservarMouseEntered
        removeSelecao();
        lb_bkgReserv.setVisible(true);
    }//GEN-LAST:event_lb_ReservarMouseEntered

    private void lb_ReservarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ReservarMouseExited
        removeSelecao();
    }//GEN-LAST:event_lb_ReservarMouseExited

    private void lb_CalendarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CalendarioMouseEntered
        removeSelecao();
        lb_bkgCalendReserv.setVisible(true);
    }//GEN-LAST:event_lb_CalendarioMouseEntered

    private void lb_CalendarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CalendarioMouseExited
        removeSelecao();
    }//GEN-LAST:event_lb_CalendarioMouseExited

    private void lb_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_HomeMouseEntered
        removeSelecao();
        lb_menuSelecionado.setVisible(true);
    }//GEN-LAST:event_lb_HomeMouseEntered

    private void lb_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_HomeMouseExited
        removeSelecao();
    }//GEN-LAST:event_lb_HomeMouseExited

    private void lb_SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_SalvarMouseClicked
        for (Hospede h1 : hospedeList) {
            if(h1.getNome().equals(cb_nomeCadastrados.getSelectedItem())){
                h1.setCheck_in(ftf_Checkin.getText());
                h1.setCheck_out(ftf_Checkout.getText());
            }
        }
        
        JOptionPane.showMessageDialog(null, "Data check-in e checkout incluidas com sucesso");
        
        limparFTF();
    }//GEN-LAST:event_lb_SalvarMouseClicked

    private void ftf_CheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftf_CheckinActionPerformed
    }//GEN-LAST:event_ftf_CheckinActionPerformed

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
    }//GEN-LAST:event_tf_nomeActionPerformed

    private void tf_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telefoneActionPerformed
    }//GEN-LAST:event_tf_telefoneActionPerformed

    private void tf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_emailActionPerformed
    }//GEN-LAST:event_tf_emailActionPerformed

    private void cb_nomeCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_nomeCadastradosActionPerformed
        for (Hospede h1 : hospedeList) {
            if(cb_nomeCadastrados.getSelectedItem().equals(h1.getNome())){
                tf_nome.setText(h1.getNome());
                tf_email.setText(h1.getEmail());
                tf_telefone.setText(h1.getTelefone());
                tf_tipoQuarto.setText(h1.getTipoQuarto().toString());
                
                String txtQntdAcomp = String.valueOf(h1.getQuantidadeAcompanhantes());
                tf_acompanhantes.setText(txtQntdAcomp);
            }
        }
    }//GEN-LAST:event_cb_nomeCadastradosActionPerformed

    private void tf_acompanhantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_acompanhantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_acompanhantesActionPerformed

    private void tf_tipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tipoQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tipoQuartoActionPerformed

    private void lb_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_HomeMouseClicked
        Main.c1.getView().setTelaHome(new Panel_home(hospedeList));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaHome());
    }//GEN-LAST:event_lb_HomeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_nomeCadastrados;
    private javax.swing.JFormattedTextField ftf_Checkin;
    private javax.swing.JFormattedTextField ftf_Checkout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lb_Cadastro;
    private javax.swing.JLabel lb_Calendario;
    private javax.swing.JLabel lb_DayUse;
    private javax.swing.JLabel lb_Home;
    private javax.swing.JLabel lb_Mailing;
    private javax.swing.JLabel lb_Reservar;
    private javax.swing.JLabel lb_Salvar;
    private javax.swing.JLabel lb_bkgCadastrar;
    private javax.swing.JLabel lb_bkgCalendReserv;
    private javax.swing.JLabel lb_bkgDayUse;
    private javax.swing.JLabel lb_bkgMailing;
    private javax.swing.JLabel lb_bkgReserv;
    private javax.swing.JLabel lb_bkgSideBar;
    private javax.swing.JLabel lb_linha;
    private javax.swing.JLabel lb_linha1;
    private javax.swing.JLabel lb_logoSideBar;
    private javax.swing.JLabel lb_menuSelecionado;
    private javax.swing.JLabel lb_titCheckin;
    private javax.swing.JLabel lb_titCheckout;
    private javax.swing.JTextField tf_acompanhantes;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_telefone;
    private javax.swing.JTextField tf_tipoQuarto;
    // End of variables declaration//GEN-END:variables
}
