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
public class Mahasiswa {
    private String nim;
    private String nama;
    private String email;
    private Dosen pembimbing;
        
    public Mahasiswa(String no, String nm){
        nim=no;
        nama=nm;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dosen getPembimbing() {
        return pembimbing;
    }

    public void setPembimbing(Dosen pembimbing) {
        this.pembimbing = pembimbing;
    }
        
}
