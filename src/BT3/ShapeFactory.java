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
public class ShapeFactory{
    public static ShapeFactory instance;
    
    ShapeType Type ;

    public ShapeType getType() {
        return Type;
    }

    public void setType(ShapeType Type) {
        this.Type = Type;
    }
   
    public static ShapeFactory Createinstance(){
        if(instance == null)
            instance = new ShapeFactory();
        return instance;
    }
    
     public Shape createShape(){
         switch(this.Type){
            case Rectangle: return new Rectangle();
            case Triangle: return new Triangle();
            case Circle: return new Circle();
        }
        return null;
     }
}
