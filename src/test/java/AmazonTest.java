import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;

public class AmazonTest {
    @Test
    void UITest() {
        // Sign in
        Configuration.holdBrowserOpen = true;

        Configuration.browserSize = "1900x1600";

        open("https://www.amazon.com");
        refresh();
        refresh();
        $("#nav-link-accountList-nav-line-1").should(Condition.visible).click();
        $("[name='email']").setValue("shirokovarsx@gmail.com");
        $("#continue").should(Condition.visible).click();
        $(".a-alert-content").shouldHave(text("We cannot find"));

        //$("[name='password']").setValue("2389123512Can#!");
        //$(byText("Continue")).click();
        // $(".a-alert-content").should(Condition.visible).click();

    }

}

