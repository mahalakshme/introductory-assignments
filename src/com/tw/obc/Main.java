package com.tw.obc;

abstract class Pattern
{

    int size;

    abstract void Draw();

}

public class Main {

    public static void main(String[] args) {
        // write your code here
        HorizontalLine horizontalLine = new HorizontalLine(3);
        horizontalLine.Draw();

        System.out.println();

        VerticalLine  verticalLine = new VerticalLine(4);
        verticalLine.Draw();

        System.out.println();

        Triangle rightTriangle = new RightTriangle(6);
        rightTriangle.Draw();

        System.out.println();

        Triangle isoscelesTriangle = new IsoscelesTriangle(4);
        isoscelesTriangle.Draw();

        System.out.println();

        CenteredDiamond centeredDiamond = new CenteredDiamond(3);
        centeredDiamond.Draw();

        System.out.println();

        DiamondWithName diamondWithName = new DiamondWithName(3);
        diamondWithName.Draw();

    }
}

