import java.util.*;
public class CatchAndBag{

    //public void catchandbag(){
    //System.out.println("Catch Pokemon");
    /*ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    ArrayList<Pokemon> bag = new ArrayList<Pokemon>();
    int numberPokemons = (int)(Math.random()*3);

    System.out.println("Pokemon arond you");

    int wildPokemon = (int)(Math.random()*3);
    for(int i = 0; i < numberPokemons; i++){
        if(wildPokemon == 0){
            pokemons.add(new Pikachu("Wild Pikachu"));
            bag.add(new Pikachu("Wild Pikachu"));
            System.out.println("Wild Pikachu");
        }
        else if(wildPokemon == 1){
            pokemons.add(new Charmender("Wild Charmender"));
            bag.add(new Pikachu("Wild Charmender"));
            System.out.println("Wild Charmender");
        }
        else if(wildPokemon == 2){
            pokemons.add(new Charmender("Wild test"));
            bag.add(new Pikachu("Wild test"));
            System.out.println("Wild test");
        }
        int pokemon1 = wildPokemon;
        wildPokemon = (int)(Math.random()*3);
        if(wildPokemon == pokemon1){
            do{
                wildPokemon = (int)(Math.random()*3);
            }while(wildPokemon == pokemon1);
        }
    }

        //bag
        System.out.println("Pokemon in my bag");
        for(Pokemon p: bag){
            System.out.println(p);
        }
    
    }*/

    public String  RandomPokemon(){
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        //ArrayList<Pokemon> bag = new ArrayList<Pokemon>();
        //int numberPokemons = (int)(Math.random()*3);

        int wildPokemon = (int)(Math.random()*3);
        
            if(wildPokemon == 0){
                pokemons.add(new Pikachu("Wild Pikachu"));
            }
            else if(wildPokemon == 1){
                pokemons.add(new Charmender("Wild Charmender"));
            }
            else if(wildPokemon == 2){
                pokemons.add(new Charmender("Wild test"));
            }
            return "Wild test";
    }
}