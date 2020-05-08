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
public class MyStringBuilder {
    String str = "";

    public MyStringBuilder() {
    }

    private MyStringBuilder(Builder builder) {
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return str; 
    }
    
    public  static class Builder{
        String str = "";
        
        public Builder addString(String s){
            this.str += s;
            return this;
        }
        
        public Builder addFloat(float s){
            this.str += String.valueOf(s);
            return this;
        }
        
        public Builder addBool(boolean s){
            this.str += String.valueOf(s);
            return this;
        }
        
        public MyStringBuilder Builder(){
            return new MyStringBuilder(this);
        }
    }        
}
