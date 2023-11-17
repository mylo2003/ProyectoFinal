package proyectofinal;

public class PantallaContexto extends javax.swing.JFrame {

    int xMouse, yMouse;

    public PantallaContexto() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        anterior = new javax.swing.JLabel();
        siguiente = new javax.swing.JLabel();
        menuLateral = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        btnTema7 = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnContenido = new javax.swing.JLabel();
        btnTema1 = new javax.swing.JLabel();
        btnTema3 = new javax.swing.JLabel();
        btnTema2 = new javax.swing.JLabel();
        btnTema4 = new javax.swing.JLabel();
        btnTema5 = new javax.swing.JLabel();
        btnTema6 = new javax.swing.JLabel();
        titulo_contexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1200, 626));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(101, 3, 29));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 626));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 626));

        header.setBackground(new java.awt.Color(66, 0, 4));
        header.setMaximumSize(new java.awt.Dimension(1200, 40));
        header.setPreferredSize(new java.awt.Dimension(1200, 40));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("JetBrains Mono", 0, 36)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 175, 94));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setMaximumSize(new java.awt.Dimension(40, 40));
        btnExit.setMinimumSize(new java.awt.Dimension(40, 40));
        btnExit.setPreferredSize(new java.awt.Dimension(40, 40));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anterior.png"))); // NOI18N
        anterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anteriorMouseClicked(evt);
            }
        });

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/siguiente.png"))); // NOI18N
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siguienteMouseClicked(evt);
            }
        });

        menuLateral.setBackground(new java.awt.Color(66, 0, 4));
        menuLateral.setMaximumSize(new java.awt.Dimension(220, 586));
        menuLateral.setPreferredSize(new java.awt.Dimension(220, 586));

        menu.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 175, 94));
        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setText("Menu");
        menu.setMaximumSize(new java.awt.Dimension(220, 48));
        menu.setMinimumSize(new java.awt.Dimension(220, 48));
        menu.setPreferredSize(new java.awt.Dimension(220, 48));

        btnTema7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema7.png"))); // NOI18N
        btnTema7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema7MouseClicked(evt);
            }
        });

        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        btnContenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/contenido.png"))); // NOI18N
        btnContenido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContenidoMouseClicked(evt);
            }
        });

        btnTema1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema1.png"))); // NOI18N
        btnTema1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema1MouseClicked(evt);
            }
        });

        btnTema3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema3.png"))); // NOI18N
        btnTema3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema3MouseClicked(evt);
            }
        });

        btnTema2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema2.png"))); // NOI18N
        btnTema2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema2MouseClicked(evt);
            }
        });

        btnTema4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema4.png"))); // NOI18N
        btnTema4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema4MouseClicked(evt);
            }
        });

        btnTema5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema5.png"))); // NOI18N
        btnTema5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema5MouseClicked(evt);
            }
        });

        btnTema6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema6.png"))); // NOI18N
        btnTema6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLateralLayout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnTema7)
                        .addComponent(btnTema6)
                        .addComponent(btnTema5)
                        .addComponent(btnContenido)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTema1)
                        .addComponent(btnTema2)
                        .addComponent(btnTema3)
                        .addComponent(btnTema4))
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(526, Short.MAX_VALUE))
            .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLateralLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(btnHome)
                    .addGap(18, 18, 18)
                    .addComponent(btnContenido)
                    .addGap(18, 18, 18)
                    .addComponent(btnTema1)
                    .addGap(18, 18, 18)
                    .addComponent(btnTema2)
                    .addGap(18, 18, 18)
                    .addComponent(btnTema3)
                    .addGap(18, 18, 18)
                    .addComponent(btnTema4)
                    .addGap(18, 18, 18)
                    .addComponent(btnTema5)
                    .addGap(18, 18, 18)
                    .addComponent(btnTema6)
                    .addGap(18, 18, 18)
                    .addComponent(btnTema7)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );

        titulo_contexto.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        titulo_contexto.setForeground(new java.awt.Color(255, 175, 94));
        titulo_contexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_contexto.setText("Contexto");
        titulo_contexto.setMaximumSize(new java.awt.Dimension(968, 48));
        titulo_contexto.setMinimumSize(new java.awt.Dimension(968, 48));
        titulo_contexto.setPreferredSize(new java.awt.Dimension(968, 48));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo_contexto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 781, Short.MAX_VALUE)
                        .addComponent(siguiente)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(titulo_contexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anterior)
                            .addComponent(siguiente))
                        .addGap(20, 20, 20))))
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

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anteriorMouseClicked
        setVisible(false);
        PantallaMenu menu = new PantallaMenu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_anteriorMouseClicked

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
        setVisible(false);
        PantallaTema1 pantalla1 = new PantallaTema1();
        pantalla1.setVisible(true);
        pantalla1.setLocationRelativeTo(null);
    }//GEN-LAST:event_siguienteMouseClicked

    private void btnTema7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema7MouseClicked
        setVisible(false);
        PantallaTema7 pantalla = new PantallaTema7();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnTema7MouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        setVisible(false);
        PantallaInicio inicio = new PantallaInicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnContenidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContenidoMouseClicked
        setVisible(false);
        PantallaMenu menu = new PantallaMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnContenidoMouseClicked

    private void btnTema1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema1MouseClicked
        setVisible(false);
        PantallaTema1 pantalla = new PantallaTema1();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnTema1MouseClicked

    private void btnTema3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema3MouseClicked
        setVisible(false);
        PantallaTema3 pantalla = new PantallaTema3();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnTema3MouseClicked

    private void btnTema2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema2MouseClicked
        setVisible(false);
        PantallaTema2 pantalla = new PantallaTema2();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnTema2MouseClicked

    private void btnTema4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema4MouseClicked
        setVisible(false);
        PantallaTema4 pantalla = new PantallaTema4();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnTema4MouseClicked

    private void btnTema5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema5MouseClicked
        setVisible(false);
        PantallaTema5 pantalla = new PantallaTema5();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnTema5MouseClicked

    private void btnTema6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema6MouseClicked
        setVisible(false);
        PantallaTema6 pantalla = new PantallaTema6();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnTema6MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anterior;
    private javax.swing.JLabel btnContenido;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnTema1;
    private javax.swing.JLabel btnTema2;
    private javax.swing.JLabel btnTema3;
    private javax.swing.JLabel btnTema4;
    private javax.swing.JLabel btnTema5;
    private javax.swing.JLabel btnTema6;
    private javax.swing.JLabel btnTema7;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menu;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JLabel siguiente;
    private javax.swing.JLabel titulo_contexto;
    // End of variables declaration//GEN-END:variables
}
