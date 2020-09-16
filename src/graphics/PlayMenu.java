package graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PlayMenu implements Menu{
	private static Menu instance=null;
	
	private JPanel panel;
	private JButton back;
	
	private PlayMenu() {
		panel=new Background(Paths.BACKGROUND_PLAY);
		panel.setLayout(null);
		
		back=Menu.backButton();
		
		panel.add(back);
	}
	
	@Override
	public JPanel getPanel() {
		return panel;
	}
	
	public static Menu getInstance() {
		if(instance==null) instance=new PlayMenu();
		return instance;
	}

	public void setUpActionListeners(MenuBasic base,Menu Main) {
	    	Menu.setNavigationTo(base, this.back, Main);
	    }
}
