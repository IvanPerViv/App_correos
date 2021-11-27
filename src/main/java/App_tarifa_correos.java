
import java.awt.*;
import javax.swing.*;

public class App_tarifa_correos extends JFrame {

    //********************** ENVIOS ORDINARIOS **************************//
    protected String[] envios_ordinarios = {
        "Hasta 20g --> 0,70€",
        "Más de 20g hasta 50g --> 0,80€",
        "Más de 50g hasta 100g --> 1,25€",
        "Más de 100g hasta 500g --> 2,50€",
        "Más de 500g hasta 1.000g --> 5,15€",
        "Más de 1.000g hasta 2.000g --> 5,60€"
    };

    protected String[] envios_ordinarios_certificado = {
        "Hasta 20g normalizadas --> 4,15€",
        "Más de 20g hasta 50g --> 4,25€",
        "Más de 50g hasta 100g --> 4,70€",
        "Más de 100g hasta 500g --> 5,95€",
        "Más de 500g hasta 1.000g --> 8,60€",
        "Más de 1.000g hasta 2.000g --> 9,05€"
    };

    protected double orden_envio_ordinario;
    protected double orden_envio_ordinario_cert;

    //********************** ENVIOS URGENTES **************************//
    protected String[] envios_urgentes = {
        "Hasta 20g normalizadas --> 4,10€",
        "Más de 20g hasta 50g --> 4,22€",
        "Más de 50g hasta 100g --> 4,74€",
        "Más de 100g hasta 500g --> 6,38€"
    };

    protected String[] envios__urgentes_certificados = {
        "Hasta 20g normalizadas --> 8,28€",
        "Más de 20g hasta 50g --> 8,40€",
        "Más de 50g hasta 100g --> 8,92€",
        "Más de 100g hasta 500g --> 10,55€",
        "Más de 500g hasta 1.000g --> 14,00€",
        "Más de 1.000g hasta 2.000g --> 14,58€"
    };

    protected double orden_envio_urgentes;
    protected double orden_envio_urgentes_certificado;

    //********************** CheckBox **************************//
    protected double valor_declarado;
    protected double aviso_recibo;

    public App_tarifa_correos(String nombre_app) {
        super(nombre_app);

        ImageIcon logo = new ImageIcon("logoCorreos.png");
        JLabel etiquetaLogo = new JLabel(logo);
        etiquetaLogo.setBounds(40, 10, 110, 110);

        add(etiquetaLogo);
        getContentPane().setBackground(new Color(255, 205, 0));
        setSize(600, 650);
        setResizable(false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        label_tipo_envio = new javax.swing.JLabel();
        label_numero_cartas = new javax.swing.JLabel();
        combox_tipo = new javax.swing.JComboBox<>();
        spinnner_numero_cartas = new javax.swing.JSpinner();
        Label_envio_ordinario = new javax.swing.JLabel();
        Label_envio_urgente = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lista_envio_ordinario = new javax.swing.JList<>();
        Combo_envio_Ordinario = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lista_envio_urgente = new javax.swing.JList<>();
        Combo_envio_Urgente = new javax.swing.JComboBox<>();
        CheckBox_valor_declarado = new javax.swing.JCheckBox();
        CheckBox_aviso_recibo = new javax.swing.JCheckBox();
        Label_valores_añadidos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        label_resultado2 = new javax.swing.JLabel();
        label_cartas_resul = new javax.swing.JLabel();
        label_tipo_de_envio = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        label_tipo_envio1 = new javax.swing.JLabel();
        combox_destino = new javax.swing.JComboBox<>();
        label_resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_titulo.setText("SERVICIOS POSTALES DE CORREOS");

        label_tipo_envio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_tipo_envio.setText("TIPO DE ENVIO ");

        label_numero_cartas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_numero_cartas.setText("Nº DE CARTAS");

        combox_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion...", "NACIONAL" }));

        spinnner_numero_cartas.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));

