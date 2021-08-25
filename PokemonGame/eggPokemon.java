import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.io.FileInputStream;

public class eggPokemon extends JFrame {
	private int Pokemon = (int)(Math.random()*2);
	private ImageIcon ImageIcon;
	private ImagePanel panel;
	private JButton button;
	

	public eggPokemon(){
		setTitle("Pokemon Game");
		setSize(1000, 600);
		setLocation(400, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		
        //Color
        Color aliceBlue = new Color(245,255,250);
        getContentPane().setBackground(aliceBlue);

        //imageicon tiTLE
        ImageIcon = new ImageIcon("boll.png");
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);

		panel = new ImagePanel(new ImageIcon("dawn.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(440,  20, 119, 190);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("dawn.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(250,  50, 119, 190);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("dawn.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(600,  50, 119, 190);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("bird.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(90,  160, 119, 60);//x y w h
    	this.getContentPane().add(panel);
		
		panel = new ImagePanel(new ImageIcon("bird1.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(740,  90, 119, 60);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("egg1.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(220,  150, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(60, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(100, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(140, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(180, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(220, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(260, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(300, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(340, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);
		
		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(380, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(420, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(460, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(500, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(520, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(540, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);
		
		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(565, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(600, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(620, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("mushroom.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(640, 470, 260, 300);//x y w h
    	this.getContentPane().add(panel);

		
        pokemonEgg();
		back();

	}

    public void pokemonEgg(){
		// Button
		JButton btn = new JButton("Egg");
		btn.setBackground ( Color.BLACK );
		btn.setForeground ( Color.WHITE );
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Check Checkbox 1
                ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
                
                if(Pokemon == 0){
					JOptionPane.showMessageDialog(null,"Floatzel" );
					panel = new ImagePanel(new ImageIcon("Floatzel.png").getImage());
    				panel.setLayout(null);
        			panel.setBounds(500,  200, 260, 500);//x y w h
    				getContentPane().add(panel);
                }
				else if(Pokemon == 1){
                    JOptionPane.showMessageDialog(null,"Salamence" ); 
				    panel = new ImagePanel(new ImageIcon("Salamence.png").getImage());
    				panel.setLayout(null);
        			panel.setBounds(450,  160, 400, 600);//x y w h
    				getContentPane().add(panel);
							
                }
                else if(Pokemon == 2){
					JOptionPane.showMessageDialog(null,"typhlosion " );
					panel = new ImagePanel(new ImageIcon("typhlosion.png").getImage());
    				panel.setLayout(null);
        			panel.setBounds(460,  120, 260, 500);//x y w h
    				getContentPane().add(panel);
						
                }
			}
		});
		btn.setBounds(440, 400, 89, 23);
		getContentPane().add(btn);

	}

	public void back(){
		  // Create Button
		JButton buttonPlay = new JButton("BACK");
		buttonPlay.setBounds(760, 470, 100, 40);
		buttonPlay.setBackground ( Color.BLACK );
		buttonPlay.setForeground ( Color.WHITE );

		try 
		{
		//Font myFont = new Font("Serif", Font.BOLD, 20);
			Font myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "04B_08__.ttf" ) );
			myFont = myFont.deriveFont ( Font.BOLD, 20f );
			buttonPlay.setFont(myFont);
		} 
		catch ( Exception error )
		{
			System.out.println("File not found");
		}
		
        // Create Event for Button
		buttonPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				// New Form
				Form3Pokemon formcharecter = new Form3Pokemon();
				formcharecter.setVisible(true);

				// Hide Current Form
				setVisible(false);
				formcharecter.setResizable(false);
			}
		});		
		getContentPane().add(buttonPlay);

	}
}