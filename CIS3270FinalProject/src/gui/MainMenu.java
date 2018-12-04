package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;;

public class MainMenu {
	private static Table table;
	private static Table table_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shlAeroplane = new Shell();
		shlAeroplane.setSize(450, 300);
		shlAeroplane.setText("Plane Aeros");
		
		Composite composite = new Composite(shlAeroplane, SWT.NONE);
		composite.setBounds(10, 10, 140, 194);
		
		Button btnTicket = new Button(composite, SWT.PUSH);
		btnTicket.setEnabled(false);
		btnTicket.setBounds(34, 148, 75, 25);
		btnTicket.setText("Buy Ticket");
		
		Button btnRegister = new Button(composite, SWT.PUSH);
		btnRegister.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnRegister.setText("Registration");
		btnRegister.setBounds(34, 88, 75, 25);
		
		Button btnSignIn = new Button(composite, SWT.PUSH);
		btnSignIn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				LogIn nw = new LogIn();
				nw.open();
			}
		});
		btnSignIn.setBounds(34, 26, 75, 25);
		btnSignIn.setText("Sign In");
		
		TableViewer tableViewer = new TableViewer(shlAeroplane, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setBounds(186, 10, 220, 194);
		
		table_1 = new Table(shlAeroplane, SWT.BORDER | SWT.FULL_SELECTION);
		table_1.setBounds(186, 10, 220, 194);
		table_1.setHeaderVisible(true);
		table_1.setLinesVisible(true);

		shlAeroplane.open();
		shlAeroplane.layout();
		while (!shlAeroplane.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
