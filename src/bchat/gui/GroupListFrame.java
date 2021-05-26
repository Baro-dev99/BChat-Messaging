/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bchat.gui;

import bchat.entities.GroupImp;
import bchat.utilities.GroupListRenderer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Blacky
 */
public class GroupListFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form LoginFrame
     */
    private final DefaultListModel<GroupImp> listModel = new DefaultListModel<>();

    public GroupListFrame() {
        initComponents();

        // remove the north pane of this frame
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        setLocation(0, 0);

        groupsJlist.setCellRenderer(new GroupListRenderer());

        groupsJlist.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && !e.isConsumed()) {
                    e.consume();

                    if (MainUser.loggedIN == false) {
                        return;
                    }

                    System.out.println(groupsJlist.getSelectedIndex());

                    GroupImp remoteGroup = groupsJlist.getSelectedValue();
                    System.out.println("remoteGroupID: " + remoteGroup.getGroupId());

                    GroupChatFrame gFrame = MainUser.groupChatFrames.get(remoteGroup.getGroupId());

                    // show components
                    gFrame.profile.setVisible(true);
                    gFrame.remoteGroupName.setText(remoteGroup.getGroupName());
                    gFrame.remoteGroupName.setVisible(true);
                    gFrame.chatArea.setVisible(true);
                    gFrame.messageText.setVisible(true);
                    gFrame.sendMessageBtn.setVisible(true);

                    gFrame.setVisible(true);
                    gFrame.moveToFront();
                }
            }
        });

    }

    public void addToJList(GroupImp group) {
        listModel.addElement(group);
        groupsJlist.validate();
    }

    public void removeFromJList(int groupId) {
        for (int i = 0; i < listModel.size(); i++) {
            GroupImp group = listModel.get(i);
            if(group.getGroupId() == groupId) {
                listModel.removeElementAt(i);
                return;
            }
        }
    }
    
    public void clearJList() {
        listModel.clear();
        groupsJlist.validate();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        groupsJlist = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        addGroup = new javax.swing.JButton();

        setBorder(null);
        setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(5, 100, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(220, 410));

        jScrollPane1.setBorder(null);

        groupsJlist.setBackground(new java.awt.Color(5, 100, 153));
        groupsJlist.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        groupsJlist.setForeground(new java.awt.Color(255, 255, 255));
        groupsJlist.setModel(listModel);
        groupsJlist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        groupsJlist.setToolTipText("Double-Click to Select Item");
        jScrollPane1.setViewportView(groupsJlist);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Groups");

        addGroup.setBackground(new java.awt.Color(5, 100, 153));
        addGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bchat/res/addGroup.png"))); // NOI18N
        addGroup.setToolTipText("Create a Group");
        addGroup.setBorder(null);
        addGroup.setBorderPainted(false);
        addGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(addGroup)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addGroup, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupActionPerformed
        CreateGroupFrame frame = new CreateGroupFrame(MainUser.user.getIduser());
        MainUser.desk2.add(frame);
        frame.setLocation(100, 100);
        frame.setVisible(true);
    }//GEN-LAST:event_addGroupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGroup;
    public static javax.swing.JList<GroupImp> groupsJlist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}