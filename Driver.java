/* Entry Class: Driver */
public class Driver {
	/* Main Method */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Model m = new Model();
		Controller c = new Controller(m);
		View v = new View(m);
	}

}
