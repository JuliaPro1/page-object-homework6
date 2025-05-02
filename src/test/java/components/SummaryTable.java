package components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SummaryTable {

    private final SelenideElement modalDialog = $(".table-responsive");

    public SummaryTable checkFields(String key, String value) {
        modalDialog.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }

    public SummaryTable shouldAppear() {
        modalDialog.shouldBe(visible);
        return this;
    }

    public SummaryTable shouldNotAppear() {
        modalDialog.shouldNotBe(visible);
        return this;
    }
}
