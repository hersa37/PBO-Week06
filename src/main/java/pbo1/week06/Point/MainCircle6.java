/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week06.Point;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class MainCircle6 {

    public static void main(String[] args) {
        
        System.out.println("\t\t>>Cirlce6<<\n");
        
        System.out.println("\t--Constructor 1--");
        
        Circle6 circle1=new Circle6();
        
        System.out.println("Atribut awal:\n"+circle1.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle1.getArea());
        System.out.println("Keliling\t: "+circle1.getCircumference());
        System.out.println("____________________________________");
        
        circle1.setRadius(50);
        circle1.moveHorizontal(40);
        circle1.moveVertical(35);
        circle1.setColor("white");
        
        System.out.println("Atribut akhir:\n"+circle1.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle1.getArea());
        System.out.println("Keliling\t: "+circle1.getCircumference());
        System.out.println("____________________________________");
        
        System.out.println(" \t--Constructor 2--");
        
        Circle6 circle2=new Circle6(15,new Point(50,20),"green");
        
        System.out.println("Atribut awal:\n"+circle2.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle2.getArea());
        System.out.println("Keliling\t: "+circle2.getCircumference());
        System.out.println("____________________________________");
        
        circle2.setRadius(-60);
        circle2.moveHorizontal(300);
        circle2.moveVertical(750);
        circle2.setColor("white");
        
        System.out.println("Atribut akhir:\n"+circle2.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle2.getArea());
        System.out.println("Keliling\t: "+circle2.getCircumference());
        System.out.println("____________________________________");
    }

}
