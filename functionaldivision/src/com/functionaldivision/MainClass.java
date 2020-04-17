package com.functionaldivision;


import com.digitalmedia.DigitalMedia;
import com.printmedia.PrintMedia;

public class MainClass {
    public static void main(String[] arg){

        PrintMedia printmedia = new PrintMedia();
        DigitalMedia digitalMedia = new DigitalMedia();

        printmedia.printMedia();
        digitalMedia.digitalMedia();

    }
}
