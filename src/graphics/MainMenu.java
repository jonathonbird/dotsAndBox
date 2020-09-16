package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainMenu {
	private JFrame frame;
	private JPanel MainMenuPanel;

	private JButton play;
	private JButton rules;
	private JButton credits;
	
	public MainMenu(JFrame frame) {
		this.frame=frame;
		this.MainMenuPanel=new Background(Paths.BACKGROUND_MAIN);
		this.MainMenuPanel.setLayout(null);
		setUpImageButtons();
		
//		frame.removeAll();
//		frame.add(MainMenuPanel);
//		frame.setVisible(false);
//		frame.setVisible(true);
		System.out.println("Done");
	}
	
	public JPanel getPanel() {
		return this.MainMenuPanel;
	}
	
	private void setUpImageButtons() {
		setUpPlay();
		setUpRules();
		setUpCredits();
		
		this.MainMenuPanel.add(play);
		this.MainMenuPanel.add(rules);
		this.MainMenuPanel.add(credits);
	}
	
	private void setUpPlay() {
		ImageIcon icon = new ImageIcon(Paths.BUTTON_PLAY);
		play=new JButton(icon);
		play.setOpaque(false);
		play.setContentAreaFilled(false);
		play.setBorderPainted(false);
		
		play.setSize(Paths.BUTTONS_WIDTH,Paths.BUTTONS_HEIGHT);
		play.setLocation(160,237);
//		play.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
	}
	
	private void setUpRules() {
		ImageIcon icon = new ImageIcon(Paths.BUTTON_RULES);
		rules=new JButton(icon);
		rules.setOpaque(false);
		rules.setContentAreaFilled(false);
		rules.setBorderPainted(false);
		
		rules.setSize(Paths.BUTTONS_WIDTH,Paths.BUTTONS_HEIGHT);
		rules.setLocation(160,329);
		
	}
	
	private void setUpCredits() {
		ImageIcon icon = new ImageIcon(Paths.BUTTON_CREDITS);
		credits=new JButton(icon);
		credits.setOpaque(false);
		credits.setContentAreaFilled(false);
		credits.setBorderPainted(false);
		
		credits.setSize(Paths.BUTTONS_WIDTH,Paths.BUTTONS_HEIGHT);
		credits.setLocation(160,422);
		
		
	}

}
