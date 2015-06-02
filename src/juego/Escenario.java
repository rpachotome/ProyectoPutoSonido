package juego;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Escenario extends javax.swing.JFrame {

    CrearEscenario crea = new CrearEscenario();
    Reproductor play = new Reproductor();
//
    private int numColumnas = 20;
    private int numFilas = 22;
    private int personajeX = 2;
    private int personajeY = 2;

    int contador = 0;
    int contBalas = 2;
    int contVida = 3;

    public final int longImg = 40;
    public final int altImg = 40;

    private int validarMX;
    private int validarMY;

    private int validarBX;
    private int validarBY;

    private int[][] escMatriz = new int[numColumnas][numFilas];
    JLabel[][] escenario = new JLabel[numColumnas][numFilas];
    

    public Escenario() {

        initComponents();

        label_bala.setVisible(false);

        escMatriz = crea.crearEscenario();

        cargarEscenario();

        play.repSonido();

        Marcador();

        Cargador();

        Vida();

    }

    private void cargarEscenario() {
        for (int c = 0; c < numColumnas; c++) {
            for (int f = 0; f < numFilas; f++) {
                escenario[c][f] = new JLabel();
                escenario[c][f].setOpaque(true);
                escenario[c][f].setBounds((c * longImg), (f * altImg), longImg, altImg);
                escenario[c][f].setIcon(crea.obtenerImagen(escMatriz[c][f]));
                panelEscenario.add(escenario[c][f]);
            }
        }
    }

    private void Marcador() {
        switch (contador) {
            case 0:
                escenario[3][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/cero.png")));
                panelEscenario.add(escenario[3][20]);
                break;
            case 1:
                escenario[3][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/uno.png")));
                panelEscenario.add(escenario[3][20]);
                break;
            case 2:
                escenario[3][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/dos.png")));
                panelEscenario.add(escenario[3][20]);
                break;
            case 3:
                escenario[3][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/tres.png")));
                panelEscenario.add(escenario[3][20]);
                break;
            case 4:
                escenario[3][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/cuatro.png")));
                panelEscenario.add(escenario[3][20]);
                break;
            case 5:
                escenario[3][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/cinco.png")));
                panelEscenario.add(escenario[3][20]);
                break;
            case 6:
                escenario[3][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/seis.png")));
                panelEscenario.add(escenario[3][20]);
                break;
            case 7:
                escenario[3][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/siete.png")));
                panelEscenario.add(escenario[3][20]);
                break;
        }
    }

    public void Vida() {

        if (contVida == 2) {
            escenario[8][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/LN.gif")));
            panelEscenario.add(escenario[9][20]);
        } else if (contVida == 1) {
            escenario[7][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/LN.gif")));
            panelEscenario.add(escenario[9][20]);
        } else if (contVida == 0) {
            escenario[6][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/LN.gif")));
            panelEscenario.add(escenario[7][20]);

            JOptionPane.showMessageDialog(null, "HAS MUERTO");

        }
    }

    public void Cargador() {

        if (contBalas == 1) {
            escenario[12][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[12][20]);
        } else if (contBalas == 2) {
            escenario[12][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[12][20]);
            escenario[13][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[13][20]);
        } else if (contBalas == 3) {
            escenario[12][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[12][20]);
            escenario[13][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[13][20]);
            escenario[14][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[14][20]);
        } else if (contBalas == 4) {
            escenario[12][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[12][20]);
            escenario[13][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[13][20]);
            escenario[14][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[14][20]);
            escenario[15][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[15][20]);
        } else if (contBalas == 5) {
            escenario[12][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[12][20]);
            escenario[13][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[13][20]);
            escenario[14][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[14][20]);
            escenario[15][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[15][20]);
            escenario[16][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[16][20]);

        } else if (contBalas == 6) {
            escenario[12][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[12][20]);
            escenario[13][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[13][20]);
            escenario[14][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[14][20]);
            escenario[15][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[15][20]);
            escenario[16][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[16][20]);
            escenario[17][20].setIcon(new ImageIcon(getClass().getResource("/Imagenes/BI.png")));
            panelEscenario.add(escenario[17][20]);
        } else {
            JOptionPane.showMessageDialog(null, "NO HAY MUNICION");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEscenario = new javax.swing.JPanel();
        label_bala = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        label_bala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bala.png"))); // NOI18N
        label_bala.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_bala.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout panelEscenarioLayout = new javax.swing.GroupLayout(panelEscenario);
        panelEscenario.setLayout(panelEscenarioLayout);
        panelEscenarioLayout.setHorizontalGroup(
            panelEscenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscenarioLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(label_bala)
                .addContainerGap(657, Short.MAX_VALUE))
        );
        panelEscenarioLayout.setVerticalGroup(
            panelEscenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscenarioLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(label_bala)
                .addContainerGap(772, Short.MAX_VALUE))
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

        panelEscenario.getAccessibleContext().setAccessibleParent(panelEscenario);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

        System.out.println(evt);
        switch (evt.getKeyCode()) {

            case 32:
                label_bala.setVisible(true);
                contBalas--;
                while(label_bala!=null){
                    //label_bala.setBounds(escenario[personajeX][personajeY]+40,escenario[personajeX][personajeY]+20 10, 10);
                }
                System.out.println(contBalas);
                Cargador();

                break;
            case 37:    //izq
                escenario[personajeX][personajeY].setIcon(crea.obtenerImagen(Contenedor.personajeI));

                if (escMatriz[personajeX - 1][personajeY] != Contenedor.muro) {
                    if (escMatriz[personajeX - 1][personajeY] != Contenedor.zombieD) {
                        if (escMatriz[personajeX - 1][personajeY] != Contenedor.zombieI) {

                            escMatriz[personajeX - 1][personajeY] = Contenedor.personajeI;
                            escMatriz[personajeX][personajeY] = Contenedor.suelo;

                            escenario[personajeX - 1][personajeY].setIcon(crea.obtenerImagen(Contenedor.personajeI));
                            escenario[personajeX][personajeY].setIcon(crea.obtenerImagen(Contenedor.suelo));

                            System.out.println(personajeX - 1 + " " + personajeY);
                            //Detectar moneda en frente
                            if (escMatriz[personajeX - 2][personajeY] == Contenedor.moneda) {
                                validarMX = personajeX - 2;
                                validarMY = personajeY;
                                System.out.println("VX: " + validarMX
                                        + " VY: " + validarMY);
                            }
                            //detectar moneda izq
                            if (escMatriz[personajeX - 1][personajeY + 1] == Contenedor.moneda) {
                                validarMX = personajeX - 1;
                                validarMY = personajeY + 1;
                                System.out.println("VX: " + validarMX
                                        + " VY: " + validarMY + "izq");
                            }
                            //detectar moneda der
                            if (escMatriz[personajeX - 1][personajeY - 1] == Contenedor.moneda) {
                                validarMX = personajeX - 1;
                                validarMY = personajeY - 1;
                                System.out.println("VX: " + validarMX
                                        + " VY: " + validarMY + "der");
                            }

                            //Detectar bala en frente
                            if (escMatriz[personajeX - 2][personajeY] == Contenedor.bala) {
                                validarBX = personajeX - 2;
                                validarBY = personajeY;
                                System.out.println("VBX: " + validarMX
                                        + " VBY: " + validarMY);
                            }
                            //detectar bala izq
                            if (escMatriz[personajeX - 1][personajeY + 1] == Contenedor.bala) {
                                validarBX = personajeX - 1;
                                validarBY = personajeY + 1;
                                System.out.println("VBX: " + validarBX
                                        + " VBY: " + validarBY + "izq");
                            }
                            //detectar bala der
                            if (escMatriz[personajeX - 1][personajeY - 1] == Contenedor.bala) {
                                validarBX = personajeX - 1;
                                validarBY = personajeY - 1;
                                System.out.println("VBX: " + validarBX
                                        + " VBY: " + validarBY + "der");
                            }

                            if (escMatriz[validarMX][validarMY] == Contenedor.personajeI) {
                                contador++;
                                Marcador();
                            }

                            if (escMatriz[validarBX][validarBY] == Contenedor.personajeI) {
                                contBalas++;
                                System.out.println(contBalas);
                                Cargador();
                            }

                            personajeX--;

                            System.out.println("C: " + contador);
                        } else {
                            contVida--;
                        }
                    } else {
                        contVida--;
                    }
                } else {
                    //sonido 
                }
                Vida();
                System.out.println(contVida);
                break;
            case 39:    //der
                escenario[personajeX][personajeY].setIcon(crea.obtenerImagen(Contenedor.personajeD));

                if (escMatriz[personajeX + 1][personajeY] != Contenedor.muro) {
                    if (escMatriz[personajeX + 1][personajeY] != Contenedor.zombieD) {
                        if (escMatriz[personajeX + 1][personajeY] != Contenedor.zombieI) {

                            escMatriz[personajeX + 1][personajeY] = Contenedor.personajeD;
                            escMatriz[personajeX][personajeY] = Contenedor.suelo;

                            escenario[personajeX + 1][personajeY].setIcon(crea.obtenerImagen(Contenedor.personajeD));
                            escenario[personajeX][personajeY].setIcon(crea.obtenerImagen(Contenedor.suelo));

                            System.out.println(personajeX + 1 + " " + personajeY);
                            if (escMatriz[personajeX + 2][personajeY] == Contenedor.moneda) {
                                validarMX = personajeX + 2;
                                validarMY = personajeY;
                                System.out.println("VX: " + validarMX
                                        + " VY: " + validarMY);

                            }
                            //detectar moneda der
                            if (escMatriz[personajeX + 1][personajeY + 1] == Contenedor.moneda) {
                                validarMX = personajeX + 1;
                                validarMY = personajeY + 1;
                                System.out.println("VX: " + validarMX
                                        + " VY: " + validarMY + "der");
                            }
                            //detectar moneda izq
                            if (escMatriz[personajeX + 1][personajeY - 1] == Contenedor.moneda) {
                                validarMX = personajeX + 1;
                                validarMY = personajeY - 1;
                                System.out.println("VX: " + validarMX
                                        + " VY: " + validarMY + "izq");
                            }
                            //Detectar bala en frente
                            if (escMatriz[personajeX + 2][personajeY] == Contenedor.bala) {
                                validarBX = personajeX + 2;
                                validarBY = personajeY;
                                System.out.println("VBX: " + validarMX
                                        + " VBY: " + validarMY);
                            }
                            //detectar bala izq
                            if (escMatriz[personajeX + 1][personajeY - 1] == Contenedor.bala) {
                                validarBX = personajeX + 1;
                                validarBY = personajeY - 1;
                                System.out.println("VBX: " + validarBX
                                        + " VBY: " + validarBY + "izq");
                            }
                            //detectar bala der
                            if (escMatriz[personajeX + 1][personajeY + 1] == Contenedor.bala) {
                                validarBX = personajeX + 1;
                                validarBY = personajeY + 1;
                                System.out.println("VBX: " + validarBX
                                        + " VBY: " + validarBY + "der");
                            }

                            if (escMatriz[validarMX][validarMY] == Contenedor.personajeD) {
                                contador++;
                                Marcador();
                            }

                            if (escMatriz[validarBX][validarBY] == Contenedor.personajeD) {
                                contBalas++;
                                System.out.println(contBalas);
                                Cargador();
                            }

                            personajeX++;

                            System.out.println("C: " + contador);
                        } else {
                            contVida--;
                        }
                    } else {
                        contVida--;
                    }
                } else {
                    //sonido 
                }
                Vida();
                System.out.println(contVida);
                break;
            case 38:    //arr
                escenario[personajeX][personajeY].setIcon(crea.obtenerImagen(Contenedor.personajeA));

                if (escMatriz[personajeX][personajeY - 1] != Contenedor.muro) {
                    if (escMatriz[personajeX][personajeY - 1] != Contenedor.zombieD) {
                        if (escMatriz[personajeX][personajeY - 1] != Contenedor.zombieI) {

                            escMatriz[personajeX][personajeY - 1] = Contenedor.personajeA;
                            escMatriz[personajeX][personajeY] = Contenedor.suelo;

                            escenario[personajeX][personajeY - 1].setIcon(crea.obtenerImagen(Contenedor.personajeA));
                            escenario[personajeX][personajeY].setIcon(crea.obtenerImagen(Contenedor.suelo));

                            System.out.println(personajeX + " " + (personajeY - 1));
                            if (escMatriz[personajeX][personajeY - 2] == Contenedor.moneda) {
                                validarMX = personajeX;
                                validarMY = personajeY - 2;
                                System.out.println("VX: " + validarMX
                                        + " VY: " + validarMY);

                            }
                            //detectar moneda der
                            if (escMatriz[personajeX + 1][personajeY - 1] == Contenedor.moneda) {
                                validarMX = personajeX + 1;
                                validarMY = personajeY - 1;
                                System.out.println("VX: " + validarMX
                                        + " VY: " + validarMY + "der");
                            }
                            //detectar moneda izq
                            if (escMatriz[personajeX - 1][personajeY - 1] == Contenedor.moneda) {
                                validarMX = personajeX - 1;
                                validarMY = personajeY - 1;
                                System.out.println("VX: " + validarMX
                                        + " VY: " + validarMY + "izq");
                            }

                            //Detectar bala en frente
                            if (escMatriz[personajeX][personajeY - 2] == Contenedor.bala) {
                                validarBX = personajeX;
                                validarBY = personajeY - 2;
                                System.out.println("VBX: " + validarMX
                                        + " VBY: " + validarMY);
                            }
                            //detectar bala izq
                            if (escMatriz[personajeX - 1][personajeY - 1] == Contenedor.bala) {
                                validarBX = personajeX - 1;
                                validarBY = personajeY - 1;
                                System.out.println("VBX: " + validarBX
                                        + " VBY: " + validarBY + "izq");
                            }
                            //detectar bala der
                            if (escMatriz[personajeX + 1][personajeY - 1] == Contenedor.bala) {
                                validarBX = personajeX + 1;
                                validarBY = personajeY - 1;
                                System.out.println("VBX: " + validarBX
                                        + " VBY: " + validarBY + "der");
                            }

                            if (escMatriz[validarMX][validarMY] == Contenedor.personajeA) {
                                contador++;
                                Marcador();
                            }

                            if (escMatriz[validarBX][validarBY] == Contenedor.personajeA) {
                                contBalas++;
                                System.out.println(contBalas);
                                Cargador();
                            }
                            personajeY--;

                            System.out.println("C: " + contador);
                        } else {
                            contVida--;
                        }
                    } else {
                        contVida--;
                    }
                } else {
                    //sonido 
                }
                Vida();
                System.out.println(contVida);
                break;
            case 40:    //ab
                escenario[personajeX][personajeY].setIcon(crea.obtenerImagen(Contenedor.personajeAb));

                if (escMatriz[personajeX][personajeY + 1] != Contenedor.muro) {
                    if (escMatriz[personajeX][personajeY + 1] != Contenedor.zombieD) {
                        if (escMatriz[personajeX][personajeY + 1] != Contenedor.zombieI) {

                            escMatriz[personajeX][personajeY + 1] = Contenedor.personajeAb;
                            escMatriz[personajeX][personajeY] = Contenedor.suelo;

                            escenario[personajeX][personajeY + 1].setIcon(crea.obtenerImagen(Contenedor.personajeAb));
                            escenario[personajeX][personajeY].setIcon(crea.obtenerImagen(Contenedor.suelo));

                            System.out.println(personajeX + " " + (personajeY + 1));
                            if (escMatriz[personajeX][personajeY + 2] == Contenedor.moneda) {
                                validarMX = personajeX;
                                validarMY = personajeY + 2;
                                System.out.println("VX: " + validarMX
                                        + " VY: " + validarMY);

                            }
                            //detectar moneda izq
                            if (escMatriz[personajeX + 1][personajeY + 1] == Contenedor.moneda) {
                                validarMX = personajeX + 1;
                                validarMY = personajeY + 1;
                                System.out.println("VX: " + validarMX
                                        + " VY: " + validarMY + "izq");
                            }
                            //detectar moneda der
                            if (escMatriz[personajeX - 1][personajeY + 1] == Contenedor.moneda) {
                                validarMX = personajeX - 1;
                                validarMY = personajeY + 1;
                                System.out.println("VX: " + validarMX
                                        + " VY: " + validarMY + "der");
                            }
                            //Detectar bala en frente
                            if (escMatriz[personajeX][personajeY + 2] == Contenedor.bala) {
                                validarBX = personajeX;
                                validarBY = personajeY + 2;
                                System.out.println("VBX: " + validarMX
                                        + " VBY: " + validarMY);
                            }
                            //detectar bala izq
                            if (escMatriz[personajeX + 1][personajeY + 1] == Contenedor.bala) {
                                validarBX = personajeX + 1;
                                validarBY = personajeY + 1;
                                System.out.println("VBX: " + validarBX
                                        + " VBY: " + validarBY + "izq");
                            }
                            //detectar bala der
                            if (escMatriz[personajeX - 1][personajeY + 1] == Contenedor.bala) {
                                validarBX = personajeX - 1;
                                validarBY = personajeY + 1;
                                System.out.println("VBX: " + validarBX
                                        + " VBY: " + validarBY + "der");
                            }

                            if (escMatriz[validarMX][validarMY] == Contenedor.personajeAb) {
                                contador++;
                                Marcador();
                            }

                            if (escMatriz[validarBX][validarBY] == Contenedor.personajeAb) {
                                contBalas++;
                                System.out.println(contBalas);
                                Cargador();
                            }
                            personajeY++;

                            System.out.println("C: " + contador);
                        } else {
                            contVida--;
                        }
                    } else {
                        contVida--;
                    }
                } else {
                    //sonido 
                }
                Vida();
                System.out.println(contVida);
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
    private javax.swing.JLabel label_bala;
    private javax.swing.JPanel panelEscenario;
    // End of variables declaration//GEN-END:variables
}
