import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/* InputOutputText Class */
public class InputOutputText extends Text implements Listener{
	private final Model m;
	public InputOutputText(final Model m, Composite screen) {
		super(screen, SWT.FILL);
		this.m = m;
		m.addListener(this);
	}
	@Override
	public void changed() {
		setText(m.getInput());
	}
	@Override
	protected void checkSubclass() {
		
	}
}