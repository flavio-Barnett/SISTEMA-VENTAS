package Interfaces;

import controlador.Controlador;
import org.apache.commons.lang3.StringUtils;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import modelo.Empleado;

public class SignUp extends javax.swing.JFrame {
    private final Controlador controlador;

    public SignUp(Controlador controlador) {
        this.controlador=controlador;
        this.setTitle("Registro - Crea tu cuenta");
        this.setLocationRelativeTo(null);
        initComponents();
        configurarEventos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnSexo = new javax.swing.ButtonGroup();
        Panel_SignUp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        txtPrimerApellido = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtNroDocumento = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFemenino = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JLabel();
        btnIniciarSesion1 = new javax.swing.JLabel();
        boxTipoDocumento = new javax.swing.JComboBox<>();
        Fondo_Nombre = new javax.swing.JLabel();
        Fondo_Apellido = new javax.swing.JLabel();
        Fondo_Correo = new javax.swing.JLabel();
        Fondo_TipoDocumento = new javax.swing.JLabel();
        Fondo_NroDocumento = new javax.swing.JLabel();
        Fondo_NroCelular = new javax.swing.JLabel();
        Fondo_Contrasena = new javax.swing.JLabel();
        Fondo_Registrar = new javax.swing.JLabel();
        Fondo_Sexo = new javax.swing.JLabel();
        Imagen_01 = new javax.swing.JLabel();
        Line = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SignUp_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Panel_SignUp.setBackground(new java.awt.Color(0, 204, 204));
        Panel_SignUp.setForeground(new java.awt.Color(255, 255, 255));
        Panel_SignUp.setPreferredSize(new java.awt.Dimension(400, 440));
        Panel_SignUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("¡Crea tu cuenta!");
        Panel_SignUp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tus datos seran confidenciales");
        jLabel2.setToolTipText("");
        Panel_SignUp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 300, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Sexo de Nacimiento");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_SignUp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 320, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("- ¿Ya tienes una cuenta? -");
        Panel_SignUp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 190, -1));

        txtPrimerNombre.setBackground(new java.awt.Color(0,0,0,0));
        txtPrimerNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPrimerNombre.setText("Primer Nombre");
        txtPrimerNombre.setBorder(null);
        txtPrimerNombre.setOpaque(false);
        txtPrimerNombre.setPreferredSize(new java.awt.Dimension(160, 35));
        txtPrimerNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrimerNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrimerNombreFocusLost(evt);
            }
        });
        Panel_SignUp.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 150, 155, -1));

        txtPrimerApellido.setBackground(new java.awt.Color(0,0,0,0));
        txtPrimerApellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPrimerApellido.setText("Primer Apellido");
        txtPrimerApellido.setBorder(null);
        txtPrimerApellido.setOpaque(false);
        txtPrimerApellido.setPreferredSize(new java.awt.Dimension(160, 35));
        txtPrimerApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrimerApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrimerApellidoFocusLost(evt);
            }
        });
        Panel_SignUp.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 150, 155, -1));

        txtCorreoElectronico.setBackground(new java.awt.Color(0,0,0,0));
        txtCorreoElectronico.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCorreoElectronico.setText("Correo Electronico");
        txtCorreoElectronico.setBorder(null);
        txtCorreoElectronico.setOpaque(false);
        txtCorreoElectronico.setPreferredSize(new java.awt.Dimension(330, 35));
        txtCorreoElectronico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoElectronicoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoElectronicoFocusLost(evt);
            }
        });
        Panel_SignUp.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 190, 325, -1));

        txtNroDocumento.setBackground(new java.awt.Color(0,0,0,0));
        txtNroDocumento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNroDocumento.setText("Nro. Documento");
        txtNroDocumento.setBorder(null);
        txtNroDocumento.setOpaque(false);
        txtNroDocumento.setPreferredSize(new java.awt.Dimension(160, 35));
        txtNroDocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNroDocumentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNroDocumentoFocusLost(evt);
            }
        });
        Panel_SignUp.add(txtNroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 230, 155, -1));

        txtCelular.setBackground(new java.awt.Color(0,0,0,0));
        txtCelular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCelular.setText("Nro. Celular");
        txtCelular.setBorder(null);
        txtCelular.setOpaque(false);
        txtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFocusLost(evt);
            }
        });
        Panel_SignUp.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 270, 155, 35));

        txtContrasena.setBackground(new java.awt.Color(0,0,0,0));
        txtContrasena.setText("Contrasena");
        txtContrasena.setBorder(null);
        txtContrasena.setOpaque(false);
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusLost(evt);
            }
        });
        Panel_SignUp.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 270, 155, 35));

        rbtnMasculino.setBackground(new java.awt.Color(0,0,0,0));
        rbtnSexo.add(rbtnMasculino);
        rbtnMasculino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnMasculino.setText("Masculino");
        rbtnMasculino.setOpaque(false);
        Panel_SignUp.add(rbtnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, 35));

        rbtnFemenino.setBackground(new java.awt.Color(0,0,0,0));
        rbtnSexo.add(rbtnFemenino);
        rbtnFemenino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnFemenino.setText("Femenino");
        rbtnFemenino.setOpaque(false);
        Panel_SignUp.add(rbtnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, 35));

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_SignUp.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 160, 35));

        btnIniciarSesion1.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciarSesion1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnIniciarSesion1.setText("Iniciar Sesión");
        btnIniciarSesion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesion1MouseClicked(evt);
            }
        });
        Panel_SignUp.add(btnIniciarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, -1, -1));

        boxTipoDocumento.setBackground(new java.awt.Color(0,0,0,0));
        boxTipoDocumento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boxTipoDocumento.setForeground(new java.awt.Color(255, 255, 255));
        boxTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Documento", "DNI", "Carne de Extranjeria", "Carne CPP", "Carne PTP", "Pasaporte" }));
        boxTipoDocumento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxTipoDocumento.setMinimumSize(new java.awt.Dimension(160, 35));
        boxTipoDocumento.setOpaque(false);
        Panel_SignUp.add(boxTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 35));

        Fondo_Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_Nombre.setToolTipText("");
        Panel_SignUp.add(Fondo_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        Fondo_Apellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_Apellido.setToolTipText("");
        Panel_SignUp.add(Fondo_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        Fondo_Correo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient2.png"))); // NOI18N
        Fondo_Correo.setToolTipText("");
        Panel_SignUp.add(Fondo_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        Fondo_TipoDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient3.png"))); // NOI18N
        Panel_SignUp.add(Fondo_TipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        Fondo_NroDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_NroDocumento.setToolTipText("");
        Panel_SignUp.add(Fondo_NroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        Fondo_NroCelular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_NroCelular.setToolTipText("");
        Panel_SignUp.add(Fondo_NroCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        Fondo_Contrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_Contrasena.setToolTipText("");
        Panel_SignUp.add(Fondo_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        Fondo_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient3.png"))); // NOI18N
        Panel_SignUp.add(Fondo_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        Fondo_Sexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient2.png"))); // NOI18N
        Fondo_Sexo.setToolTipText("");
        Panel_SignUp.add(Fondo_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        Imagen_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_1.png"))); // NOI18N
        Panel_SignUp.add(Imagen_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        Line.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Line.setText("______________________");
        Panel_SignUp.add(Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        Panel_SignUp.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, 560));

        SignUp_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Background.png"))); // NOI18N
        Panel_SignUp.add(SignUp_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_SignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_SignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrimerNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrimerNombreFocusGained
        if (txtPrimerNombre.getText().equals("Primer Nombre")) {
            txtPrimerNombre.setText(null);
        }
    }//GEN-LAST:event_txtPrimerNombreFocusGained

    private void txtPrimerNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrimerNombreFocusLost
        if (txtPrimerNombre.getText().equals("")) {
            txtPrimerNombre.setText("Primer Nombre");
        }
    }//GEN-LAST:event_txtPrimerNombreFocusLost

    private void txtPrimerApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrimerApellidoFocusGained
        if (txtPrimerApellido.getText().equals("Primer Apellido")) {
            txtPrimerApellido.setText(null);
        }
    }//GEN-LAST:event_txtPrimerApellidoFocusGained

    private void txtPrimerApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrimerApellidoFocusLost
        if (txtPrimerApellido.getText().equals("")) {
            txtPrimerApellido.setText("Primer Apellido");
        }
    }//GEN-LAST:event_txtPrimerApellidoFocusLost

    private void txtCorreoElectronicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoFocusLost
        if (txtCorreoElectronico.getText().equals("")) {
            txtCorreoElectronico.setText("Correo Electronico");
        }
    }//GEN-LAST:event_txtCorreoElectronicoFocusLost

    private void txtCorreoElectronicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoFocusGained
        if (txtCorreoElectronico.getText().equals("Correo Electronico")) {
            txtCorreoElectronico.setText(null);
        }
    }//GEN-LAST:event_txtCorreoElectronicoFocusGained

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        if (txtCelular.getText().equals("")) {
            txtCelular.setText("Nro. Celular");
        }
    }//GEN-LAST:event_txtCelularFocusLost

    private void txtCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusGained
        if (txtCelular.getText().equals("Nro. Celular")) {
            txtCelular.setText(null);
        }
    }//GEN-LAST:event_txtCelularFocusGained

    private void txtNroDocumentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNroDocumentoFocusGained
        if (txtNroDocumento.getText().equals("Nro. Documento")) {
            txtNroDocumento.setText(null);
        }
    }//GEN-LAST:event_txtNroDocumentoFocusGained

    private void txtNroDocumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNroDocumentoFocusLost
        if (txtNroDocumento.getText().equals("")) {
            txtNroDocumento.setText("Nro. Documento");
        }
    }//GEN-LAST:event_txtNroDocumentoFocusLost

    private void btnIniciarSesion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesion1MouseClicked
        Login LogIn = new Login(controlador);
        LogIn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIniciarSesion1MouseClicked

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        if (txtContrasena.getText().equals("Contrasena")) {
            txtContrasena.setText(null);
        }
    }//GEN-LAST:event_txtContrasenaFocusGained

    private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusLost
        if (txtContrasena.getText().equals("")) {
            txtContrasena.setText("Contrasena");
        }
    }//GEN-LAST:event_txtContrasenaFocusLost

    private void configurarEventos() {
        btnRegistrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                String firstName = txtPrimerNombre.getText();
                String lastName = txtPrimerApellido.getText();
                String email = txtCorreoElectronico.getText();
                String documentType = boxTipoDocumento.getSelectedItem().toString();
                String documentNumber = txtNroDocumento.getText();
                String cellphoneNumber = txtCelular.getText();
                String password = txtContrasena.getText();
                String gender = rbtnFemenino.isSelected() ? "Femenino" : "Masculino";
                if (StringUtils.isNoneBlank(firstName, lastName, email, documentType, documentNumber, cellphoneNumber, password, gender)) {
                Empleado empleado = new Empleado(firstName, lastName, email, documentType, documentNumber, cellphoneNumber, password, gender);
                Controlador.Registrar(empleado);
                } else {
                    JOptionPane.showMessageDialog(null, "Falta llenar Datos");
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo_Apellido;
    private javax.swing.JLabel Fondo_Contrasena;
    private javax.swing.JLabel Fondo_Correo;
    private javax.swing.JLabel Fondo_Nombre;
    private javax.swing.JLabel Fondo_NroCelular;
    private javax.swing.JLabel Fondo_NroDocumento;
    private javax.swing.JLabel Fondo_Registrar;
    private javax.swing.JLabel Fondo_Sexo;
    private javax.swing.JLabel Fondo_TipoDocumento;
    private javax.swing.JLabel Imagen_01;
    private javax.swing.JLabel Line;
    private javax.swing.JPanel Panel_SignUp;
    private javax.swing.JLabel SignUp_Background;
    private javax.swing.JComboBox<String> boxTipoDocumento;
    private javax.swing.JLabel btnIniciarSesion1;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.ButtonGroup rbtnSexo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNroDocumento;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    // End of variables declaration//GEN-END:variables
}
