package com.tw.obc;

/**
 * Created by mahalaks on 09/01/15.
 */
public class IsoscelesTriangle extends Triangle {

    int size;

    public IsoscelesTriangle(int size)
    {
        this.size = size;
    }

    public void Draw()
    {
        for(int height = 0; height < size; height++)
        {
            for(int spaces = 0; spaces < size - height - 1; spaces++) {
                System.out.print(" ");
            }

                for(int breadth = 0; breadth < 2 * height + 1; breadth++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
