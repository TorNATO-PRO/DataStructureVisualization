/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblackvisualization;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;

/**
 *
 * @author nathan
 */
public class JFrameRedBlackTrees extends javax.swing.JFrame {

    private final RedBlackTree rbTree;

    /**
     * Creates new form JFrameRedBlackTrees
     */
    public JFrameRedBlackTrees() {
        initComponents();
        this.rbTree = new RedBlackTree((Graphics2D) PanelForDisplaying.getGraphics(), 
                DescriptionPane);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TraversalGroup = new javax.swing.ButtonGroup();
        DeleteButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        InsertButton = new javax.swing.JButton();
        TraverseButton = new javax.swing.JButton();
        PreOrderButton = new javax.swing.JRadioButton();
        InOrderButton = new javax.swing.JRadioButton();
        PostOrderButton = new javax.swing.JRadioButton();
        TreeTraversalsLabel = new javax.swing.JLabel();
        InsertUserInputField = new javax.swing.JTextField();
        DeleteUserInputField = new javax.swing.JTextField();
        SearchUserInputField = new javax.swing.JTextField();
        BlackTreesLabel = new javax.swing.JLabel();
        RedTreesLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescriptionPane = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        PanelForDisplaying = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 780));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 780));

        DeleteButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        SearchButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        InsertButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        InsertButton.setText("Insert");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        TraverseButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        TraverseButton.setText("Traverse");
        TraverseButton.setName("Traverse"); // NOI18N
        TraverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraverseButtonActionPerformed(evt);
            }
        });

        TraversalGroup.add(PreOrderButton);
        PreOrderButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PreOrderButton.setForeground(new java.awt.Color(152, 30, 50));
        PreOrderButton.setText("Pre-Order");

        TraversalGroup.add(InOrderButton);
        InOrderButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        InOrderButton.setForeground(new java.awt.Color(152, 30, 50));
        InOrderButton.setText("In-Order");
        InOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InOrderButtonActionPerformed(evt);
            }
        });

        TraversalGroup.add(PostOrderButton);
        PostOrderButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PostOrderButton.setForeground(new java.awt.Color(152, 30, 50));
        PostOrderButton.setText("Post-Order");
        PostOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostOrderButtonActionPerformed(evt);
            }
        });

        TreeTraversalsLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TreeTraversalsLabel.setForeground(new java.awt.Color(83, 86, 90));
        TreeTraversalsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TreeTraversalsLabel.setLabelFor(PreOrderButton);
        TreeTraversalsLabel.setText("Tree Traversals");

        InsertUserInputField.setBackground(new java.awt.Color(254, 254, 254));
        InsertUserInputField.setToolTipText("");
        InsertUserInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertUserInputFieldActionPerformed(evt);
            }
        });

        DeleteUserInputField.setBackground(new java.awt.Color(254, 254, 254));
        DeleteUserInputField.setToolTipText("");
        DeleteUserInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserInputFieldActionPerformed(evt);
            }
        });

        SearchUserInputField.setBackground(new java.awt.Color(254, 254, 254));
        SearchUserInputField.setToolTipText("");
        SearchUserInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchUserInputFieldActionPerformed(evt);
            }
        });

        BlackTreesLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BlackTreesLabel.setForeground(new java.awt.Color(83, 86, 90));
        BlackTreesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlackTreesLabel.setText("-Black Trees");

        RedTreesLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        RedTreesLabel.setForeground(new java.awt.Color(152, 30, 50));
        RedTreesLabel.setText("Red");

        DescriptionLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DescriptionLabel.setForeground(new java.awt.Color(152, 30, 50));
        DescriptionLabel.setText("Description");

        DescriptionPane.setEditable(false);
        jScrollPane1.setViewportView(DescriptionPane);

        PanelForDisplaying.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelForDisplayingLayout = new javax.swing.GroupLayout(PanelForDisplaying);
        PanelForDisplaying.setLayout(PanelForDisplayingLayout);
        PanelForDisplayingLayout.setHorizontalGroup(
            PanelForDisplayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelForDisplayingLayout.setVerticalGroup(
            PanelForDisplayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(PanelForDisplaying);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RedTreesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BlackTreesLabel)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DescriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TreeTraversalsLabel)
                                .addGap(118, 118, 118))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InsertUserInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InsertButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchUserInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteUserInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PostOrderButton)
                                    .addComponent(PreOrderButton))
                                .addGap(138, 138, 138))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InOrderButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TraverseButton)
                                .addGap(34, 34, 34))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TreeTraversalsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DescriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PreOrderButton)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(InOrderButton)
                                    .addComponent(TraverseButton)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(PostOrderButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BlackTreesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RedTreesLabel))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InsertUserInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InsertButton)
                            .addComponent(SearchUserInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchButton)
                            .addComponent(DeleteUserInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteButton))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        try {
            int DeleteThis = Integer.parseInt(DeleteUserInputField.getText());
            DeleteUserInputField.setText("");
            rbTree.deleteNode(DeleteThis);
        } catch (NumberFormatException exception) {
            DeleteUserInputField.setText("");
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        try {
            int SearchThis = Integer.parseInt(SearchUserInputField.getText());
            SearchUserInputField.setText("");
            rbTree.searchTree(SearchThis);
        } catch (NumberFormatException exception) {
            SearchUserInputField.setText("");
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
        try {
            int InsertThis = Integer.parseInt(InsertUserInputField.getText());
            InsertUserInputField.setText("");
            rbTree.insert(InsertThis);
        } catch (NumberFormatException exception) {
            InsertUserInputField.setText("");
        }
    }//GEN-LAST:event_InsertButtonActionPerformed

    private void TraverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraverseButtonActionPerformed
        if (PreOrderButton.isSelected()) {
            try {
                rbTree.preorder();
            } catch (InterruptedException ex) {
                Logger.getLogger(JFrameRedBlackTrees.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (InOrderButton.isSelected()) {
            rbTree.inorder();
        } else if (PostOrderButton.isSelected()) {
            rbTree.postorder();
        }
    }//GEN-LAST:event_TraverseButtonActionPerformed

    private void InOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InOrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InOrderButtonActionPerformed

    private void InsertUserInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertUserInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertUserInputFieldActionPerformed

    private void DeleteUserInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteUserInputFieldActionPerformed

    private void SearchUserInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchUserInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchUserInputFieldActionPerformed

    private void PostOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostOrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PostOrderButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(JFrameRedBlackTrees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameRedBlackTrees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameRedBlackTrees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameRedBlackTrees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameRedBlackTrees().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BlackTreesLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField DeleteUserInputField;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextPane DescriptionPane;
    private javax.swing.JRadioButton InOrderButton;
    private javax.swing.JButton InsertButton;
    private javax.swing.JTextField InsertUserInputField;
    private javax.swing.JPanel PanelForDisplaying;
    private javax.swing.JRadioButton PostOrderButton;
    private javax.swing.JRadioButton PreOrderButton;
    private javax.swing.JLabel RedTreesLabel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchUserInputField;
    private javax.swing.ButtonGroup TraversalGroup;
    private javax.swing.JButton TraverseButton;
    private javax.swing.JLabel TreeTraversalsLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
