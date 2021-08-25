import java.util.Scanner;
import java.util.InputMismatchException;

class Bulbasaur implements Pokemon{
    private String  name;
    private int level;
    private int hp;
    private int pp;
    private int exp;
    private int l;
    private int hplevel;
    private int mp;

    public Bulbasaur(){
        this.name = "Bulbasaur";
        this.hp = 80;
        this.pp = 40;
        this.l = 1;
        this.hplevel = 0;
        this.exp = 40;
        this.mp =50;
    }

  
    public int getMpEatBerry(){
        return mp += 10;
    } 
    
    public int getMp(){
        return mp;
    }
    

    public int getMpAttack(){
        return mp -= 10;
    }

    public int getExp(){
        return exp += 10;
    }

    
    public int getExpZero(){
        return exp = 0;
    }
 
    public int  HP(){
        return hp;
    }
   
    public String getName(){
        return name;
    }

    public String getNameBulbasaur(){
        return name = "Bulbasaur";
    }

    public void setName(String name){
        this.name = name;
    }

    public void setL(int hplevel) {
        this.hplevel += hplevel;
    }

    public int getL() {
        return hplevel += 0;
    }

    public int getLevelUp(){   
		return hplevel;
    }

}