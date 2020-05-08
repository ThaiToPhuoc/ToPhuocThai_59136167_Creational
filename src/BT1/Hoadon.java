/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author tophu
 */
public class Hoadon {
    Hoadonheader header = new Hoadonheader();
    ArrayList<CTHD> chitiet = new ArrayList<>();

    protected Hoadon(builder builder) {
        this.header = builder.header;
        this.chitiet = builder.chitiet;
    }
    
    public String hienthiCTHD(){
        String ht = "";
        for(int i = 0; i < chitiet.size(); i++){
            ht+= "\nTen san pham: " + chitiet.get(i).getTenSP()
                +"\tSo luong: " + chitiet.get(i).getSoluong()
                +"\tDon gia: " + chitiet.get(i).getDongia()
                +"\tChiet khau: " + chitiet.get(i).getChietkhau();
            }
        return ht;
    }

    @Override
    public String toString() {
        return "chi tiết hóa đơn: \n Mã Hóa đơn: " + header.getMaHD() +
                "\nTên khách hàng: " + header.getTenKH() +
                "\nNgay ban: " + header.getNgayban()
                +"\nDanh sach san pham: " + hienthiCTHD();
    }
    
    public static class builder{
        Hoadonheader header = new Hoadonheader();
        ArrayList<CTHD> chitiet = new ArrayList<>();
         
      //cach 1:  
        public builder setheader(Hoadonheader HD){
            this.header = HD;
            return this;
        }
        
        /*Cach 2:
        public builder addMaHD(String MaHD){
            this.header.setMaHD(MaHD);
            return this;
        }
        
        public builder addTenKH(String TenKH){
            this.header.setTenKH(TenKH);
            return this;
        }
        
        public builder addNgayban(Date Ngayban){
            this.header.setNgayban(Ngayban);
            return this;
        }*/
        
        public builder themsanpham(CTHD p){
            chitiet.add(p);
            return this;
        }
                
        public Hoadon build(){
            return new Hoadon(this);
        }
    }
    
    
}