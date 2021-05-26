/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bchat.gui;

import bchat.utilities.MyColors;
import bchat.controllers.UserController;
import bchat.entities.UserImp;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Blacky
 */
public class SignupFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form LoginFrame
     */
    public SignupFrame() {
        initComponents();

        // remove the north pane of this frame
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        setLocation(-10, 0);

        // change the color of jOptionPane
        UIManager.put("OptionPane.background", new Color(5, 100, 153));
        UIManager.getLookAndFeelDefaults().put("Panel.background", new Color(5, 100, 153));
        UIManager.put("control", new Color(5, 100, 153));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        
        this.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        signupPassword = new javax.swing.JPasswordField();
        signupUsername = new javax.swing.JTextField();
        signupBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        signupFname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        signupLname = new javax.swing.JTextField();

        setBorder(null);
        setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(5, 100, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create an account!");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bchat/res/username.png"))); // NOI18N
        jLabel2.setToolTipText("username");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bchat/res/password.png"))); // NOI18N
        jLabel3.setToolTipText("password");

        signupPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signupPassword.setForeground(new java.awt.Color(51, 153, 255));
        signupPassword.setToolTipText("password");
        signupPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        signupUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signupUsername.setForeground(new java.awt.Color(204, 204, 204));
        signupUsername.setText("Username");
        signupUsername.setToolTipText("username");
        signupUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        signupUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                signupUsernameFocusLost(evt);
            }
        });

        signupBtn.setBackground(new java.awt.Color(5, 100, 153));
        signupBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("GET STARTED");
        signupBtn.setBorder(null);
        signupBtn.setBorderPainted(false);
        signupBtn.setContentAreaFilled(false);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bchat/res/confirm.png"))); // NOI18N
        jLabel5.setToolTipText("confirm password");

        confirmPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmPassword.setForeground(new java.awt.Color(51, 153, 255));
        confirmPassword.setToolTipText("confirm password");
        confirmPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bchat/res/fname.png"))); // NOI18N
        jLabel4.setToolTipText("First Name");

        signupFname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signupFname.setForeground(new java.awt.Color(204, 204, 204));
        signupFname.setText("First Name");
        signupFname.setToolTipText("First Name");
        signupFname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        signupFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupFnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                signupFnameFocusLost(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bchat/res/lname.png"))); // NOI18N
        jLabel6.setToolTipText("Last Name");

        signupLname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signupLname.setForeground(new java.awt.Color(204, 204, 204));
        signupLname.setText("Last Name");
        signupLname.setToolTipText("Last Name");
        signupLname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        signupLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupLnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                signupLnameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(signupLname))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(signupUsername))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(signupPassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(signupFname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(signupBtn)
                        .addGap(63, 63, 63))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(signupFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(signupLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(signupUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signupPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addComponent(signupBtn)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed

        String username = this.signupUsername.getText();
        String password = this.signupPassword.getText();
        String passConfirm = confirmPassword.getText();
        String fName = signupFname.getText();
        String lName = signupLname.getText();

        // checking if fields are empty
        if (fName == null || fName.equals("") || fName.equals("First Name")) {
            JOptionPane.showMessageDialog(this,
                    "<html><b>First Name field required</b></html>",
                    "Entry Error",
                    JOptionPane.ERROR_MESSAGE);
            signupFname.requestFocus();
            return;
        }
        
        if (lName == null || lName.equals("") || lName.equals("Last Name")) {
            JOptionPane.showMessageDialog(this,
                    "<html><b>Last Name field required</b></html>",
                    "Entry Error",
                    JOptionPane.ERROR_MESSAGE);
            signupLname.requestFocus();
            return;
        }

        if (username == null || username.equals("") || username.equals("Username")) {
            JOptionPane.showMessageDialog(this,
                    "<html><b>Username field required</b></html>",
                    "Entry Error",
                    JOptionPane.ERROR_MESSAGE);
            signupUsername.requestFocus();
            return;
        }
        
        if (password == null || password.equals("")) {
            JOptionPane.showMessageDialog(this,
                    "<html><b>Password field required</b></html>",
                    "Entry Error",
                    JOptionPane.ERROR_MESSAGE);
            signupPassword.requestFocus();
            return;
        }

        // checking if signupUsername exists in db
        UserImp temp = UserController.INSTANCE.findByKey(username);
        if (temp == null) {
            // signup Username not used before

            if (password.equals(passConfirm)) {
                try {
                    int choice = JOptionPane.showConfirmDialog(this,
                            "<html><b>Create new account \"" + username + "\"?</b></html>",
                            "Confirm Account Creation",
                            JOptionPane.YES_NO_OPTION);

                    switch (choice) {
                        case JOptionPane.YES_OPTION:
                            // everything ok -> create account
                            UserController.INSTANCE.create(username, password, fName, lName);
                            
                            // switch back to login frame
                            MainUser.loginFrame.loginUsername.setText(username);
                            MainUser.loginFrame.setVisible(true);

                            // reinitialize fields and hide current frame
                            signupUsername.setForeground(MyColors.GRAY);
                            signupFname.setForeground(MyColors.GRAY);
                            signupLname.setForeground(MyColors.GRAY);
                            signupUsername.setText("Username");
                            signupFname.setText("First Name");
                            signupLname.setText("Last Name");
                            signupPassword.setText("");
                            confirmPassword.setText("");

                            JOptionPane.showMessageDialog(this,
                                    "<html><b>Account Created Successfully!</b></html>\n"
                                    + "<html><b>Please re-enter your password.</b></html>",
                                    "Success",
                                    JOptionPane.INFORMATION_MESSAGE);
                            this.setVisible(false);
                            break;

                        case JOptionPane.NO_OPTION:
                            break;

                        default:
                            break;
                    }

                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                // signupPassword mismatch -> do nothing
                JOptionPane.showMessageDialog(this,
                        "<html><b>Password Mismatch</b></html>",
                        "Entry Error",
                        JOptionPane.ERROR_MESSAGE);
                signupPassword.setText("");
                confirmPassword.setText("");
                signupPassword.requestFocus();
            }
        } else {
            // signupUsername already exist -> do nothing
            JOptionPane.showMessageDialog(this,
                    "<html><b>Username Already Exists</b></html>",
                    "Entry Error",
                    JOptionPane.ERROR_MESSAGE);
            signupUsername.setText("");
            signupPassword.setText("");
            confirmPassword.setText("");
            signupUsername.requestFocus();
        }
    }//GEN-LAST:event_signupBtnActionPerformed

    private void signupFnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupFnameFocusGained
        if (signupFname.getText().equals("First Name")) {
            signupFname.setText("");
            signupFname.setForeground(MyColors.LIGHT_BLUE);
        }
    }//GEN-LAST:event_signupFnameFocusGained

    private void signupFnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupFnameFocusLost
        if (signupFname.getText().equals("")) {
            signupFname.setText("First Name");
            signupFname.setForeground(MyColors.GRAY);
        }
    }//GEN-LAST:event_signupFnameFocusLost

    private void signupLnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupLnameFocusGained
        if (signupLname.getText().equals("Last Name")) {
            signupLname.setText("");
            signupLname.setForeground(MyColors.LIGHT_BLUE);
        }
    }//GEN-LAST:event_signupLnameFocusGained

    private void signupLnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupLnameFocusLost
        if (signupLname.getText().equals("")) {
            signupLname.setText("Last Name");
            signupLname.setForeground(MyColors.GRAY);
        }
    }//GEN-LAST:event_signupLnameFocusLost

    private void signupUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupUsernameFocusGained
        if (signupUsername.getText().equals("Username")) {
            signupUsername.setText("");
            signupUsername.setForeground(MyColors.LIGHT_BLUE);
        }
    }//GEN-LAST:event_signupUsernameFocusGained

    private void signupUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupUsernameFocusLost
        if (signupUsername.getText().equals("")) {
            signupUsername.setText("Username");
            signupUsername.setForeground(MyColors.GRAY);
        }
    }//GEN-LAST:event_signupUsernameFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton signupBtn;
    private javax.swing.JTextField signupFname;
    private javax.swing.JTextField signupLname;
    private javax.swing.JPasswordField signupPassword;
    private javax.swing.JTextField signupUsername;
    // End of variables declaration//GEN-END:variables
}
