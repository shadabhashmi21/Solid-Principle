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
public class Mobile {
    private int ram;
    private String processor;
    private String brand;

    public Mobile(int ram, String processor, String brand) {
        this.ram = ram;
        this.processor = processor;
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
}
