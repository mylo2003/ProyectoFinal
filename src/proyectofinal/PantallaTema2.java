package proyectofinal;

import java.util.Locale;
import java.util.ResourceBundle;

public class PantallaTema2 extends javax.swing.JFrame {

    int xMouse, yMouse;

    public PantallaTema2() {
        initComponents();
        setLocationRelativeTo(null);
        cargarIdiomaAlmacenado();
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
        btnHome3 = new javax.swing.JLabel();
        btnContenido = new javax.swing.JLabel();
        btnContexto = new javax.swing.JLabel();
        btnTema1 = new javax.swing.JLabel();
        btnTema2 = new javax.swing.JLabel();
        btnTema3 = new javax.swing.JLabel();
        btnTema4 = new javax.swing.JLabel();
        btnTema5 = new javax.swing.JLabel();
        btnEvaluacion = new javax.swing.JLabel();
        btnSalida = new javax.swing.JLabel();
        titulo_tema2 = new javax.swing.JLabel();
        btnSpanish = new javax.swing.JButton();
        btnEnglish = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1200, 626));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 626));
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

        btnHome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        btnHome3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHome3MouseClicked(evt);
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

        btnTema1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema2.png"))); // NOI18N
        btnTema1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema1MouseClicked(evt);
            }
        });

        btnTema2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tema3.png"))); // NOI18N
        btnTema2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTema2MouseClicked(evt);
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
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalida)
                    .addComponent(btnEvaluacion)
                    .addComponent(btnTema5)
                    .addComponent(btnTema4)
                    .addComponent(btnTema3)
                    .addComponent(btnTema2)
                    .addComponent(btnTema1)
                    .addComponent(btnContexto)
                    .addComponent(btnContenido)
                    .addComponent(btnHome3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome3)
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

        titulo_tema2.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        titulo_tema2.setForeground(new java.awt.Color(255, 175, 94));
        titulo_tema2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_tema2.setText("Application I/O Interface");
        titulo_tema2.setMaximumSize(new java.awt.Dimension(968, 48));
        titulo_tema2.setMinimumSize(new java.awt.Dimension(968, 48));
        titulo_tema2.setPreferredSize(new java.awt.Dimension(968, 48));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("✔ I/O system calls encapsulate device behaviors in generic classes ");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("✔ Device-driver layer hides differences among I/O controllers from kernel  ");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("✔ New devices talking already-implemented protocols need no extra work ");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("✔ Each OS has its own I/O subsystem structures and device driver frameworks ");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("✔ Devices vary in many dimensions ");
        jLabel5.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("> Character-stream or block ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("> Sequential or random-access  ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setText("> Synchronous or asynchronous (or both) ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 102, 255));
        jLabel11.setText(">Sharable or dedicated ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 102, 255));
        jLabel12.setText("> Speed of operation ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 102, 255));
        jLabel13.setText("> read-write, read only, or write only ");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(titulo_tema2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 781, Short.MAX_VALUE)
                                .addComponent(siguiente)
                                .addGap(21, 21, 21))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSpanish)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnglish)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel13)))
                        .addContainerGap())))
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
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEnglish)
                            .addComponent(btnSpanish))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo_tema2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anterior)
                            .addComponent(siguiente))
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        titulo_tema2.setText(texto.getString("applicationIoInterface"));
        jLabel1.setText(texto.getString("appIoInterfaceLabel1"));
        jLabel2.setText(texto.getString("appIoInterfaceLabel2"));
        jLabel3.setText(texto.getString("appIoInterfaceLabel3"));
        jLabel4.setText(texto.getString("appIoInterfaceLabel4"));
        jLabel5.setText(texto.getString("appIoInterfaceLabel5"));
        jLabel8.setText(texto.getString("appIoInterfaceLabel6"));
        jLabel9.setText(texto.getString("appIoInterfaceLabel7"));
        jLabel10.setText(texto.getString("appIoInterfaceLabel8"));
        jLabel11.setText(texto.getString("appIoInterfaceLabel9"));
        jLabel12.setText(texto.getString("appIoInterfaceLabel10"));
        jLabel13.setText(texto.getString("appIoInterfaceLabel11"));

        ProyectoFinal.setLenguajeSeleccionado(locale);

    }

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anteriorMouseClicked
        setVisible(false);
        PantallaTema1 pantalla1 = new PantallaTema1();
        pantalla1.setVisible(true);
        pantalla1.setLocationRelativeTo(null);
    }//GEN-LAST:event_anteriorMouseClicked

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
        setVisible(false);
        PantallaTema3 pantalla3 = new PantallaTema3();
        pantalla3.setVisible(true);
        pantalla3.setLocationRelativeTo(null);
    }//GEN-LAST:event_siguienteMouseClicked

    private void btnHome3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome3MouseClicked
        setVisible(false);
        PantallaInicio inicio = new PantallaInicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_btnHome3MouseClicked

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
    private javax.swing.JLabel btnHome3;
    private javax.swing.JLabel btnSalida;
    private javax.swing.JButton btnSpanish;
    private javax.swing.JLabel btnTema1;
    private javax.swing.JLabel btnTema2;
    private javax.swing.JLabel btnTema3;
    private javax.swing.JLabel btnTema4;
    private javax.swing.JLabel btnTema5;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menu;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JLabel siguiente;
    private javax.swing.JLabel titulo_tema2;
    // End of variables declaration//GEN-END:variables
}
