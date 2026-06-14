package Collection;

public class SeleniumPractic {
	public static void  main(String[]args)
	{
		String parent = driver.getWindoHandel();
		Set<String>allWindows = driver.getWindowHandels();
		
		for(String win : allWindows)
		{
			if(!win.equals(parent))
				
				{
					driver.switchTo().window(win);
				}
			WebElement element = driver.findelement(by.xpath(""));
			Action action = new Action(driver);
			Action.contextClick(element).perform();
			
			WebdriverWait wait = new WebdriverWait(driver,20);
			wait.until(VisiblityOfelemeny(locator));
			
			File src =((TaleScreenShot)driver).getScreenShootAS(OutputType.FILE);
			File des = new File(location.png);
			FileUtils.copyFile(src,des);
			@RunsWith(cucumber.file)
			
		}
			
	}
}

