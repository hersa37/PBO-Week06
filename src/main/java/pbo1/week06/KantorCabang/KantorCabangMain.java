/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week06.KantorCabang;


/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class KantorCabangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai nm=new Pegawai();
        KantorCabang kc=new KantorCabang("B0001", "Paingan", "sleman", new Pegawai());
             
        System.out.println(kc);
    }

}
