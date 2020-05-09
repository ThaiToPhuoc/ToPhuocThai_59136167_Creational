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
public abstract class Shape {
    String Brush = "", Paper = "", Frame = "";
    ShapeType Type;

    public ShapeType getType() {
        return Type;
    }

    public void setType(ShapeType Type) {
        this.Type = Type;
    }
    public abstract String Draw();

    @Override
    public String toString() {
        return "Brush: " + Brush + "\tPaper: " + Paper + "\tFrame: " + Frame;
    }
    
    
}
