/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesgui;

/**
 *
 * @author deric
 */
public class SalesLogic {
    private String id,nama,wilayah;
    private double point,gajipokok,bonus;
    
public SalesLogic(){ // konstruktor untuk class
id="";
nama="";
wilayah="";
point=0;
gajipokok=800000;
bonus=0;
}
public void setId(String id){
this.id=id;
}
public void setNama(String nama){
this.nama=nama;
}
public void setWilayah(String wilayah){
this.wilayah=wilayah;
}
public void setPoint(double point){
this.point=point;
}
public double getPoint(){
return(point);
}
public double Bonus(){ // menentukan value dari var bonus.
if(getPoint() >= 600){
bonus = 1000000;
}else if(getPoint() >= 500){
bonus = 600000;
}else if(getPoint() >= 400){
bonus = 300000;
}else if(getPoint() >= 100){
bonus = 100000;
}else bonus = 0;
return(bonus);
}

public void setGajiPokok(double gaji){
this.gajipokok = gaji;
}

public double getGajiPokok(){ // menentukan value dari var gaji pokok.
return(gajipokok);
}
public double Total(){ // menentukan value dari var total gaji.
return(gajipokok + bonus);
}
}
