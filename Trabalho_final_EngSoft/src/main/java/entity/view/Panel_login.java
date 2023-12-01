package entity.view;

import entity.controller.Main;
import javax.swing.SwingConstants;

public class Panel_login extends javax.swing.JPanel {

    public Panel_login() {
        initComponents();
        //   lb_logoHotel.setHorizontalAlignment(SwingConstants.CENTER);
        //   lb_bkgLogin.setHorizontalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_txAcessar = new javax.swing.JLabel();
        tf_Senha = new javax.swing.JTextField();
        tf_ID = new javax.swing.JTextField();
        lb_logoHotel = new javax.swing.JLabel();
        lb_bkgLogin = new javax.swing.JLabel();
        lb_btAcessar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setLayout(null);

        lb_txAcessar.setBackground(new java.awt.Color(187, 187, 187));
        lb_txAcessar.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        lb_txAcessar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txAcessar.setText("Acessar");
        lb_txAcessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_txAcessar);
        lb_txAcessar.setBounds(650, 560, 90, 15);

        tf_Senha.setBackground(new java.awt.Color(255, 255, 255));
        tf_Senha.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_Senha.setForeground(new java.awt.Color(153, 153, 153));
        tf_Senha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_Senha.setText("Senha");
        tf_Senha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_SenhaActionPerformed(evt);
            }
        });
        add(tf_Senha);
        tf_Senha.setBounds(460, 410, 460, 40);

        tf_ID.setBackground(new java.awt.Color(255, 255, 255));
        tf_ID.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_ID.setForeground(new java.awt.Color(153, 153, 153));
        tf_ID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_ID.setText("Identificador");
        tf_ID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(tf_ID);
        tf_ID.setBounds(460, 340, 460, 40);

        lb_logoHotel.setBackground(new java.awt.Color(204, 0, 204));
        lb_logoHotel.setForeground(new java.awt.Color(51, 255, 204));
        lb_logoHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hotelIcon.png"))); // NOI18N
        lb_logoHotel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_logoHotel.setRequestFocusEnabled(false);
        add(lb_logoHotel);
        lb_logoHotel.setBounds(510, 140, 350, 132);

        lb_bkgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/retanguloAzul.png"))); // NOI18N
        lb_bkgLogin.setMaximumSize(new java.awt.Dimension(628, 215));
        lb_bkgLogin.setMinimumSize(new java.awt.Dimension(628, 215));
        lb_bkgLogin.setPreferredSize(new java.awt.Dimension(628, 215));
        lb_bkgLogin.setRequestFocusEnabled(false);
        add(lb_bkgLogin);
        lb_bkgLogin.setBounds(370, 290, 636, 227);

        lb_btAcessar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_btAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/AcessarBotão.png"))); // NOI18N
        lb_btAcessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_btAcessar.setMaximumSize(new java.awt.Dimension(332, 48));
        lb_btAcessar.setMinimumSize(new java.awt.Dimension(332, 48));
        lb_btAcessar.setPreferredSize(new java.awt.Dimension(332, 48));
        lb_btAcessar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_btAcessarMouseClicked(evt);
            }
        });
        add(lb_btAcessar);
        lb_btAcessar.setBounds(520, 540, 340, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_SenhaActionPerformed

    private void lb_btAcessarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_btAcessarMouseClicked
        Main.c1.getView().setTelaHome(new Panel_home());
        Main.c1.getView().mostraTela(Main.c1.getView().getTelaHome());
    }//GEN-LAST:event_lb_btAcessarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_bkgLogin;
    private javax.swing.JLabel lb_btAcessar;
    private javax.swing.JLabel lb_logoHotel;
    private javax.swing.JLabel lb_txAcessar;
    private javax.swing.JTextField tf_ID;
    private javax.swing.JTextField tf_Senha;
    // End of variables declaration//GEN-END:variables
}
