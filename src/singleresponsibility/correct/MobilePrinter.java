/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleresponsibility.correct;

/**
 *
 * @author shadab
 */
public class MobilePrinter {
    public void printMobileDetails(Mobile mobile){
        System.out.println("RAM -> " + mobile.getRam());
        System.out.println("Processor -> " + mobile.getProcessor());
        System.out.println("Brand -> " + mobile.getBrand());
    }
}
