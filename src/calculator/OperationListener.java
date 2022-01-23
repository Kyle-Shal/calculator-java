package calculator;
import java.awt.event.*;

public class OperationListener implements java.awt.event.ActionListener {
	private final Model model;
	private final View view;
	Op op;
	
	public OperationListener(View view, Model model, Op op) {
		this.model = model;
		this.view = view;
		this.op = op;
	}
	
	@Override public void actionPerformed( ActionEvent e ) {
		model.operation(op);
		view.refresh();
	}
}
