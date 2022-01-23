/**
 * 
 */
package calculator;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;


/**
 * @author kyles
 *
 */
public class View extends JFrame {
	
	private final Model model = new Model();
	private final JLabel valueLabel = new JLabel();
	
	public View() {
		setLayout(new FlowLayout());
		JButton digitButton = new JButton(Integer.toString(0));
		digitButton.addActionListener( new DigitListener( this, model, 0 ) ) ;
		add(digitButton);
		
		JButton digitButton1 = new JButton(Integer.toString(1));
		digitButton1.addActionListener( new DigitListener( this, model, 1 ) ) ;
		add(digitButton1);
		
		JButton digitButton2 = new JButton(Integer.toString(2));
		digitButton2.addActionListener( new DigitListener( this, model, 2 ) ) ;
		add(digitButton2);
		
		JButton digitButton3 = new JButton(Integer.toString(3));
		digitButton3.addActionListener( new DigitListener( this, model, 3 ) ) ;
		add(digitButton3);
		
		JButton digitButton4 = new JButton(Integer.toString(4));
		digitButton4.addActionListener( new DigitListener( this, model, 4 ) ) ;
		add(digitButton4);
		
		JButton digitButton5 = new JButton(Integer.toString(5));
		digitButton5.addActionListener( new DigitListener( this, model, 5 ) ) ;
		add(digitButton5);
		
		JButton digitButton6 = new JButton(Integer.toString(6));
		digitButton6.addActionListener( new DigitListener( this, model, 6 ) ) ;
		add(digitButton6);
		
		JButton digitButton7 = new JButton(Integer.toString(7));
		digitButton7.addActionListener( new DigitListener( this, model, 7 ) ) ;
		add(digitButton7);
		
		JButton digitButton8 = new JButton(Integer.toString(8));
		digitButton8.addActionListener( new DigitListener( this, model, 8 ) ) ;
		add(digitButton8);
		
		JButton digitButton9 = new JButton(Integer.toString(9));
		digitButton9.addActionListener( new DigitListener( this, model, 9 ) ) ;
		add(digitButton9);
		
		JButton plusButton = new JButton("+");
		plusButton.addActionListener( new OperationListener( this, model, Op.ADD ) ) ;
		add(plusButton);
		
		JButton clearButton = new JButton("=");
		clearButton.addActionListener( new OperationListener( this, model, Op.EQUAL ) ) ;
		add(clearButton);
		
		JButton equalButton = new JButton("Clear");
		equalButton.addActionListener( new OperationListener( this, model, Op.CLEAR ) ) ;
		add(equalButton);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(valueLabel);
		refresh();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			@Override public void run() {
				new View();
			}
		});

	}
	
	void refresh() {
		valueLabel.setText(model.getResult());
	}

}
