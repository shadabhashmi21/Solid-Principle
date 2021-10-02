/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleresponsibility;

import singleresponsibility.correct.MobilePrinter;
import solid.PrincipleContract;

/**
 *
 * @author shadab
 */
public class SingleResponsibility implements PrincipleContract{
    
    /**
     * As the name suggests, this principle states that each class should have one responsibility, 
     * one single purpose. This means that a class will do only one job, which leads us to conclude 
     * it should have only one reason to change.
     */

    public SingleResponsibility() {
        //doCorrectImplementation();
        doIncorrectImplementation();
    }

    @Override
    public void doIncorrectImplementation() {
       /**
         * Let’s consider a class that contains mobile information. 
         * The only job of this class should be containing book related data and 
         * do book related operations.
         */
       singleresponsibility.incorrect.Mobile mobile = new singleresponsibility.incorrect.Mobile(8, "Mediatek", "Xiaomi");
       
       mobile.printDetails();
    }
    
    
    @Override
    public void doCorrectImplementation() {
        singleresponsibility.correct.Mobile mobile = new singleresponsibility.correct.Mobile(8, "Snapdragon", "OnePlus");
        
        MobilePrinter mobilePrinter = new MobilePrinter();
        mobilePrinter.printMobileDetails(mobile);
    }
    
}
