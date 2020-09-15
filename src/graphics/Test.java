package graphics;

public class Test {
	public static void main(String[] args) {
		MenuBasic x= new MenuBasic();
		Rules y = new Rules();
		x.setVisiblePanel(y.getRules());
	}
}
