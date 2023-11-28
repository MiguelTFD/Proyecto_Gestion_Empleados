package net.migueltfd.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection
{
   
   public static Connection getConexion(){
      
      Connection cn = null;
      try
      {
         Class.forName("com.mysql.jdbc.Driver");
         cn = DriverManager.getConnection("jdbc:mysql://localhost/municipalidad", "root", "mysql" );
         System.out.println("Te Has Conectado con : " + "\033[0;34m" + "MySQL" + "\033[0m");
         
      }catch (Exception exc)
      {
         exc.printStackTrace();
      }
      return cn;
   }
   
   
}
