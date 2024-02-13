package pomScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends BasePage {
public RegisterPage(WebDriver driver) {
	super(driver);
}
@FindBy(id = ("gender-male"))
private WebElement gendermale;

@FindBy(id = ("gender-female"))
private WebElement genderfemale;

@FindBy(id = ("FirstName"))
private WebElement firstName;

@FindBy(id = ("LastName"))
private WebElement lastName;

@FindBy(id = ("Email"))
private WebElement email;

@FindBy(id = ("Password"))
private WebElement password;

@FindBy(id = ("ConfirmPassword"))
private WebElement confirmPassword;

@FindBy(id = ("register-button"))
private WebElement registerbutton;

public WebElement getGendermale() {
	return gendermale;
}

public WebElement getGenderfemale() {
	return genderfemale;
}

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getEmail() {
	return  email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getConfirmPassword() {
	return confirmPassword;
}

public WebElement getRegisterbutton() {
	return registerbutton;
}



}
