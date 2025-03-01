import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;
import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.selector.ByText.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTextCaseInsensitive;
import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selectors.withTextCaseInsensitive;

public class NewUItest {
@Test
    void successfulUITest() {
    Configuration.holdBrowserOpen = true;

    Configuration.browserSize = "1900x1600";

    open("https://github.com");
    $("[placeholder='Search or jump to...']").should(Condition.visible).click();
    $("[name='query-builder-test']").setValue("selenide").pressEnter();
    $("[href='/selenide/selenide']").click();
    $("[href='/selenide/selenide']").shouldHave(Condition.text("selenide/selenide"));

}
    @Test
    void successfulUITest2() {


        Configuration.holdBrowserOpen = true;

        Configuration.browserSize = "1900x1600";


        open("https://github.com");
        $("[placeholder='Search or jump to...']").should(Condition.visible).click();
        $("[name='query-builder-test']").setValue("selenide").pressEnter();
        $("[href='/selenide/selenide']").click();
        $("[href='/selenide/selenide']").shouldHave(Condition.text("selenide/selenide"));
        $("[href='/selenide/selenide/wiki']").click();
        $("[href='/selenide/selenide/wiki/SoftAssertions']").shouldHave(Condition.text("Soft assertions"));
        $("[href='/selenide/selenide/wiki/SoftAssertions']").click();
        $("body").shouldHave(text("Using JUnit5 extend test"));
        $("body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}"));


    }
}
