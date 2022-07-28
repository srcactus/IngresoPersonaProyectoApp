/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import dao.ComunaDAO;
import dao.CorporacionDAO;
import dao.DatosContactoDAO;
import dao.DireccionDAO;
import dao.DiscapacidadDAO;
import dao.EmpresaDAO;
import dao.LocalidadDAO;
import dao.NacimientoDAO;
import dao.PersonaDAO;
import dao.ProvinciaDAO;
import dao.ProyectoDAO;
import dao.RegionDAO;
import dao.RespuestaDAO;
import dao.UsoInternoDAO;
import entidades.Comuna;
import entidades.Corporacion;
import entidades.DatosContacto;
import entidades.Direccion;
import entidades.Discapacidad;
import entidades.Empresa;
import entidades.Localidad;
import entidades.Nacimiento;
import entidades.Persona;
import entidades.Provincia;
import entidades.Proyecto;
import entidades.Region;
import entidades.Respuesta;
import entidades.UsoInterno;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Cactus
 */
public class FormularioSercotecTres extends javax.swing.JFrame {

    /**
     * Creates new form FormularioSercotecTres
     */
    public FormularioSercotecTres() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/logoNewSolutionLogin.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnSiguiente3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblA11 = new javax.swing.JLabel();
        cboSocioNegocio = new javax.swing.JComboBox<>();
        lblA12 = new javax.swing.JLabel();
        cboPersonasCargoTrabajosAnteriores = new javax.swing.JComboBox<>();
        lblA13 = new javax.swing.JLabel();
        cboRecursosCrecerNegocio = new javax.swing.JComboBox<>();
        lblA14 = new javax.swing.JLabel();
        cboServiciosAsesorias = new javax.swing.JComboBox<>();
        lblA15 = new javax.swing.JLabel();
        cboNotableSerEmprendedor = new javax.swing.JComboBox<>();
        lblA16 = new javax.swing.JLabel();
        cboPrincipalVentajaSobreCompetencia = new javax.swing.JComboBox<>();
        lblA18 = new javax.swing.JLabel();
        cboEmpresasNegociosDueno = new javax.swing.JComboBox<>();
        lblA19 = new javax.swing.JLabel();
        cboPromedioHorasCapacitacion = new javax.swing.JComboBox<>();
        cboConocimientoManejoMarketing = new javax.swing.JComboBox<>();
        lblA17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNombreProyecto = new javax.swing.JTextField();
        lblA1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcionProyecto2 = new javax.swing.JTextArea();
        lblA2 = new javax.swing.JLabel();
        cboRubro = new javax.swing.JComboBox<>();
        lblA3 = new javax.swing.JLabel();
        lblA4 = new javax.swing.JLabel();
        rbtVideoRedesSi = new javax.swing.JRadioButton();
        rbtVideoRedesNo = new javax.swing.JRadioButton();
        lblA5 = new javax.swing.JLabel();
        rbtAutorizaDireccionSi = new javax.swing.JRadioButton();
        rbtAutorizaDireccionNo = new javax.swing.JRadioButton();
        lblA6 = new javax.swing.JLabel();
        cboPrincipalesClientes = new javax.swing.JComboBox<>();
        lblA7 = new javax.swing.JLabel();
        cboFormaPaganLosClientes = new javax.swing.JComboBox<>();
        cboNivDeudaMensual = new javax.swing.JComboBox<>();
        lblA9 = new javax.swing.JLabel();
        cboPrincipalFuenteFinanciamiento = new javax.swing.JComboBox<>();
        lblA10 = new javax.swing.JLabel();
        cboFormaPagoInsumosNegocio = new javax.swing.JComboBox<>();
        lblA8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FormularioSercotec3");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Ficha tecnica");

        btnSiguiente3.setText("Siguiente");
        btnSiguiente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente3ActionPerformed(evt);
            }
        });

        lblA11.setText("Cuenta con algun socio en su negocio (socio formal o informal).");

        cboSocioNegocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "No tengo, pero ya he contactado a mi futuro socio", "No tengo, ni estoy pensando en tener socio", "No tengo, pero no lo descarto", "Tengo o tendré socio familiar y no familiar" }));

        lblA12.setText("Cuantas personas a cargo ha tenido en trabajos anteriores?");

        cboPersonasCargoTrabajosAnteriores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "No he tenido personas a mi cargo.", "1 – 2 personas", "3- 5 personas", "6 – 10 personas", "11- 15 personas", "Mayor a 15 personas" }));

        lblA13.setText("Si tienes que conseguir recursos para hacer crecer su negocio cual seria la mejor alternativa para conseguir.");

        cboRecursosCrecerNegocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Préstamo de amigo familiar.", "Préstamo de banco e instituciones financieras", "Préstamo de casa comercial", "Tarjeta de crédito o avance en efectivo", "Subsidio de institución gubernamental  no gubernamental", "Ahorro propio", "Otro" }));

        lblA14.setText("De la siguiente lista de servicios o asesoria externa, escoja una");

        cboServiciosAsesorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Contador", "Otra asesoría externa, publicidad, abogado, ingeniero, etc.", "Mentor familiar que aconseja", "Contador y Otra asesoría externa, publicidad, abogado, ingeniero, etc.", "Contador y Mentor familiar que aconseja", "Otra asesoría externa, publicidad, abogado, ingeniero, etc. Y Mentor familiar que aconseja", "Contador, Otra asesoría externa, publicidad, abogado, ingeniero, etc. Y Mentor familiar que aconseja", "No utiliza servicios externos" }));

        lblA15.setText("Que es lo mas notable de ser emprendedor?");

        cboNotableSerEmprendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Lograr independencia y ser mi propio jefe.", "Tener personas a cargo", "Ganarme la vida", "Autorrealización", "Contribuir a la sociedad", "Mejorar actuales ingresos", "Otro" }));

        lblA16.setText("Cual es la principal ventaja que usted identifica en productos y/o servicios por sobre su competencia?");

        cboPrincipalVentajaSobreCompetencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Mis productos son claramente de mejor calidad.", "Doy un mejor servicio que mis competencias", "Ofrezco mejor precio", "Mis productos y servicios está a la vanguardia del mercado", "No es relevante conocer los productos y/o servicios de mi competencia cuando mi producto o servicio es de calidad." }));

        lblA18.setText("De cuantas empresas o negocios es o ha sido dueño?");

        cboEmpresasNegociosDueno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "1", "2", "3", "Mayor a 3", "Nunca he sido dueño de negocio o empresa" }));

        lblA19.setText("Señale nivel de conocimiento y manejo que posee en marketing comercial y generacion de redes comerciales");

        cboPromedioHorasCapacitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "No he recibido capacitación", "Menor a 20 horas", "20 – 50 horas", "50 – 100 horas", "100 – 200 horas", "200 – 300 horas", "Mayor a 300 horas" }));

        cboConocimientoManejoMarketing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Sin manejo teórico y práctico sobre la materia", "Conoce poco sobre la materia y nunca la he puesto en práctica", "Conoce sobre el tema y algunas veces la he puesto en práctica", "Conoce sobre el tema e intenta ponerlo en práctica", "Tiene un alto manejo técnico y práctico de la materia" }));

        lblA17.setText("Promedio de horas efectivas de capacitacion en los ultimos 3 años");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblA13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboPersonasCargoTrabajosAnteriores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblA12)
                            .addComponent(cboSocioNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblA11))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblA17)
                            .addComponent(cboEmpresasNegociosDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblA18)
                            .addComponent(cboPrincipalVentajaSobreCompetencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblA16)
                            .addComponent(cboNotableSerEmprendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblA15)
                            .addComponent(cboServiciosAsesorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblA14)
                            .addComponent(cboRecursosCrecerNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblA19)
                            .addComponent(cboConocimientoManejoMarketing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboPromedioHorasCapacitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblA11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboSocioNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblA12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboPersonasCargoTrabajosAnteriores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblA13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboRecursosCrecerNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblA14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboServiciosAsesorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblA15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboNotableSerEmprendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblA16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboPrincipalVentajaSobreCompetencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblA17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboPromedioHorasCapacitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblA18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboEmpresasNegociosDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lblA19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboConocimientoManejoMarketing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        lblA1.setText("Nombre del proyecto");

        txaDescripcionProyecto2.setColumns(20);
        txaDescripcionProyecto2.setRows(5);
        jScrollPane1.setViewportView(txaDescripcionProyecto2);

        lblA2.setText("Descripcion del proyecto");

        cboRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Agricultura, Ganadería, Silvicultura y Pesca", "Explotación de Minas y Canteras", "Industrias Manufacturera", "Suministro de Electricidad, Gas, Vapor y Aire Acondicionado", "Suministro de Agua, Evacuación de Agua residuales, gestión de desechos y descontaminación", "Construcción", "Comercio al Por Mayor y al por Menor ", "Reparación de Vehiculos Automotores y Motocicletas", "Transporte y Almacenamiento", "Actividades de Alojamiento y de Servicio de comidas", "Información y Comunicaciones", "Actividades Financieras y de Seguros", "Actividades inmobiliarias", "Actividades Profesionales, Cientificas y Técnicas", "Actividades de Servicios Administrativos y de Apoyo", "Adm. Pública y Defensa, Planes de Seguridad Social de Afiliación Obligatoria", "Enseñanza", "Actividades de Atención de la Salud Humana y de Asistencia Social", "Actividades Artisticas, de Entretenimiento y Recreativas", "Otras Actividades de Servicios", "Actividades de los Hogaes como Empleadores: Actividades No Diferenciadas de los Hogares", "Actividades de Organizaciones y Organos Extraterritoriales" }));

        lblA3.setText("Seleccion del rubro");

        lblA4.setText("Autorizacion del video en redes sociales");

        buttonGroup1.add(rbtVideoRedesSi);
        rbtVideoRedesSi.setText("Si");

        buttonGroup1.add(rbtVideoRedesNo);
        rbtVideoRedesNo.setText("No");

        lblA5.setText("Autorizacion uso de direccion comercial de empresa localizacion, ubicacion en plataforma en SERCOTEC ");

        buttonGroup2.add(rbtAutorizaDireccionSi);
        rbtAutorizaDireccionSi.setText("Si");

        buttonGroup2.add(rbtAutorizaDireccionNo);
        rbtAutorizaDireccionNo.setText("No");

        lblA6.setText("Principales clientes");

        cboPrincipalesClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Personas Naturales o particulares", "Empresas grandes", "Empresas consideradas mediana y pequeñas", "Microempresas", "Instituciones Públicas", "No sé" }));

        lblA7.setText("De que forma pagan a los clientes");

        cboFormaPaganLosClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Efectivo", "Cheque al día saldo 15 a 30 días", "Tarjeta Crédito o débito", "Con insumos" }));

        cboNivDeudaMensual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "No tiene", "Cerca del 10% de ventas mensuales", "Cerca del 20% de ventas mensuales", "Cerca de 30% de ventas mensuales", "Cerca del 40% de ventas mensuales", "Más del 40 % de ventas mensuales" }));

        lblA9.setText("Cual es la principal fuente de financiamiento con que pone en marcha su negocio?");

        cboPrincipalFuenteFinanciamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Dinero que recibió (Herencia, indemnización, finiquito, etc.)", "Préstamo de un amigo, familiar", "Fondo propio que tenía ahorrado.", "Con mi sueldo ya que trabajé dependiente.", "Subsidio que recibió de institución Pública", "Préstamo de entidad financiera.", "Otra" }));

        lblA10.setText("Cual es la forma de pago que utiliza para pagar materia prima o insumos del negocio?");

        cboFormaPagoInsumosNegocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Al contado", "Tarjeta de Crédito en cuotas con interés", "Tarjeta de crédito en 3 cuotas sin interés o cheque de pie, más cuota sin interés.", "Otra" }));

        lblA8.setText("Nivel de deuda mensual que tiene el negocio en relacion a las ventas netas mensuales");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbtAutorizaDireccionSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtAutorizaDireccionNo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblA2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblA1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblA3)
                        .addGap(18, 18, 18)
                        .addComponent(cboRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblA4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtVideoRedesSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtVideoRedesNo))
                            .addComponent(lblA5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblA6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPrincipalesClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblA7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboFormaPaganLosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblA8)
                    .addComponent(cboNivDeudaMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA9)
                    .addComponent(cboPrincipalFuenteFinanciamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA10)
                    .addComponent(cboFormaPagoInsumosNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA1))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblA2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblA3)
                    .addComponent(cboRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblA4)
                    .addComponent(rbtVideoRedesSi)
                    .addComponent(rbtVideoRedesNo))
                .addGap(37, 37, 37)
                .addComponent(lblA5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtAutorizaDireccionSi)
                    .addComponent(rbtAutorizaDireccionNo))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblA6)
                    .addComponent(cboPrincipalesClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblA7)
                    .addComponent(cboFormaPaganLosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lblA8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboNivDeudaMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblA9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboPrincipalFuenteFinanciamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblA10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFormaPagoInsumosNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(514, 514, 514)
                                .addComponent(btnSiguiente3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguiente3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente3ActionPerformed
        // TODO add your handling code here:

        if (FormularioSercotecTres.txtNombreProyecto.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Debe completar el campo NOMBRE PROYECTO", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboRubro.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar un RUBRO valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.rbtVideoRedesSi.isSelected() == false && FormularioSercotecTres.rbtVideoRedesNo.isSelected() == false) {

            JOptionPane.showMessageDialog(null, "Debe seleccionar si autoriza o no VIDEO REDES SOCIALES", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.rbtAutorizaDireccionSi.isSelected() == false && FormularioSercotecTres.rbtAutorizaDireccionNo.isSelected() == false) {

            JOptionPane.showMessageDialog(null, "Debe seleccionar si autoriza o no la DIRECCION DE EMPRESA", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboPrincipalesClientes.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar PRINCIPALES CLIENTES valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboFormaPaganLosClientes.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar una FORMA DE PAGO DE CLIENTES valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboNivDeudaMensual.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar un NIVEL DE DEUDA valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboPrincipalFuenteFinanciamiento.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar una FUENTE DE FINANCIAMIENTO valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboFormaPagoInsumosNegocio.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar una FORMA DE PAGO DE INSUMOS valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboSocioNegocio.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar un SOCIO DE NEGOCIO valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboPersonasCargoTrabajosAnteriores.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar PERSONAS A CARGO EN TRABAJOS valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboRecursosCrecerNegocio.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar RECURSOS PARA SU NEGOCIO valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboServiciosAsesorias.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar un SERVICIO O ASESORIA EXTERNA valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboNotableSerEmprendedor.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar LO NOTABLE DE SER EMPRENDEDOR valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboPrincipalVentajaSobreCompetencia.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar una PRINCIPAL VENTAJA SOBRE LA COMPETENCIA valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboPromedioHorasCapacitacion.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar un PROMEDIO DE HORAS DE CAPACITACION valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboEmpresasNegociosDueno.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar de CUANTAS EMPRESAS O NEGOCIOS A SIDO DUEÑO valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else if (FormularioSercotecTres.cboConocimientoManejoMarketing.getSelectedItem().toString() == "-Seleccione-") {

            JOptionPane.showMessageDialog(null, "Debe seleccionar un CONOCIMIENTO Y MANEJO DE MARKETING valido", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else {

            FormularioSercotecCanvasCuatro abrir = new FormularioSercotecCanvasCuatro();
            abrir.setVisible(true);
            
        }

    }//GEN-LAST:event_btnSiguiente3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormularioSercotecTres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioSercotecTres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioSercotecTres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioSercotecTres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioSercotecTres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.JComboBox<String> cboConocimientoManejoMarketing;
    public static javax.swing.JComboBox<String> cboEmpresasNegociosDueno;
    public static javax.swing.JComboBox<String> cboFormaPaganLosClientes;
    public static javax.swing.JComboBox<String> cboFormaPagoInsumosNegocio;
    public static javax.swing.JComboBox<String> cboNivDeudaMensual;
    public static javax.swing.JComboBox<String> cboNotableSerEmprendedor;
    public static javax.swing.JComboBox<String> cboPersonasCargoTrabajosAnteriores;
    public static javax.swing.JComboBox<String> cboPrincipalFuenteFinanciamiento;
    public static javax.swing.JComboBox<String> cboPrincipalVentajaSobreCompetencia;
    public static javax.swing.JComboBox<String> cboPrincipalesClientes;
    public static javax.swing.JComboBox<String> cboPromedioHorasCapacitacion;
    public static javax.swing.JComboBox<String> cboRecursosCrecerNegocio;
    public static javax.swing.JComboBox<String> cboRubro;
    public static javax.swing.JComboBox<String> cboServiciosAsesorias;
    public static javax.swing.JComboBox<String> cboSocioNegocio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblA1;
    private javax.swing.JLabel lblA10;
    private javax.swing.JLabel lblA11;
    private javax.swing.JLabel lblA12;
    private javax.swing.JLabel lblA13;
    private javax.swing.JLabel lblA14;
    private javax.swing.JLabel lblA15;
    private javax.swing.JLabel lblA16;
    private javax.swing.JLabel lblA17;
    private javax.swing.JLabel lblA18;
    private javax.swing.JLabel lblA19;
    private javax.swing.JLabel lblA2;
    private javax.swing.JLabel lblA3;
    private javax.swing.JLabel lblA4;
    private javax.swing.JLabel lblA5;
    private javax.swing.JLabel lblA6;
    private javax.swing.JLabel lblA7;
    private javax.swing.JLabel lblA8;
    private javax.swing.JLabel lblA9;
    public static javax.swing.JRadioButton rbtAutorizaDireccionNo;
    public static javax.swing.JRadioButton rbtAutorizaDireccionSi;
    public static javax.swing.JRadioButton rbtVideoRedesNo;
    public static javax.swing.JRadioButton rbtVideoRedesSi;
    public static javax.swing.JTextArea txaDescripcionProyecto2;
    public static javax.swing.JTextField txtNombreProyecto;
    // End of variables declaration//GEN-END:variables
}
