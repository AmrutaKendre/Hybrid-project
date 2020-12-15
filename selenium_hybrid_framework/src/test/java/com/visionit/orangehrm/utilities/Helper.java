package com.visionit.orangehrm.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Helper {
	public static void selectDropDownValue(WebElement ele,String visibleText) {
		new Select(ele).selectByVisibleText(visibleText);
	}
	public static void selectDropDownValue(WebElement ele, int index) {
		new Select(ele).selectByIndex(index);
	}
	public static void selectDropDownValue(String value,WebElement ele) {
		new Select(ele).selectByValue(value);
	}
	
	

}
