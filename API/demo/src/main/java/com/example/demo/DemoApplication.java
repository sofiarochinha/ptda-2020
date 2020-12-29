package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

public static void main(String[] args) throws ClassNotFoundException {
SpringApplication.run(DemoApplication.class, args);

    String url = "jdbc:mysql://estga-dev.clients.ua.pt:3306/ptda2020gr1db";
        String username = "ptda-2020-gr1";
        String password = "snh_936=i";
        String driver = "com.mysql.cj.jdbc.Driver";

        Class.forName(driver);

        try {
            Connection conn = DriverManager.getConnection(url, username, password);

            String query = "insert into Categoria (Nome)" + " values (?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            
            preparedStmt.setString(1, "r");

            // execute the preparedstatement
            preparedStmt.execute();

            query = "select * from Categoria";
            PreparedStatement preparedStmtSelect = conn.prepareStatement(query);
            preparedStmtSelect.execute();
            
            ResultSet rs = preparedStmtSelect.getResultSet();
        
            while (rs.next()) {
                System.out.println(rs.getString("ID"));
                System.out.println(rs.getString("Nome"));
            }

        } catch (SQLException e) {
            System.out.println("Connection to MySQL db failed");
            e.printStackTrace();
        }
}
        
        
//@GetMapping("estga-dev.clients.ua.pt:3306")
//public int hello(@RequestParam(value = "ID", defaultValue = "Nome") int name) {
//    return 
//}
}