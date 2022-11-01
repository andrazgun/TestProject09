package com.siit.course.homework.Homework04;
import static com.siit.course.utils.MathFunctions.*;


public class ComputeVolume {

    public static void runComputeVolume() {
        int sphereRadius = 5;
        int baseLength = 5;
        int baseWidth = 2;
        int pyramidHeight = 9;
        int smallRadius = 4;
        int bigRadius = 9;
        int recLength = 3;
        int recWidth = 5;
        int recHeight = 8;

        System.out.println("The volume for a sphere with radius " + sphereRadius + " is " + computeSphereVolume(sphereRadius));

        System.out.println("The volume for a pyramid with base length " + baseLength + " , base width " + baseWidth +
                " , height " + pyramidHeight + " is " + computePyramidVolume(baseLength, baseWidth, pyramidHeight));

        System.out.println("The volume for a torus with small radius " + smallRadius + " , big radius " + bigRadius +
               " is " + computeTorusVolume(smallRadius, bigRadius));

        System.out.println("The volume for a rectangle with length " + recLength + " , width " + recWidth +
                " , height " + recHeight + " is " + computeRectangleVolume(recLength, recWidth, recHeight));
    }

}
