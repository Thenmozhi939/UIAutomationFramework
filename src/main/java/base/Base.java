package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import resources.staticResource.GlobalStatic;
import utilities.ExcelUtilities.ExcelTestDataUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {


    public void loadProperties() throws IOException {
        FileInputStream file = new FileInputStream("src/main/java/config/config.properties");
        GlobalStatic.prop = new Properties();
        GlobalStatic.prop.load(file);
    }


    public void loadExcelData() {
        GlobalStatic.testData = new ExcelTestDataUtility("src/main/java/testData/Demo_TestData.xlsx");

    }

    public void launchBrowser() throws IOException {
        loadProperties();
        loadExcelData();
        String br = System.getProperty("browser Name");
        if (br == null) {
            br = GlobalStatic.prop.getProperty("browser");
            OpenSpecificBrowser(br);
        }
        OpenSpecificBrowser(br);
        GlobalStatic.driver.manage().window().maximize();
        GlobalStatic.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        GlobalStatic.driver.get(GlobalStatic.prop.getProperty("appURL"));

    }


    public void OpenSpecificBrowser(String browser) {
        if (browser.equals("Chrome") || browser.equals("chrome")) {
            GlobalStatic.driver = new ChromeDriver();
        }
        if (browser.equals("Edge") || browser.equals("edge")) {
            GlobalStatic.driver = new EdgeDriver();
        }
        if (browser.equals("Firefox") || browser.equals("firefox")) {
            GlobalStatic.driver = new FirefoxDriver();
        }

    }
}


