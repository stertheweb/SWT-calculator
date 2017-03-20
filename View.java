import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

/* View Class: What the user sees */
public class View {
	/* View constructor */
	public View(final Model m) {
		/* Set Layout */
		/* Define the Display */
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setBackground(new Color(display, 178, 34, 34));
		
		/* Message Box containing sample expressions */		
		MessageBox messageBox = new MessageBox(shell, SWT.ABORT);
        
        messageBox.setText("Sample Expressions");
        messageBox.setMessage("1. 1 + 1\n" +
        		"2. 3 - 2\n" + "3. 4 X 5\n" + "4. 8 / 4\n" + "5. 3 ^ 2\n");
        messageBox.open();
		
		/* Set Grid Layout */
		shell.setLayout(new GridLayout(1, true));
		
		/* Calculator Screen Layout */
		Composite screen = new Composite(shell, SWT.NONE);
		screen.setLayout(new GridLayout(1, true));
		screen.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		InputOutputText input = new InputOutputText(m, screen);
		input.setOrientation(SWT.LEFT_TO_RIGHT);
		input.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));	

		/* Create rowOne content */
		Composite rowOne = new Composite(shell, SWT.NONE);
		rowOne.setLayout(new GridLayout(2, true));
		rowOne.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button powerButton = new Button(rowOne, SWT.PUSH);
		powerButton.setText("^");
		powerButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button clearButton = new Button(rowOne, SWT.PUSH);
		clearButton.setText("C");
		clearButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		/* Create rowTwo content */
		Composite rowTwo = new Composite(shell, SWT.NONE);
		rowTwo.setLayout(new GridLayout(4, true));
		rowTwo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button sevenButton = new Button(rowTwo, SWT.PUSH);
		sevenButton.setText("7");
		sevenButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button eightButton = new Button(rowTwo, SWT.PUSH);
		eightButton.setText("8");
		eightButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button nineButton = new Button(rowTwo, SWT.PUSH);
		nineButton.setText("9");
		nineButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button divisionButton = new Button(rowTwo, SWT.PUSH);
		divisionButton.setText("/");
		divisionButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		/* Create rowThree content */
		Composite rowThree = new Composite(shell, SWT.NONE);
		rowThree.setLayout(new GridLayout(4, true));
		rowThree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button fourButton = new Button(rowThree, SWT.PUSH);
		fourButton.setText("4");
		fourButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button fiveButton = new Button(rowThree, SWT.PUSH);
		fiveButton.setText("5");
		fiveButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button sixButton = new Button(rowThree, SWT.PUSH);
		sixButton.setText("6");
		sixButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button timesButton = new Button(rowThree, SWT.PUSH);
		timesButton.setText("X");
		timesButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		/* Create rowFour content */
		Composite rowFour = new Composite(shell, SWT.NONE);
		rowFour.setLayout(new GridLayout(4, true));
		rowFour.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button oneButton = new Button(rowFour, SWT.PUSH);
		oneButton.setText("1");
		oneButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button twoButton = new Button(rowFour, SWT.PUSH);
		twoButton.setText("2");
		twoButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button threeButton = new Button(rowFour, SWT.PUSH);
		threeButton.setText("3");
		threeButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button minusButton = new Button(rowFour, SWT.PUSH);
		minusButton.setText("-");
		minusButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		/* Create rowFive content */
		Composite rowFive = new Composite(shell, SWT.NONE);
		rowFive.setLayout(new GridLayout(4, true));
		rowFive.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button zeroButton = new Button(rowFive, SWT.PUSH);
		zeroButton.setText("0");
		zeroButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button decimalButton = new Button(rowFive, SWT.PUSH);
		decimalButton.setText(".");
		decimalButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button plusButton = new Button(rowFive, SWT.PUSH);
		plusButton.setText("+");
		plusButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Button equalsButton = new Button(rowFive, SWT.PUSH);
		equalsButton.setText("=");
		equalsButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		/* Add Listeners to Controller */		
		Controller controller = new Controller(m);
		powerButton.addListener(SWT.Selection, controller);
		clearButton.addListener(SWT.Selection, controller);
		sevenButton.addListener(SWT.Selection, controller);
		eightButton.addListener(SWT.Selection, controller);
		nineButton.addListener(SWT.Selection, controller);
		divisionButton.addListener(SWT.Selection, controller);
		fourButton.addListener(SWT.Selection, controller);
		fiveButton.addListener(SWT.Selection, controller);
		sixButton.addListener(SWT.Selection, controller);
		timesButton.addListener(SWT.Selection, controller);
		oneButton.addListener(SWT.Selection, controller);
		twoButton.addListener(SWT.Selection, controller);
		threeButton.addListener(SWT.Selection, controller);
		minusButton.addListener(SWT.Selection, controller);
		zeroButton.addListener(SWT.Selection, controller);
		decimalButton.addListener(SWT.Selection, controller);
		plusButton.addListener(SWT.Selection, controller);
		equalsButton.addListener(SWT.Selection, controller);
		
		/* Set size & dispose */
		shell.pack();
		shell.setSize(400, 500);
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
