import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Status{
    public void statusPikachu(){
        Pikachu pikachu = new Pikachu("PIKACHU");
        pikachu.printStatus();
        
        System.out.println("//update Status//");
        pikachu.loopStatus();
        pikachu.updatePrintStatus();
        System.out.println();
    }

    public void statusCharmender(){
        Charmender charmender = new Charmender("CHARMENDER");
        charmender.printStatus();
        
        System.out.println("//update Status//");
        charmender.loopStatus();
        charmender.updatePrintStatus();
    }

    public void statusTosakinto(){
        Tosakinto tosakinto = new Tosakinto("TOSAKINTO");
        tosakinto.printStatus();
        
        System.out.println("//update Status//");
        tosakinto.loopStatus();
        tosakinto.updatePrintStatus();
    }
}