        Label_envio_ordinario.setBackground(new java.awt.Color(255, 255, 255));
        Label_envio_ordinario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_envio_ordinario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_envio_ordinario.setText("ENVIO ORDINARIO");
        Label_envio_ordinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Label_envio_urgente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_envio_urgente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_envio_urgente.setText("ENVIO URGENTE");
        Label_envio_urgente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lista_envio_ordinario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista_envio_ordinario.setToolTipText("Boton \"CTRL\" del teclado para deseleccionar una opcion marcada.");
        jScrollPane4.setViewportView(lista_envio_ordinario);

        Combo_envio_Ordinario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion...", "Envio ordinario", "Envio certificado" }));
        Combo_envio_Ordinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_envio_OrdinarioActionPerformed(evt);
            }
        });

        lista_envio_urgente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista_envio_urgente.setToolTipText("Boton \"CTRL\" del teclado para deseleccionar una opcion marcada.");
        jScrollPane5.setViewportView(lista_envio_urgente);

        Combo_envio_Urgente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion...", "Envio urgente", "Envio urgente certificado" }));
        Combo_envio_Urgente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_envio_UrgenteActionPerformed(evt);
            }
        });

        CheckBox_valor_declarado.setText("VALOR DECLARADO.");
        CheckBox_valor_declarado.setToolTipText("NECESITA un envio CERTIFICADO. Doble certificado. 2.10€");
        CheckBox_valor_declarado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CheckBox_valor_declarado.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        CheckBox_aviso_recibo.setText("AVISO DE RECIBO.");
        CheckBox_aviso_recibo.setToolTipText("NECESITA un envio CERTIFICADO.  1.94€");
        CheckBox_aviso_recibo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CheckBox_aviso_recibo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        Label_valores_añadidos.setBackground(new java.awt.Color(255, 153, 0));
        Label_valores_añadidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_valores_añadidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_valores_añadidos.setText("VALORES AÑADIDOS");
        Label_valores_añadidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label_resultado2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        label_cartas_resul.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        label_tipo_de_envio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label_tipo_envio1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_tipo_envio1.setText("DESTINO");

        combox_destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion...", "Andalucía", "Aragón", "Principado de Asturias", "Illes Balears", "Canarias", "Cantabria", "Castilla y León", "Castilla-La Mancha", "Cataluña", "Comunitat Valenciana", "Extremadura", "Galicia", "Comunidad de Madrid", "Región de Murcia", "Comunidad de Navarra", "País Vasco", "La Rioja", "Ciudad Autónoma de Ceuta", "Ciudad Autónoma de Melilla" }));

        label_resultado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Combo_envio_Ordinario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label_envio_ordinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_envio_urgente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Combo_envio_Urgente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label_valores_añadidos, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_tipo_de_envio, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label_cartas_resul, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_resultado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CheckBox_valor_declarado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CheckBox_aviso_recibo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(label_tipo_envio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combox_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(label_tipo_envio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(label_numero_cartas, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spinnner_numero_cartas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnner_numero_cartas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_numero_cartas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tipo_envio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tipo_envio1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combox_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_envio_urgente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_envio_ordinario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Combo_envio_Urgente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Combo_envio_Ordinario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Label_valores_añadidos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(CheckBox_valor_declarado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckBox_aviso_recibo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_cartas_resul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_tipo_de_envio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(label_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Combo_envio_OrdinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_envio_OrdinarioActionPerformed
        //Lectura usuario indice
        int categoria = Combo_envio_Ordinario.getSelectedIndex();
        DefaultListModel modelo = new DefaultListModel<>();

        switch (categoria) {
            case 1:
                for (int i = 0; i < envios_ordinarios.length; i++) {
                    modelo.addElement(envios_ordinarios[i]);
                }
                lista_envio_ordinario.setModel(modelo);
                break;
            case 2:
                for (int i = 0; i < envios_ordinarios_certificado.length; i++) {
                    modelo.addElement(envios_ordinarios_certificado[i]);
                }
                lista_envio_ordinario.setModel(modelo);
                break;
        }
    }//GEN-LAST:event_Combo_envio_OrdinarioActionPerformed

    private void Combo_envio_UrgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_envio_UrgenteActionPerformed
        int categoria = Combo_envio_Urgente.getSelectedIndex();
        DefaultListModel modelo2 = new DefaultListModel<>();

        switch (categoria) {
            case 1:
                for (int i = 0; i < envios_urgentes.length; i++) {
                    modelo2.addElement(envios_urgentes[i]);
                }
                lista_envio_urgente.setModel(modelo2);
                break;
            case 2:
                for (int i = 0; i < envios__urgentes_certificados.length; i++) {
                    modelo2.addElement(envios__urgentes_certificados[i]);
                }
                lista_envio_urgente.setModel(modelo2);
                break;
        }
    }//GEN-LAST:event_Combo_envio_UrgenteActionPerformed

    private double resultado_envio_ordinario() {
        double resultado = 0;
        String valorEnvio = lista_envio_ordinario.getSelectedValue().toString();
        if (valorEnvio.contains("Hasta 20g --> 0,70€")) {
            resultado = 0.70;
        } else if (valorEnvio.contains("Más de 20g hasta 50g --> 0,80€")) {
            resultado = 0.80;
        } else if (valorEnvio.contains("Más de 50g hasta 100g --> 1,25€")) {
            resultado = 1.25;
        } else if (valorEnvio.contains("Más de 100g hasta 500g --> 2,50€")) {
            resultado = 2.50;
        } else if (valorEnvio.contains("Más de 500g hasta 1.000g --> 5,15€")) {
            resultado = 5.15;
        } else if (valorEnvio.contains("Más de 1.000g hasta 2.000g --> 5,60€")) {
            resultado = 5.60;
        }
        return resultado;
    }

    private double resultado_envio_ordinario_certificado() {
        double resultado = 0;
        String valorEnvioCert = lista_envio_ordinario.getSelectedValue().toString();
        if (valorEnvioCert.contains("Hasta 20g normalizadas --> 4,15€")) {
            resultado = 4.15;
        } else if (valorEnvioCert.contains("Más de 20g hasta 50g --> 4,25€")) {
            resultado = 4.25;
        } else if (valorEnvioCert.contains("Más de 50g hasta 100g --> 4,70€")) {
            resultado = 4.70;
        } else if (valorEnvioCert.contains("Más de 100g hasta 500g --> 5,95€")) {
            resultado = 5.95;
        } else if (valorEnvioCert.contains("Más de 500g hasta 1.000g --> 8,60€")) {
            resultado = 8.60;
        } else if (valorEnvioCert.contains("Más de 1.000g hasta 2.000g --> 9,05€")) {
            resultado = 9.05;
        }
        return resultado;
    }

    private double resultado_envio_urgentes() {
        double resultado = 0;
        String valorEnvioUrg = lista_envio_urgente.getSelectedValue().toString();
        if (valorEnvioUrg.contains("Hasta 20g normalizadas --> 4,10€")) {
            resultado = 4.10;
        } else if (valorEnvioUrg.contains("Más de 20g hasta 50g --> 4,22€")) {
            resultado = 4.22;
        } else if (valorEnvioUrg.contains("Más de 50g hasta 100g --> 4,74€")) {
            resultado = 4.74;
        } else if (valorEnvioUrg.contains("Más de 100g hasta 500g --> 6,38€")) {
            resultado = 6.38;
        }
        return resultado;
    }

    private double resultado_envio_urgentes_certificados() {
        double resultado = 0;
        String valorEnvioUrgCer = lista_envio_urgente.getSelectedValue().toString();

        if (valorEnvioUrgCer.contains("Hasta 20g normalizadas --> 8,28€")) {
            resultado = 8.28;
        } else if (valorEnvioUrgCer.contains("Más de 20g hasta 50g --> 8,40€")) {
            resultado = 8.40;
        } else if (valorEnvioUrgCer.contains("Más de 50g hasta 100g --> 8,92€")) {
            resultado = 8.92;
        } else if (valorEnvioUrgCer.contains("Más de 100g hasta 500g --> 10,55€")) {
            resultado = 10.55;
        } else if (valorEnvioUrgCer.contains("Más de 500g hasta 1.000g --> 14,00€")) {
            resultado = 14.00;
        } else if (valorEnvioUrgCer.contains("Más de 1.000g hasta 2.000g --> 14,58€")) {
            resultado = 14.58;
        }
        return resultado;
    }

    //orden_envio_ordinario,orden_envio_urgentes,orden_envio_ordinario_cert,orden_envio_urgentes_certificado ,valor_declarado ,aviso_recibo
    public double sumatorio(double valor1, double valor2, double valorCert, double valorCert2, double valorOpcional, double valorOpcional2) {
        double resultado = 0;  
        if(valorCert != 0){
            resultado = valorOpcional+valorCert+valorCert2+valorOpcional2;
        }else if(valorCert2 != 0){
            resultado += valorOpcional2+valorCert+valorCert2+valorOpcional;
        }
        resultado += valor1 + valor2;
        return resultado;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        var resul_final = "El precio total es: ";
        label_tipo_de_envio.setText("Tipo de envio: " + combox_tipo.getItemAt(1)); //Por defecto siempre te pone el envio nacional.
        label_cartas_resul.setText("Nº Cartas: " + spinnner_numero_cartas.getValue().toString());
        var numeroDeCartas = (int)(spinnner_numero_cartas.getValue());
        var resultado_destino = combox_destino.getSelectedItem().toString();
        
        //ENVIOS ORDINARIOS, CERTIFICADO
        if (lista_envio_ordinario.getSelectedIndex() != -1) {
            orden_envio_ordinario = resultado_envio_ordinario();
            orden_envio_ordinario_cert = resultado_envio_ordinario_certificado();
        } else {
            orden_envio_ordinario = 0;
            orden_envio_ordinario_cert = 0;
        }

        //ENVIOS URGENTES, CERTIFICADO
        if (lista_envio_urgente.getSelectedIndex() != -1) {
            orden_envio_urgentes = resultado_envio_urgentes();
            orden_envio_urgentes_certificado = resultado_envio_urgentes_certificados();
        } else {
            orden_envio_urgentes = 0;
            orden_envio_urgentes_certificado = 0;
        }

        //CHECKBOX
        if (CheckBox_valor_declarado.isSelected()) {
            valor_declarado = 2.10;
        } else {
            valor_declarado = 0;
        }
        if (CheckBox_aviso_recibo.isSelected()) {
            aviso_recibo = 1.94;
        } else {
            aviso_recibo = 0;
        }
        
        double resultadoSuma = sumatorio(orden_envio_ordinario,orden_envio_urgentes,orden_envio_ordinario_cert,orden_envio_urgentes_certificado ,valor_declarado ,aviso_recibo)*numeroDeCartas;       
        label_resultado.setText(resul_final+ String.format("%.2f",resultadoSuma)+"€");
        label_resultado2.setText("Destino: " + resultado_destino);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        label_resultado.setText("");
        label_resultado2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox_aviso_recibo;
    private javax.swing.JCheckBox CheckBox_valor_declarado;
    private javax.swing.JComboBox<String> Combo_envio_Ordinario;
    private javax.swing.JComboBox<String> Combo_envio_Urgente;
    private javax.swing.JLabel Label_envio_ordinario;
    private javax.swing.JLabel Label_envio_urgente;
    private javax.swing.JLabel Label_valores_añadidos;
    private javax.swing.JComboBox<String> combox_destino;
    private javax.swing.JComboBox<String> combox_tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel label_cartas_resul;
    private javax.swing.JLabel label_numero_cartas;
    private javax.swing.JLabel label_resultado;
    private javax.swing.JLabel label_resultado2;
    private javax.swing.JLabel label_tipo_de_envio;
    private javax.swing.JLabel label_tipo_envio;
    private javax.swing.JLabel label_tipo_envio1;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JList<String> lista_envio_ordinario;
    private javax.swing.JList<String> lista_envio_urgente;
    private javax.swing.JSpinner spinnner_numero_cartas;
    // End of variables declaration//GEN-END:variables
}
