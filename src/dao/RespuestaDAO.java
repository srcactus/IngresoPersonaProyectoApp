/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Discapacidad;
import entidades.Nacimiento;
import entidades.Persona;
import entidades.Respuesta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cactus
 */
public class RespuestaDAO {

    private Conexion conexion = new Conexion();
    int contadorF = 1;
    int contadorF2 = 20;

    public boolean consultaDatosFichaTecnica(Respuesta respuesta) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            if (contadorF <= 19) {

                String sql2 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                        + "values(?,?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                stmt2.setString(1, respuesta.getR1());
                stmt2.setInt(2, respuesta.getIdPersonaF());
                stmt2.setInt(3, contadorF);

                stmt2.executeUpdate();
                contadorF++;

                if (contadorF <= 19) {

                    String sql3 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                            + "values(?,?,?)";
                    PreparedStatement stmt3 = conn.prepareStatement(sql3);
                    stmt3.setString(1, respuesta.getR2());
                    stmt3.setInt(2, respuesta.getIdPersonaF());
                    stmt3.setInt(3, contadorF);

                    stmt3.executeUpdate();
                    contadorF++;

                    if (contadorF <= 19) {

                        String sql4 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                + "values(?,?,?)";
                        PreparedStatement stmt4 = conn.prepareStatement(sql4);
                        stmt4.setString(1, respuesta.getR3());
                        stmt4.setInt(2, respuesta.getIdPersonaF());
                        stmt4.setInt(3, contadorF);

                        stmt4.executeUpdate();
                        contadorF++;

                        if (contadorF <= 19) {

                            String sql5 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                    + "values(?,?,?)";
                            PreparedStatement stmt5 = conn.prepareStatement(sql5);
                            stmt5.setString(1, respuesta.getR4());
                            stmt5.setInt(2, respuesta.getIdPersonaF());
                            stmt5.setInt(3, contadorF);

                            stmt5.executeUpdate();
                            contadorF++;

                            if (contadorF <= 19) {

                                String sql6 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                        + "values(?,?,?)";
                                PreparedStatement stmt6 = conn.prepareStatement(sql6);
                                stmt6.setString(1, respuesta.getR5());
                                stmt6.setInt(2, respuesta.getIdPersonaF());
                                stmt6.setInt(3, contadorF);

                                stmt6.executeUpdate();
                                contadorF++;

                                if (contadorF <= 19) {

                                    String sql7 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                            + "values(?,?,?)";
                                    PreparedStatement stmt7 = conn.prepareStatement(sql7);
                                    stmt7.setString(1, respuesta.getR6());
                                    stmt7.setInt(2, respuesta.getIdPersonaF());
                                    stmt7.setInt(3, contadorF);

                                    stmt7.executeUpdate();
                                    contadorF++;

                                    if (contadorF <= 19) {

                                        String sql8 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                + "values(?,?,?)";
                                        PreparedStatement stmt8 = conn.prepareStatement(sql8);
                                        stmt8.setString(1, respuesta.getR7());
                                        stmt8.setInt(2, respuesta.getIdPersonaF());
                                        stmt8.setInt(3, contadorF);

                                        stmt8.executeUpdate();
                                        contadorF++;

                                        if (contadorF <= 19) {

                                            String sql9 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                    + "values(?,?,?)";
                                            PreparedStatement stmt9 = conn.prepareStatement(sql9);
                                            stmt9.setString(1, respuesta.getR8());
                                            stmt9.setInt(2, respuesta.getIdPersonaF());
                                            stmt9.setInt(3, contadorF);

                                            stmt9.executeUpdate();
                                            contadorF++;

                                            if (contadorF <= 19) {

                                                String sql10 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                        + "values(?,?,?)";
                                                PreparedStatement stmt10 = conn.prepareStatement(sql10);
                                                stmt10.setString(1, respuesta.getR9());
                                                stmt10.setInt(2, respuesta.getIdPersonaF());
                                                stmt10.setInt(3, contadorF);

                                                stmt10.executeUpdate();
                                                contadorF++;

                                                if (contadorF <= 19) {

                                                    String sql11 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                            + "values(?,?,?)";
                                                    PreparedStatement stmt11 = conn.prepareStatement(sql11);
                                                    stmt11.setString(1, respuesta.getR10());
                                                    stmt11.setInt(2, respuesta.getIdPersonaF());
                                                    stmt11.setInt(3, contadorF);

                                                    stmt11.executeUpdate();
                                                    contadorF++;

                                                    if (contadorF <= 19) {

                                                        String sql12 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                + "values(?,?,?)";
                                                        PreparedStatement stmt12 = conn.prepareStatement(sql12);
                                                        stmt12.setString(1, respuesta.getR11());
                                                        stmt12.setInt(2, respuesta.getIdPersonaF());
                                                        stmt12.setInt(3, contadorF);

                                                        stmt12.executeUpdate();
                                                        contadorF++;

                                                        if (contadorF <= 19) {

                                                            String sql13 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                    + "values(?,?,?)";
                                                            PreparedStatement stmt13 = conn.prepareStatement(sql13);
                                                            stmt13.setString(1, respuesta.getR12());
                                                            stmt13.setInt(2, respuesta.getIdPersonaF());
                                                            stmt13.setInt(3, contadorF);

                                                            stmt13.executeUpdate();
                                                            contadorF++;

                                                            if (contadorF <= 19) {

                                                                String sql14 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                        + "values(?,?,?)";
                                                                PreparedStatement stmt14 = conn.prepareStatement(sql14);
                                                                stmt14.setString(1, respuesta.getR13());
                                                                stmt14.setInt(2, respuesta.getIdPersonaF());
                                                                stmt14.setInt(3, contadorF);

                                                                stmt14.executeUpdate();
                                                                contadorF++;

                                                                if (contadorF <= 19) {

                                                                    String sql15 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                            + "values(?,?,?)";
                                                                    PreparedStatement stmt15 = conn.prepareStatement(sql15);
                                                                    stmt15.setString(1, respuesta.getR14());
                                                                    stmt15.setInt(2, respuesta.getIdPersonaF());
                                                                    stmt15.setInt(3, contadorF);

                                                                    stmt15.executeUpdate();
                                                                    contadorF++;

                                                                    if (contadorF <= 19) {

                                                                        String sql16 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                                + "values(?,?,?)";
                                                                        PreparedStatement stmt16 = conn.prepareStatement(sql16);
                                                                        stmt16.setString(1, respuesta.getR15());
                                                                        stmt16.setInt(2, respuesta.getIdPersonaF());
                                                                        stmt16.setInt(3, contadorF);

                                                                        stmt16.executeUpdate();
                                                                        contadorF++;

                                                                        if (contadorF <= 19) {

                                                                            String sql17 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                                    + "values(?,?,?)";
                                                                            PreparedStatement stmt17 = conn.prepareStatement(sql17);
                                                                            stmt17.setString(1, respuesta.getR16());
                                                                            stmt17.setInt(2, respuesta.getIdPersonaF());
                                                                            stmt17.setInt(3, contadorF);

                                                                            stmt17.executeUpdate();
                                                                            contadorF++;

                                                                            if (contadorF <= 19) {

                                                                                String sql18 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                                        + "values(?,?,?)";
                                                                                PreparedStatement stmt18 = conn.prepareStatement(sql18);
                                                                                stmt18.setString(1, respuesta.getR17());
                                                                                stmt18.setInt(2, respuesta.getIdPersonaF());
                                                                                stmt18.setInt(3, contadorF);

                                                                                stmt18.executeUpdate();
                                                                                contadorF++;

                                                                                if (contadorF <= 19) {

                                                                                    String sql19 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                                            + "values(?,?,?)";
                                                                                    PreparedStatement stmt19 = conn.prepareStatement(sql19);
                                                                                    stmt19.setString(1, respuesta.getR18());
                                                                                    stmt19.setInt(2, respuesta.getIdPersonaF());
                                                                                    stmt19.setInt(3, contadorF);

                                                                                    stmt19.executeUpdate();
                                                                                    contadorF++;

                                                                                    if (contadorF <= 19) {//19

                                                                                        String sql20 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                                                + "values(?,?,?)";
                                                                                        PreparedStatement stmt20 = conn.prepareStatement(sql20);
                                                                                        stmt20.setString(1, respuesta.getR19());
                                                                                        stmt20.setInt(2, respuesta.getIdPersonaF());
                                                                                        stmt20.setInt(3, contadorF);

                                                                                        stmt20.executeUpdate();
                                                                                        contadorF++;
                                                                                        consultaCorrecta = true;

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        return consultaCorrecta;

    }

    public boolean consultaDatosCanvas(Respuesta respuesta) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sqlCons = "select id_persona from persona where id_persona=(?)";
            PreparedStatement stmtCons = conn.prepareStatement(sqlCons);

            stmtCons.setInt(1, respuesta.getIdPersonaFCanvas());

            ResultSet rsCons = stmtCons.executeQuery();

            int valorCons = 0;

            while (rsCons.next()) {
                valorCons = rsCons.getInt("id_persona");
            }

            System.out.println("valor que toma en la consulta select: " + valorCons);

            if (valorCons != 0) {

                if (contadorF2 <= 35) {

                    String sql21 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                            + "values(?,?,?)";
                    PreparedStatement stmt21 = conn.prepareStatement(sql21);
                    stmt21.setString(1, respuesta.getR20());
                    stmt21.setInt(2, respuesta.getIdPersonaFCanvas());
                    stmt21.setInt(3, contadorF2);

                    stmt21.executeUpdate();
                    contadorF2++;

                    if (contadorF2 <= 35) {

                        String sql22 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                + "values(?,?,?)";
                        PreparedStatement stmt22 = conn.prepareStatement(sql22);
                        stmt22.setString(1, respuesta.getR21());
                        stmt22.setInt(2, respuesta.getIdPersonaFCanvas());
                        stmt22.setInt(3, contadorF2);

                        stmt22.executeUpdate();
                        contadorF2++;

                        if (contadorF2 <= 35) {

                            String sql23 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                    + "values(?,?,?)";
                            PreparedStatement stmt23 = conn.prepareStatement(sql23);
                            stmt23.setString(1, respuesta.getR22());
                            stmt23.setInt(2, respuesta.getIdPersonaFCanvas());
                            stmt23.setInt(3, contadorF2);

                            stmt23.executeUpdate();
                            contadorF2++;

                            if (contadorF2 <= 35) {

                                String sql24 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                        + "values(?,?,?)";
                                PreparedStatement stmt24 = conn.prepareStatement(sql24);
                                stmt24.setString(1, respuesta.getR23());
                                stmt24.setInt(2, respuesta.getIdPersonaFCanvas());
                                stmt24.setInt(3, contadorF2);

                                stmt24.executeUpdate();
                                contadorF2++;

                                if (contadorF2 <= 35) {

                                    String sql25 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                            + "values(?,?,?)";
                                    PreparedStatement stmt25 = conn.prepareStatement(sql25);
                                    stmt25.setString(1, respuesta.getR24());
                                    stmt25.setInt(2, respuesta.getIdPersonaFCanvas());
                                    stmt25.setInt(3, contadorF2);

                                    stmt25.executeUpdate();
                                    contadorF2++;

                                    if (contadorF2 <= 35) {

                                        String sql26 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                + "values(?,?,?)";
                                        PreparedStatement stmt26 = conn.prepareStatement(sql26);
                                        stmt26.setString(1, respuesta.getR25());
                                        stmt26.setInt(2, respuesta.getIdPersonaFCanvas());
                                        stmt26.setInt(3, contadorF2);

                                        stmt26.executeUpdate();
                                        contadorF2++;

                                        if (contadorF2 <= 35) {

                                            String sql27 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                    + "values(?,?,?)";
                                            PreparedStatement stmt27 = conn.prepareStatement(sql27);
                                            stmt27.setString(1, respuesta.getR26());
                                            stmt27.setInt(2, respuesta.getIdPersonaFCanvas());
                                            stmt27.setInt(3, contadorF2);

                                            stmt27.executeUpdate();
                                            contadorF2++;

                                            if (contadorF2 <= 35) {

                                                String sql28 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                        + "values(?,?,?)";
                                                PreparedStatement stmt28 = conn.prepareStatement(sql28);
                                                stmt28.setString(1, respuesta.getR27());
                                                stmt28.setInt(2, respuesta.getIdPersonaFCanvas());
                                                stmt28.setInt(3, contadorF2);

                                                stmt28.executeUpdate();
                                                contadorF2++;

                                                if (contadorF2 <= 35) {

                                                    String sql29 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                            + "values(?,?,?)";
                                                    PreparedStatement stmt29 = conn.prepareStatement(sql29);
                                                    stmt29.setString(1, respuesta.getR28());
                                                    stmt29.setInt(2, respuesta.getIdPersonaFCanvas());
                                                    stmt29.setInt(3, contadorF2);

                                                    stmt29.executeUpdate();
                                                    contadorF2++;
                                                    if (contadorF2 <= 35) {

                                                        String sql30 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                + "values(?,?,?)";
                                                        PreparedStatement stmt30 = conn.prepareStatement(sql30);
                                                        stmt30.setString(1, respuesta.getR29());
                                                        stmt30.setInt(2, respuesta.getIdPersonaFCanvas());
                                                        stmt30.setInt(3, contadorF2);

                                                        stmt30.executeUpdate();
                                                        contadorF2++;

                                                        if (contadorF2 <= 35) {

                                                            String sql31 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                    + "values(?,?,?)";
                                                            PreparedStatement stmt31 = conn.prepareStatement(sql31);
                                                            stmt31.setString(1, respuesta.getR30());
                                                            stmt31.setInt(2, respuesta.getIdPersonaFCanvas());
                                                            stmt31.setInt(3, contadorF2);

                                                            stmt31.executeUpdate();
                                                            contadorF2++;

                                                            if (contadorF2 <= 35) {

                                                                String sql32 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                        + "values(?,?,?)";
                                                                PreparedStatement stmt32 = conn.prepareStatement(sql32);
                                                                stmt32.setString(1, respuesta.getR31());
                                                                stmt32.setInt(2, respuesta.getIdPersonaFCanvas());
                                                                stmt32.setInt(3, contadorF2);

                                                                stmt32.executeUpdate();
                                                                contadorF2++;

                                                                if (contadorF2 <= 35) {

                                                                    String sql33 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                            + "values(?,?,?)";
                                                                    PreparedStatement stmt33 = conn.prepareStatement(sql33);
                                                                    stmt33.setString(1, respuesta.getR32());
                                                                    stmt33.setInt(2, respuesta.getIdPersonaFCanvas());
                                                                    stmt33.setInt(3, contadorF2);

                                                                    stmt33.executeUpdate();
                                                                    contadorF2++;

                                                                    if (contadorF2 <= 35) {

                                                                        String sql34 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                                + "values(?,?,?)";
                                                                        PreparedStatement stmt34 = conn.prepareStatement(sql34);
                                                                        stmt34.setString(1, respuesta.getR33());
                                                                        stmt34.setInt(2, respuesta.getIdPersonaFCanvas());
                                                                        stmt34.setInt(3, contadorF2);

                                                                        stmt34.executeUpdate();
                                                                        contadorF2++;

                                                                        if (contadorF2 <= 35) {

                                                                            String sql35 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                                    + "values(?,?,?)";
                                                                            PreparedStatement stmt35 = conn.prepareStatement(sql35);
                                                                            stmt35.setString(1, respuesta.getR34());
                                                                            stmt35.setInt(2, respuesta.getIdPersonaFCanvas());
                                                                            stmt35.setInt(3, contadorF2);

                                                                            stmt35.executeUpdate();
                                                                            contadorF2++;

                                                                            if (contadorF2 <= 35) {

                                                                                String sql36 = "insert into respuesta(descripcion, id_persona, id_pregunta) "
                                                                                        + "values(?,?,?)";
                                                                                PreparedStatement stmt36 = conn.prepareStatement(sql36);
                                                                                stmt36.setString(1, respuesta.getR35());
                                                                                stmt36.setInt(2, respuesta.getIdPersonaFCanvas());
                                                                                stmt36.setInt(3, contadorF2);

                                                                                stmt36.executeUpdate();
                                                                                contadorF2++;
                                                                                consultaCorrecta = true;
                                                                            }

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {

                JOptionPane.showMessageDialog(null, "Debe ingresar un ID valido!!!");

            }
        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
        return consultaCorrecta;

    }

    
    
    
    

}
