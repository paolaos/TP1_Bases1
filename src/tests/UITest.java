package tests;


import ui.UI;

import java.io.IOException;

/**
 * Created by Paola Ortega S on 4/1/2017.
 */
public class UITest {
    public static void main(String[] args){
        try{
            UI ui = new UI();
        } catch (IOException e){
            e.fillInStackTrace();
        }

    }
}
