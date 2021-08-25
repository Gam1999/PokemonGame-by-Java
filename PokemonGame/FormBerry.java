import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.io.FileInputStream;

public class FormBerry extends JFrame {
    private int wildPokemon = (int)(Math.random());
	private ArrayList<Pokemon> bag = new ArrayList<Pokemon>();
	Pikachu pikachu = new Pikachu("PIKACHU");
    //Charmender charmender = new Charmender("CHARMENDER");
    //Tosakinto tosakinto = new Tosakinto("TOSAKINTO");

	
	public FormBerry(){

		// Create Form Frame
		setTitle("My Java Game");
		setSize(1000, 600);
		setLocation(400, 280);

		ImagePanel panel2 = new ImagePanel(new ImageIcon("Berry.png").getImage());
    	panel2.setLayout(null);
        panel2.setBounds(350, 15, 600, 300);//x y w h
    	this.getContentPane().add(panel2);
	
        //Color
        Color aliceBlue = new Color(255,248,220);
        getContentPane().setBackground(aliceBlue);

        //imageicon tiTLE
        ImageIcon ImageIcon = new ImageIcon("boll.png");
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

        RandomPokemon();
        BerryPokemon();
        //BackForm3();
	}	

    public void RandomPokemon(){
		// Button
		JButton btn = new JButton("catch Pokemon");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Check Checkbox 1
                ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
                
                if(wildPokemon == 0){
                    //pokemons.add(new Pikachu("Wild Pikachu"));
                    bag.add(new Pikachu("Pikachu"));
                    System.out.println("Pikachu");
					JOptionPane.showMessageDialog(null,
							"Pikachu" );
                }
				/*if(wildPokemon == 1){
                    //pokemons.add(new Charmender("Wild Charmender"));
                    bag.add(new Pikachu("Charmender"));
                    System.out.println("Charmender");
					JOptionPane.showMessageDialog(null,
							"Charmender" );
                }
                if(wildPokemon == 2){
                    //pokemons.add(new Charmender("Wild test"));
                    bag.add(new Pikachu("TOSAKINTO"));
                    System.out.println("TOSAKINTO");
					JOptionPane.showMessageDialog(null,
							"TOSAKINTO" );
                }*/
			}
		});
		btn.setBounds(125, 154, 89, 23);
		getContentPane().add(btn);
    }

    public void BerryPokemon(){
        // Button
		JButton Berry = new JButton("Berry");
		Berry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Check Checkbox 1
                
                if(wildPokemon == 0){
                    System.out.println("Pikachu");
					JOptionPane.showMessageDialog(null,
							"Pikachu HP: " + pikachu.getEatBerry());
					
                }
				/*if(wildPokemon == 1){
                    System.out.println("Charmender");
					JOptionPane.showMessageDialog(null,
							"Charmender HP: " +charmender.eatBerry());
                }
                if(wildPokemon == 2){
                    System.out.println("TOSAKINTO");
					JOptionPane.showMessageDialog(null,
							"TOSAKINTO HP: " +tosakinto.eatBerry());
                }*/
			}
		});
		Berry.setBounds(25, 54, 89, 23);
		getContentPane().add(Berry);
    }

   /* public void BackForm3(){
		JButton buttonBackForm3 = new JButton("Back");
		buttonBackForm3.setBounds(600, 490, 160, 40);
		buttonBackForm3.setBackground ( Color.BLACK );
		buttonBackForm3.setForeground ( Color.WHITE );

	try 
		{
		//Font myFont = new Font("Serif", Font.BOLD, 20);
		Font myFont2 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "04B_08__.ttf" ) );
		 myFont2 =  myFont2.deriveFont ( Font.BOLD, 20f );
		
		buttonBackForm3.setFont( myFont2);
		} 
		catch ( Exception error )
		{

		}
		
        // Create Event for Button
		buttonBackForm3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				 // New Form
				 Form3 form32 = new Form3();			 
				 form32.setVisible(true);
					
				 // Hide Current Form

				 setVisible(false);
				 form32.setResizable(false);
			}
		});		
		getContentPane().add(buttonBackForm3);
	}*/

	
}