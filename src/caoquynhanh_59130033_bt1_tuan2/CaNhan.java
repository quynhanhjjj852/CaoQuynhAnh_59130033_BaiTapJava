/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caoquynhanh_59130033_bt1_tuan2;

/**
 *
 * @author Asus
 */
public abstract class CaNhan {
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;

    public CaNhan() {
    }

    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    
    public abstract String HienThiTT();

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }
    update
}
