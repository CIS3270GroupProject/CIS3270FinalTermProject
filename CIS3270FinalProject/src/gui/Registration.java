package gui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;

public class Registration extends Composite {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text FirstName;
	private Text LastName;
	private Text SAddress;
	private Text State;
	private Text Zip;
	private Text text;
	private Text txtUser;
	private Text Pswd;
	private Text SecurityAnswer;
	private Text txtNewText;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Registration(Composite parent, int style) {
		super(parent, style);
		
		Label lblFirstName = new Label(this, SWT.NONE);
		lblFirstName.setAlignment(SWT.CENTER);
		lblFirstName.setBounds(31, 30, 63, 15);
		formToolkit.adapt(lblFirstName, true, true);
		lblFirstName.setText("First Name:");
		
		FirstName = new Text(this, SWT.BORDER);
		FirstName.setBounds(123, 24, 76, 21);
		formToolkit.adapt(FirstName, true, true);
		
		Label lblLastName = new Label(this, SWT.NONE);
		lblLastName.setAlignment(SWT.CENTER);
		lblLastName.setBounds(238, 30, 63, 15);
		formToolkit.adapt(lblLastName, true, true);
		lblLastName.setText("Last Name:");
		
		LastName = new Text(this, SWT.BORDER);
		LastName.setBounds(317, 24, 76, 21);
		formToolkit.adapt(LastName, true, true);
		
		Label lblStreetAddress = new Label(this, SWT.NONE);
		lblStreetAddress.setAlignment(SWT.CENTER);
		lblStreetAddress.setBounds(31, 61, 86, 21);
		formToolkit.adapt(lblStreetAddress, true, true);
		lblStreetAddress.setText("Street Address:");
		
		SAddress = new Text(this, SWT.BORDER);
		SAddress.setBounds(123, 61, 76, 21);
		formToolkit.adapt(SAddress, true, true);
		
		Label lblState = new Label(this, SWT.NONE);
		lblState.setAlignment(SWT.CENTER);
		lblState.setBounds(238, 61, 55, 15);
		formToolkit.adapt(lblState, true, true);
		lblState.setText("State:");
		
		State = new Text(this, SWT.BORDER);
		State.setBounds(317, 58, 76, 21);
		formToolkit.adapt(State, true, true);
		
		Label lblZipCode = new Label(this, SWT.NONE);
		lblZipCode.setAlignment(SWT.CENTER);
		lblZipCode.setBounds(31, 91, 55, 15);
		formToolkit.adapt(lblZipCode, true, true);
		lblZipCode.setText("Zip Code:");
		
		Zip = new Text(this, SWT.BORDER);
		Zip.setBounds(123, 88, 76, 21);
		formToolkit.adapt(Zip, true, true);
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setText("SSN:");
		lblNewLabel.setBounds(238, 91, 55, 15);
		formToolkit.adapt(lblNewLabel, true, true);
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(317, 91, 76, 21);
		formToolkit.adapt(text, true, true);
		
		Label lblUsername = new Label(this, SWT.NONE);
		lblUsername.setAlignment(SWT.CENTER);
		lblUsername.setBounds(31, 137, 63, 15);
		formToolkit.adapt(lblUsername, true, true);
		lblUsername.setText("Username:");
		
		txtUser = new Text(this, SWT.BORDER);
		txtUser.setBounds(123, 137, 76, 21);
		formToolkit.adapt(txtUser, true, true);
		
		Label lblPassword = new Label(this, SWT.NONE);
		lblPassword.setBounds(238, 137, 55, 15);
		formToolkit.adapt(lblPassword, true, true);
		lblPassword.setText("Password:");
		
		Pswd = new Text(this, SWT.BORDER);
		Pswd.setBounds(317, 134, 76, 21);
		formToolkit.adapt(Pswd, true, true);
		
		Label lblSecurityQuestion = new Label(this, SWT.NONE);
		lblSecurityQuestion.setBounds(31, 219, 101, 15);
		formToolkit.adapt(lblSecurityQuestion, true, true);
		lblSecurityQuestion.setText("Security Question:");
		
		Combo combo = new Combo(this, SWT.NONE);
		combo.setItems(new String[] {"What's your mother's maiden name?", "What's your hometown?", "How are you doing today?"});
		combo.setBounds(161, 216, 114, 23);
		formToolkit.adapt(combo);
		formToolkit.paintBordersFor(combo);
		combo.select(3);
		
		SecurityAnswer = new Text(this, SWT.BORDER);
		SecurityAnswer.setBounds(317, 216, 76, 21);
		formToolkit.adapt(SecurityAnswer, true, true);
		
		Button btnCreateAccount = new Button(this, SWT.NONE);
		btnCreateAccount.setBounds(171, 245, 91, 25);
		formToolkit.adapt(btnCreateAccount, true, true);
		btnCreateAccount.setText("Create Account");
		
		Label lblEmailAddress = formToolkit.createLabel(this, "Email Address:", SWT.NONE);
		lblEmailAddress.setBounds(31, 180, 76, 15);
		
		txtNewText = formToolkit.createText(this, "New Text", SWT.NONE);
		txtNewText.setText("");
		txtNewText.setBounds(123, 174, 114, 21);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
