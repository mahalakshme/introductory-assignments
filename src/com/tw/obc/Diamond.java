package com.tw.obc;

/**
 * Created by mahalaks on 09/01/15.
 */
public abstract class Diamond extends Pattern {

    int size;

    public Diamond(int size)
    {
        this.size  = size;
    }

    abstract void Draw();

    void constructLowerTriangle() {
        int maxSpace = 1;

        for(int height = size - 1; height > 0; height--)
        {

            for(int spaces = 0; spaces < maxSpace ; spaces++) {
                System.out.print(" ");
            }

            for(int breadth = 0; breadth < 2 * height - 1 ; breadth++) {
                System.out.print("*");
            }

            maxSpace++;
            System.out.println();
        }
    }

    void constructUpperTriangle() {
        for(int height = 0; height < size - 1; height++)
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
