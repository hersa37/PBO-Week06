/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week06.Point;

import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Circle6 {
    private int radius;
    private Point center;
    private String color;
    
    public Circle6() {       
        this(20, new Point(), "black");
    }
    
    public Circle6(int radius, Point center, String color){       
        this.radius=radius;
        this.center=center;
        this.color=color;
    }   
    
    public void setRadius(int radius){
        if(radius>=0){
            this.radius=radius;
        } else this.radius=0;
        
    }
    
    public int getRadius(){
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public String getColor(){
        return color;
    }
    
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    
    public double getArea(){
        return Math.PI*radius*radius;
    } 
    
    public void moveHorizontal(int distance){
        center.setX(center.getX()+distance);
    }
    
    public void moveVertical(int distance){
        center.setY(center.getY()+distance);
    }    
    
    public void draw(Graphics g){
        switch (color){
            case "white": 
                g.setColor(Color.WHITE);
                break;
            case "black":
                g.setColor(Color.BLACK);
                break;
            case "red":
                g.setColor(Color.red);
                break;
            case "pink": 
                g.setColor(Color.pink);
                break;
            case "orange":
                g.setColor(Color.orange);
                break;
            case "yellow":
                g.setColor(Color.yellow);
                break;
            case "green":
                g.setColor(Color.green);
                break;
            case "blue":
                g.setColor(Color.blue);
                break;
            default:
                g.setColor(Color.BLACK);         
        }        
        g.fillArc(center.getX(), center.getY(), 2*radius, 2*radius, 0, 360);
    }

    @Override
    public String toString(){
        return "{Radius: "+radius
                +"; Color: "+color
                +"; Center: "+center;
    }
}
