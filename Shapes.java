/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funinshapes;

/**
 *
 * @author Kareem_29
 */
public class Shapes {
    double num1, num2;
    
    public Shapes(double x){
        num1=x;
    }
    
    public Shapes(double z, double y){
        num1= z;
        num2= y;
    }
    
    double getPerimeterSquare(){
        double sPrimeter = 4*num1;
        return sPrimeter;
    } 
    
    double getAreaSquare(){
        double sArea=Math.pow(num1,2);
        return sArea;
    }
    
    double getPerimeterRectangle(){
        double rPrimeter =2*num1+2*num2;
        return rPrimeter;
    }
    
    double getAreaRectangle(){
        double rArea=num1*num2;
        return rArea;
    }
    
    double getPerimeterCircle(){
        double cPrimeter = 2*Math.PI*num1;
        return cPrimeter;
    } 
    
    double getAreaCircle(){
        double cArea=Math.PI*Math.pow(num1,2);
        return cArea;
    }
    
}
