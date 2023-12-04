package entity.view;

import entity.controller.Main;
import entity.model.Hospede;
import entity.model.TipoQuarto;
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Panel_cadastroHospede extends javax.swing.JPanel {

    private List<String> servicos = new ArrayList<>();
    private List<Hospede> hospedeList = new ArrayList<>();

    public Panel_cadastroHospede() {
       initComponents();
       
       menuSideBarBranco();
       removeSelecao();
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

        lb_TitleInfHosp = new javax.swing.JLabel();
        lb_linha = new javax.swing.JLabel();
        lb_iconUser = new javax.swing.JLabel();
        lb_tipoQuarto = new javax.swing.JLabel();
        lb_nomeCompleto = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        lb_telefone = new javax.swing.JLabel();
        lb_Acompanhantes = new javax.swing.JLabel();
        cb_tipoQuarto = new javax.swing.JComboBox<>();
        tf_nomeCompleto = new javax.swing.JTextField();
        tf_Email = new javax.swing.JTextField();
        tf_Telefone = new javax.swing.JTextField();
        tf_Acompanhantes = new javax.swing.JTextField();
        lb_TitleServ = new javax.swing.JLabel();
        lb_linha1 = new javax.swing.JLabel();
        cb_Lavanderia = new javax.swing.JCheckBox();
        cb_Cafe = new javax.swing.JCheckBox();
        cb_Restaurante = new javax.swing.JCheckBox();
        cb_Frigobar = new javax.swing.JCheckBox();
        cb_AluguelCarro = new javax.swing.JCheckBox();
        cb_Piscina = new javax.swing.JCheckBox();
        lb_Salvar = new javax.swing.JLabel();
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
        setLayout(null);

        lb_TitleInfHosp.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lb_TitleInfHosp.setForeground(new java.awt.Color(0, 0, 0));
        lb_TitleInfHosp.setText("Informações do Hóspede");
        add(lb_TitleInfHosp);
        lb_TitleInfHosp.setBounds(450, 70, 310, 23);

        lb_linha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/linha.png"))); // NOI18N
        add(lb_linha);
        lb_linha.setBounds(450, 90, 792, 1);

        lb_iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUserCad.png"))); // NOI18N
        add(lb_iconUser);
        lb_iconUser.setBounds(450, 130, 120, 120);

        lb_tipoQuarto.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        lb_tipoQuarto.setForeground(new java.awt.Color(0, 0, 0));
        lb_tipoQuarto.setText("Tipo de Quarto");
        add(lb_tipoQuarto);
        lb_tipoQuarto.setBounds(620, 300, 120, 20);

        lb_nomeCompleto.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        lb_nomeCompleto.setForeground(new java.awt.Color(0, 0, 0));
        lb_nomeCompleto.setText("Nome Completo");
        add(lb_nomeCompleto);
        lb_nomeCompleto.setBounds(620, 140, 120, 20);

        lb_email.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        lb_email.setForeground(new java.awt.Color(0, 0, 0));
        lb_email.setText("E-mail");
        add(lb_email);
        lb_email.setBounds(620, 180, 120, 20);

        lb_telefone.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        lb_telefone.setForeground(new java.awt.Color(0, 0, 0));
        lb_telefone.setText("Telefone");
        add(lb_telefone);
        lb_telefone.setBounds(620, 220, 120, 20);

        lb_Acompanhantes.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        lb_Acompanhantes.setForeground(new java.awt.Color(0, 0, 0));
        lb_Acompanhantes.setText("Acompanhantes");
        add(lb_Acompanhantes);
        lb_Acompanhantes.setBounds(620, 260, 120, 20);

        cb_tipoQuarto.setBackground(new java.awt.Color(255, 255, 255));
        cb_tipoQuarto.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        cb_tipoQuarto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duplo Solteiro", "Casal", "Standard", "Twin Room", "Deluxe" }));
        add(cb_tipoQuarto);
        cb_tipoQuarto.setBounds(720, 300, 340, 20);

        tf_nomeCompleto.setBackground(new java.awt.Color(255, 255, 255));
        tf_nomeCompleto.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tf_nomeCompleto.setForeground(new java.awt.Color(51, 51, 51));
        tf_nomeCompleto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_nomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeCompletoActionPerformed(evt);
            }
        });
        add(tf_nomeCompleto);
        tf_nomeCompleto.setBounds(740, 140, 320, 20);

        tf_Email.setBackground(new java.awt.Color(255, 255, 255));
        tf_Email.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tf_Email.setForeground(new java.awt.Color(51, 51, 51));
        tf_Email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_EmailActionPerformed(evt);
            }
        });
        add(tf_Email);
        tf_Email.setBounds(680, 180, 380, 20);

        tf_Telefone.setBackground(new java.awt.Color(255, 255, 255));
        tf_Telefone.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tf_Telefone.setForeground(new java.awt.Color(51, 51, 51));
        tf_Telefone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_TelefoneActionPerformed(evt);
            }
        });
        add(tf_Telefone);
        tf_Telefone.setBounds(690, 220, 370, 20);

        tf_Acompanhantes.setBackground(new java.awt.Color(255, 255, 255));
        tf_Acompanhantes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tf_Acompanhantes.setForeground(new java.awt.Color(51, 51, 51));
        tf_Acompanhantes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_Acompanhantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_AcompanhantesActionPerformed(evt);
            }
        });
        add(tf_Acompanhantes);
        tf_Acompanhantes.setBounds(730, 260, 330, 20);

        lb_TitleServ.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lb_TitleServ.setForeground(new java.awt.Color(0, 0, 0));
        lb_TitleServ.setText("Serviços");
        add(lb_TitleServ);
        lb_TitleServ.setBounds(450, 410, 310, 23);

        lb_linha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/linha.png"))); // NOI18N
        add(lb_linha1);
        lb_linha1.setBounds(450, 430, 792, 1);

        cb_Lavanderia.setBackground(new java.awt.Color(255, 255, 255));
        cb_Lavanderia.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cb_Lavanderia.setForeground(new java.awt.Color(0, 0, 0));
        cb_Lavanderia.setText("Lavanderia");
        cb_Lavanderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_LavanderiaActionPerformed(evt);
            }
        });
        add(cb_Lavanderia);
        cb_Lavanderia.setBounds(450, 540, 210, 26);

        cb_Cafe.setBackground(new java.awt.Color(255, 255, 255));
        cb_Cafe.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cb_Cafe.setForeground(new java.awt.Color(0, 0, 0));
        cb_Cafe.setText("Café da Manhã");
        cb_Cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_CafeActionPerformed(evt);
            }
        });
        add(cb_Cafe);
        cb_Cafe.setBounds(450, 460, 210, 26);

        cb_Restaurante.setBackground(new java.awt.Color(255, 255, 255));
        cb_Restaurante.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cb_Restaurante.setForeground(new java.awt.Color(0, 0, 0));
        cb_Restaurante.setText("Restaurante");
        cb_Restaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_RestauranteActionPerformed(evt);
            }
        });
        add(cb_Restaurante);
        cb_Restaurante.setBounds(450, 500, 210, 26);

        cb_Frigobar.setBackground(new java.awt.Color(255, 255, 255));
        cb_Frigobar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cb_Frigobar.setForeground(new java.awt.Color(0, 0, 0));
        cb_Frigobar.setText("Frigobar");
        cb_Frigobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_FrigobarActionPerformed(evt);
            }
        });
        add(cb_Frigobar);
        cb_Frigobar.setBounds(670, 540, 210, 31);

        cb_AluguelCarro.setBackground(new java.awt.Color(255, 255, 255));
        cb_AluguelCarro.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cb_AluguelCarro.setForeground(new java.awt.Color(0, 0, 0));
        cb_AluguelCarro.setText("Aluguel Carro");
        cb_AluguelCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_AluguelCarroActionPerformed(evt);
            }
        });
        add(cb_AluguelCarro);
        cb_AluguelCarro.setBounds(670, 460, 210, 26);

        cb_Piscina.setBackground(new java.awt.Color(255, 255, 255));
        cb_Piscina.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cb_Piscina.setForeground(new java.awt.Color(0, 0, 0));
        cb_Piscina.setText("Piscina");
        cb_Piscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_PiscinaActionPerformed(evt);
            }
        });
        add(cb_Piscina);
        cb_Piscina.setBounds(670, 500, 210, 26);

        lb_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_Salvar.png"))); // NOI18N
        lb_Salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_SalvarMouseClicked(evt);
            }
        });
        add(lb_Salvar);
        lb_Salvar.setBounds(1090, 680, 150, 30);

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
        lb_Calendario.setText("Calendário de Reservas   ");
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
        lb_Calendario.setBounds(50, 190, 206, 20);

        lb_Home.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_Home.setText("Home");
        lb_Home.setAlignmentY(0.0F);
        lb_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Home.addMouseListener(new java.awt.event.MouseAdapter() {
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

    private void tf_nomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeCompletoActionPerformed

    private void tf_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_EmailActionPerformed

    private void tf_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_TelefoneActionPerformed

    private void tf_AcompanhantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_AcompanhantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_AcompanhantesActionPerformed

    private void cb_LavanderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_LavanderiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_LavanderiaActionPerformed

    private void cb_CafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_CafeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_CafeActionPerformed

    private void cb_RestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_RestauranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_RestauranteActionPerformed

    private void cb_FrigobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_FrigobarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_FrigobarActionPerformed

    private void cb_AluguelCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_AluguelCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_AluguelCarroActionPerformed

    private void cb_PiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_PiscinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_PiscinaActionPerformed

    private void lb_SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_SalvarMouseClicked
        String name = tf_nomeCompleto.getText();
        String phone = tf_Telefone.getText();
        String email = tf_Email.getText();
        Integer guests = Integer.valueOf(tf_Acompanhantes.getText());
        String roomTypeStr = (String) cb_tipoQuarto.getSelectedItem();
        TipoQuarto roomType = TipoQuarto.valueOf(roomTypeStr.toUpperCase());

        // verifica serviços
        if (cb_Restaurante.isSelected()) {
            servicos.add("Restaurante");
        }
        if (cb_Piscina.isSelected()) {
            servicos.add("Piscina");
        }
        if (cb_Lavanderia.isSelected()) {
            servicos.add("Lavanderia");
        }
        if (cb_Frigobar.isSelected()) {
            servicos.add("Frigobar");
        }
        if (cb_Cafe.isSelected()) {
            servicos.add("Café da Manhã");
        }
        if (cb_AluguelCarro.isSelected()) {
            servicos.add("Aluguel Carro");
        }

        Hospede h = new Hospede(name, phone, guests, roomType, email, servicos);
        hospedeList.add(h);
        servicos = new ArrayList<>();
        JOptionPane.showMessageDialog(null, "Hóspede cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        // limpa campos
        tf_nomeCompleto.setText(null);
        tf_Telefone.setText(null);
        tf_Email.setText(null);
        tf_Acompanhantes.setText(null);
        cb_Restaurante.setSelected(false);
        cb_Piscina.setSelected(false);
        cb_Lavanderia.setSelected(false);
        cb_Frigobar.setSelected(false);
        cb_Cafe.setSelected(false);
        cb_AluguelCarro.setSelected(false);

        for (Hospede h1 : hospedeList) {
            System.out.println(h1.getNome());
            System.out.println(h1.getTelefone());
            System.out.println(h1.getEmail());
            System.out.println(h1.getQuantidadeAcompanhantes());
            System.out.println(h1.getTipoQuarto());
            System.out.println(h1.getServicos());
        }
    }//GEN-LAST:event_lb_SalvarMouseClicked

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
        Main.c1.getView().setTelaCadastro(new Panel_cadastroHospede());
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb_AluguelCarro;
    private javax.swing.JCheckBox cb_Cafe;
    private javax.swing.JCheckBox cb_Frigobar;
    private javax.swing.JCheckBox cb_Lavanderia;
    private javax.swing.JCheckBox cb_Piscina;
    private javax.swing.JCheckBox cb_Restaurante;
    private javax.swing.JComboBox<String> cb_tipoQuarto;
    private javax.swing.JLabel lb_Acompanhantes;
    private javax.swing.JLabel lb_Cadastro;
    private javax.swing.JLabel lb_Calendario;
    private javax.swing.JLabel lb_DayUse;
    private javax.swing.JLabel lb_Home;
    private javax.swing.JLabel lb_Mailing;
    private javax.swing.JLabel lb_Reservar;
    private javax.swing.JLabel lb_Salvar;
    private javax.swing.JLabel lb_TitleInfHosp;
    private javax.swing.JLabel lb_TitleServ;
    private javax.swing.JLabel lb_bkgCadastrar;
    private javax.swing.JLabel lb_bkgCalendReserv;
    private javax.swing.JLabel lb_bkgDayUse;
    private javax.swing.JLabel lb_bkgMailing;
    private javax.swing.JLabel lb_bkgReserv;
    private javax.swing.JLabel lb_bkgSideBar;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_iconUser;
    private javax.swing.JLabel lb_linha;
    private javax.swing.JLabel lb_linha1;
    private javax.swing.JLabel lb_logoSideBar;
    private javax.swing.JLabel lb_menuSelecionado;
    private javax.swing.JLabel lb_nomeCompleto;
    private javax.swing.JLabel lb_telefone;
    private javax.swing.JLabel lb_tipoQuarto;
    private javax.swing.JTextField tf_Acompanhantes;
    private javax.swing.JTextField tf_Email;
    private javax.swing.JTextField tf_Telefone;
    private javax.swing.JTextField tf_nomeCompleto;
    // End of variables declaration//GEN-END:variables
}
