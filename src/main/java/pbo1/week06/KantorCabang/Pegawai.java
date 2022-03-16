/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week06.KantorCabang;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Pegawai {
    
    private String employeeID;
    private static String uniqueID="0";
    private String name;
    private String jabatan;
    private LocalDate birthday;
    
    public Pegawai(){
        this("", LocalDate.of(2000, 1, 31));
    }
    
    public Pegawai(String name, LocalDate birthday){
        employeeID=Pegawai.getUniqueID();
        this.name=name;
        this.birthday=birthday;
    }
        
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = String.format("%4s", employeeID);
    }
    
    public void setUniqueID(int uniqueID){
        Pegawai.uniqueID=String.valueOf(uniqueID);
    }
    
    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;                
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        switch(jabatan){
            case "pimpinan":case "teknisi":case "akuntan":
                this.jabatan=jabatan;
        }
        this.jabatan = "";
    }
    
    private static String getUniqueID(){
        int id=Integer.parseInt(uniqueID);
        uniqueID=String.format("%04d", ++id);
        return uniqueID;
    }
    
    @Override
    public String toString(){
        return "{ID: "+getEmployeeID()
                +"; Name: "+getName()
                +"; Birthday: "
                +getBirthday().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                +"}";
    }
}
