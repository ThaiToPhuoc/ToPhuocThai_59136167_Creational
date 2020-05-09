/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tophuocthai_59136167_creational;

import BT1.Hoadon;
import BT1.CTHD;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import BT1.Hoadonheader;
import BT2.MyStringBuilder;
import BT3.Shape;
import BT3.ShapeFactory;
import BT3.ShapeType;
/**
 *
 * @author tophu
 */
public class ToPhuocThai_59136167_Creational {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
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
        
        MyStringBuilder str = new MyStringBuilder.Builder()
                                .addString("Test BT 2, them so thuc: ")
                                .addFloat((float)0.8)
                                .addString(", Them boolean: ")
                                .addBool(Boolean.TRUE)
                                .Builder();
        
        System.out.println("\n" + str.toString());
        
        ShapeFactory Hinh1 = ShapeFactory.Createinstance();
        ShapeFactory Hinh2 = ShapeFactory.Createinstance();
        ShapeFactory Hinh3 = ShapeFactory.Createinstance();
        Shape H1 = Hinh1.createShape(ShapeType.Triangle);
        System.out.println(H1.Draw()+"\n");
        
        Shape H2 = Hinh2.createShape(ShapeType.Circle);
        System.out.println(H2.Draw()+"\n");
        
        Shape H3 = Hinh2.createShape(ShapeType.Rectangle);
        System.out.println(H3.Draw()+"\n");
    }
    
}
