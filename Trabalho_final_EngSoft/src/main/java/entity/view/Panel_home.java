package entity.view;

import entity.controller.Main;
import entity.model.Hospede;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Panel_home extends javax.swing.JPanel {

    private List<Hospede> hospedeList = new ArrayList<>();

    public Panel_home(List<Hospede> hospedeList) {
        initComponents();

        String undelineHome = "<HTML><u>Home</u></HTML>";
        lb_Home.setText(undelineHome);
<<<<<<< HEAD
        
=======
        this.hospedeList = hospedeList;
        //oioioioio
        // right
>>>>>>> d1140903d3659b9c95813a3555db63dd395f4ce1
        menuSideBarBranco();
        removeSelecao();

        lb_menuSelecionado.setVisible(true);
    }

    public void menuSideBarBranco() {
        lb_Home.setForeground(Color.WHITE);
        lb_Cadastro.setForeground(Color.WHITE);
        lb_Calendario.setForeground(Color.WHITE);
        lb_Reservar.setForeground(Color.WHITE);
        lb_Mailing.setForeground(Color.WHITE);
        lb_DayUse.setForeground(Color.WHITE);
    }

    public void removeSelecao() {
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

        lb_iconUserQ9 = new javax.swing.JLabel();
        lb_userQ9 = new javax.swing.JLabel();
        lb_iconQuartoQ9 = new javax.swing.JLabel();
        lb_statusCivilQ9 = new javax.swing.JLabel();
        lb_dataQ9 = new javax.swing.JLabel();
        lb_iconDataQ9 = new javax.swing.JLabel();
        lb_infoQ9 = new javax.swing.JLabel();
        lb_nomeQuartoQ9 = new javax.swing.JLabel();
        lb_cbcQ9 = new javax.swing.JLabel();
        lb_bkgQ9 = new javax.swing.JLabel();
        lb_dataQ8 = new javax.swing.JLabel();
        lb_iconUserQ8 = new javax.swing.JLabel();
        lb_iconQuartoQ8 = new javax.swing.JLabel();
        lb_iconDataQ8 = new javax.swing.JLabel();
        lb_statusCivilQ8 = new javax.swing.JLabel();
        lb_userQ8 = new javax.swing.JLabel();
        lb_infoQ8 = new javax.swing.JLabel();
        lb_nomeQuartoQ8 = new javax.swing.JLabel();
        lb_cbcQ8 = new javax.swing.JLabel();
        lb_bkgQ8 = new javax.swing.JLabel();
        lb_dataQ7 = new javax.swing.JLabel();
        lb_iconQuartoQ7 = new javax.swing.JLabel();
        lb_statusCivilQ7 = new javax.swing.JLabel();
        lb_iconDataQ7 = new javax.swing.JLabel();
        lb_userQ7 = new javax.swing.JLabel();
        lb_iconUserQ7 = new javax.swing.JLabel();
        lb_infoQ7 = new javax.swing.JLabel();
        lb_nomeQuartoQ7 = new javax.swing.JLabel();
        lb_cbcQ7 = new javax.swing.JLabel();
        lb_bkgQ7 = new javax.swing.JLabel();
        lb_statusCivilQ6 = new javax.swing.JLabel();
        lb_iconUserQ6 = new javax.swing.JLabel();
        lb_iconQuartoQ6 = new javax.swing.JLabel();
        lb_iconDataQ6 = new javax.swing.JLabel();
        lb_dataQ6 = new javax.swing.JLabel();
        lb_userQ6 = new javax.swing.JLabel();
        lb_infoQ6 = new javax.swing.JLabel();
        lb_nomeQuartoQ6 = new javax.swing.JLabel();
        lb_cbcQ6 = new javax.swing.JLabel();
        lb_bkgQ6 = new javax.swing.JLabel();
        lb_userQ5 = new javax.swing.JLabel();
        lb_iconDataQ5 = new javax.swing.JLabel();
        lb_dataQ5 = new javax.swing.JLabel();
        lb_statusCivilQ5 = new javax.swing.JLabel();
        lb_iconUserQ5 = new javax.swing.JLabel();
        lb_iconQuartoQ5 = new javax.swing.JLabel();
        lb_infoQ5 = new javax.swing.JLabel();
        lb_nomeQuartoQ5 = new javax.swing.JLabel();
        lb_cbcQ5 = new javax.swing.JLabel();
        lb_bkgQ5 = new javax.swing.JLabel();
        lb_userQ4 = new javax.swing.JLabel();
        lb_iconDataQ4 = new javax.swing.JLabel();
        lb_dataQ4 = new javax.swing.JLabel();
        lb_statusCivilQ4 = new javax.swing.JLabel();
        lb_iconUserQ4 = new javax.swing.JLabel();
        lb_iconQuartoQ4 = new javax.swing.JLabel();
        lb_infoQ4 = new javax.swing.JLabel();
        lb_nomeQuartoQ4 = new javax.swing.JLabel();
        lb_cbcQ4 = new javax.swing.JLabel();
        lb_bkgQ4 = new javax.swing.JLabel();
        lb_statusCivilQ3 = new javax.swing.JLabel();
        lb_iconQuartoQ3 = new javax.swing.JLabel();
        lb_dataQ3 = new javax.swing.JLabel();
        lb_iconDataQ3 = new javax.swing.JLabel();
        lb_userQ3 = new javax.swing.JLabel();
        lb_iconUserQ3 = new javax.swing.JLabel();
        lb_infoQ3 = new javax.swing.JLabel();
        lb_nomeQuartoQ3 = new javax.swing.JLabel();
        lb_cbcQ3 = new javax.swing.JLabel();
        lb_bkgQ3 = new javax.swing.JLabel();
        lb_statusCivilQ2 = new javax.swing.JLabel();
        lb_iconQuartoQ2 = new javax.swing.JLabel();
        lb_dataQ2 = new javax.swing.JLabel();
        lb_iconDataQ2 = new javax.swing.JLabel();
        lb_userQ2 = new javax.swing.JLabel();
        lb_iconUserQ2 = new javax.swing.JLabel();
        lb_infoQ2 = new javax.swing.JLabel();
        lb_nomeQuartoQ2 = new javax.swing.JLabel();
        lb_cbcQ2 = new javax.swing.JLabel();
        lb_bkgQ2 = new javax.swing.JLabel();
        lb_statusCivilQ1 = new javax.swing.JLabel();
        lb_iconQuartoQ1 = new javax.swing.JLabel();
        lb_dataQ1 = new javax.swing.JLabel();
        lb_iconDataQ1 = new javax.swing.JLabel();
        lb_userQ1 = new javax.swing.JLabel();
        lb_iconUserQ1 = new javax.swing.JLabel();
        lb_iconInfoQ1 = new javax.swing.JLabel();
        lb_nomeQuartoQ1 = new javax.swing.JLabel();
        lb_cbcQ1 = new javax.swing.JLabel();
        lb_bkgQ1 = new javax.swing.JLabel();
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
        lb_menuSupSaiHoje = new javax.swing.JLabel();
        lb_bkgMenuSupSaiHoje = new javax.swing.JLabel();
        lb_menuSupEntraHoje = new javax.swing.JLabel();
        lb_bkgMenuSupEntraHoje = new javax.swing.JLabel();
        lb_menuSupLimpeza = new javax.swing.JLabel();
        lb_bkgMenuSupLimpeza = new javax.swing.JLabel();
        lb_menuSupOcupado = new javax.swing.JLabel();
        lb_bkgMenuSupOcupado = new javax.swing.JLabel();
        lb_menuSupDisp = new javax.swing.JLabel();
        lb_bkgMenuSupDisp = new javax.swing.JLabel();
        lb_menuSupTodos = new javax.swing.JLabel();
        lb_bkgMenuSupTodos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setLayout(null);

        lb_iconUserQ9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUser.png"))); // NOI18N
        add(lb_iconUserQ9);
        lb_iconUserQ9.setBounds(1080, 610, 190, 12);

        lb_userQ9.setBackground(new java.awt.Color(0, 0, 0));
        lb_userQ9.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_userQ9.setForeground(new java.awt.Color(0, 0, 0));
        lb_userQ9.setText("Duda Costa");
        add(lb_userQ9);
        lb_userQ9.setBounds(1100, 610, 200, 10);

        lb_iconQuartoQ9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCobertor.png"))); // NOI18N
        lb_iconQuartoQ9.setText("jLabel1");
        lb_iconQuartoQ9.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconQuartoQ9);
        lb_iconQuartoQ9.setBounds(1080, 650, 12, 12);

        lb_statusCivilQ9.setBackground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ9.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_statusCivilQ9.setForeground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ9.setText("Solteiro");
        add(lb_statusCivilQ9);
        lb_statusCivilQ9.setBounds(1100, 650, 200, 10);

        lb_dataQ9.setBackground(new java.awt.Color(0, 0, 0));
        lb_dataQ9.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_dataQ9.setForeground(new java.awt.Color(0, 0, 0));
        lb_dataQ9.setText("19/09/2023 - 22/09/2023");
        add(lb_dataQ9);
        lb_dataQ9.setBounds(1100, 630, 200, 10);

        lb_iconDataQ9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalendario.png"))); // NOI18N
        lb_iconDataQ9.setText("jLabel1");
        lb_iconDataQ9.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconDataQ9);
        lb_iconDataQ9.setBounds(1080, 630, 12, 12);

        lb_infoQ9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/informacoes 1.png"))); // NOI18N
        lb_infoQ9.setText("jLabel1");
        lb_infoQ9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_infoQ9.setPreferredSize(new java.awt.Dimension(25, 27));
        add(lb_infoQ9);
        lb_infoQ9.setBounds(1260, 650, 25, 27);

        lb_nomeQuartoQ9.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_nomeQuartoQ9.setForeground(new java.awt.Color(255, 255, 255));
        lb_nomeQuartoQ9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nomeQuartoQ9.setText("QUARTO 09");
        lb_nomeQuartoQ9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_nomeQuartoQ9);
        lb_nomeQuartoQ9.setBounds(1060, 543, 240, 40);

        lb_cbcQ9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cbcLimpeza.png"))); // NOI18N
        add(lb_cbcQ9);
        lb_cbcQ9.setBounds(1060, 540, 241, 45);

        lb_bkgQ9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        add(lb_bkgQ9);
        lb_bkgQ9.setBounds(1060, 540, 241, 157);

        lb_dataQ8.setBackground(new java.awt.Color(0, 0, 0));
        lb_dataQ8.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_dataQ8.setForeground(new java.awt.Color(0, 0, 0));
        lb_dataQ8.setText("19/09/2023 - 22/09/2023");
        add(lb_dataQ8);
        lb_dataQ8.setBounds(750, 630, 200, 10);

        lb_iconUserQ8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUser.png"))); // NOI18N
        add(lb_iconUserQ8);
        lb_iconUserQ8.setBounds(730, 610, 190, 12);

        lb_iconQuartoQ8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCobertor.png"))); // NOI18N
        lb_iconQuartoQ8.setText("jLabel1");
        lb_iconQuartoQ8.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconQuartoQ8);
        lb_iconQuartoQ8.setBounds(730, 650, 12, 12);

        lb_iconDataQ8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalendario.png"))); // NOI18N
        lb_iconDataQ8.setText("jLabel1");
        lb_iconDataQ8.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconDataQ8);
        lb_iconDataQ8.setBounds(730, 630, 12, 12);

        lb_statusCivilQ8.setBackground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ8.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_statusCivilQ8.setForeground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ8.setText("Solteiro");
        add(lb_statusCivilQ8);
        lb_statusCivilQ8.setBounds(750, 650, 200, 10);

        lb_userQ8.setBackground(new java.awt.Color(0, 0, 0));
        lb_userQ8.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_userQ8.setForeground(new java.awt.Color(0, 0, 0));
        lb_userQ8.setText("Duda Costa");
        add(lb_userQ8);
        lb_userQ8.setBounds(750, 610, 200, 10);

        lb_infoQ8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/informacoes 1.png"))); // NOI18N
        lb_infoQ8.setText("jLabel1");
        lb_infoQ8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_infoQ8.setPreferredSize(new java.awt.Dimension(25, 27));
        add(lb_infoQ8);
        lb_infoQ8.setBounds(910, 660, 25, 27);

        lb_nomeQuartoQ8.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_nomeQuartoQ8.setForeground(new java.awt.Color(255, 255, 255));
        lb_nomeQuartoQ8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nomeQuartoQ8.setText("QUARTO 08");
        lb_nomeQuartoQ8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_nomeQuartoQ8);
        lb_nomeQuartoQ8.setBounds(710, 543, 240, 40);

        lb_cbcQ8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cbcSaiHoje.png"))); // NOI18N
        add(lb_cbcQ8);
        lb_cbcQ8.setBounds(710, 540, 241, 45);

        lb_bkgQ8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        add(lb_bkgQ8);
        lb_bkgQ8.setBounds(710, 540, 241, 157);

        lb_dataQ7.setBackground(new java.awt.Color(0, 0, 0));
        lb_dataQ7.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_dataQ7.setForeground(new java.awt.Color(0, 0, 0));
        lb_dataQ7.setText("19/09/2023 - 22/09/2023");
        add(lb_dataQ7);
        lb_dataQ7.setBounds(410, 630, 200, 10);

        lb_iconQuartoQ7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCobertor.png"))); // NOI18N
        lb_iconQuartoQ7.setText("jLabel1");
        lb_iconQuartoQ7.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconQuartoQ7);
        lb_iconQuartoQ7.setBounds(390, 650, 12, 12);

        lb_statusCivilQ7.setBackground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ7.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_statusCivilQ7.setForeground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ7.setText("Solteiro");
        add(lb_statusCivilQ7);
        lb_statusCivilQ7.setBounds(410, 650, 200, 10);

        lb_iconDataQ7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalendario.png"))); // NOI18N
        lb_iconDataQ7.setText("jLabel1");
        lb_iconDataQ7.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconDataQ7);
        lb_iconDataQ7.setBounds(390, 630, 12, 12);

        lb_userQ7.setBackground(new java.awt.Color(0, 0, 0));
        lb_userQ7.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_userQ7.setForeground(new java.awt.Color(0, 0, 0));
        lb_userQ7.setText("Duda Costa");
        add(lb_userQ7);
        lb_userQ7.setBounds(410, 610, 200, 10);

        lb_iconUserQ7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUser.png"))); // NOI18N
        add(lb_iconUserQ7);
        lb_iconUserQ7.setBounds(390, 610, 190, 12);

        lb_infoQ7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/informacoes 1.png"))); // NOI18N
        lb_infoQ7.setText("jLabel1");
        lb_infoQ7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_infoQ7.setPreferredSize(new java.awt.Dimension(25, 27));
        add(lb_infoQ7);
        lb_infoQ7.setBounds(570, 660, 25, 27);

        lb_nomeQuartoQ7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_nomeQuartoQ7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nomeQuartoQ7.setText("QUARTO 07");
        lb_nomeQuartoQ7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_nomeQuartoQ7);
        lb_nomeQuartoQ7.setBounds(370, 543, 240, 40);

        lb_cbcQ7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cbcEntraHoje.png"))); // NOI18N
        add(lb_cbcQ7);
        lb_cbcQ7.setBounds(370, 540, 241, 45);

        lb_bkgQ7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        add(lb_bkgQ7);
        lb_bkgQ7.setBounds(370, 540, 241, 157);

        lb_statusCivilQ6.setBackground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ6.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_statusCivilQ6.setForeground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ6.setText("-");
        add(lb_statusCivilQ6);
        lb_statusCivilQ6.setBounds(1100, 450, 200, 10);

        lb_iconUserQ6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUser.png"))); // NOI18N
        add(lb_iconUserQ6);
        lb_iconUserQ6.setBounds(1080, 410, 20, 12);

        lb_iconQuartoQ6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCobertor.png"))); // NOI18N
        lb_iconQuartoQ6.setText("jLabel1");
        lb_iconQuartoQ6.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconQuartoQ6);
        lb_iconQuartoQ6.setBounds(1080, 450, 12, 12);

        lb_iconDataQ6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalendario.png"))); // NOI18N
        lb_iconDataQ6.setText("jLabel1");
        lb_iconDataQ6.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconDataQ6);
        lb_iconDataQ6.setBounds(1080, 430, 12, 12);

        lb_dataQ6.setBackground(new java.awt.Color(0, 0, 0));
        lb_dataQ6.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_dataQ6.setForeground(new java.awt.Color(0, 0, 0));
        lb_dataQ6.setText("-");
        add(lb_dataQ6);
        lb_dataQ6.setBounds(1100, 430, 200, 10);

        lb_userQ6.setBackground(new java.awt.Color(0, 0, 0));
        lb_userQ6.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_userQ6.setForeground(new java.awt.Color(0, 0, 0));
        lb_userQ6.setText("-");
        add(lb_userQ6);
        lb_userQ6.setBounds(1100, 410, 200, 10);

        lb_infoQ6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/informacoes 1.png"))); // NOI18N
        lb_infoQ6.setText("jLabel1");
        lb_infoQ6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_infoQ6.setPreferredSize(new java.awt.Dimension(25, 27));
        add(lb_infoQ6);
        lb_infoQ6.setBounds(1260, 450, 25, 27);

        lb_nomeQuartoQ6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_nomeQuartoQ6.setForeground(new java.awt.Color(0, 0, 0));
        lb_nomeQuartoQ6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nomeQuartoQ6.setText("QUARTO 06");
        lb_nomeQuartoQ6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_nomeQuartoQ6);
        lb_nomeQuartoQ6.setBounds(1060, 342, 240, 40);

        lb_cbcQ6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cbcDisp.png"))); // NOI18N
        add(lb_cbcQ6);
        lb_cbcQ6.setBounds(1060, 340, 241, 45);

        lb_bkgQ6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        add(lb_bkgQ6);
        lb_bkgQ6.setBounds(1060, 340, 241, 157);

        lb_userQ5.setBackground(new java.awt.Color(0, 0, 0));
        lb_userQ5.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_userQ5.setForeground(new java.awt.Color(0, 0, 0));
        lb_userQ5.setText("-");
        add(lb_userQ5);
        lb_userQ5.setBounds(750, 410, 200, 10);

        lb_iconDataQ5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalendario.png"))); // NOI18N
        lb_iconDataQ5.setText("jLabel1");
        lb_iconDataQ5.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconDataQ5);
        lb_iconDataQ5.setBounds(730, 430, 12, 12);

        lb_dataQ5.setBackground(new java.awt.Color(0, 0, 0));
        lb_dataQ5.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_dataQ5.setForeground(new java.awt.Color(0, 0, 0));
        lb_dataQ5.setText("-");
        add(lb_dataQ5);
        lb_dataQ5.setBounds(750, 430, 200, 10);

        lb_statusCivilQ5.setBackground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ5.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_statusCivilQ5.setForeground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ5.setText("-");
        add(lb_statusCivilQ5);
        lb_statusCivilQ5.setBounds(750, 450, 200, 10);

        lb_iconUserQ5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUser.png"))); // NOI18N
        add(lb_iconUserQ5);
        lb_iconUserQ5.setBounds(730, 410, 20, 12);

        lb_iconQuartoQ5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCobertor.png"))); // NOI18N
        lb_iconQuartoQ5.setText("jLabel1");
        lb_iconQuartoQ5.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconQuartoQ5);
        lb_iconQuartoQ5.setBounds(730, 450, 12, 12);

        lb_infoQ5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/informacoes 1.png"))); // NOI18N
        lb_infoQ5.setText("jLabel1");
        lb_infoQ5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_infoQ5.setPreferredSize(new java.awt.Dimension(25, 27));
        add(lb_infoQ5);
        lb_infoQ5.setBounds(910, 460, 25, 27);

        lb_nomeQuartoQ5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_nomeQuartoQ5.setForeground(new java.awt.Color(0, 0, 0));
        lb_nomeQuartoQ5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nomeQuartoQ5.setText("QUARTO 05");
        lb_nomeQuartoQ5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_nomeQuartoQ5);
        lb_nomeQuartoQ5.setBounds(710, 342, 240, 40);

        lb_cbcQ5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cbcDisp.png"))); // NOI18N
        add(lb_cbcQ5);
        lb_cbcQ5.setBounds(710, 340, 241, 45);

        lb_bkgQ5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        add(lb_bkgQ5);
        lb_bkgQ5.setBounds(710, 340, 241, 157);

        lb_userQ4.setBackground(new java.awt.Color(0, 0, 0));
        lb_userQ4.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_userQ4.setForeground(new java.awt.Color(0, 0, 0));
        lb_userQ4.setText("Duda Costa");
        add(lb_userQ4);
        lb_userQ4.setBounds(410, 410, 200, 10);

        lb_iconDataQ4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalendario.png"))); // NOI18N
        lb_iconDataQ4.setText("jLabel1");
        lb_iconDataQ4.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconDataQ4);
        lb_iconDataQ4.setBounds(390, 430, 12, 12);

        lb_dataQ4.setBackground(new java.awt.Color(0, 0, 0));
        lb_dataQ4.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_dataQ4.setForeground(new java.awt.Color(0, 0, 0));
        lb_dataQ4.setText("19/09/2023 - 22/09/2023");
        add(lb_dataQ4);
        lb_dataQ4.setBounds(410, 430, 200, 10);

        lb_statusCivilQ4.setBackground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ4.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_statusCivilQ4.setForeground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ4.setText("Solteiro");
        add(lb_statusCivilQ4);
        lb_statusCivilQ4.setBounds(410, 450, 200, 10);

        lb_iconUserQ4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUser.png"))); // NOI18N
        add(lb_iconUserQ4);
        lb_iconUserQ4.setBounds(390, 410, 190, 12);

        lb_iconQuartoQ4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCobertor.png"))); // NOI18N
        lb_iconQuartoQ4.setText("jLabel1");
        lb_iconQuartoQ4.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconQuartoQ4);
        lb_iconQuartoQ4.setBounds(390, 450, 12, 12);

        lb_infoQ4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/informacoes 1.png"))); // NOI18N
        lb_infoQ4.setText("jLabel1");
        lb_infoQ4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_infoQ4.setPreferredSize(new java.awt.Dimension(25, 27));
        add(lb_infoQ4);
        lb_infoQ4.setBounds(570, 460, 25, 27);

        lb_nomeQuartoQ4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_nomeQuartoQ4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nomeQuartoQ4.setText("QUARTO 04");
        lb_nomeQuartoQ4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_nomeQuartoQ4);
        lb_nomeQuartoQ4.setBounds(370, 342, 240, 40);

        lb_cbcQ4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cbcOcupado.png"))); // NOI18N
        add(lb_cbcQ4);
        lb_cbcQ4.setBounds(370, 340, 241, 45);

        lb_bkgQ4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        add(lb_bkgQ4);
        lb_bkgQ4.setBounds(370, 340, 241, 157);

        lb_statusCivilQ3.setBackground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ3.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_statusCivilQ3.setForeground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ3.setText("Solteiro");
        add(lb_statusCivilQ3);
        lb_statusCivilQ3.setBounds(1100, 240, 200, 10);

        lb_iconQuartoQ3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCobertor.png"))); // NOI18N
        lb_iconQuartoQ3.setText("jLabel1");
        lb_iconQuartoQ3.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconQuartoQ3);
        lb_iconQuartoQ3.setBounds(1080, 240, 12, 12);

        lb_dataQ3.setBackground(new java.awt.Color(0, 0, 0));
        lb_dataQ3.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_dataQ3.setForeground(new java.awt.Color(0, 0, 0));
        lb_dataQ3.setText("19/09/2023 - 22/09/2023");
        add(lb_dataQ3);
        lb_dataQ3.setBounds(1100, 220, 200, 10);

        lb_iconDataQ3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalendario.png"))); // NOI18N
        lb_iconDataQ3.setText("jLabel1");
        lb_iconDataQ3.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconDataQ3);
        lb_iconDataQ3.setBounds(1080, 220, 12, 12);

        lb_userQ3.setBackground(new java.awt.Color(0, 0, 0));
        lb_userQ3.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_userQ3.setForeground(new java.awt.Color(0, 0, 0));
        lb_userQ3.setText("Duda Costa");
        add(lb_userQ3);
        lb_userQ3.setBounds(1100, 200, 200, 10);

        lb_iconUserQ3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUser.png"))); // NOI18N
        add(lb_iconUserQ3);
        lb_iconUserQ3.setBounds(1080, 200, 20, 12);

        lb_infoQ3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/informacoes 1.png"))); // NOI18N
        lb_infoQ3.setText("jLabel1");
        lb_infoQ3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_infoQ3.setPreferredSize(new java.awt.Dimension(25, 27));
        add(lb_infoQ3);
        lb_infoQ3.setBounds(1260, 250, 25, 27);

        lb_nomeQuartoQ3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_nomeQuartoQ3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nomeQuartoQ3.setText("QUARTO 03");
        lb_nomeQuartoQ3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_nomeQuartoQ3);
        lb_nomeQuartoQ3.setBounds(1060, 133, 240, 40);

        lb_cbcQ3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cbcLimpeza.png"))); // NOI18N
        add(lb_cbcQ3);
        lb_cbcQ3.setBounds(1060, 130, 241, 45);

        lb_bkgQ3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        add(lb_bkgQ3);
        lb_bkgQ3.setBounds(1060, 130, 241, 157);

        lb_statusCivilQ2.setBackground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ2.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_statusCivilQ2.setForeground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ2.setText("Casal");
        add(lb_statusCivilQ2);
        lb_statusCivilQ2.setBounds(750, 240, 200, 10);

        lb_iconQuartoQ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCobertor.png"))); // NOI18N
        lb_iconQuartoQ2.setText("jLabel1");
        lb_iconQuartoQ2.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconQuartoQ2);
        lb_iconQuartoQ2.setBounds(730, 240, 12, 12);

        lb_dataQ2.setBackground(new java.awt.Color(0, 0, 0));
        lb_dataQ2.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_dataQ2.setForeground(new java.awt.Color(0, 0, 0));
        lb_dataQ2.setText("19/09/2023 - 22/09/2023");
        add(lb_dataQ2);
        lb_dataQ2.setBounds(750, 220, 200, 10);

        lb_iconDataQ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalendario.png"))); // NOI18N
        lb_iconDataQ2.setText("jLabel1");
        lb_iconDataQ2.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconDataQ2);
        lb_iconDataQ2.setBounds(730, 220, 12, 12);

        lb_userQ2.setBackground(new java.awt.Color(0, 0, 0));
        lb_userQ2.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_userQ2.setForeground(new java.awt.Color(0, 0, 0));
        lb_userQ2.setText("Duda Costa");
        add(lb_userQ2);
        lb_userQ2.setBounds(750, 200, 200, 10);

        lb_iconUserQ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUser.png"))); // NOI18N
        add(lb_iconUserQ2);
        lb_iconUserQ2.setBounds(730, 200, 20, 12);

        lb_infoQ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/informacoes 1.png"))); // NOI18N
        lb_infoQ2.setText("jLabel1");
        lb_infoQ2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_infoQ2.setPreferredSize(new java.awt.Dimension(25, 27));
        add(lb_infoQ2);
        lb_infoQ2.setBounds(910, 250, 25, 27);

        lb_nomeQuartoQ2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_nomeQuartoQ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nomeQuartoQ2.setText("QUARTO 02");
        lb_nomeQuartoQ2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_nomeQuartoQ2);
        lb_nomeQuartoQ2.setBounds(720, 133, 220, 40);

        lb_cbcQ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cbcSaiHoje.png"))); // NOI18N
        add(lb_cbcQ2);
        lb_cbcQ2.setBounds(710, 130, 241, 45);

        lb_bkgQ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        add(lb_bkgQ2);
        lb_bkgQ2.setBounds(710, 130, 241, 157);

        lb_statusCivilQ1.setBackground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_statusCivilQ1.setForeground(new java.awt.Color(0, 0, 0));
        lb_statusCivilQ1.setText("Solteiro");
        add(lb_statusCivilQ1);
        lb_statusCivilQ1.setBounds(410, 240, 200, 10);

        lb_iconQuartoQ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCobertor.png"))); // NOI18N
        lb_iconQuartoQ1.setText("jLabel1");
        lb_iconQuartoQ1.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconQuartoQ1);
        lb_iconQuartoQ1.setBounds(390, 240, 12, 12);

        lb_dataQ1.setBackground(new java.awt.Color(0, 0, 0));
        lb_dataQ1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_dataQ1.setForeground(new java.awt.Color(0, 0, 0));
        lb_dataQ1.setText("19/09/2023 - 22/09/2023");
        add(lb_dataQ1);
        lb_dataQ1.setBounds(410, 220, 200, 10);

        lb_iconDataQ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalendario.png"))); // NOI18N
        lb_iconDataQ1.setText("jLabel1");
        lb_iconDataQ1.setPreferredSize(new java.awt.Dimension(12, 12));
        add(lb_iconDataQ1);
        lb_iconDataQ1.setBounds(390, 220, 12, 12);

        lb_userQ1.setBackground(new java.awt.Color(0, 0, 0));
        lb_userQ1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lb_userQ1.setForeground(new java.awt.Color(0, 0, 0));
        lb_userQ1.setText("Duda Costa");
        add(lb_userQ1);
        lb_userQ1.setBounds(410, 200, 200, 10);

        lb_iconUserQ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUser.png"))); // NOI18N
        add(lb_iconUserQ1);
        lb_iconUserQ1.setBounds(390, 200, 20, 12);

        lb_iconInfoQ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/informacoes 1.png"))); // NOI18N
        lb_iconInfoQ1.setText("jLabel1");
        lb_iconInfoQ1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_iconInfoQ1.setPreferredSize(new java.awt.Dimension(25, 27));
        add(lb_iconInfoQ1);
        lb_iconInfoQ1.setBounds(570, 250, 25, 27);

        lb_nomeQuartoQ1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lb_nomeQuartoQ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nomeQuartoQ1.setText("QUARTO 01");
        lb_nomeQuartoQ1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lb_nomeQuartoQ1);
        lb_nomeQuartoQ1.setBounds(370, 133, 240, 40);

        lb_cbcQ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cbcEntraHoje.png"))); // NOI18N
        add(lb_cbcQ1);
        lb_cbcQ1.setBounds(370, 130, 241, 45);

        lb_bkgQ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        add(lb_bkgQ1);
        lb_bkgQ1.setBounds(370, 130, 241, 157);

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
        lb_Mailing.setBounds(50, 350, 70, 21);

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
        lb_DayUse.setBounds(50, 310, 70, 21);

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
        lb_Cadastro.setBounds(50, 270, 146, 21);

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
        lb_Reservar.setBounds(50, 230, 210, 21);

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
<<<<<<< HEAD
        lb_Calendario.setBounds(50, 190, 145, 20);
