package com.ff.javaoop.day1;

import javax.swing.*;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int wide = input.nextInt();

        Rectangle  rectangle = new Rectangle();
        rectangle.Perimeter(length,wide);
        rectangle.Area(length,wide);
    }
}
