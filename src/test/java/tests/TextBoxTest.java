package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.TestBoxPage;

public class TextBoxTest extends TestBase {
    TestBoxPage testBoxPage = new TestBoxPage();

    @Test
    void successTextBoxPageTest() {
        testBoxPage.openPage()
                .bannersRemove()
                .setFirstName("Julia Amel")
                .setEmail("Julia@test.dsd")
                .setCurrentAddress("New street 1")
                .setPermanentAddress("Old street 2")
                .clickButton()
                .outputResults();
    }
}
