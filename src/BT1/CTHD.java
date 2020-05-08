/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author tophu
 */
public class CTHD {
    String TenSP;
    int soluong, dongia;
    float chietkhau;

    public CTHD(String TenSP, int soluong, int dongia, float chietkhau) {
        this.TenSP = TenSP;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public float getChietkhau() {
        return chietkhau;
    }

    public void setChietkhau(float chietkhau) {
        this.chietkhau = chietkhau;
    }
    
}
