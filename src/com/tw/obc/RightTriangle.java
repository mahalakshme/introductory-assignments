package com.tw.obc;

/**
 * Created by mahalaks on 09/01/15.
 */
public class RightTriangle extends Triangle {

    int size;

    public RightTriangle(int size) {
        this.size = size;
    }

    public void Draw() {
        for(int height = 0; height < size; height++) {
            for (int breadth = 0; breadth <= height; breadth++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}


