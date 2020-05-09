/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;
/**
 *
 * @author tophu
 */
public class MainBT2 {
    public static void main(String[] args){   
        MyStringBuilder str = new MyStringBuilder.Builder()
                                .addString("Test BT 2, them so thuc: ")
                                .addFloat((float)0.8)
                                .addString(", Them boolean: ")
                                .addBool(Boolean.TRUE)
                                .Builder();
        
        System.out.println("\n" + str.toString());
    }
}
