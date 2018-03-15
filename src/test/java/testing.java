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
        open("https://web-quadratic-equation.herokuapp.com/");
        $(By.id(Selectors.PARAM_A)).click();
        $(By.id(Selectors.PARAM_A)).clear();
        $(By.id(Selectors.PARAM_A)).setValue("2");
        $(By.id(Selectors.PARAM_B)).click();
        $(By.id(Selectors.PARAM_B)).clear();
        $(By.id(Selectors.PARAM_B)).setValue("12");
        $(By.id(Selectors.PARAM_C)).click();
        $(By.id(Selectors.PARAM_C)).setValue("14").pressEnter();
        $(By.linkText(Selectors.SEND)).doubleClick();
        $(By.className("alert")).click();
        String result_success = "x1";
        $(By.id("result")).shouldHave(text(result_success));
    }



}
