package proyectofinal;

import java.util.Locale;
import java.util.ResourceBundle;

public class PantallaMenu extends javax.swing.JFrame {

    int xMouse, yMouse;

    public PantallaMenu() {
        initComponents();
        setLocationRelativeTo(null);
        cargarIdiomaAlmacenado();
    }

    private void cargarIdiomaAlmacenado() {
        // Aquí deberías tener una lógica para obtener el idioma almacenado, por ejemplo, desde una preferencia o configuración.
        // Por ahora, asumamos que hay una clase Configuracion con un método getLenguajeSeleccionado()
        Locale idiomaAlmacenado = ProyectoFinal.getLenguajeSeleccionado();

        // Si el idioma almacenado no es nulo, aplicar el cambio de idioma
        if (idiomaAlmacenado != null) {
            cambiarIdioma(idiomaAlmacenado);
        }
    }

    private void cambiarIdioma(Locale locale) {
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);

        menu.setText(texto.getString("menu"));
        btnSpanish.setText(texto.getString("spanish"));
        btnEnglish.setText(texto.getString("english"));

        content1.setText(texto.getString("context_Overview"));
        content2.setText(texto.getString("ioHardware"));
        content3.setText(texto.getString("applicationIoInterface"));
        content4.setText(texto.getString("kernelSubsystem"));
        content5.setText(texto.getString("transRequestHardwareOperations"));
        content6.setText(texto.getString("performance"));
        titulo_menu.setText(texto.getString("titleMenu"));

