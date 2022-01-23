package calculator;
import java.awt.event.*;

public class DigitListener implements java.awt.event.ActionListener {
	private final Model model;
	private final View view;
	int i;
	
	public DigitListener(View view, Model model, int i) {
		this.model = model;
		this.view = view;
		this.i = i;
	}
	
	@Override public void actionPerformed( ActionEvent e ) {
		model.digit(i);
		view.refresh();
	}
}
