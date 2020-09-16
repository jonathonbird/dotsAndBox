package graphics;
import javax.swing.*;
import java.awt.*;

public class Rules implements Menu{
	private static Menu instance=null;;

	private JPanel panel;
    
    public Rules() {
    	this.panel= new Background(Paths.BACKGROUND_RULES);

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
