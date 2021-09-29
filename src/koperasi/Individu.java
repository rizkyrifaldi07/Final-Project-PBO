
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adiha
 */
class Individu extends Nasabah{

    /**
     * @return the nik
     */
    public long getNik() {
        return nik;
    }

    /**
     * @param nik the nik to set
     */
    public void setNik(long nik) {
        this.nik = nik;
    }

    /**
     * @return the npwp
     */
    public long getNpwp() {
        return npwp;
    }

    /**
     * @param npwp the npwp to set
     */
    public void setNpwp(long npwp) {
        this.npwp = npwp;
    }
    
    public long nik;
    public long npwp;
    
    public Individu(long nik, long npwp, String nama, String alamat, ArrayList<Rekening> rekening) {
        super(nama, alamat, rekening);
        this.setNik(nik);
        this.setNpwp(npwp);
    }
    
    @Override
    public void print(){
        System.out.println("Nama: " + this.nama);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("NIK: " + this.nik);
        System.out.println("NPWP: " + this.npwp);
        System.out.println("===========================================");
        System.out.println("No Rekening                     Saldo");
        System.out.println("===========================================");
        for(Rekening i : this.rekening){
            System.out.println(String.format("%-27d%.2f", i.getNoRekening(), i.getSaldo()));
        }
    }
}
