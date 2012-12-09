package mediator;

public class ConcrMediator implements Mediator {
	// private Category cat = new Category();
	
	private TextButton fine = new TextButton("Fine", 21, 5);
	private TextButton cancel = new TextButton("Cancel", 21, 15);
	private Text t = new Text();
	private InputBox inbox = new InputBox(5, 10);
	
	private InputBox in = new InputBox(2, 2);
	
	public void select(String s) {
		if (s.compareTo("vola") == 0) {
			fine.deactivate();
			inbox.show();
		}

		if (s.compareTo("corri") == 0) {
			fine.deactivate();
			inbox.setPosition(6, 10);
			inbox.show();
		}
		fine.activate();

		cancel.deactivate();
	}

	public void init() {
		fine.deactivate();
		cancel.activate();

		t.add("vola");
		t.add("corri");
		t.add("naviga");
	}
	
	public void inputLoop() {
		String s = in.show();
				
		while (s.compareTo("q")!=0) {
			select(s);
			s = in.show();			
		}
	}
}
