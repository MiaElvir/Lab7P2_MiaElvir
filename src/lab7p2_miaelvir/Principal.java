/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab7p2_miaelvir;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        tf_command = new javax.swing.JTextField();
        jb_Enter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Arbol = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmi_newFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmi_importFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jmi_clearCommand = new javax.swing.JMenuItem();
        jmi_refreshArbol = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jm_help = new javax.swing.JMenu();
        jmi_estructuraP = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tf_command.setBackground(new java.awt.Color(204, 204, 255));
        tf_command.setForeground(new java.awt.Color(0, 0, 0));

        jb_Enter.setBackground(new java.awt.Color(204, 204, 255));
        jb_Enter.setForeground(new java.awt.Color(0, 0, 0));
        jb_Enter.setText("Enter");
        jb_Enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_EnterMouseClicked(evt);
            }
        });
        jb_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_EnterActionPerformed(evt);
            }
        });

        jt_Arbol.setBackground(new java.awt.Color(204, 204, 204));
        jt_Arbol.setForeground(new java.awt.Color(0, 0, 0));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("CSVs");
        jt_Arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_Arbol);

        jt_Tabla.setBackground(new java.awt.Color(51, 51, 51));
        jt_Tabla.setForeground(new java.awt.Color(255, 255, 255));
        jt_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Categoria", "Precio", "Aisle", "Bin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_Tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_command, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_Enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_Enter, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(tf_command))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmi_newFile.setText("File");

        jMenuItem1.setText("New File");
        jmi_newFile.add(jMenuItem1);

        jmi_importFile.setText("Import File ");
        jmi_newFile.add(jmi_importFile);

        jMenuBar1.add(jmi_newFile);

        jMenu2.setText("Window");

        jMenu4.setText("Clear");

        jmi_clearCommand.setText("Clear Command Line");
        jMenu4.add(jmi_clearCommand);

        jmi_refreshArbol.setText("Clear Table");
        jMenu4.add(jmi_refreshArbol);

        jMenu2.add(jMenu4);

        jMenuItem5.setText("Refresh Trees");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jm_help.setText("Help");

        jmi_estructuraP.setText("Product Structure");
        jm_help.add(jmi_estructuraP);

        jMenuItem7.setText("jmi_comandosAyuda");
        jm_help.add(jMenuItem7);

        jMenuBar1.add(jm_help);

        setJMenuBar(jMenuBar1);

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

    private void jb_EnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_EnterMouseClicked
        DefaultTableModel modeloTaba = (DefaultTableModel)jt_Tabla.getModel(); 
        File archivo = null; 
        System.out.println(tf_command.getText());
        String [] commandLine = tf_command.getText().split(" "); 
        if (commandLine[0].equals("./load")) {
            archivo = new File("./"+commandLine[1]); 
            System.out.println(commandLine[0]+commandLine[1]);
            try { 
                FileReader fr = new FileReader(archivo);
                BufferedReader bf = new BufferedReader(fr); 
                String linea = ""; 
                while ((linea = bf.readLine()) != null){
                    System.out.println(linea);
                    String [] papoy = linea.split(","); 
                    
                    //System.out.println(papoy);
                    //modeloTaba.addRow(papoy);  
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(evt.getComponent(), "Este archivo no existe");
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }else if (commandLine[0].equals("./create")) {
            
        }else if (commandLine[0].equals("./clear")) {
            
        }else if (commandLine[0].equals("./refresh")) {
            
        }
    }//GEN-LAST:event_jb_EnterMouseClicked

    private void jb_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_EnterActionPerformed
      
        
        
        
    }//GEN-LAST:event_jb_EnterActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_Enter;
    private javax.swing.JMenu jm_help;
    private javax.swing.JMenuItem jmi_clearCommand;
    private javax.swing.JMenuItem jmi_estructuraP;
    private javax.swing.JMenuItem jmi_importFile;
    private javax.swing.JMenu jmi_newFile;
    private javax.swing.JMenuItem jmi_refreshArbol;
    private javax.swing.JTree jt_Arbol;
    private javax.swing.JTable jt_Tabla;
    private javax.swing.JTextField tf_command;
    // End of variables declaration//GEN-END:variables
}
