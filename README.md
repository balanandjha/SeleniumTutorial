# SeleniumTutorial
all the basic concepts of Selenium can be found here.

For chrome browser chromeDrive Should be downloaded.
For FireFox gecko driver should be downloaded.

few necessary steps (It's good practice to implement in every project) : 


    System.setProperty("webdriver.chrome.driver","<Path where it located>\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome driver
		driver.manage().window().maximize();//maximizing the window
		driver.manage().deleteAllCookies();
		//dymamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("<URL of the website>");
