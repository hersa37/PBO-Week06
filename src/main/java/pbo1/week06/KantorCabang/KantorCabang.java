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
public class KantorCabang {
    
    private String kodeCabang;
    private String alamat;
    private String kota;
    private Pegawai pimpinan;
           
    public KantorCabang(){
        this("","","",new Pegawai());
    }
    
    public KantorCabang(String kode, String alamat, String kota, Pegawai pimpinan){
        kodeCabang=kode;
        this.alamat=alamat;
        this.kota=kota;
        this.pimpinan=pimpinan;
    }

    public String getKodeCabang() {
        return kodeCabang;
    }

    public void setKodeCabang(String kodeCabang) {
        this.kodeCabang = kodeCabang;
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
        if(pimpinan.getJabatan().equals("pimpinan")){
            this.pimpinan = pimpinan;
        } else this.pimpinan = new Pegawai();
    }
    
    @Override
    public String toString(){
        return "{Kode Cabang: "+kodeCabang
                +"; Alamat: "+alamat
                +"; Kota: "+kota
                +"; Pimpinan: "+pimpinan.toString();
    }
    
    
}
