/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secure.files;

/**
 *
 * @author DELL
 */
public class Learn extends javax.swing.JFrame {

    /**
     * Creates new form Learn
     */
    public Learn() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        About = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        DImage = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        DText = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        EImage = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        EText = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        EImage1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 87));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel2.setText("Secure Files");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(502, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setWheelScrollingEnabled(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel8.setText("Learn How To Use :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 330, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setWheelScrollingEnabled(false);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Hello Users,\n           \n1) Encryption is the process of converting normal message\n    (plaintext) into meaningless message (Ciphertext). \n2) Decryption is the process of converting meaningless \n    message (Ciphertext) into its original form (Plaintext).\n\nAny message can be encrypted with either secret key\nor public key. This Secret key is called API key ( Application\nProgramming Interface Key). Without that key you can not\nDecrypt your file/text. If you use wrong key to decrypt file \nthen you might be lose your file. so it is highly recommanded\nto remember that key.\n\nIn this app you will see 4 main sections\n\n1) Encrypt Files :  In this part you have to enter key and cho-\n   ose the files. After that hit the Encrypt Button. Within few sec.\n   your file is encrypted.it's visible in that particular folder\n   but you can't see it. it's meaning-less. It is preferable that \n   choose file less than 1 GB for better performance\n\n2) Decrypt Files :  Same as Encrypt Part. but remeber one\n    thing. enter only key that you used to encrypt that file.\n    otherwise your file might be destroy.\n\n3) Encrypt Text : the process is same but in this section, you\n    can encrypt your random text. and copy paste that text \n    and send it your friends\n\n4) Decrypt Text : if someone gives you encrypted text and \n    key then you copy  that text and key and you will see \n    decrypted text.\n\nSo that's it ! now time to use this app. We hope you like it.\nEnjoy..!! For any query contact us. Information in about \nsection");
        jTextArea1.setEditable(false);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 580, 430));

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 600, 520));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        About.setBackground(new java.awt.Color(255, 255, 255));
        About.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        About.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("ABOUT US");

        javax.swing.GroupLayout AboutLayout = new javax.swing.GroupLayout(About);
        About.setLayout(AboutLayout);
        AboutLayout.setHorizontalGroup(
            AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        AboutLayout.setVerticalGroup(
            AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutLayout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel3.add(About, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 100, 30));

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("HOME");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jPanel3.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 100, 30));

        DImage.setBackground(new java.awt.Color(255, 255, 255));
        DImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DImageMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Decrypt File");

        javax.swing.GroupLayout DImageLayout = new javax.swing.GroupLayout(DImage);
        DImage.setLayout(DImageLayout);
        DImageLayout.setHorizontalGroup(
            DImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        DImageLayout.setVerticalGroup(
            DImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DImageLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel3.add(DImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 170, 30));

        DText.setBackground(new java.awt.Color(255, 255, 255));
        DText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DTextMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Decrypt Text");

        javax.swing.GroupLayout DTextLayout = new javax.swing.GroupLayout(DText);
        DText.setLayout(DTextLayout);
        DTextLayout.setHorizontalGroup(
            DTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DTextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        DTextLayout.setVerticalGroup(
            DTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DTextLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(DText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 160, 30));

        EImage.setBackground(new java.awt.Color(255, 255, 255));
        EImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EImageMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Encrypt File");

        javax.swing.GroupLayout EImageLayout = new javax.swing.GroupLayout(EImage);
        EImage.setLayout(EImageLayout);
        EImageLayout.setHorizontalGroup(
            EImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        EImageLayout.setVerticalGroup(
            EImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EImageLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel3.add(EImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 30));

        EText.setBackground(new java.awt.Color(255, 255, 255));
        EText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ETextMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Encrypt Text");

        javax.swing.GroupLayout ETextLayout = new javax.swing.GroupLayout(EText);
        EText.setLayout(ETextLayout);
        ETextLayout.setHorizontalGroup(
            ETextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ETextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        ETextLayout.setVerticalGroup(
            ETextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ETextLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(EText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, 30));

        EImage1.setBackground(new java.awt.Color(255, 153, 0));
        EImage1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setText("Learn App");

        javax.swing.GroupLayout EImage1Layout = new javax.swing.GroupLayout(EImage1);
        EImage1.setLayout(EImage1Layout);
        EImage1Layout.setHorizontalGroup(
            EImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        EImage1Layout.setVerticalGroup(
            EImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EImage1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel3.add(EImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 140, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMouseClicked
        // TODO add your handling code here:
        About l = new About();
        l.setVisible(true);
        l.setTitle("Secure Files");
        dispose();
    }//GEN-LAST:event_AboutMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        Dashboard d= new Dashboard();
        d.setVisible(true);
        d.setTitle("Secure Files");
        dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void DImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DImageMouseClicked
        // TODO add your handling code here:
        DecryptImage d = new DecryptImage();
        d.setVisible(true);
        d.setTitle("Secure Files");
        dispose();
    }//GEN-LAST:event_DImageMouseClicked

    private void DTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DTextMouseClicked
        // TODO add your handling code here:
        DecryptText t = new DecryptText();
        t.setVisible(true);
        t.setTitle("Secure Files");
        dispose();
    }//GEN-LAST:event_DTextMouseClicked

    private void EImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EImageMouseClicked
        // TODO add your handling code here:
        EncryptImage e = new EncryptImage();
        e.setVisible(true);
        e.setTitle("Secure Files");
        dispose();
    }//GEN-LAST:event_EImageMouseClicked

    private void ETextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ETextMouseClicked
        // TODO add your handling code here:
        EncryptText t = new EncryptText();
        t.setVisible(true);
        t.setTitle("Secure Files");
        dispose();
    }//GEN-LAST:event_ETextMouseClicked

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
            java.util.logging.Logger.getLogger(Learn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Learn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Learn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Learn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Learn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About;
    private javax.swing.JPanel DImage;
    private javax.swing.JPanel DText;
    private javax.swing.JPanel EImage;
    private javax.swing.JPanel EImage1;
    private javax.swing.JPanel EText;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
