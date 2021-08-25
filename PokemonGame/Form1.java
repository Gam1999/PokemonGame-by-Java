import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.FileInputStream;
public class Form1 extends JFrame{ 
  
    public Form1(){

	    // Create Form Frame
		setTitle("Pokemon Game");
         
        //imageicon
        ImageIcon ImageIcon = new ImageIcon("boll.png");
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);

        //Color
        Color white = new Color(255,255,255);
        getContentPane().setBackground(white);	

        // Create Button
		JButton buttonPlay = new JButton("PLAYGAME");
		buttonPlay.setBounds(430, 440, 180, 60);
		buttonPlay.setBackground ( Color.BLACK );
		buttonPlay.setForeground ( Color.WHITE );

		try 
		{
			Font myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ("04B_08__.ttf" ) );
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
				FormCharecter formcharecter = new FormCharecter();
				formcharecter.setVisible(true);

				// Hide Current Form
				setVisible(false);
				formcharecter.setResizable(false);
			}
		});		
		getContentPane().add(buttonPlay);
   }

}


