/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author tophu
 */
public class MainBT3 {
    public static void main(String[] args){
        ShapeFactory Hinh1 = ShapeFactory.Createinstance();
        ShapeFactory Hinh2 = ShapeFactory.Createinstance();
        ShapeFactory Hinh3 = ShapeFactory.Createinstance();
        
        Hinh1.setType(ShapeType.Triangle);
        Shape H1 = Hinh1.createShape();
        
        System.out.println("\n" + H1.Draw());
        
        Hinh2.setType(ShapeType.Circle);
        H1 = Hinh1.createShape();
        Shape H2 = Hinh2.createShape();
        
        System.out.println("\n" + H1.Draw());
        System.out.println(H2.Draw());
        
        Hinh3.setType(ShapeType.Rectangle);
        H1 = Hinh1.createShape();
        H2 = Hinh2.createShape();
        Shape H3 = Hinh3.createShape();
        System.out.println("\n" + H1.Draw());
        System.out.println(H2.Draw());
        System.out.println(H3.Draw());
    }
}
