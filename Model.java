import java.util.ArrayList;
import java.util.List;

/* Model Class: Dictates how the calculator functions */
public class Model {
	public String input = "";

	/* update input method */
	public void updateInput(String item) {
		input = input + item;
		alertListeners();
	}

	/* Method to clear input */
	public void clear() {
		input = "";
		alertListeners();
	}

	/* Algorithm to evaluate input */
	void calculator() {
		char operator = 'o';
		char character = 'c';
		double result = 0.0;
		double x = 0.0;
		double y = 0.0;
		int characterCount = 0;
		String equation = input;
		String firstValue = "";
		String secondValue = "";
		for (characterCount = 0; characterCount < equation.length(); characterCount++) {
			character = equation.charAt(characterCount);
			if (character == '^' || character == '/' || character == 'X' ||
					character == '-' || character == '+') {
				operator = character;
				firstValue = equation.substring(0, characterCount);
				x = Float.parseFloat(firstValue);
			}
		}
		secondValue = equation.substring(characterCount - 1);
		y = Float.parseFloat(secondValue);

		if (operator == '^') {
			result = Math.pow(x, y);
		}
		else if (operator == '/') {
			result = x / y;
		}
		else if (operator == 'X') {
			result = x * y;
		}
		else if (operator == '-') {
			result = x - y;
		}
		else if (operator == '+') {
			result = x + y;
		}
		displayResult(result);
		System.out.println(result);
		alertListeners();
	}

	/* displayResult method */
	public String displayResult(Double result) {
		input = Double.toString(result);
		return input;
	}

	/* getInput method */
	public String getInput() {
		return input;
	}

	/* Methods to handle the listeners */
	private List<Listener> listeners = new ArrayList<Listener>();

	public void addListener(final Listener listener) {
		listeners.add(listener);
	}

	public void alertListeners() {
		for(final Listener listener : listeners) {
			listener.changed();
		}
	}
}