=======
        lb_Calendario.setBounds(50, 190, 181, 21);
>>>>>>> d1140903d3659b9c95813a3555db63dd395f4ce1

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
        lb_Home.setBounds(50, 150, 60, 21);

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

        lb_menuSupSaiHoje.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        lb_menuSupSaiHoje.setForeground(new java.awt.Color(0, 0, 0));
        lb_menuSupSaiHoje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_menuSupSaiHoje.setText("Sai hoje: 2");
        add(lb_menuSupSaiHoje);
        lb_menuSupSaiHoje.setBounds(1160, 70, 133, 30);

        lb_bkgMenuSupSaiHoje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuSupSaiHoje.png"))); // NOI18N
        add(lb_bkgMenuSupSaiHoje);
        lb_bkgMenuSupSaiHoje.setBounds(1160, 70, 133, 30);

        lb_menuSupEntraHoje.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        lb_menuSupEntraHoje.setForeground(new java.awt.Color(0, 0, 0));
        lb_menuSupEntraHoje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_menuSupEntraHoje.setText("Entra hoje: 2");
        add(lb_menuSupEntraHoje);
        lb_menuSupEntraHoje.setBounds(990, 70, 133, 30);

        lb_bkgMenuSupEntraHoje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuSupEntraHoje.png"))); // NOI18N
        add(lb_bkgMenuSupEntraHoje);
        lb_bkgMenuSupEntraHoje.setBounds(990, 70, 133, 30);

        lb_menuSupLimpeza.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        lb_menuSupLimpeza.setForeground(new java.awt.Color(0, 0, 0));
        lb_menuSupLimpeza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_menuSupLimpeza.setText("Limpeza: 2");
        add(lb_menuSupLimpeza);
        lb_menuSupLimpeza.setBounds(830, 70, 133, 30);

        lb_bkgMenuSupLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuSupLimpeza.png"))); // NOI18N
        add(lb_bkgMenuSupLimpeza);
        lb_bkgMenuSupLimpeza.setBounds(830, 70, 133, 30);

        lb_menuSupOcupado.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        lb_menuSupOcupado.setForeground(new java.awt.Color(0, 0, 0));
        lb_menuSupOcupado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_menuSupOcupado.setText("Ocupado: 1");
        add(lb_menuSupOcupado);
        lb_menuSupOcupado.setBounds(660, 70, 133, 30);

        lb_bkgMenuSupOcupado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuSupOcupado.png"))); // NOI18N
        add(lb_bkgMenuSupOcupado);
        lb_bkgMenuSupOcupado.setBounds(660, 70, 133, 30);

        lb_menuSupDisp.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        lb_menuSupDisp.setForeground(new java.awt.Color(0, 0, 0));
        lb_menuSupDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_menuSupDisp.setText("Disponível: 2");
        add(lb_menuSupDisp);
        lb_menuSupDisp.setBounds(490, 70, 133, 30);

        lb_bkgMenuSupDisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuSupDisp.png"))); // NOI18N
        add(lb_bkgMenuSupDisp);
        lb_bkgMenuSupDisp.setBounds(490, 70, 133, 30);

        lb_menuSupTodos.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        lb_menuSupTodos.setForeground(new java.awt.Color(0, 0, 0));
        lb_menuSupTodos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_menuSupTodos.setText("Todos: 9");
        add(lb_menuSupTodos);
        lb_menuSupTodos.setBounds(370, 70, 85, 30);

        lb_bkgMenuSupTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuSupTodos.png"))); // NOI18N
        add(lb_bkgMenuSupTodos);
        lb_bkgMenuSupTodos.setBounds(370, 70, 85, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_CadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CadastroMouseClicked
        Main.c1.getView().setTelaCadastro(new Panel_cadastroHospede(hospedeList));
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaCadastro());
    }//GEN-LAST:event_lb_CadastroMouseClicked

    private void lb_CalendarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CalendarioMouseEntered
        removeSelecao();
        lb_bkgCalendReserv.setVisible(true);
    }//GEN-LAST:event_lb_CalendarioMouseEntered

    private void lb_CalendarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CalendarioMouseExited
        removeSelecao();
    }//GEN-LAST:event_lb_CalendarioMouseExited

    private void lb_ReservarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ReservarMouseEntered
        removeSelecao();
        lb_bkgReserv.setVisible(true);
    }//GEN-LAST:event_lb_ReservarMouseEntered

    private void lb_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_HomeMouseEntered
        removeSelecao();
        lb_menuSelecionado.setVisible(true);
    }//GEN-LAST:event_lb_HomeMouseEntered

    private void lb_ReservarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ReservarMouseExited
        removeSelecao();
    }//GEN-LAST:event_lb_ReservarMouseExited

    private void lb_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_HomeMouseExited
        removeSelecao();
    }//GEN-LAST:event_lb_HomeMouseExited

    private void lb_CadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CadastroMouseEntered
        removeSelecao();
        lb_bkgCadastrar.setVisible(true);
    }//GEN-LAST:event_lb_CadastroMouseEntered

    private void lb_CadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CadastroMouseExited
        removeSelecao();
    }//GEN-LAST:event_lb_CadastroMouseExited

    private void lb_DayUseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_DayUseMouseEntered
        removeSelecao();
        lb_bkgDayUse.setVisible(true);
    }//GEN-LAST:event_lb_DayUseMouseEntered

    private void lb_DayUseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_DayUseMouseExited
        removeSelecao();
    }//GEN-LAST:event_lb_DayUseMouseExited

    private void lb_MailingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MailingMouseEntered
        removeSelecao();
        lb_bkgMailing.setVisible(true);
    }//GEN-LAST:event_lb_MailingMouseEntered

    private void lb_MailingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MailingMouseExited
        removeSelecao();
    }//GEN-LAST:event_lb_MailingMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel lb_bkgMenuSupDisp;
    private javax.swing.JLabel lb_bkgMenuSupEntraHoje;
    private javax.swing.JLabel lb_bkgMenuSupLimpeza;
    private javax.swing.JLabel lb_bkgMenuSupOcupado;
    private javax.swing.JLabel lb_bkgMenuSupSaiHoje;
    private javax.swing.JLabel lb_bkgMenuSupTodos;
    private javax.swing.JLabel lb_bkgQ1;
    private javax.swing.JLabel lb_bkgQ2;
    private javax.swing.JLabel lb_bkgQ3;
    private javax.swing.JLabel lb_bkgQ4;
    private javax.swing.JLabel lb_bkgQ5;
    private javax.swing.JLabel lb_bkgQ6;
    private javax.swing.JLabel lb_bkgQ7;
    private javax.swing.JLabel lb_bkgQ8;
    private javax.swing.JLabel lb_bkgQ9;
    private javax.swing.JLabel lb_bkgReserv;
    private javax.swing.JLabel lb_bkgSideBar;
    private javax.swing.JLabel lb_cbcQ1;
    private javax.swing.JLabel lb_cbcQ2;
    private javax.swing.JLabel lb_cbcQ3;
    private javax.swing.JLabel lb_cbcQ4;
    private javax.swing.JLabel lb_cbcQ5;
    private javax.swing.JLabel lb_cbcQ6;
    private javax.swing.JLabel lb_cbcQ7;
    private javax.swing.JLabel lb_cbcQ8;
    private javax.swing.JLabel lb_cbcQ9;
    private javax.swing.JLabel lb_dataQ1;
    private javax.swing.JLabel lb_dataQ2;
    private javax.swing.JLabel lb_dataQ3;
    private javax.swing.JLabel lb_dataQ4;
    private javax.swing.JLabel lb_dataQ5;
    private javax.swing.JLabel lb_dataQ6;
    private javax.swing.JLabel lb_dataQ7;
    private javax.swing.JLabel lb_dataQ8;
    private javax.swing.JLabel lb_dataQ9;
    private javax.swing.JLabel lb_iconDataQ1;
    private javax.swing.JLabel lb_iconDataQ2;
    private javax.swing.JLabel lb_iconDataQ3;
    private javax.swing.JLabel lb_iconDataQ4;
    private javax.swing.JLabel lb_iconDataQ5;
    private javax.swing.JLabel lb_iconDataQ6;
    private javax.swing.JLabel lb_iconDataQ7;
    private javax.swing.JLabel lb_iconDataQ8;
    private javax.swing.JLabel lb_iconDataQ9;
    private javax.swing.JLabel lb_iconInfoQ1;
    private javax.swing.JLabel lb_iconQuartoQ1;
    private javax.swing.JLabel lb_iconQuartoQ2;
    private javax.swing.JLabel lb_iconQuartoQ3;
    private javax.swing.JLabel lb_iconQuartoQ4;
    private javax.swing.JLabel lb_iconQuartoQ5;
    private javax.swing.JLabel lb_iconQuartoQ6;
    private javax.swing.JLabel lb_iconQuartoQ7;
    private javax.swing.JLabel lb_iconQuartoQ8;
    private javax.swing.JLabel lb_iconQuartoQ9;
    private javax.swing.JLabel lb_iconUserQ1;
    private javax.swing.JLabel lb_iconUserQ2;
    private javax.swing.JLabel lb_iconUserQ3;
    private javax.swing.JLabel lb_iconUserQ4;
    private javax.swing.JLabel lb_iconUserQ5;
    private javax.swing.JLabel lb_iconUserQ6;
    private javax.swing.JLabel lb_iconUserQ7;
    private javax.swing.JLabel lb_iconUserQ8;
    private javax.swing.JLabel lb_iconUserQ9;
    private javax.swing.JLabel lb_infoQ2;
    private javax.swing.JLabel lb_infoQ3;
    private javax.swing.JLabel lb_infoQ4;
    private javax.swing.JLabel lb_infoQ5;
    private javax.swing.JLabel lb_infoQ6;
    private javax.swing.JLabel lb_infoQ7;
    private javax.swing.JLabel lb_infoQ8;
    private javax.swing.JLabel lb_infoQ9;
    private javax.swing.JLabel lb_logoSideBar;
    private javax.swing.JLabel lb_menuSelecionado;
    private javax.swing.JLabel lb_menuSupDisp;
    private javax.swing.JLabel lb_menuSupEntraHoje;
    private javax.swing.JLabel lb_menuSupLimpeza;
    private javax.swing.JLabel lb_menuSupOcupado;
    private javax.swing.JLabel lb_menuSupSaiHoje;
    private javax.swing.JLabel lb_menuSupTodos;
    private javax.swing.JLabel lb_nomeQuartoQ1;
    private javax.swing.JLabel lb_nomeQuartoQ2;
    private javax.swing.JLabel lb_nomeQuartoQ3;
    private javax.swing.JLabel lb_nomeQuartoQ4;
    private javax.swing.JLabel lb_nomeQuartoQ5;
    private javax.swing.JLabel lb_nomeQuartoQ6;
    private javax.swing.JLabel lb_nomeQuartoQ7;
    private javax.swing.JLabel lb_nomeQuartoQ8;
    private javax.swing.JLabel lb_nomeQuartoQ9;
    private javax.swing.JLabel lb_statusCivilQ1;
    private javax.swing.JLabel lb_statusCivilQ2;
    private javax.swing.JLabel lb_statusCivilQ3;
    private javax.swing.JLabel lb_statusCivilQ4;
    private javax.swing.JLabel lb_statusCivilQ5;
    private javax.swing.JLabel lb_statusCivilQ6;
    private javax.swing.JLabel lb_statusCivilQ7;
    private javax.swing.JLabel lb_statusCivilQ8;
    private javax.swing.JLabel lb_statusCivilQ9;
    private javax.swing.JLabel lb_userQ1;
    private javax.swing.JLabel lb_userQ2;
    private javax.swing.JLabel lb_userQ3;
    private javax.swing.JLabel lb_userQ4;
    private javax.swing.JLabel lb_userQ5;
    private javax.swing.JLabel lb_userQ6;
    private javax.swing.JLabel lb_userQ7;
    private javax.swing.JLabel lb_userQ8;
    private javax.swing.JLabel lb_userQ9;
    // End of variables declaration//GEN-END:variables
}
