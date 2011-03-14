/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChannelSelecter.java
 *
 * Created on 2011/02/23, 11:17:50
 */
package jp.atr.dni.bmi.desktop.explorereditor;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import jp.atr.dni.bmi.desktop.model.Channel;
import jp.atr.dni.bmi.desktop.model.GeneralFileInfo;
import jp.atr.dni.bmi.desktop.model.Workspace;
import jp.atr.dni.bmi.desktop.neuroshareutils.NSReader;
import jp.atr.dni.bmi.desktop.neuroshareutils.NeuroshareFile;
import jp.atr.dni.bmi.desktop.workingfileutils.WorkingFileUtils;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.Exceptions;

/**
 *
 * @author kharada
 * @version 2010/02/23
 */
public class ChannelSelecter extends javax.swing.JPanel implements ActionListener {

    // Define Lists.
    DefaultListModel unSelectedChannelList;
    DefaultListModel selectedChannelList;
    DialogDescriptor dialogDescriptor;
    Dialog dialog;
    GeneralFileInfo generalFileInfo;

    /** Creates new form ChannelSelecter */
    public ChannelSelecter(GeneralFileInfo gfi) {

        beforeInitComponents(gfi);
        initComponents();
        afterInitComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText(org.openide.util.NbBundle.getMessage(ChannelSelecter.class, "ChannelSelecter.jLabel1.text")); // NOI18N

        jTextField1.setText(this.generalFileInfo.getFilePath());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 2.0;
        add(jPanel1, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, org.openide.util.NbBundle.getMessage(ChannelSelecter.class, "ChannelSelecter.jPanel4.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP)); // NOI18N

        jList2.setModel(selectedChannelList);
        jScrollPane2.setViewportView(jList2);

        jButton3.setText(org.openide.util.NbBundle.getMessage(ChannelSelecter.class, "ChannelSelecter.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(org.openide.util.NbBundle.getMessage(ChannelSelecter.class, "ChannelSelecter.jButton4.text")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 9.0;
        add(jPanel4, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, org.openide.util.NbBundle.getMessage(ChannelSelecter.class, "ChannelSelecter.jPanel3.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP)); // NOI18N

        jList1.setModel(unSelectedChannelList);
        jScrollPane1.setViewportView(jList1);

        jButton1.setText(org.openide.util.NbBundle.getMessage(ChannelSelecter.class, "ChannelSelecter.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(org.openide.util.NbBundle.getMessage(ChannelSelecter.class, "ChannelSelecter.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 9.0;
        add(jPanel3, gridBagConstraints);

        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(org.openide.util.NbBundle.getMessage(ChannelSelecter.class, "ChannelSelecter.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 2.0;
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Set all channels as Selected.
        if (this.unSelectedChannelList.isEmpty()) {
            return;
        }

        ArrayList<Channel> tmpChannelList = new ArrayList<Channel>();
        for (int ii = 0; ii < this.unSelectedChannelList.getSize(); ii++) {
            tmpChannelList.add((Channel) this.unSelectedChannelList.getElementAt(ii));
        }

        for (int jj = 0; jj < tmpChannelList.size(); jj++) {
            this.moveChannelToSelected(tmpChannelList.get(jj));
        }

        jList1.repaint();
        jList2.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Set chosen channel as Selected.
        Object[] chosen = jList1.getSelectedValues();
        if (chosen == null) {
            // Any channel is not chosen.
            return;
        }

        for (int ii = 0; ii < chosen.length; ii++) {
            Channel ch = (Channel) chosen[ii];
            this.moveChannelToSelected(ch);
        }

        jList1.repaint();
        jList2.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Set chosen channel as Unselected.
        Object[] chosen = jList2.getSelectedValues();
        if (chosen == null) {
            // Any channel is not chosen.
            return;
        }

        for (int ii = 0; ii < chosen.length; ii++) {
            Channel ch = (Channel) chosen[ii];
            this.moveChannelToUnSelected(ch);
        }

        jList1.repaint();
        jList2.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Set all channels as Unselected.
        if (this.selectedChannelList.isEmpty()) {
            return;
        }

        ArrayList<Channel> tmpChannelList = new ArrayList<Channel>();
        for (int ii = 0; ii < this.selectedChannelList.getSize(); ii++) {
            tmpChannelList.add((Channel) this.selectedChannelList.getElementAt(ii));
        }

        for (int jj = 0; jj < tmpChannelList.size(); jj++) {
            this.moveChannelToUnSelected(tmpChannelList.get(jj));
        }

        jList1.repaint();
        jList2.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == DialogDescriptor.OK_OPTION) {
            // Add Channels to the workspace.
            for (int ii = 0; ii < this.selectedChannelList.size(); ii++) {
                Object obj = this.selectedChannelList.get(ii);
                Channel ch = (Channel) obj;

                // Create working file.
                WorkingFileUtils wfu = new WorkingFileUtils();
                try {
                    wfu.createWorkingFile(ch.getSourceFilePath(), ch.getEntity());
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
                ch.setWorkingFilePath(wfu.getWorkingFilePath());

                Workspace.addChannel(ch);
            }
        }

    }

    private void beforeInitComponents(GeneralFileInfo generalFileInfo) {
        // Define settings about components.
        this.generalFileInfo = generalFileInfo;
        this.unSelectedChannelList = new DefaultListModel();
        this.selectedChannelList = new DefaultListModel();
    }

    private void afterInitComponents() {
        // Set values about components.
        this.dialogDescriptor = new DialogDescriptor(this, "Channel Selecter", true, this);

        // Case : Neuroshare.
        if (this.generalFileInfo.getFileType().equals("File/nsn")) {

            // Get nsObj to set channel list.
            NeuroshareFile nsf = this.generalFileInfo.getNsObj();
            if (nsf == null) {
                // Get nsObj if unload.
                NSReader nsr = new NSReader();
                nsf = nsr.readNSFileOnlyInfo(this.generalFileInfo.getFilePath());
                this.generalFileInfo.setNsObj(nsf);
            }

            // Remove all (remove all elements.)
            this.unSelectedChannelList.removeAllElements();
            this.selectedChannelList.removeAllElements();

            // Add channels to unSelectedChannelList.
            for (int ii = 0; ii < nsf.getEntities().size(); ii++) {
                Channel ch = new Channel(ii, nsf.getEntities().get(ii));
                this.unSelectedChannelList.add(ii, ch);
            }

        } else {
            JOptionPane.showMessageDialog(null, "It is not data file.");
        }
    }

    void showDialog() {
        this.dialog = DialogDisplayer.getDefault().createDialog(this.dialogDescriptor);
        this.dialog.setModal(true);
        this.dialog.pack();
        this.dialog.setVisible(true);
    }

    private void moveChannelToSelected(Channel ch) {
        if (this.selectedChannelList.isEmpty()) {
            // Add to First.
            this.selectedChannelList.addElement(ch);
        } else {
            int selectedChannelListSize = this.selectedChannelList.getSize();
            for (int ii = 0; ii < selectedChannelListSize; ii++) {
                Channel search = (Channel) this.selectedChannelList.getElementAt(ii);
                int diff = ch.getChannelID() - search.getChannelID();

                if (diff < 0) {
                    // Insert at ii.
                    this.selectedChannelList.insertElementAt(ch, ii);
                    break;
                }
                if (selectedChannelListSize <= ii + 1) {
                    // Add to Last.
                    this.selectedChannelList.addElement(ch);
                    break;
                }
            }
        }
        this.unSelectedChannelList.removeElement(ch);
    }

    private void moveChannelToUnSelected(Channel ch) {
        if (this.unSelectedChannelList.isEmpty()) {
            // Add to First.
            this.unSelectedChannelList.addElement(ch);
        } else {
            int unSelectedChannelListSize = this.unSelectedChannelList.getSize();
            for (int ii = 0; ii < unSelectedChannelListSize; ii++) {
                Channel search = (Channel) this.unSelectedChannelList.getElementAt(ii);
                int diff = ch.getChannelID() - search.getChannelID();

                if (diff < 0) {
                    // Insert at ii.
                    this.unSelectedChannelList.insertElementAt(ch, ii);
                    break;
                }
                if (unSelectedChannelListSize <= ii + 1) {
                    // Add to Last.
                    this.unSelectedChannelList.addElement(ch);
                    break;
                }
            }
        }
        this.selectedChannelList.removeElement(ch);
    }
}
