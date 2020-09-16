package graphics;

import javax.swing.JPanel;

public class PlayMenu implements Menu{
	private static Menu instance=null;
	
	@Override
	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Menu getInstance() {
		if(instance==null) instance=new PlayMenu();
		return instance;
	}

}
