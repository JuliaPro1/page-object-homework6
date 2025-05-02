package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.TextBoxResultComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestBoxPage {
    private final SelenideElement fullNameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitButton = $("#submit");

    public TestBoxPage openPage() {
        open("/text-box");
        $(".text-center").shouldHave(text("Text Box"));
        return this;
    }

    public TestBoxPage bannersRemove() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public TestBoxPage setFirstName(String value) {
        fullNameInput.setValue(value);
        return this;
    }

    public TestBoxPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public TestBoxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public TestBoxPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);
        return this;
    }

    public TestBoxPage clickButton() {
        submitButton.click();
        return this;
    }

    public void outputResults() {
        new TextBoxResultComponent().outputResults();
    }

}
