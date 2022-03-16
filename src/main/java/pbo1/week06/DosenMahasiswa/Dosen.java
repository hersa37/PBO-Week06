/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week06.DosenMahasiswa;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Dosen {
    private String nip;
    private String nama;
    private String email;
    
    public Dosen(String no, String nm){
        nip=no;
        nama=nm;
    }
    
    public String getNIP(){
        return nip;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
}
