package StartProgram;
import Customer.MainclassCustomer;
import StartProgram.LogIn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Register extends javax.swing.JFrame {
    
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LoginPage = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        RegPassword = new javax.swing.JPasswordField();
        Registerbtn = new javax.swing.JButton();
        ExitRegister = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        RegArea = new javax.swing.JTextField();
        RegEmail = new javax.swing.JTextField();
        RegName = new javax.swing.JTextField();
        RegPhone = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        RegCity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        RegAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(1150, 650));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(480, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginPage.setBackground(new java.awt.Color(0, 0, 0));
        LoginPage.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        LoginPage.setForeground(new java.awt.Color(223, 112, 0));
        LoginPage.setText("Log In");
        LoginPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPageActionPerformed(evt);
            }
        });
        jPanel1.add(LoginPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 130, 50));

        jPanel8.setBackground(new java.awt.Color(32, 32, 32));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 20, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logInBG1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 650));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(223, 112, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(420, 2));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 420, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(223, 112, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Create Account");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 310, 60));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setText("Password");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 120, 40));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setText("Phone Number");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 120, 30));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setText("Area");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 120, 40));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setText("Address");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 120, 40));

        jPanel14.setBackground(new java.awt.Color(223, 112, 0));
        jPanel14.setPreferredSize(new java.awt.Dimension(420, 2));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 420, -1));

        jPanel10.setBackground(new java.awt.Color(223, 112, 0));
        jPanel10.setPreferredSize(new java.awt.Dimension(420, 2));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 420, -1));

        jPanel12.setBackground(new java.awt.Color(223, 112, 0));
        jPanel12.setPreferredSize(new java.awt.Dimension(420, 2));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 420, -1));

        RegPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegPassword.setForeground(new java.awt.Color(204, 204, 204));
        RegPassword.setBorder(null);
        RegPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegPasswordActionPerformed(evt);
            }
        });
        jPanel6.add(RegPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 420, 30));

        Registerbtn.setBackground(new java.awt.Color(223, 112, 0));
        Registerbtn.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        Registerbtn.setForeground(new java.awt.Color(255, 255, 255));
        Registerbtn.setText("Register");
        Registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterbtnActionPerformed(evt);
            }
        });
        jPanel6.add(Registerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 160, 50));

        ExitRegister.setBackground(new java.awt.Color(223, 112, 0));
        ExitRegister.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        ExitRegister.setForeground(new java.awt.Color(255, 255, 255));
        ExitRegister.setText("X");
        ExitRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitRegisterActionPerformed(evt);
            }
        });
        jPanel6.add(ExitRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 40, 30));

        jPanel11.setBackground(new java.awt.Color(223, 112, 0));
        jPanel11.setPreferredSize(new java.awt.Dimension(420, 2));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 420, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel10.setText("Name");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 120, 30));

        RegArea.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        RegArea.setForeground(new java.awt.Color(204, 204, 204));
        RegArea.setBorder(null);
        RegArea.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        RegArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegAreaActionPerformed(evt);
            }
        });
        jPanel6.add(RegArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 420, 30));

        RegEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        RegEmail.setForeground(new java.awt.Color(204, 204, 204));
        RegEmail.setBorder(null);
        RegEmail.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        RegEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegEmailActionPerformed(evt);
            }
        });
        jPanel6.add(RegEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 420, 30));

        RegName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        RegName.setForeground(new java.awt.Color(204, 204, 204));
        RegName.setBorder(null);
        RegName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        RegName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegNameActionPerformed(evt);
            }
        });
        jPanel6.add(RegName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 420, 40));

        RegPhone.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        RegPhone.setForeground(new java.awt.Color(204, 204, 204));
        RegPhone.setBorder(null);
        RegPhone.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        RegPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegPhoneActionPerformed(evt);
            }
        });
        jPanel6.add(RegPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 420, 30));

        jPanel15.setBackground(new java.awt.Color(223, 112, 0));
        jPanel15.setPreferredSize(new java.awt.Dimension(420, 2));

        jPanel16.setBackground(new java.awt.Color(223, 112, 0));
        jPanel16.setPreferredSize(new java.awt.Dimension(420, 2));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel6.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 420, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel11.setText("City");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 120, 40));

        RegCity.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        RegCity.setForeground(new java.awt.Color(204, 204, 204));
        RegCity.setBorder(null);
        RegCity.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        RegCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegCityActionPerformed(evt);
            }
        });
        jPanel6.add(RegCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 420, 30));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel12.setText("Area");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 120, 40));

        jPanel17.setBackground(new java.awt.Color(223, 112, 0));
        jPanel17.setPreferredSize(new java.awt.Dimension(420, 2));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 420, -1));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel13.setText("Email");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 120, 40));

        RegAddress.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        RegAddress.setForeground(new java.awt.Color(204, 204, 204));
        RegAddress.setBorder(null);
        RegAddress.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        RegAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegAddressActionPerformed(evt);
            }
        });
        jPanel6.add(RegAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 420, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 670, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegEmailActionPerformed

    private void RegAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegAreaActionPerformed

    private void RegisterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterbtnActionPerformed

        try{
            String url ="jdbc:sqlserver://ISHA\\SQLEXPRESS:1433;databaseName=ASAPCourier";
            String username = "asfiqun";
            String password = "123456";
            Connection connection = DriverManager.getConnection(url,username,password);
            
            Statement statement = connection.createStatement();
            String UserPass= String.valueOf(RegPassword.getPassword());
            String sql = "INSERT into CUSTOMERINFO(CustomerName,CustomerEmail,CustomerPhone,CustomerAddress,CustomerArea,CustomerCity,CustomerPassword)" + "values ('"+RegName.getText()+"','"+RegEmail.getText()+"','"+RegPhone.getText()+"','"+RegAddress.getText()+"','"+RegArea.getText()+"','"+RegCity.getText()+"','"+UserPass+"')";
            int row = statement.executeUpdate(sql);
            if (row>0){
                JOptionPane.showMessageDialog(this, "You Have Successfully Registered. Now Log In to Continue.");
                new LogIn().setVisible(true);
                dispose();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_RegisterbtnActionPerformed

    private void RegNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegNameActionPerformed

    private void RegPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegPhoneActionPerformed

    private void ExitRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitRegisterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitRegisterActionPerformed

    private void LoginPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginPageActionPerformed
       LogIn login1=new LogIn();
       login1.setVisible(true);
       dispose();
    }//GEN-LAST:event_LoginPageActionPerformed

    private void RegCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegCityActionPerformed

    private void RegAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegAddressActionPerformed

    private void RegPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitRegister;
    private javax.swing.JButton LoginPage;
    private javax.swing.JTextField RegAddress;
    private javax.swing.JTextField RegArea;
    private javax.swing.JTextField RegCity;
    private javax.swing.JTextField RegEmail;
    private javax.swing.JTextField RegName;
    private javax.swing.JPasswordField RegPassword;
    private javax.swing.JTextField RegPhone;
    private javax.swing.JButton Registerbtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
