package graphics;

import javax.swing.JPanel;

public class GameMenu implements Menu{
	private JPanel mainPanel, leftPanel, rightPanel;
	
	private String p1="Player 1";
	private String p2="Player 2";
	
	private MenuBasic base;
	
	public GameMenu(MenuBasic base) {
		this.base=base;
		this.mainPanel=new JPanel();
		this.leftPanel=new JPanel();
		this.rightPanel=new JPanel();
		
		setUpPanels();
	}
	
	public GameMenu(MenuBasic base, String p1, String p2) {
		this.base=base;
		
		this.p1=p1;
		this.p2=p2;
		
		this.mainPanel=new JPanel();
		this.leftPanel=new JPanel();
		this.rightPanel=new JPanel();
		
		setUpPanels();
	}
	
	private void setUpPanels() {
		this.mainPanel.setLayout(null);
		setUpLeft();
		setUpRight();
	}
	

	private void setUpLeft() {
		//TODO Side panel which will display details like score and players names
	}

	private void setUpRight() {
		//TODO this will be the game board.
	}

	@Override
	public JPanel getPanel() {
		return mainPanel;
	}
}
