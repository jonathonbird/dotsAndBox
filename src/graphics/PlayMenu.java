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
		this.playMenuPanel.add(player);
	}
	@Override
	public JPanel getPanel() {
		return this.playMenuPanel;
	}
	private void setUpPlay(){
		play = new JButton("PLAY");
		play.setSize(80,30);
		play.setLocation(533,510);
		play.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent e){}});

	}

	private void setUpPlayer(){
		human = new JButton("HUMAN");
		human.setSize(80,30);
		human.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent e){}});
		human.setLocation(206,143);
		bot = new JButton("BOT");
		bot.setSize(80,30);
		bot.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent e){}});
		bot.setLocation(369,143);
		player = new JLabel("CHOOSE OPPONENT");
		player.setLocation(180,143);
	}

	private void setUpBoard(){
		size1 = new JButton("SIZE1");
		size1.setSize(80,30);
		size1.setLocation(206,350);
		size2 = new JButton("SIZE2");
		size2.setSize(80,30);
		size2.setLocation(369,350);
		size3 = new JButton("SIZE3");
		size3.setSize(80,30);
		size3.setLocation(533,350);
		size = new JLabel("CHOOSE BOARD SIZE");
		size.setLocation(180,350);

	}
	public static Menu getInstance() {
		if(instance==null) instance=new PlayMenu();
		return instance;
	}

	public void setUpActionListeners(MenuBasic base,Menu Main) {
	    	Menu.setNavigationTo(base, this.back, Main);
	    }
}
