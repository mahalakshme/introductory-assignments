package com.tw.obc;

/**
 * Created by mahalaks on 09/01/15.
 */
public class CenteredDiamond extends Diamond {

    int size;

    public CenteredDiamond(int size)
    {
        super(size);

        this.size = size;
    }

    public void Draw()
    {
        constructUpperTriangle();

        constructCenterPart();

        constructLowerTriangle();

    }

    private void constructCenterPart() {
        for(int breadth = 0; breadth < 2 * size - 1; breadth++)
        {
            System.out.print("*");
        }

        System.out.println();
    }

}
