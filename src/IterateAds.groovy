
import geb.Browser
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.chrome.ChromeDriver

class Yad_2{
    static void main (String [] args){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\WebDrivers\\CHROME\\chromedriver.exe")
        def browser = new Browser()
        browser.driver = new ChromeDriver()
        browser.setBaseUrl('http://www.google.com')
        browser.go('http://m.yad2.co.il')


    }
}
