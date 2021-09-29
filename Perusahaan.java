
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
class Perusahaan extends Nasabah{
    /**
     * @return the nib
     */
    public String getNib() {
        return nib;
    }

    /**
     * @param nib the nib to set
     */
    public void setNib(String nib) {
        this.nib = nib;
    }
    
    private String nib;
    
    public Perusahaan(String nib, String nama, String alamat, ArrayList<Rekening> rekening) {
        super(nama, alamat, rekening);
        this.setNib(nib);
    }
    
    @Override
    public void print() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("NIB: " + this.nib);
        System.out.println("===========================================");
        System.out.println("No Rekening                     Saldo");
        System.out.println("===========================================");
        for(Rekening i : this.rekening){
            System.out.println(String.format("%-27d%.2f", i.getNoRekening(), i.getSaldo()));
        }
    }
}
