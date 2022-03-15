/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week06;


/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class KantorCabang {
    
    private String kode_cabang;
    private String alamat;
    private String kota;
    private Pegawai pimpinan;
           
    public KantorCabang(){
        this("","","",new Pegawai());
    }
    
    public KantorCabang(String kode, String alamat, String kota, Pegawai pimpinan){
        kode_cabang=kode;
        this.alamat=alamat;
        this.kota=kota;
        this.pimpinan=pimpinan;
    }

    public String getKode_cabang() {
        return kode_cabang;
    }

    public void setKode_cabang(String kode_cabang) {
        this.kode_cabang = kode_cabang;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public Pegawai getPimpinan() {
        return pimpinan;
    }

    public void setPimpinan(Pegawai pimpinan) {
        this.pimpinan = pimpinan;
    }
    
    
}
