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
public class Circle extends Shape{
    public Circle(){
        Brush += "Vẽ hình tròn:\n";
    }

    @Override
    public String Draw() {
        Brush += "Brush: Bút máy \n";
        Paper += "Paper: Giấy màu\n";
        Frame += "Frame: Khung nhựa";
        return Brush + Paper + Frame;
    }
}
