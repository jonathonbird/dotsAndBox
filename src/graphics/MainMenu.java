package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainMenu implements Menu{
	private static Menu instance=null;;
	
	private JFrame frame;
	private JPanel MainMenuPanel;

	private JButton play;
	private JButton rules;
	private JButton credits;
	
	
	public MainMenu() {
		this.MainMenuPanel=new Background(Paths.BACKGROUND_MAIN);
		this.MainMenuPanel.setLayout(null);
		setUpImageButtons();
		System.out.println("Done");
	}
	
	@Override
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
		play=Button(Paths.BUTTON_PLAY);
		play.setLocation(160,237);
//		play.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
	}
	
	private void setUpRules() {
		rules=Button(Paths.BUTTON_RULES);
		rules.setLocation(160,329);
		
	}
	
	private void setUpCredits() {
		credits=Button(Paths.BUTTON_CREDITS);
		credits.setLocation(160,422);
		
		
	}
	
	private JButton Button(String path) {
		ImageIcon icon = new ImageIcon(path);
		JButton button=new JButton(icon);
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setSize(Paths.BUTTONS_WIDTH,Paths.BUTTONS_HEIGHT);
		return button;
	}

	public static Menu getInstance() {
		if(instance==null)instance=new MainMenu();
		return instance;
	}
	
}
