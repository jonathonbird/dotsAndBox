package graphics;

import javax.swing.JPanel;

public class Credits implements Menu{
	private static Menu instance=null;;
	
	private JPanel panel;
	
	public Credits() {
		this.panel= new Background(Paths.BACKGROUND_CREDITS);
	}
	
	@Override
	public JPanel getPanel() {
    	return panel;
    }
	
	public static Menu getInstance() {
		if(instance==null) instance=new Credits();
		return instance;
	}

	
}