        ProyectoFinal.setLenguajeSeleccionado(locale);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        content1 = new javax.swing.JLabel();
        content2 = new javax.swing.JLabel();
        content3 = new javax.swing.JLabel();
        content4 = new javax.swing.JLabel();
        content5 = new javax.swing.JLabel();
        content6 = new javax.swing.JLabel();
        siguiente = new javax.swing.JLabel();
        anterior = new javax.swing.JLabel();
        menuLateral = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnContenido = new javax.swing.JLabel();
        btnContexto = new javax.swing.JLabel();
        btnTema2 = new javax.swing.JLabel();
        btnTema1 = new javax.swing.JLabel();
        btnTema3 = new javax.swing.JLabel();
        btnTema4 = new javax.swing.JLabel();
        btnTema5 = new javax.swing.JLabel();
        btnEvaluacion = new javax.swing.JLabel();
        btnSalida = new javax.swing.JLabel();
        titulo_menu = new javax.swing.JLabel();
        btnSpanish = new javax.swing.JButton();
        btnEnglish = new javax.swing.JButton();

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
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        content1.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        content1.setForeground(new java.awt.Color(227, 218, 201));
        content1.setText("Context - Overview");
        content1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        content1.setMaximumSize(new java.awt.Dimension(700, 33));
        content1.setMinimumSize(new java.awt.Dimension(700, 33));
        content1.setPreferredSize(new java.awt.Dimension(700, 40));
        content1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                content1MouseClicked(evt);
            }
        });

        content2.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        content2.setForeground(new java.awt.Color(227, 218, 201));
        content2.setText("I/O Hardware ");
        content2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        content2.setMaximumSize(new java.awt.Dimension(700, 33));
        content2.setMinimumSize(new java.awt.Dimension(700, 33));
        content2.setPreferredSize(new java.awt.Dimension(700, 40));
        content2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                content2MouseClicked(evt);
            }
        });

        content3.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        content3.setForeground(new java.awt.Color(227, 218, 201));
        content3.setText("Application I/O Interface ");
        content3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        content3.setMaximumSize(new java.awt.Dimension(700, 33));
        content3.setMinimumSize(new java.awt.Dimension(700, 33));
        content3.setPreferredSize(new java.awt.Dimension(700, 40));
        content3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                content3MouseClicked(evt);
            }
        });

        content4.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        content4.setForeground(new java.awt.Color(227, 218, 201));
        content4.setText("Kernel I/O Subsystem ");
        content4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        content4.setMaximumSize(new java.awt.Dimension(700, 33));
        content4.setMinimumSize(new java.awt.Dimension(700, 33));
        content4.setPreferredSize(new java.awt.Dimension(700, 40));
        content4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                content4MouseClicked(evt);
            }
        });

        content5.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        content5.setForeground(new java.awt.Color(227, 218, 201));
        content5.setText("Transforming I/O Requests to Hardware Operations ");
        content5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        content5.setMaximumSize(new java.awt.Dimension(700, 33));
        content5.setMinimumSize(new java.awt.Dimension(700, 33));
        content5.setPreferredSize(new java.awt.Dimension(700, 40));
        content5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                content5MouseClicked(evt);
            }
        });

        content6.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        content6.setForeground(new java.awt.Color(227, 218, 201));
        content6.setText("Performance");
        content6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        content6.setMaximumSize(new java.awt.Dimension(700, 33));
        content6.setMinimumSize(new java.awt.Dimension(700, 33));
        content6.setPreferredSize(new java.awt.Dimension(700, 40));
        content6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                content6MouseClicked(evt);
            }
        });

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/siguiente.png"))); // NOI18N
        siguiente.setAlignmentX(1.0F);
        siguiente.setAlignmentY(1.0F);
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siguienteMouseClicked(evt);
            }
        });

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anterior.png"))); // NOI18N
        anterior.setAlignmentX(1.0F);
        anterior.setAlignmentY(1.0F);
        anterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anteriorMouseClicked(evt);
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

        btnContexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema1.png"))); // NOI18N
        btnContexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContextoMouseClicked(evt);
            }
        });

        btnTema2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema3.png"))); // NOI18N
        btnTema2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema2MouseClicked(evt);
            }
        });

        btnTema1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema2.png"))); // NOI18N
        btnTema1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema1MouseClicked(evt);
            }
        });

        btnTema3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema4.png"))); // NOI18N
        btnTema3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema3MouseClicked(evt);
            }
        });

        btnTema4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema5.png"))); // NOI18N
        btnTema4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema4MouseClicked(evt);
            }
        });

        btnTema5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema6.png"))); // NOI18N
        btnTema5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema5MouseClicked(evt);
            }
        });

        btnEvaluacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/evaluacion.png"))); // NOI18N
        btnEvaluacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEvaluacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEvaluacionMouseClicked(evt);
            }
        });

        btnSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salida.png"))); // NOI18N
        btnSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalidaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalida)
                    .addComponent(btnEvaluacion)
                    .addComponent(btnTema5)
                    .addComponent(btnTema4)
                    .addComponent(btnContenido)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContexto)
                    .addComponent(btnTema1)
                    .addComponent(btnTema2)
                    .addComponent(btnTema3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHome)
                .addGap(18, 18, 18)
                .addComponent(btnContenido)
                .addGap(18, 18, 18)
                .addComponent(btnContexto)
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
                .addComponent(btnEvaluacion)
                .addGap(18, 18, 18)
                .addComponent(btnSalida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titulo_menu.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        titulo_menu.setForeground(new java.awt.Color(255, 175, 94));
        titulo_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_menu.setText("Content");
        titulo_menu.setMaximumSize(new java.awt.Dimension(968, 48));
        titulo_menu.setMinimumSize(new java.awt.Dimension(968, 48));
        titulo_menu.setPreferredSize(new java.awt.Dimension(968, 48));

        btnSpanish.setText("Spanish");
        btnSpanish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSpanish.setFocusable(false);
        btnSpanish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpanishActionPerformed(evt);
            }
        });

        btnEnglish.setText("English");
        btnEnglish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnglish.setFocusable(false);
        btnEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnglishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(siguiente)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(content2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(content3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(content4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(content1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(content6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(content5, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSpanish)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnglish)
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEnglish)
                            .addComponent(btnSpanish))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titulo_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(content1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(content2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(content3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(content4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(content5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(content6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(anterior)
                            .addComponent(siguiente))
                        .addGap(20, 20, 20))
                    .addComponent(menuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        PantallaInicio inicio = new PantallaInicio();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_anteriorMouseClicked

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
        setVisible(false);
        PantallaContexto contexto = new PantallaContexto();
        contexto.setVisible(true);
        contexto.setLocationRelativeTo(null);
    }//GEN-LAST:event_siguienteMouseClicked

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

    private void btnContextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContextoMouseClicked
        setVisible(false);
        PantallaContexto contexto = new PantallaContexto();
        contexto.setVisible(true);
    }//GEN-LAST:event_btnContextoMouseClicked

    private void btnTema1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema1MouseClicked
        setVisible(false);
        PantallaTema1 pantalla = new PantallaTema1();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnTema1MouseClicked

    private void btnTema2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema2MouseClicked
        setVisible(false);
        PantallaTema2 pantalla = new PantallaTema2();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnTema2MouseClicked

    private void btnTema3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTema3MouseClicked
        setVisible(false);
        PantallaTema3 pantalla = new PantallaTema3();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnTema3MouseClicked

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

    private void btnEvaluacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEvaluacionMouseClicked
        setVisible(false);
        PantallaEvaluacion evaluacion = new PantallaEvaluacion();
        evaluacion.setVisible(true);
    }//GEN-LAST:event_btnEvaluacionMouseClicked

    private void btnSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseClicked
        setVisible(false);
        PantallaSalida salida = new PantallaSalida();
        salida.setVisible(true);
    }//GEN-LAST:event_btnSalidaMouseClicked

    private void content1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_content1MouseClicked
        btnContextoMouseClicked(evt);
    }//GEN-LAST:event_content1MouseClicked

    private void content2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_content2MouseClicked
        btnTema1MouseClicked(evt);
    }//GEN-LAST:event_content2MouseClicked

    private void content3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_content3MouseClicked
        btnTema2MouseClicked(evt);
    }//GEN-LAST:event_content3MouseClicked

    private void content4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_content4MouseClicked
        btnTema3MouseClicked(evt);
    }//GEN-LAST:event_content4MouseClicked

    private void content5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_content5MouseClicked
        btnTema4MouseClicked(evt);
    }//GEN-LAST:event_content5MouseClicked

    private void content6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_content6MouseClicked
        btnTema5MouseClicked(evt);
    }//GEN-LAST:event_content6MouseClicked

    private void btnSpanishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpanishActionPerformed
        cambiarIdioma(new Locale("es", "ES"));
    }//GEN-LAST:event_btnSpanishActionPerformed

    private void btnEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnglishActionPerformed
        cambiarIdioma(new Locale("en", "US"));
    }//GEN-LAST:event_btnEnglishActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anterior;
    private javax.swing.JLabel btnContenido;
    private javax.swing.JLabel btnContexto;
    private javax.swing.JButton btnEnglish;
    private javax.swing.JLabel btnEvaluacion;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnSalida;
    private javax.swing.JButton btnSpanish;
    private javax.swing.JLabel btnTema1;
    private javax.swing.JLabel btnTema2;
    private javax.swing.JLabel btnTema3;
    private javax.swing.JLabel btnTema4;
    private javax.swing.JLabel btnTema5;
    private javax.swing.JLabel content1;
    private javax.swing.JLabel content2;
    private javax.swing.JLabel content3;
    private javax.swing.JLabel content4;
    private javax.swing.JLabel content5;
    private javax.swing.JLabel content6;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menu;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JLabel siguiente;
    private javax.swing.JLabel titulo_menu;
    // End of variables declaration//GEN-END:variables
}
