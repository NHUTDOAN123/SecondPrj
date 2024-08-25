/*
 * @ (#) TestRectangle.java    1.0     8/25/2024
 * Copyright (c) 2024 IUH. All rights reserved
 */

package iuh.edu.se;

/*
 * @description:
 * @author: Doan, Nguyen Nhut
 * @version: 1.0
 * @created: 8/25/2024 6:16 PM
 */
public class TestRectangle {
    public static void main(String[] args) {
        //Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.5,5.0);
        System.out.println("Length r2: "+r2.getLength());
        System.out.println("Width  r2: "+r2.getWidth());
        System.out.println("Area  r2: "+r2.getArea());
        System.out.println("Perimeter r2: "+r2.getPerimeter());
    }
}
