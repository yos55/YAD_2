
import geb.Browser
import groovy.json.JsonSlurper
import groovy.json.internal.LazyMap
import org.openqa.selenium.chrome.ChromeDriver

class Yad2 {
    def Start() {
        def configData = GetConfigData()

        def chromeDriverName = configData.get('chromeDriver')
        def chromeBrowser = GetChromeBrowser(chromeDriverName)

        GoIntoYad2(chromeBrowser,configData)


    }
    LazyMap GetConfigData(){
        File configFile = new File("src\\config.json")
        def configData = new JsonSlurper().parse(configFile)
        return configData
    }
    Browser GetChromeBrowser(String driverName){
        System.setProperty("webdriver.chrome.driver", driverName)
        def browser = new Browser()
        browser.driver =  new ChromeDriver()
        return browser
    }
    def GoIntoYad2(Browser browser, LazyMap configData){

        def baseUrl = configData.get('baseUrl')
        def mainUrl = configData.get('mainUrl')

        def tabsBuilder = new TabsBuilder()
        def tab = tabsBuilder.createNode('cars', "/vehicles/private-cars")

        browser.setBaseUrl(baseUrl)
        browser.go("${mainUrl}")

        browser.driver{
            to tab
        }

//        browser.setBaseUrl(baseUrl)
//        browser.go("${mainUrl}/vehicles/private-cars")

//        NavigateOnSite(configData, browser)
    }

    def NavigateOnSite(LazyMap configData, Browser browser){
        LazyMap desktopNavigation = configData.get('desktop-navigation')

        def mainUrl = configData.get('mainUrl')



//        def tabObjects = new LinkedHashMap()
//
//        desktopNavigation.each {tab ->
//            def urlExtension = tab.getValue()
//            def carPage = new CarsPage(URL: "${mainUrl}\${urlExtension}")
//            browser.go(tabUrl)
//        }
    }
    static void main (String [] args){

        def yad2 = new Yad2()
        yad2.Start()
//        CarsPage carsPage = new CarsPage()

    }

}
