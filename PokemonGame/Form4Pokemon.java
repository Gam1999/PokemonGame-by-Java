import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.FileInputStream;

public class Form4Pokemon extends JFrame {	
	private int wildPokemon = (int)(Math.random());
	private ImageIcon ImageIcon;
	private ImagePanel panel;
	private JButton button;
	Pikachu pikachu = new Pikachu();
    Charmender charmender = new Charmender();
	Bulbasaur bulbasaur = new Bulbasaur();

	public Form4Pokemon(){

		// Create Form Frame
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

		panel = new ImagePanel(new ImageIcon("man.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(700, 100, 950, 1500);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("pikachu.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(30, 195, 450, 260);//x y w h
    	this.getContentPane().add(panel);
		

		panel = new ImagePanel(new ImageIcon("charmender.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(360, 210, 540, 540);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("Bulbasaur.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(590, 210, 140, 140);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("Berry.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(70,  400, 119, 90);//x y w h
    	this.getContentPane().add(panel);
		

		panel = new ImagePanel(new ImageIcon("dawn.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(440,  46, 119, 190);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("Egg.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(20,  46, 140, 160);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("dawn.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(250,  79, 119, 190);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("dawn.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(600,  79, 119, 190);//x y w h
    	this.getContentPane().add(panel);

		panel = new ImagePanel(new ImageIcon("bird.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(90,  160, 119, 60);//x y w h
    	this.getContentPane().add(panel);
		
		panel = new ImagePanel(new ImageIcon("bird1.png").getImage());
    	panel.setLayout(null);
        panel.setBounds(740,  90, 119, 60);//x y w h
    	this.getContentPane().add(panel);
		
		Berry();
		statusPikachu();
		attactPikachu();
		reNamePikachu();
		statusCharmender();
		attactCharmender();
		reNameCharmender();
		statusBulbasaur();
		attactBulbasaur();
		reNameBulbasaur();
		pokemonEgg();
	}
	public void Berry(){
		
		button = new JButton("Berry");
		button.setBackground ( Color.BLACK );
		button.setForeground ( Color.WHITE );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Check Checkbox 1
                System.out.println("Pikachu");
				JOptionPane.showMessageDialog(null,
				"Pikachu MP: " + pikachu.getMpEatBerry());

			}
		});
		button.setBounds(70, 495, 89, 23);
		getContentPane().add(button);
	}

	public int checklevelUpPikachu(){
        
		if(pikachu.getExp() >= 110){
			pikachu.getL(); 
			pikachu.setL(1);
			pikachu.getExpZero();
        } 
		return pikachu.getLevelUp();
    }	

	public void statusPikachu(){
        // Button
		
		button = new JButton("Status Pikachu");
		button.setBackground ( Color.BLACK );
		button.setForeground ( Color.WHITE );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Check Checkbox 1
                System.out.println("Pikachu");
				JOptionPane.showMessageDialog(null,
				"Name: "+pikachu.getName()+ "\n"+
				"HP: "+ pikachu.HP()+ "\n" +
				"MP: "+pikachu.getMp()+ "\n"+
				"Level: " +checklevelUpPikachu());

			}
		});
		button.setBounds(180, 375, 120, 23);
		getContentPane().add(button);
    } 

	public void attactPikachu(){
			
		button = new JButton("Attack");
		button.setBackground ( Color.BLACK );
		button.setForeground ( Color.WHITE );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Check Checkbox 1
                System.out.println("Pikachu");
				JOptionPane.showMessageDialog(null,
				""+pikachu.getNamepikachu()+ "\n"+
				"HP: " + pikachu.HP()+ "\n"+
				"MP: " + pikachu.getMpAttack() +"\n"+
				"EXP: " + pikachu.getExp()+ "\n"+
				"Level: " +checklevelUpPikachu());            
			}
		});
		button.setBounds(179, 416, 120, 23);
		getContentPane().add(button);
	}
	public void reNamePikachu(){
		// Text Field
		
				// Text Field
				final JTextField txt = new JTextField();
				txt.setBounds(179, 460, 120, 20);
				getContentPane().add(txt);
				txt.setColumns(10);
		
				// Label
				final JLabel lbl = new JLabel();
				lbl.setBounds(103, 120, 144, 14);
				getContentPane().add(lbl);
				
				// Button
				button = new JButton("Rename");
				button.setBackground ( Color.BLACK );
				button.setForeground ( Color.WHITE );
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					txt.setText(pikachu.getName());
					}
				});
				button.setBounds(179, 495, 120, 23);
				getContentPane().add(button);			
					         
	}
	public void statusCharmender(){
        // Button
		
		button = new JButton("Status Charmender");
		button.setBackground ( Color.BLACK );
		button.setForeground ( Color.WHITE );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Check Checkbox 1
                System.out.println("Charmender");
				JOptionPane.showMessageDialog(null,
				"Name: "+charmender.getName()+ "\n"+
				"HP: " + charmender.HP()+ "\n"+
				"MP: "+charmender.getMp()+ "\n"+
				"Level: " +checklevelUpPikachu());           
			}
		});
		button.setBounds(340, 375, 180, 23);
		getContentPane().add(button);
    }

	public void attactCharmender(){
			
		button = new JButton("Attack");
		button.setBackground ( Color.BLACK );
		button.setForeground ( Color.WHITE );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Check Checkbox 1
                System.out.println("Pikachu");
				JOptionPane.showMessageDialog(null,
				""+charmender.getName()+ "\n"+
				"HP: " + charmender.HP()+ "\n"+
				"MP: " + charmender.getMpAttack() +"\n"+
				"EXP: " + charmender.getExp()+ "\n"+
				"Level: " +checklevelUpPikachu());            
			}
		});
		button.setBounds(340, 410, 180, 23);
		getContentPane().add(button);
	}
	
	public int checklevelUpCharmender(){
        
		if(charmender.getExp() >= 110){
			charmender.getL(); 
			charmender.setL(1);
			charmender.getExpZero();
        } 
		return charmender.getLevelUp();
    }	

	public void reNameCharmender(){
		// Text Field
		final JTextField txt = new JTextField();
		txt.setBounds(340, 460, 180, 23);
		getContentPane().add(txt);
		txt.setColumns(10);
		
		// Label
		final JLabel lbl = new JLabel();
		lbl.setBounds(120, 460, 180, 23);
		getContentPane().add(lbl);
				
		// Button
		button = new JButton("Rename");
		button.setBackground ( Color.BLACK );
		button.setForeground ( Color.WHITE );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(charmender.getName());
				
			}
		});
		button.setBounds(340, 495, 180, 23);
		getContentPane().add(button);			
					         
	}

	public int checklevelUpBulbasaur(){
        
		if(bulbasaur.getExp() >= 110){
			bulbasaur.getL(); 
			bulbasaur.setL(1);
			bulbasaur.getExpZero();
        } 
		return bulbasaur.getLevelUp();
    }	

	public void statusBulbasaur(){
        // Button
		
		button = new JButton("Status Bulbasaur");
		button.setBackground ( Color.BLACK );
		button.setForeground ( Color.WHITE );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Check Checkbox 1
                System.out.println("Bulbasaur");
				JOptionPane.showMessageDialog(null,
				"Name: "+bulbasaur.getName()+ "\n"+
				"HP: "+ bulbasaur.HP()+ "\n" +
				"MP: "+bulbasaur.getMp()+ "\n"+
				"Level: " +checklevelUpPikachu());

			}
		});
		button.setBounds(580, 375, 170, 23);
		getContentPane().add(button);
    } 

	public void attactBulbasaur(){
			
		button= new JButton("Attack");
		button.setBackground ( Color.BLACK );
		button.setForeground ( Color.WHITE );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Check Checkbox 1
                System.out.println("Bulbasaur");
				JOptionPane.showMessageDialog(null,
				""+bulbasaur.getNameBulbasaur()+ "\n"+
				"HP: " + bulbasaur.HP()+ "\n"+
				"MP: " + bulbasaur.getMpAttack() +"\n"+
				"EXP: " + bulbasaur.getExp()+ "\n"+
				"Level: " +checklevelUpPikachu());
						            
			}
		});
		button.setBounds(579, 416, 170, 23);
		getContentPane().add(button);
	}
	public void reNameBulbasaur(){
		// Text Field
		
				// Text Field
		final JTextField txt = new JTextField();
		txt.setBounds(579, 460, 170, 20);
		getContentPane().add(txt);
		txt.setColumns(10);
		
		// Label
		final JLabel lbl = new JLabel();
		lbl.setBounds(503, 170, 144, 14);
		getContentPane().add(lbl);
				
		// Button
		button = new JButton("Rename");
		button.setBackground ( Color.BLACK );
		button.setForeground ( Color.WHITE );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(bulbasaur.getName());
			}
		});
		button.setBounds(579, 495, 170, 23);
		getContentPane().add(button);			
					         
	}

	public void pokemonEgg(){
		  // Create Button
		button = new JButton("Egg");
		button.setBackground ( Color.BLACK );
		button.setForeground ( Color.WHITE );
		button.setBounds(10, 90, 60, 20);
		
        // Create Event for Button
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				// New Form
				eggPokemon eggpokemon = new eggPokemon();
				eggpokemon.setVisible(true);

				// Hide Current Form
				setVisible(false);
				eggpokemon.setResizable(false);
			}
		});		
		getContentPane().add(button);

	}
}