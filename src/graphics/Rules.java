package graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Rules implements Menu{
	private static Menu instance=null;;

	private JPanel panel;
	private JButton back;
	
    public Rules() {
    	this.panel= new Background(Paths.BACKGROUND_RULES);
    	panel.setLayout(null);
		
		back=Menu.backButton();
		
		panel.add(back);
    }
    
    @Override
	public JPanel getPanel() {
    	return panel;
    }
    
    public static Menu getInstance() {
    	if(instance==null) instance=new Rules();
		return instance;
    }
    
   
}
