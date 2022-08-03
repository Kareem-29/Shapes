/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funinshapes;
import java.util.Scanner;
/**
 *
 * @author Kareem_29
 */
public class FunInShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int cho=0;
       
       while(cho!=4){
       System.out.println("What shape do you want to compute for area and perimeter?");
       System.out.println("[1]Square\n[2]Rectangle\n[3]Circle\n[4]Exit");
       System.out.println("Choice: ");
       cho=input.nextInt();
       
       switch(cho){
           case 1:
        System.out.println("Enter the side of Square: ");
        double side=input.nextDouble();
        Shapes Square=new Shapes(side);
        System.out.println("Square Primeter= "+Square.getPerimeterSquare());
        System.out.println("Square Area= "+Square.getAreaSquare());
        
        break; 
           case 2:
        System.out.println("Enter the width and length of Rectangle: ");
        double width=input.nextDouble();
        double length=input.nextDouble();
        Shapes Rectangle=new Shapes(width, length);
        System.out.println("Rectangle Primeter= "+Rectangle.getPerimeterRectangle());
        System.out.println("Rectangle Area= "+Rectangle.getAreaRectangle());
        
        break; 
        
           case 3:
        System.out.println("Enter the reduis of Circle: ");
        double raduis=input.nextDouble();
        Shapes Circle=new Shapes(raduis);
        System.out.println("Circle Primeter= "+Circle.getPerimeterCircle());
        System.out.println("Circle Area= "+Circle.getAreaCircle());
        break;
        
           case 4:
               System.exit(0);
       }
       
       }
        // TODO code application logic here
    
}         
}
