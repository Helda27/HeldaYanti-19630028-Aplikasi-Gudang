/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksiGudang;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class koneksiGudang {
    private Connection  koneksi;
    
    public Connection Connect(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Berhasil Koneksi");
    }   catch (ClassNotFoundException ex){
        System.out.println ("Gagal Koneksi"+ex);
    }
        String url ="jdbc:mysql://localhost:3306/db_gudang";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Database");
        }   catch (SQLException ex){
            System.out.println("Gagal Koneksi Database"+ex);
        }
            return koneksi;
        
    
    }

    public Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
