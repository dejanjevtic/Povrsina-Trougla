/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package povrsinatrougla;
import java.lang.Math;
/**
 *
 * @author dejan
 */
public class PovrsinaTrougla {
        public static void printArea(double [] X, double [] Y){
        //find area of triangle
        double area = Math.abs(X[0]*(Y[1]-Y[2]) + X[1]*(Y[2]-Y[0]) + X[2]*(Y[0]-Y[1]))/2;
        System.out.println("Area of Triangle: " + area);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] x_coordinates = {1,2,5};
        double [] y_coordinates = {0, 6, 10};
    }
    
}
