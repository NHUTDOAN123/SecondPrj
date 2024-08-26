/*
 * @ (#) Rectangle.java    1.0     8/25/2024
 * Copyright (c) 2024 IUH. All rights reserved
 */

package iuh.edu.se;

/*
 * @description: Tinh dien tich va chu vi hinh chu nhat
 * @author: Doan, Nguyen Nhut
 * @version: 1.0
 * @created: 8/25/2024 6:16 PM
 */
public class Rectangle {
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
        if (length <0.0 || width < 0.0) {
            throw new IllegalArgumentException("Length and width must be greater than 0.");
        }
    }
    private double length;
    private double width;
    //setters / getter
    public double getLength() {
        return length;
    }

    /**
     * Description: Set the length of the rectangle
     * @param length The length of the rectangle
     * @throws IllegalArgumentException if length is less than 0
     */
    public void setLength(double length) {
        if (length < 0.0)
        {
            throw new IllegalArgumentException("Length must be greater than 0.");
        }
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    /**
     * Description: Set the width of the rectangle
     * @param width The width of the rectangle
     * @throws IllegalArgumentException if width is less than 0
     */
    public void setWidth(double width) {
        if (width < 0.0)
            throw new IllegalArgumentException("Width must be greater than 0.");
        this.width = width;
    }
    public double getArea() {
        return this.length * this.width;
    }
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

}
