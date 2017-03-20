import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

/* Controller Class: Controls the program */
public class Controller implements Listener {

	private Model m;
	
	public Controller(final Model m) {
		this.m = m;
	}

	@Override
	public void handleEvent(Event event) {
		Button button = (Button) event.widget;
		if (button.getText() != "=" && button.getText() != "C") {
			m.updateInput(button.getText());
		}
		else if (button.getText() == "C") {
			m.clear();
		}
		else if (button.getText() == "=") {
			m.calculator();
		}
	}
}
