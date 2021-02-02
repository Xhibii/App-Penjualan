/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.penjualan;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author deric
 */
public class Hitung {
    private String kode,nama;
    private double harga,jumlah,subtotal,subsubtotal,diskon,pajak,total;
    private Statement s;
    private ResultSet rs;
    Connection con=Koneksi.Koneksi();
    
public Hitung(){
    kode = "";
    nama = "";
    harga = 0;
}

public void setKode(String kode){
    this.kode = kode;
}

public void setNama(String nama){
    this.nama = nama;
}

public void setHarga(double Harga){
    this.harga = Harga;
}

public double getHarga(){
    return(harga);
}
public void setJumlah(double Jumlah){
    this.jumlah = Jumlah;
}

public double getJumlah(){
    return(jumlah);
}

public double getSubTotal(){
return(getJumlah()*getHarga());
} 

public double Total(){
   String sql="Select Sum(subtotal) as total from penjualan";
        try{
            s=con.createStatement();
            rs=s.executeQuery(sql);
            if(rs.next()){
            total = rs.getDouble("total");
        }
        } catch (Exception e) {
        }
        return(total);
}
}
