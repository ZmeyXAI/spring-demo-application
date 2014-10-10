package conspicuum.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameConstraintValidator implements ConstraintValidator<Name, String> {

	@Override
	public void initialize(Name name) {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public boolean isValid(String nameField, ConstraintValidatorContext cxt) {
		if (nameField == null) {
			return false;
		}
		return nameField.matches("[a-zA-Z]*");
	}

}
