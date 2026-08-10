import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SampleTestForScreenShot {

    public WebDriver driver;

    public void takeScreenshot(String testName) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File(
            "./screenshots/" + testName + ".png"
        );

        FileUtils.copyFile(source, destination);
    }
}