package juego;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Escenario extends javax.swing.JFrame {

    private int numColumnas = 20;
    private int numFilas = 22;
    private int personajeX = 2;
    private int personajeY = 2;

    public final int longImg = 40;
    public final int altImg = 40;

    private int[][] escLogico = new int[numColumnas][numFilas];
    private JLabel[][] escenario = new JLabel[numColumnas][numFilas];

    public Escenario() {

        initComponents();

        escLogico = crearEscenario();

        cargarEscenario();
    }

    private int[][] crearEscenario() {
        int[][] esc = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},//Columna
            {1, 0, 0, 1, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
            {1, 0, 10, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 3, 0, 1, 0, 0, 1, 1, 1},
            {1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1},
            {1, 3, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 1, 1, 1},
            {1, 0, 0, 1, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        return esc;
    }

    private void cargarEscenario() {
        for (int c = 0; c < numColumnas; c++) {
            for (int f = 0; f < numFilas; f++) {
                escenario[c][f] = new JLabel();
                escenario[c][f].setOpaque(true);
                escenario[c][f].setBounds((c * longImg), (f * altImg), longImg, altImg);
                escenario[c][f].setIcon(obtenerImagen(escLogico[c][f]));
                panelEscenario.add(escenario[c][f]);
            }
        }
    }

    private ImageIcon obtenerImagen(int nImg) {
        switch (nImg) {
            case Contenedor.suelo:
                return new ImageIcon(getClass().getResource("/Imagenes/C.png"));
            case Contenedor.muro:
                return new ImageIcon(getClass().getResource("/Imagenes/M.png"));
            case Contenedor.personajeD:
                return new ImageIcon(getClass().getResource("/Imagenes/PD.png"));
            case Contenedor.personajeI:
                return new ImageIcon(getClass().getResource("/Imagenes/PI.png"));
            case Contenedor.personajeA:
                return new ImageIcon(getClass().getResource("/Imagenes/PArr.png"));
            case Contenedor.personajeAb:
                return new ImageIcon(getClass().getResource("/Imagenes/PAb.png"));
            case Contenedor.moneda:
                return new ImageIcon(getClass().getResource("/Imagenes/Moneda.gif"));
            default:
                return new ImageIcon(getClass().getResource("/Imagenes/C.png"));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEscenario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelEscenarioLayout = new javax.swing.GroupLayout(panelEscenario);
        panelEscenario.setLayout(panelEscenarioLayout);
        panelEscenarioLayout.setHorizontalGroup(
            panelEscenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        panelEscenarioLayout.setVerticalGroup(
            panelEscenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscenario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscenario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
                                   
        System.out.println(evt);
        switch (evt.getKeyCode()) {
            case 32:
                break;
            case 37:    //izq
                escenario[personajeX][personajeY].setIcon(obtenerImagen(Contenedor.personajeI));

                if (escLogico[personajeX - 1][personajeY] != Contenedor.muro) {

                    escLogico[personajeX - 1][personajeY] = Contenedor.personajeI;
                    escLogico[personajeX][personajeY] = Contenedor.suelo;

                    escenario[personajeX - 1][personajeY].setIcon(obtenerImagen(Contenedor.personajeI));
                    escenario[personajeX][personajeY].setIcon(obtenerImagen(Contenedor.suelo));

                    personajeX--;

                } else {

                }
                break;
            case 39:    //der
                escenario[personajeX][personajeY].setIcon(obtenerImagen(Contenedor.personajeD));

                if (escLogico[personajeX + 1][personajeY] != Contenedor.muro) {

                    escLogico[personajeX + 1][personajeY] = Contenedor.personajeD;
                    escLogico[personajeX][personajeY] = Contenedor.suelo;
                    escenario[personajeX + 1][personajeY].setIcon(obtenerImagen(Contenedor.personajeD));
                    escenario[personajeX][personajeY].setIcon(obtenerImagen(Contenedor.suelo));

                    personajeX++;

                } else {

                }
                break;
            case 38:    //arr
                escenario[personajeX][personajeY].setIcon(obtenerImagen(Contenedor.personajeA));

                if (escLogico[personajeX][personajeY - 1] != Contenedor.muro) {

                    escLogico[personajeX][personajeY - 1] = Contenedor.personajeA;
                    escLogico[personajeX][personajeY] = Contenedor.suelo;

                    escenario[personajeX][personajeY - 1].setIcon(obtenerImagen(Contenedor.personajeA));
                    escenario[personajeX][personajeY].setIcon(obtenerImagen(Contenedor.suelo));

                    personajeY--;

                } else {

                }
                break;
            case 40:    //ab
                escenario[personajeX][personajeY].setIcon(obtenerImagen(Contenedor.personajeAb));

                if (escLogico[personajeX][personajeY + 1] != Contenedor.muro) {

                    escLogico[personajeX][personajeY + 1] = Contenedor.personajeAb;
                    escLogico[personajeX][personajeY] = Contenedor.suelo;

                    escenario[personajeX][personajeY + 1].setIcon(obtenerImagen(Contenedor.personajeAb));
                    escenario[personajeX][personajeY].setIcon(obtenerImagen(Contenedor.suelo));

                    personajeY++;

                } else {

                }
                break;
        }
    
    }//GEN-LAST:event_formKeyReleased

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
            java.util.logging.Logger.getLogger(Escenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escenario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelEscenario;
    // End of variables declaration//GEN-END:variables
}
