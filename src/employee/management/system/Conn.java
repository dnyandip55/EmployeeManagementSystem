
package employee.management.system;

import java.sql.*;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create the connection
            String user="root";
            String password="root@123";
            String url="jdbc:mysql://localhost:3306/employeemanagementsystem";
            
            c=DriverManager.getConnection(url,user,password);
            
            s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
