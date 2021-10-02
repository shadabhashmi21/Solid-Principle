/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskovsubsitution;

import solid.PrincipleContract;

/**
 *
 * @author shadab
 */
public class LiskovSubstitution implements PrincipleContract{
    
    /**
     * Liskov Substitution Principle can be considered to be an extension of the Open / Closed principle 
     * which states the base class reference should be replaceable by the child class 
     * without changing the functionality.
     */
    
    public LiskovSubstitution() {
        doCorrectImplementation();
        //doIncorrectImplementation();
    }

    @Override
    public void doIncorrectImplementation() {
        /**
         * Let us assume that we implemented a Rectangle class with height, width properties and getArea method. 
         * Alone it will function perfectly fine.
         */
        liskovsubsitution.incorrect.Rectangle rectangle = new liskovsubsitution.incorrect.Rectangle();
        
        rectangle.setHeight(2);
        rectangle.setWidth(3);
        
        System.out.println("Rectangle area -> "+rectangle.getArea());
        
        /**
         * Output:
         * Area of the rectangle = 6 where input -> Height = 2 and Width = 3
         */
        
        /**
         * Now we would like to have a similar functionality for a Square as well, 
         * so instead on reinventing the wheel we will simply inherit from the Rectangle class 
         * and customize the functionality for a square.
         */
        
        
        /**
         * But now if we replace the reference of the parent class by the child class 
         * then we will not the correct area for the rectangle since we have change the core 
         * functions (setHeight, setWidth) to set the height and width to same value 
         * which is not true in case of rectangle. Hence we have violated the Liskov Substitution principle.
         */
        
        //liskovsubsitution.incorrect.Rectangle square = new liskovsubsitution.incorrect.Rectangle();
        /**
         * changing parent's reference (Rectangle) with child's reference (Square).
         */
        liskovsubsitution.incorrect.Rectangle square = new liskovsubsitution.incorrect.Square();
        
        square.setHeight(2);
        square.setWidth(3);
        
        System.out.println("Square area -> "+square.getArea());
        
        /**
         * Output:
         * Area of the square = 9 where input -> Height = 2 and Width = 3
         */
        
        /**
         * We were expecting a Rectangle of sides 2 and 3 to have an area of 6 but 
         * we got a Square with sides 3 and 3 and area 9.
         * Hence, using Square’s object in place of the Rectangle’s object totally breaks LSP! 
         * Read the definition of LSP again:
         */
    }

    @Override
    public void doCorrectImplementation() {
        /**
         * Here we are using reference of child's class (Rectangle)
         */
        liskovsubsitution.correct.Shape rectangle = new liskovsubsitution.correct.Rectangle(2, 3);
        
        System.out.println("Rectangle area -> "+rectangle.getArea());
        
        /**
         * Output:
         * Area of the rectangle = 6 where input -> Height = 2 and Width = 3
         */
        
        /**
         * Here we are using reference of child's class (Square)
         */
        liskovsubsitution.correct.Shape square = new liskovsubsitution.correct.Square(2);
        
        System.out.println("Square area -> "+square.getArea());
        
        /**
         * Output:
         * Area of the square = 4 where input -> Height = 2 and Width = 2
         */
        
        
        /**
         * So now the parent class is substitutable by the child classes 
         * without changing any existing functionality and so we are not violating 
         * the Liskov Substitution Principle.
         */
    }
    
}
