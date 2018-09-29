/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swingamobatable;

/**
 *
 * @author ferenc
 */
public class Jatekos {
    private String nev;
    private String jel;
    private boolean jon = false;
    private int lepesekSzama=0;

    public Jatekos() {
    }

    public Jatekos(String nev, String jel) {
        this.nev = nev;
        this.jel = jel;
    }

    public String getJel() {
        return jel;
    }

    public void setJel(String jel) {
        this.jel = jel;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public boolean isJon() {
        return jon;
    }

    public void setJon(boolean jon) {
        this.jon = jon;
    }

    public int getLepesekSzama() {
        return lepesekSzama;
    }

    public void setLepesekSzama(int lepesekSzama) {
        this.lepesekSzama = lepesekSzama;
    }
    
   
    
    
}
