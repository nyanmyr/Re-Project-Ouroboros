package reprojectouroboros;

import java.awt.Dimension;
import java.awt.event.*;

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

        panel_Menu.setLayout(null);

        button_QuickStart.setText("jButton1");
        panel_Menu.add(button_QuickStart);
        button_QuickStart.setBounds(6, 6, 75, 23);

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

        panel_Menu.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent evt) {
                panel_ScreenResized(evt);
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold desc="swing variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_QuickStart;
    private javax.swing.JPanel panel_Menu;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
    
    private void panel_ScreenResized(ComponentEvent evt) {
        
        
        Dimension screenSize = panel_Menu.getSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        
        // use this for helper method
        // minimum size x: 1900 y:877
//        System.out.printf("x:%s y:%s\n", screenWidth, screenHeight);
        System.out.println("TEST: " + (int) (1900 * 0.16));
        
        // make a helper method out of this (25/7/2025 10:28PM)
        var menu_buttonDimensions = new Dimension(
                determineWidth(0.16f, screenWidth),
                determineHeight(0.075f, screenHeight)
        );
        
        button_QuickStart.setBounds(
                ((int) (screenWidth * 0.5)) - ((int) (menu_buttonDimensions.width * 0.5)),
                ((int) (screenHeight * 0.5)) - ((int) (menu_buttonDimensions.height * 0.5)),
                menu_buttonDimensions.width, menu_buttonDimensions.height
        );
        
        // size debugging
        button_QuickStart.setText(String.format("x:%s y:%s", button_QuickStart.getSize().width, button_QuickStart.getSize().height));
    }
    
    private int determineWidth(float sizeAmount, int screenDimension) {
        
        return (int) (screenDimension * sizeAmount) < 0 
                ? (int) (1900 * sizeAmount)
                : (int) (screenDimension * sizeAmount
                );
    }
    
    private int determineHeight(float sizeAmount, int screenDimension) {
        
        return (int) (screenDimension * sizeAmount) < 0 
                ? (int) (900 * sizeAmount)
                : (int) (screenDimension * sizeAmount
                );
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Menu().setVisible(true));
    }
    
}
