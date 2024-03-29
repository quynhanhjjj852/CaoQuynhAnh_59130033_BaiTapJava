/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author Asus
 */
public abstract class SinhVienPoly 
{
    // attributes
    public String hoTen;
    public String nganhHoc;

    // constructor
    public SinhVienPoly(String hoTen, String nganhHoc) 
    {
        this.hoTen = hoTen;
        this.nganhHoc = nganhHoc;
    }

    // methods
    // get diem (abstract method)
    public abstract double getDiem();

    // get hoc luc
    public String getHocLuc() 
    {
      if (this.getDiem() < 5) 
      {
        return "Yeu";
      }
      if (this.getDiem() < 6.5) 
      {
        return "Trung binh";
      }
      if (this.getDiem() < 7.5) 
      {
        return "Kha";
      }
      if (this.getDiem() < 9) 
      {
        return "Gioi";
      }
      return "Xuat sac";
    }

     // xuat thong tin sinh vien
     public void xuat() 
     {
       System.out.println("Ho ten: " + this.hoTen + ", nganh hoc: " + this.nganhHoc);
     }
}
