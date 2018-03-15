import com.codeborne.selenide.Configuration;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.*;




public class testing {
    @Before
    public void start(){
        Configuration.browser = "chrome";
    }

    @Test
    public void equation() {
       TestPattern.execute("1","8","7");
    }



}
