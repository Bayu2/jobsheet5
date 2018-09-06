/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum;

/**
 *
 * @author Windows 10
 */
public class TestCloneable implements Cloneable {
    @Override
    public TestCloneable clone() throws CloneNotSupportedException{
         return (TestCloneable) super.clone();
    }
    public static void main(String[] args) {
        try {
            new TestCloneable().clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
