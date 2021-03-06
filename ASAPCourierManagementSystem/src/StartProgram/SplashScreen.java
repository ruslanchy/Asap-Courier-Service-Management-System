package StartProgram;
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
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
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

        bg = new javax.swing.JPanel();
        LoadingBar = new javax.swing.JProgressBar();
        LoadingValue = new javax.swing.JLabel();
        Loadingtext = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        BGimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setPreferredSize(new java.awt.Dimension(650, 400));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingBar.setBackground(new java.awt.Color(204, 0, 0));
        LoadingBar.setForeground(new java.awt.Color(51, 255, 204));
        bg.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 540, -1));

        LoadingValue.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(204, 102, 0));
        LoadingValue.setText("0 %");
        bg.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        Loadingtext.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        Loadingtext.setForeground(new java.awt.Color(204, 102, 0));
        Loadingtext.setText("Loading...");
        bg.add(Loadingtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Management System");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 280, 30));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Logobig.png"))); // NOI18N
        Logo.setText("jLabel1");
        bg.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        BGimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Splashbackground.jpg"))); // NOI18N
        BGimage.setText("jLabel2");
        bg.add(BGimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        //Coding starts
       SplashScreen sp= new SplashScreen();
       sp.setVisible(true);
       
       try{
           for(int i=0;i<=100;i++){
           Thread.sleep(50);
           sp.LoadingValue.setText(i+"%");
           
           if(i==00){
               sp.Loadingtext.setText("Starting...");
           }
           
           if(i==40){
               sp.Loadingtext.setText("Connecting to Database...");
           }
           
           if(i==90){
               sp.Loadingtext.setText("Connection Succeded...");
           }
           sp.LoadingBar.setValue(i);
           }
       } catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
       
       LogIn login=new LogIn();
       login.setVisible(true);
       sp.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGimage;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel Loadingtext;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
