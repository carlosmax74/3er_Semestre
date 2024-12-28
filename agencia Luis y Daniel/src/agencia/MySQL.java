/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PCxxCC1
 */
public class MySQL {
    
    static Connection Conexion;
    
    public void MySQLConnection(String user, String pass, String db_name) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
            JOptionPane.showMessageDialog(null, "Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void closeConnection() {
        try {
            Conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void createDB(String name) throws Exception {
        try {
            String Query = "CREATE DATABASE IF NOT EXISTS " + name;
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            MySQLConnection("root", "", name);
            JOptionPane.showMessageDialog(null, "Se ha creado/revisado la base de datos " + name + " de forma exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    
    public void createTableAutos(String name) {
        try {
            String Query = "CREATE TABLE IF NOT EXISTS " + name +  ""
                    + "(Numero_Serie VARCHAR(25) NOT NULL,Marca VARCHAR(30) NOT NULL,Modelo VARCHAR(50) NOT NULL,"
                    + " Anio VARCHAR(4) NOT NULL,Tipo VARCHAR(20) NOT NULL,Color VARCHAR(10) NOT NULL,"
                    + " Configuracion_Motor VARCHAR(150) NOT NULL,Transmision VARCHAR(50) NOT NULL,Equipamiento VARCHAR(100),"
                    + " PRIMARY KEY (Numero_Serie))";
            JOptionPane.showMessageDialog(null, "Se ha creado/revisado la base de tabla " + name + " de forma exitosa");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createTableClientes(String name) { 
        try {
            String Query = "CREATE TABLE IF NOT EXISTS " + name + "" 
                    + "(ID_Cliente VARCHAR(10) NOT NULL, Apellidos VARCHAR(50) NOT NULL, Nombres VARCHAR(50) NOT NULL,"
                    + " Sexo VARCHAR(10) NOT NULL, Fecha_Nacimiento DATE NOT NULL, Direccion VARCHAR(75) NOT NULL,"
                    + " Colonia VARCHAR(50) NOT NULL, Telefono VARCHAR(10) NOT NULL,"
                    + " PRIMARY KEY (ID_Cliente))";
            JOptionPane.showMessageDialog(null, "Se ha creado/revisado la base de tabla " + name + " de forma exitosa");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createTableEmpleados(String name) {
        try {
            String Query = "CREATE TABLE IF NOT EXISTS " + name + "" 
                    + "(RFC VARCHAR(13) NOT NULL, Apellidos VARCHAR(50) NOT NULL, Nombres VARCHAR(50) NOT NULL,"
                    + " Puesto VARCHAR(20) NOT NULL, Sexo VARCHAR(10) NOT NULL, Fecha_Nacimiento DATE NOT NULL,"
                    + " Direccion VARCHAR(50) NOT NULL, Colonia VARCHAR(30) NOT NULL, Telefono VARCHAR(10),"
                    + " PRIMARY KEY (RFC))";
            JOptionPane.showMessageDialog(null, "Se ha creado/revisado la base de tabla " + name + " de forma exitosa");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createTableVentas(String name) {
        try {
            String Query = "CREATE TABLE IF NOT EXISTS " + name + ""
                    + "(ID_Venta VARCHAR(10) NOT NULL, RFC VARCHAR(13) NOT NULL, ID_Cliente VARCHAR(10) NOT NULL,"
                    + " Numero_Serie VARCHAR(25) NOT NULL, Fecha DATE NOT NULL, Precio VARCHAR(15) NOT NULL, Forma_Pago VARCHAR(20) NOT NULL,"
                    + " PRIMARY KEY (ID_Venta))";
            JOptionPane.showMessageDialog(null, "Se ha creado/revisado la base de tabla " + name + " de forma exitosa");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createTableServicios(String name) {
        try {
            String Query = "CREATE TABLE IF NOT EXISTS " + name + "" 
                    + "(ID_Servicio VARCHAR(10) NOT NULL, RFC VARCHAR(13) NOT NULL, Numero_Serie VARCHAR(25) NOT NULL,"
                    + " ID_Cliente VARCHAR(10) NOT NULL, Fecha_Recepcion DATE NOT NULL, Fecha_Entrega DATE NOT NULL,"
                    + " Cambio_Aceite VARCHAR(2) NOT NULL, Afinacion VARCHAR(2) NOT NULL, Cambio_Frenos VARCHAR(2), Problemas_Generales VARCHAR(200),"
                    + " PRIMARY KEY (ID_Servicio))";
            JOptionPane.showMessageDialog(null, "Se ha creado/revisado la base de tabla " + name + " de forma exitosa");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //a PARTIR DE AQUI VER SI CREAR RELACIONES CON SELECT autos.* ventas.* FROM autos JOIN ventas ON autos.Numero_Serie = ventas.Numero_Serie 

    public void insertDataAutos(String table_name, String Numero_Serie, String Marca, String Modelo, String Anio, String Tipo, String Color, String Configuracion_Motor, String Transmision, String Equipamiento) {
        try {
            String Query = "INSERT INTO " + table_name + " VALUES("
                    + "\"" + Numero_Serie + "\", "
                    + "\"" + Marca + "\", "
                    + "\"" + Modelo + "\", "
                    + "\"" + Anio + "\", "
                    + "\"" + Tipo + "\", "
                    + "\"" + Color + "\", "
                    + "\"" + Configuracion_Motor + "\", "
                    + "\"" + Transmision + "\", "
                    + "\"" + Equipamiento + "\")";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
            JOptionPane.showMessageDialog(null, "Revise que el Número de Serie no coincida con uno registrado anteriormente en la base de datos");
            JOptionPane.showMessageDialog(null, "Recuerde consultar su manual de usuario para mas información");
            
        }
    }
    
    public void insertDataClientes(String table_name, String ID_Cliente, String Apellidos, String Nombres, String Sexo, String Fecha_Nacimiento, String Direccion, String Colonia, String Telefono) {
        try {
            String Query = "INSERT INTO " + table_name + " VALUES("
                    + "\"" + ID_Cliente + "\", "
                    + "\"" + Apellidos + "\", "
                    + "\"" + Nombres + "\", "
                    + "\"" + Sexo + "\", "
                    + "\"" + Fecha_Nacimiento + "\", "
                    + "\"" + Direccion + "\", "
                    + "\"" + Colonia + "\", "
                    + "\"" + Telefono + "\")";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
            JOptionPane.showMessageDialog(null, "Revise que el ID del cliente no coincida con uno registrado anteriormente en la base de datos");
            JOptionPane.showMessageDialog(null, "Recuerde consultar su manual de usuario para mas información");
        }
    }
    
    public void insertDataEmpleados(String table_name, String RFC, String Apellidos, String Nombres, String Puesto, String Sexo, String Fecha_Nacimiento, String Direccion, String Colonia, String Telefono) {
        try {
            String Query = "INSERT INTO " + table_name + " VALUES("
                    + "\"" + RFC + "\", "
                    + "\"" + Apellidos + "\", "
                    + "\"" + Nombres + "\", "
                    + "\"" + Puesto + "\", "
                    + "\"" + Sexo + "\", "
                    + "\"" + Fecha_Nacimiento + "\", "
                    + "\"" + Direccion + "\", "
                    + "\"" + Colonia + "\", "
                    + "\"" + Telefono + "\")";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
            JOptionPane.showMessageDialog(null, "Revise que el RFC no coincida con uno registrado anteriormente en la base de datos");
            JOptionPane.showMessageDialog(null, "Recuerde consultar su manual de usuario para mas información");
        }
    }
    
    public void insertDataVentas(String table_name, String ID_Venta, String RFC, String ID_Cliente, String Numero_Serie, String Fecha, String Precio, String Forma_Pago) {
        try {
            String Query = "INSERT INTO " + table_name + " VALUES("
                    + "\"" + ID_Venta + "\", "
                    + "\"" + RFC + "\", "
                    + "\"" + ID_Cliente + "\", "
                    + "\"" + Numero_Serie + "\", "
                    + "\"" + Fecha + "\", "
                    + "\"" + Precio + "\", "
                    + "\"" + Forma_Pago + "\")";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
            JOptionPane.showMessageDialog(null, "Revise que el ID de venta no coincida con uno registrado anteriormente en la base de datos");
            JOptionPane.showMessageDialog(null, "Recuerde consultar su manual de usuario para mas información");
        }
    }
    
    public void insertDataServicios(String table_name, String ID_Servicio, String RFC, String Numero_Serie, String ID_Cliente, String Fecha_Recepcion, String Fecha_Entrega, String Cambio_Aceite, String Afinacion, String Cambio_Frenos, String Problemas_Generales) {
        try {
            String Query = "INSERT INTO " + table_name + " VALUES("
                    + "\"" + ID_Servicio + "\", "
                    + "\"" + RFC + "\", "
                    + "\"" + Numero_Serie + "\", "
                    + "\"" + ID_Cliente + "\", "
                    + "\"" + Fecha_Recepcion + "\", "
                    + "\"" + Fecha_Entrega + "\", "
                    + "\"" + Cambio_Aceite + "\", "
                    + "\"" + Afinacion + "\", "
                    + "\"" + Cambio_Frenos + "\", "
                    + "\"" + Problemas_Generales + "\")";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
            JOptionPane.showMessageDialog(null, "Revise que el ID de Servicio no coincida con uno registrado anteriormente en la base de datos");
            JOptionPane.showMessageDialog(null, "Recuerde consultar su manual de usuario para mas información");
        }
    }

    public void getValuesAutos(String table_name) {
        try {
            String Query = "SELECT * FROM " + table_name;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
 
            while (resultSet.next()) {
                System.out.println("Numero Serie: " + resultSet.getString("Numero_Serie") + " "
                        + "Marca: " + resultSet.getString("Marca") + " " 
                        + "Modelo: " + resultSet.getString("Modelo") + " "
                        + "Año: " + resultSet.getString("Anio") + " "
                        + "Tipo: " + resultSet.getString("Tipo") + " "
                        + "Color: " + resultSet.getString("Color") + " "
                        + "Configuracion del motor: " + resultSet.getString("Configuracion_Motor") + " "
                        + "Transmision: " + resultSet.getString("Transmision") + " "
                        + "Equipamiento: " + resultSet.getString("Equipamiento"));
             
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos, revise que la conexión siga ejecutandose");
        }
    }
    
    public void getValuesClientes(String table_name) {
        try {
            String Query = "SELECT * FROM " + table_name;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
 
            while (resultSet.next()) {
                System.out.println("ID del cliente: " + resultSet.getString("ID_Cliente") + " "
                        + "Apellidos: " + resultSet.getString("Apellidos") + " " 
                        + "Nombre(s): " + resultSet.getString("Nombres") + " "
                        + "Sexo: " + resultSet.getString("Sexo") + " "
                        + "Fecha de Nacimiento: " + resultSet.getString("Fecha_Nacimiento") + " "
                        + "Direccion: " + resultSet.getString("Direccion") + " "
                        + "Colonia: " + resultSet.getString("Colonia") + " "
                        + "Telefono: " + resultSet.getString("Telefono"));
             
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos, revise que la conexión siga ejecutandose");
        }
    }
    
    public void getValuesEmpleados(String table_name) {
        try {
            String Query = "SELECT * FROM " + table_name;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
 
            while (resultSet.next()) {
                System.out.println("RFC: " + resultSet.getString("RFC") + " "
                        + "Apellidos: " + resultSet.getString("Apellidos") + " " 
                        + "Nombre(s): " + resultSet.getString("Nombres") + " "
                        + "Puesto: " + resultSet.getString("Puesto") + " "
                        + "Sexo: " + resultSet.getString("Sexo") + " "
                        + "Fecha de Nacimiento: " + resultSet.getString("Fecha_Nacimiento") + " "
                        + "Direccion: " + resultSet.getString("Direccion") + " "
                        + "Colonia: " + resultSet.getString("Colonia") + " "
                        + "Telefono: " + resultSet.getString("Telefono"));
             
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos, revise que la conexión siga ejecutandose");
        }
    }
    
    public void getValuesVentas(String table_name) {
        try {
            String Query = "SELECT * FROM " + table_name;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                System.out.println("ID de venta: " + resultSet.getString("ID_Venta") + " "
                        + "RFC del vendedor: " + resultSet.getString("RFC") + " " 
                        + "ID del cliente: " + resultSet.getString("ID_Cliente") + " "
                        + "Numero de serie del vehículo: " + resultSet.getString("Numero_Serie") + " "
                        + "Fecha de venta: " + resultSet.getString("Fecha") + " "
                        + "Precio: " + resultSet.getString("Precio") + " "
                        + "Forma de pago: " + resultSet.getString("Forma_Pago"));
             
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos, revise que la conexión siga ejecutandose");
        }
    }
    
    public void getValuesServicios(String table_name) {
        try {
            String Query = "SELECT * FROM " + table_name;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                System.out.println("ID de Servicio: " + resultSet.getString("ID_Servicio") + " "
                        + "RFC del mecánico: " + resultSet.getString("RFC") + " " 
                        + "ID del cliente: " + resultSet.getString("ID_Cliente") + " "
                        + "Numero de serie del vehículo: " + resultSet.getString("Numero_Serie") + " "
                        + "Fecha de recepción: " + resultSet.getString("Fecha_Recepcion") + " "
                        + "Fecha de entrega: " + resultSet.getString("Fecha_Entrega") + " "
                        + "Cambio de aceite: " + resultSet.getString("Cambio_Aceite") + " "
                        + "Afinacion: " + resultSet.getString("Afinacion") + " "
                        + "Cambio de frenos: " + resultSet.getString("Cambio_Frenos") + " "
                        + "Problemas Generales: " + resultSet.getString("Problemas_Generales"));
             
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos, revise que la conexión siga ejecutandose");
        }
    }
    
    public void deleteRegistroAutos(String table_name, String Numero_Serie) {
        try {
            String Query = "DELETE FROM " + table_name + " WHERE Numero_Serie = \"" + Numero_Serie + "\"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Exito borrando el registro especificado");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
            JOptionPane.showMessageDialog(null, "Revise que el Número de Serie este dado de alta, recuerde consultar su manual de usuario");
        }
    }
    
    public void deleteRegistroClientes(String table_name, String ID_Clientes) {
        try {
            String Query = "DELETE FROM " + table_name + " WHERE ID_Cliente = \"" + ID_Clientes + "\"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Exito borrando el registro especificado");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
            JOptionPane.showMessageDialog(null, "Revise que el ID del cliente este dado de alta, recuerde consultar su manual de usuario");
        }   
    }
    public void deleteRegistroEmpleados(String table_name, String RFC) {
        try {
            String Query = "DELETE FROM " + table_name + " WHERE RFC = \"" + RFC + "\"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Exito borrando el registro especificado");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
            JOptionPane.showMessageDialog(null, "Revise que el RFC este dado de alta, recuerde consultar su manual de usuario");
        }
    }
    
    public void deleteRegistroVentas(String table_name, String ID_Ventas) {
        try {
            String Query = "DELETE FROM " + table_name + " WHERE ID_Venta = \"" + ID_Ventas + "\"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Exito borrando el registro especificado");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
            JOptionPane.showMessageDialog(null, "Revise que el ID de venta este dado de alta, recuerde consultar su manual de usuario");
        }
    }
    
    public void deleteRegistroServicios(String table_name, String ID_Servicios) {
        try {
            String Query = "DELETE FROM " + table_name + " WHERE ID_Servicio = \"" + ID_Servicios + "\"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Exito borrando el registro especificado");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
            JOptionPane.showMessageDialog(null, "Revise que el ID de servicio este dado de alta, recuerde consultar su manual de usuario");
        }
    }
   
}
