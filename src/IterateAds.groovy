@Grab(group='org.codehaus.geb', module='geb-core', version='0.7.1')
@Grab(group='org.seleniumhq.selenium', module='selenium-chrome-driver', version='2.31.0')
import geb.*
import org.openqa.selenium.chrome.ChromeDriver
driver = {
    System.setProperty('webdriver.chrome.driver', "C:/Program Files/WebDrivers/chromedriver.exe")
    new ChromeDriver()
}