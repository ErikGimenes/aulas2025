/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author erik
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    public JFrmPrincipal() {
        initComponents();
        setTitle("Sistema de Vendas e Compras");
        setExtendedState(MAXIMIZED_BOTH);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuCadastros = new javax.swing.JMenu();
        jMnuClientes = new javax.swing.JMenuItem();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMnuMovimento = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMnuCadastros.setText("Cadastros");

        jMnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensTelas/cliente.png"))); // NOI18N
        jMnuClientes.setText("Clientes");
        jMnuCadastros.add(jMnuClientes);

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensTelas/usuario.png"))); // NOI18N
        jMnuUsuarios.setText("Usuários");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuUsuarios);
        jMnuCadastros.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jMnuSair.setText("Sair");
        jMnuCadastros.add(jMnuSair);

        jMenuBar1.add(jMnuCadastros);

        jMnuMovimento.setText("Movimento");
        jMenuBar1.add(jMnuMovimento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        // TODO add your handling code here:
        JDlgUsuarios jDlgUsuarios = new JDlgUsuarios(this, true);
        jDlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMnuCadastros;
    private javax.swing.JMenuItem jMnuClientes;
    private javax.swing.JMenu jMnuMovimento;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
