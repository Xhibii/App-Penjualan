/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.penjualan;

/**
 *
 * @author deric
 */
public class Hitung {
    private String kode,nama;
    private double harga,jumlah,subtotal,diskon,pajak;
    
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
    subtotal = harga*jumlah;
    return(subtotal);
} 

public double Diskon(){
    if (getSubTotal()>1000000){
        diskon = 0.25 * subtotal;
    }else diskon = 0;
    return (diskon);
}

public double getPajak(){
    pajak = 0.1 * (subtotal-diskon);
    return (pajak);
}

public double Total(){
    return(subtotal-diskon+pajak);
}
}
