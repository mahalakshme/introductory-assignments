package com.tw.obc;

/**
 * Created by mahalaks on 10/01/15.
 */
public class DiamondWithName extends Diamond{

    int size;

    String name = "mahalakshme";

    public DiamondWithName(int size)
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
            System.out.print(name.charAt(breadth));
        }

        System.out.println();
    }



}
