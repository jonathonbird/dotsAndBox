package graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayMenu implements Menu{
	private static Menu instance=null;

	private JFrame frame;
	private JPanel playMenuPanel;
	private JButton back;
	private JButton play;
	private JButton human;
	private JButton bot;
	private JButton size1;
	private JButton size2;
	private JButton size3;
	private JLabel player;
	private JLabel size;


	private PlayMenu() {
		playMenuPanel=new Background(Paths.BACKGROUND_PLAY);
		playMenuPanel.setLayout(null);

		back=Menu.backButton();

		playMenuPanel.add(back);
		setUpButtons();
	}

	private void setUpButtons(){
		setUpPlay();
		setUpPlayer();
		setUpBoard();
		this.playMenuPanel.add(play);
		this.playMenuPanel.add(human);
		this.playMenuPanel.add(bot);
		this.playMenuPanel.add(size1);
		this.playMenuPanel.add(size2);
		this.playMenuPanel.add(size3);
	}
	@Override
	public JPanel getPanel() {
		return this.playMenuPanel;
	}
	private void setUpPlay(){
		play = Button(Paths.BUTTON_START);
		play.setLocation(475,573);
		play.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent e){}});

	}

	private void setUpPlayer(){
		human=Button(Paths.BUTTON_HUMAN);
		bot=Button(Paths.BUTTON_BOT);
		
		bot.setLocation(336,128);
		human.setLocation(164,128);
		bot.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent e){}});
		human.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent e){}});
	}

	private void setUpBoard(){
		size1=Button(Paths.BUTTON_SIZE1);
		size2=Button(Paths.BUTTON_SIZE2);
		size3=Button(Paths.BUTTON_SIZE3);
		
		size1.setLocation(164,329);
		size2.setLocation(323,329);
		size3.setLocation(475,329);
		
	}
	
	private JButton Button(String path) {
		ImageIcon icon = new ImageIcon(path);
		JButton button=new JButton(icon);
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setSize(Paths.BUTTONS_WIDTH_PLAY,Paths.BUTTONS_HEIGHT_PLAY);
		return button;
	}
	
	public static Menu getInstance() {
		if(instance==null) instance=new PlayMenu();
		return instance;
	}

	public void setUpActionListeners(MenuBasic base,Menu Main) {
	    	Menu.setNavigationTo(base, this.back, Main);
	    }
}
