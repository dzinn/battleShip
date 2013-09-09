package GameDesign;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class UserInterface extends JFrame {

    public UserInterface() {
        
       setTitle("BattleShip!");
       setSize(900, 600);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }
    
    UserInterface UI = new UserInterface();
    
   	public void homeScreen(){
  
     	UI.setBackground(Color.BLACK);
     	JPanel container = new JPanel();
     	container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
        ContentPane panel = new ContentPane();
        JPanel btnpanel = new JPanel();
        
        JButton playbtn = new JButton("Play !");
        btnpanel.add(playbtn);
        playbtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e){
        		gameScreen();
        	}
        });
        
        JButton optionbtn = new JButton("Options");
        btnpanel.add(optionbtn);
        JButton quitbtn = new JButton("Quit ...");
        btnpanel.add(quitbtn);
        
        container.add(panel);
        container.add(btnpanel);
        UI.add(container);
        UI.setVisible(true);
    }

    private void gameScreen() {
	UI.getContentPane().removeAll();
	UI.validate();
	
	JPanel container= new JPanel();
	container.setPreferredSize(new Dimension(1000,500));
	container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));

	JPanel yourScreen = new JPanel();
	JPanel hitScreen = new JPanel();
	hitScreen.setLayout(new GridLayout(10,10));
	
	JButton[][] grid = new JButton[10][10];
	for(int i=0; i<10; i++){
		for(int j=0;j<10;j++){
			grid[i][j]= new JButton();
			grid[i][j].setPreferredSize(new Dimension(1,1));
			hitScreen.add(grid[i][j]);
		}
	}
	
	container.add(yourScreen);
	container.add(hitScreen);
	UI.add(container);
	UI.pack();
	UI.setVisible(true);
}

	public void start() {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                homeScreen();
            }
        });
    }
    
    public class ContentPane extends JPanel {
        BufferedImage image = null;

        public ContentPane() {
            try {
                String pathToImage = "/Users/Firefly/Desktop/BS.jpg";
                image = ImageIO.read(new File(pathToImage));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null);
        };

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(image.getWidth(), image.getHeight());
        }
    }
    
}

