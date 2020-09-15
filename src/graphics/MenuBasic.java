package graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuBasic {
	private JFrame frame;
	private JPanel panel;
	
	public MenuBasic() {
		this.frame=new JFrame();
		frame.setSize(Paths.FRAME_WIDTH, Paths.FRAME_HEIGHT);
		frame.setResizable(false);
		this.panel=new JPanel();
		frame.add(panel);
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public JPanel getPanel() {
		return panel;
	}
	
	public void refreshFrame() {
		frame.setVisible(false);
		frame.setVisible(true);
	}
}
