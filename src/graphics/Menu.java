package graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public interface Menu {
	
	public JPanel getPanel();
	
	public static JButton backButton() {
		ImageIcon icon = new ImageIcon(Paths.BUTTON_BACK);
		JButton back=new JButton(icon);
		back.setOpaque(false);
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);
		back.setSize(170,63);
		back.setLocation(5,576);
		return back;
	}
}
