package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExerciseValuesPage {
	int total = 0;

	public ExerciseValuesPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id = "lbl_val_1")
	private WebElement lbl_1;

	@FindBy(id = "lbl_val_2")
	private WebElement lbl_2;

	@FindBy(id = "lbl_val_3")
	private WebElement lbl_3;

	@FindBy(id = "lbl_val_4")
	private WebElement lbl_4;

	@FindBy(id = "lbl_val_5")
	private WebElement lbl_5;

	@FindBy(id = "lbl_ttl_val")
	private WebElement lblTotalBalance;

	@FindBy(id = "txt_val_1")
	private WebElement value_1;

	@FindBy(id = "txt_val_2")
	private WebElement value_2;

	@FindBy(id = "txt_val_4")
	private WebElement value_4;

	@FindBy(id = "txt_val_5")
	private WebElement value_5;

	@FindBy(id = "txt_val_6")
	private WebElement value_6;

	@FindBy(id = "txt_ttl_val")
	private WebElement totalBalance;

	// return count of labels
	public int countOfLabels() {
		int count = 0;
		if (lbl_1.isDisplayed()) {
			count++;
		}
		if (lbl_2.isDisplayed()) {
			count++;
		}
		if (lbl_3.isDisplayed()) {
			count++;
		}
		if (lbl_4.isDisplayed()) {
			count++;
		}
		if (lbl_5.isDisplayed()) {
			count++;
		}
		if (lblTotalBalance.isDisplayed()) {
			count++;
		}
		return count;
	}

	// return count of values
	public int countOfValues() {
		int count = 0;
		if (value_1.isDisplayed()) {
			count++;
		}
		if (value_2.isDisplayed()) {
			count++;
		}
		if (value_4.isDisplayed()) {
			count++;
		}
		if (value_5.isDisplayed()) {
			count++;
		}
		if (value_6.isDisplayed()) {
			count++;
		}
		if (totalBalance.isDisplayed()) {
			count++;
		}
		return count;
	}

	// Verify values are greater than 0
	public boolean areValuesGreaterThanZero() {
		int val_1 = Integer.parseInt(value_1.getText());
		int val_2 = Integer.parseInt(value_2.getText());
		int val_4 = Integer.parseInt(value_4.getText());
		int val_5 = Integer.parseInt(value_5.getText());
		int val_6 = Integer.parseInt(value_6.getText());
		int balance = Integer.parseInt(totalBalance.getText());
		if (val_1 > 0 && val_2 > 0 && val_4 > 0 && val_5 > 0 && val_6 > 0 && balance > 0) {
			return true;
		}
		return false;
	}

	// get total balance
	public int getTotalBalance() {
		return Integer.parseInt(totalBalance.getText());
	}

	// Add all values and return sum
	public int actualTotalBalance() {
		int val_1 = Integer.parseInt(value_1.getText());
		int val_2 = Integer.parseInt(value_2.getText());
		int val_4 = Integer.parseInt(value_4.getText());
		int val_5 = Integer.parseInt(value_5.getText());
		int val_6 = Integer.parseInt(value_6.getText());
		int actualBalance = val_1 + val_2 + val_4 + val_5 + val_6;
		return actualBalance;
	}

	// Verify values are formatted as currencies
	public boolean areValuesFormatted() {
		String val_1 = value_1.getText();
		String val_2 = value_2.getText();
		String val_4 = value_4.getText();
		String val_5 = value_5.getText();
		String val_6 = value_6.getText();
		String balance = totalBalance.getText();
		if (val_1.contains("$") && val_2.contains("$") && val_4.contains("$") && val_5.contains("$")
				&& val_6.contains("$") && balance.contains("$")) {
			return true;
		}
		return false;
	}
}
