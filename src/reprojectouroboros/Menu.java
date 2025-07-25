package reprojectouroboros;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        
        initComponents();
        
//        setExtendedState(Menu.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Menu = new javax.swing.JPanel();
        button_QuickStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setSize(new java.awt.Dimension(1024, 768));

        button_QuickStart.setText("jButton1");

        javax.swing.GroupLayout panel_MenuLayout = new javax.swing.GroupLayout(panel_Menu);
        panel_Menu.setLayout(panel_MenuLayout);
        panel_MenuLayout.setHorizontalGroup(
            panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_QuickStart)
                .addContainerGap(750, Short.MAX_VALUE))
        );
        panel_MenuLayout.setVerticalGroup(
            panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_QuickStart)
                .addContainerGap(510, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold desc="swing variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_QuickStart;
    private javax.swing.JPanel panel_Menu;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Menu().setVisible(true));
    }
    
}
