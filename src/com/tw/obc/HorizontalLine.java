package com.tw.obc;

/**
 * Created by mahalaks on 09/01/15.
 */
public class HorizontalLine extends Line {

    int no;

    public HorizontalLine(int no)
    {
        this.no = no;
    }

    public void Draw() {
        for(int i = 0; i < no; i++)
        {
            System.out.print("*");
        }
    }
}
