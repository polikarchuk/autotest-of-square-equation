import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestnoSolution {
    @Before
    public void start(){
        Configuration.browser = "chrome";
    }

    @Test
    public void litest() {
        TestPattern.execute("1","1","1");
        String result_success = "";
        $(By.id("result")).shouldHave(text(result_success));
    }
}
