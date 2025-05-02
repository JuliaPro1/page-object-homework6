package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxResultComponent {
    public void outputResults() {
        $("#output").shouldHave(text("Name:Julia Amel\n" +
                "\n" +
                "Email:Julia@test.dsd\n" +
                "\n" +
                "Current Address :New street 1\n" +
                "\n" +
                "Permananet Address :Old street 2"));
    }


}
