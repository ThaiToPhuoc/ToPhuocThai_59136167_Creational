/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author tophu
 */
public class MainBT1 {
    public static void main(String[] args) throws ParseException {
        CTHD SP1 = new CTHD("Kem đánh răng", 2, 12000, (float) 0.9);
        CTHD SP2 = new CTHD("USB", 4, 140000, (float) 0.95);
        Hoadonheader HD = new Hoadonheader("HD001", "Tô Phước Thái", 
                new SimpleDateFormat("dd/MM/yy").parse("04/01/2020"));
        Hoadon HD1 = new Hoadon.builder()
                /*.addMaHD("HD001")
                .addTenKH("Tô Phước Thái")
                .addNgayban(new SimpleDateFormat("dd/MM/yy").parse("04/01/2020"))*/
                .setheader(HD)
                .themsanpham(SP1)
                .themsanpham(SP2)
                .build();
        System.out.println(HD1.toString());
    }
}
