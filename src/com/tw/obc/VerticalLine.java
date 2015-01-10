package com.tw.obc;

/**
 * Created by mahalaks on 09/01/15.
 */
public class VerticalLine extends Line {

    int no;

    public VerticalLine(int no)
    {
        this.no = no;
    }

    void Draw()
    {
        for(int i = 0; i < no; i++)
        {
            System.out.println("*");
        }
    }
}
