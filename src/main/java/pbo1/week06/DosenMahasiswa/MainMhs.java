/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week06.DosenMahasiswa;
import javax.swing.*;
/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class MainMhs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dsn1=new Dosen("P1000", "Adi Putra");
        dsn1.setEmail("adi@yahoo.com");
        Mahasiswa mhs1=new Mahasiswa("005314200", "Ria");
        mhs1.setPembimbing(dsn1);
        mhs1.setEmail("ria@gmail.com");
        Dosen dsnSem=mhs1.getPembimbing();
        String nm=dsnSem.getNIP();
        JOptionPane.showMessageDialog(null, "Pembimbing "
                +mhs1.getNim()+" adalah "+nm,"Pembimbing ",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
