package entity.view;

import entity.controller.Main;
import entity.model.Hospede;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Panel_reservar extends javax.swing.JPanel {

    private List<Hospede> hospedeList;
    private List<String> servicos = new ArrayList<>();
    
    public Panel_reservar(List<Hospede> hospedeList) {
        initComponents();
        menuSideBarBranco();
        this.hospedeList = hospedeList;
        this.servicos = servicos;
        
        String undelineHome = "<HTML><u>Reservar/Hospedar</u></HTML>";
        lb_Reservar.setText(undelineHome);
        
        removeSelecao();
        preencherLabels();
    }
    
    public void removeSelecao(){
        lb_menuSelecionado.setVisible(false);
        lb_bkgCalendReserv.setVisible(false);
        lb_bkgReserv.setVisible(false);
        lb_bkgMailing.setVisible(false);
        lb_bkgDayUse.setVisible(false);
        lb_bkgCadastrar.setVisible(false);
    }
    
    public void preencherLabels (){
         for (Hospede h1 : hospedeList) {
            int numAcompanhantes = h1.getQuantidadeAcompanhantes();
            String numAcompanhantesTxt = String.valueOf(numAcompanhantes);
            h1.setCheck_in(h1.getCheck_in() == null ? "-" : h1.getCheck_in());
            h1.setCheck_out(h1.getCheck_out() == null ? "-" : h1.getCheck_out()); 
            lb_txtAcompanhantes.setText(lb_txtAcompanhantes.getText()+"<HTML><p>"+numAcompanhantesTxt+"</p><HTML>");    
            lb_txtCheckIn.setText(lb_txtCheckIn.getText()+"<HTML><p>"+h1.getCheck_in()+"</p><HTML>");
            lb_txtCheckout.setText(lb_txtCheckout.getText()+"<HTML><p>"+h1.getCheck_out()+"</p><HTML>");
            lb_txtEmail.setText(lb_txtEmail.getText()+"<HTML><p>"+h1.getEmail()+"</p><HTML>");
            lb_txtFone.setText(lb_txtFone.getText()+"<HTML><p>"+h1.getTelefone()+"</p><HTML>");
            lb_txtNome.setText(lb_txtNome.getText()+"<HTML><p>"+h1.getNome()+"</p><HTML>");
            lb_txtTipoQuarto.setText(lb_txtTipoQuarto.getText()+"<HTML><p>"+h1.getTipoQuarto().toString()+"</p><HTML>");
        }
    }

    public void menuSideBarBranco(){
        lb_Home.setForeground(Color.WHITE);
        lb_Cadastro.setForeground(Color.WHITE);
        lb_Calendario.setForeground(Color.WHITE);
        lb_Reservar.setForeground(Color.WHITE);
        lb_Mailing.setForeground(Color.WHITE);
        lb_DayUse.setForeground(Color.WHITE);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_txtFone = new javax.swing.JLabel();
        lb_txtAcompanhantes = new javax.swing.JLabel();
        lb_txtNome = new javax.swing.JLabel();
        lb_txtTipoQuarto = new javax.swing.JLabel();
        lb_txtCheckIn = new javax.swing.JLabel();
        lb_txtCheckout = new javax.swing.JLabel();
        lb_txtEmail = new javax.swing.JLabel();
        lb_titFone = new javax.swing.JLabel();
        lb_titEmail = new javax.swing.JLabel();
        lb_titCheckout = new javax.swing.JLabel();
        lb_titCheckIn = new javax.swing.JLabel();
        lb_titTipoQuarto = new javax.swing.JLabel();
        lb_titNome = new javax.swing.JLabel();
        lb_titAcompanhantes = new javax.swing.JLabel();
        cbcTabela = new javax.swing.JLabel();
        linhaTabela = new javax.swing.JLabel();
        pesquisa = new javax.swing.JLabel();
        lb_novoHospede = new javax.swing.JLabel();
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

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setLayout(null);

        lb_txtFone.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_txtFone.setForeground(new java.awt.Color(0, 0, 0));
        lb_txtFone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtFone.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lb_txtFone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_txtFone);
        lb_txtFone.setBounds(1170, 270, 140, 250);

        lb_txtAcompanhantes.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_txtAcompanhantes.setForeground(new java.awt.Color(0, 0, 0));
        lb_txtAcompanhantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtAcompanhantes.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lb_txtAcompanhantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_txtAcompanhantes);
        lb_txtAcompanhantes.setBounds(350, 270, 150, 250);

        lb_txtNome.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_txtNome.setForeground(new java.awt.Color(0, 0, 0));
        lb_txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtNome.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lb_txtNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_txtNome);
        lb_txtNome.setBounds(500, 270, 150, 250);

        lb_txtTipoQuarto.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_txtTipoQuarto.setForeground(new java.awt.Color(0, 0, 0));
        lb_txtTipoQuarto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtTipoQuarto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lb_txtTipoQuarto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_txtTipoQuarto);
        lb_txtTipoQuarto.setBounds(650, 270, 130, 250);

        lb_txtCheckIn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_txtCheckIn.setForeground(new java.awt.Color(0, 0, 0));
        lb_txtCheckIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtCheckIn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lb_txtCheckIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_txtCheckIn);
        lb_txtCheckIn.setBounds(780, 270, 130, 250);

        lb_txtCheckout.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_txtCheckout.setForeground(new java.awt.Color(0, 0, 0));
        lb_txtCheckout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtCheckout.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lb_txtCheckout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_txtCheckout);
        lb_txtCheckout.setBounds(910, 270, 130, 250);

        lb_txtEmail.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        lb_txtEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtEmail.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lb_txtEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_txtEmail);
        lb_txtEmail.setBounds(1040, 270, 130, 250);

        lb_titFone.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_titFone.setForeground(new java.awt.Color(0, 0, 0));
        lb_titFone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titFone.setText("E-mail");
        add(lb_titFone);
        lb_titFone.setBounds(1170, 234, 140, 30);

        lb_titEmail.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_titEmail.setForeground(new java.awt.Color(0, 0, 0));
        lb_titEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titEmail.setText("Fone");
        add(lb_titEmail);
        lb_titEmail.setBounds(1040, 234, 130, 30);

        lb_titCheckout.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_titCheckout.setForeground(new java.awt.Color(0, 0, 0));
        lb_titCheckout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titCheckout.setText("Checkout");
        add(lb_titCheckout);
        lb_titCheckout.setBounds(910, 234, 130, 30);

        lb_titCheckIn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_titCheckIn.setForeground(new java.awt.Color(0, 0, 0));
        lb_titCheckIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titCheckIn.setText("Check-in");
        add(lb_titCheckIn);
        lb_titCheckIn.setBounds(780, 234, 130, 30);

        lb_titTipoQuarto.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_titTipoQuarto.setForeground(new java.awt.Color(0, 0, 0));
        lb_titTipoQuarto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titTipoQuarto.setText("Tipo de Quarto");
        add(lb_titTipoQuarto);
        lb_titTipoQuarto.setBounds(650, 234, 130, 30);

        lb_titNome.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_titNome.setForeground(new java.awt.Color(0, 0, 0));
        lb_titNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titNome.setText("Nome");
        add(lb_titNome);
        lb_titNome.setBounds(500, 234, 150, 30);

        lb_titAcompanhantes.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_titAcompanhantes.setForeground(new java.awt.Color(0, 0, 0));
        lb_titAcompanhantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titAcompanhantes.setText("Acompanhantes");
        add(lb_titAcompanhantes);
        lb_titAcompanhantes.setBounds(350, 234, 150, 30);

        cbcTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CabecalhoReserva.png"))); // NOI18N
        add(cbcTabela);
        cbcTabela.setBounds(350, 230, 963, 40);

        linhaTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LinhaReserva.png"))); // NOI18N
        add(linhaTabela);
        linhaTabela.setBounds(350, 260, 964, 260);

        pesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Barra Pesquisa.png"))); // NOI18N
        add(pesquisa);
        pesquisa.setBounds(350, 130, 380, 50);

        lb_novoHospede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_NovoHospede.png"))); // NOI18N
        lb_novoHospede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_novoHospedeMouseClicked(evt);
            }
        });
        add(lb_novoHospede);
        lb_novoHospede.setBounds(810, 130, 160, 50);

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
        lb_Cadastro.setBounds(50, 270, 180, 20);

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
        lb_Reservar.setBounds(50, 230, 170, 20);

        lb_Calendario.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_Calendario.setText("Cadastro Reserva");
        lb_Calendario.setAlignmentY(0.0F);
        lb_Calendario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Calendario.setMaximumSize(new java.awt.Dimension(32000, 32000));
        lb_Calendario.setPreferredSize(new java.awt.Dimension(10, 10));
        lb_Calendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_CalendarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_CalendarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_CalendarioMouseExited(evt);
            }
        });
        add(lb_Calendario);
        lb_Calendario.setBounds(50, 190, 160, 20);

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

    private void lb_ReservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ReservarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_ReservarMouseClicked

    private void lb_CalendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CalendarioMouseClicked
        Main.c1.getView().setTelaCalendario(new panel_cadastroReserva(hospedeList));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaCalendario());
    }//GEN-LAST:event_lb_CalendarioMouseClicked

    private void lb_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_HomeMouseClicked
        Main.c1.getView().setTelaHome(new Panel_home(hospedeList, servicos));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaHome());
    }//GEN-LAST:event_lb_HomeMouseClicked

    private void lb_novoHospedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_novoHospedeMouseClicked
        Main.c1.getView().setTelaCadastro(new Panel_cadastroHospede(hospedeList));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaCadastro());
    }//GEN-LAST:event_lb_novoHospedeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cbcTabela;
    private javax.swing.JLabel lb_Cadastro;
    private javax.swing.JLabel lb_Calendario;
    private javax.swing.JLabel lb_DayUse;
    private javax.swing.JLabel lb_Home;
    private javax.swing.JLabel lb_Mailing;
    private javax.swing.JLabel lb_Reservar;
    private javax.swing.JLabel lb_bkgCadastrar;
    private javax.swing.JLabel lb_bkgCalendReserv;
    private javax.swing.JLabel lb_bkgDayUse;
    private javax.swing.JLabel lb_bkgMailing;
    private javax.swing.JLabel lb_bkgReserv;
    private javax.swing.JLabel lb_bkgSideBar;
    private javax.swing.JLabel lb_logoSideBar;
    private javax.swing.JLabel lb_menuSelecionado;
    private javax.swing.JLabel lb_novoHospede;
    private javax.swing.JLabel lb_titAcompanhantes;
    private javax.swing.JLabel lb_titCheckIn;
    private javax.swing.JLabel lb_titCheckout;
    private javax.swing.JLabel lb_titEmail;
    private javax.swing.JLabel lb_titFone;
    private javax.swing.JLabel lb_titNome;
    private javax.swing.JLabel lb_titTipoQuarto;
    private javax.swing.JLabel lb_txtAcompanhantes;
    private javax.swing.JLabel lb_txtCheckIn;
    private javax.swing.JLabel lb_txtCheckout;
    private javax.swing.JLabel lb_txtEmail;
    private javax.swing.JLabel lb_txtFone;
    private javax.swing.JLabel lb_txtNome;
    private javax.swing.JLabel lb_txtTipoQuarto;
    private javax.swing.JLabel linhaTabela;
    private javax.swing.JLabel pesquisa;
    // End of variables declaration//GEN-END:variables
}
