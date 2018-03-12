import com.codeborne.selenide.Configuration;
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
        $(By.id("param_a")).click();
        $(By.id("param_a")).clear();
        $(By.id("param_a")).setValue("2");
        $(By.id("param_b")).click();
        $(By.id("param_b")).clear();
        $(By.id("param_b")).setValue("16");
        $(By.id("param_c")).click();
        $(By.id("param_c")).setValue("14").pressEnter();
        $(By.id("solve")).shouldBe(visible);
        $(By.linkText("Solve it!")).click();



    }




}
