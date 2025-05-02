package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.components.SummaryTableComponent;

import static java.lang.Thread.sleep;

public class RegistrationFormWithPom extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    SummaryTableComponent summaryTable = new SummaryTableComponent();

    @Test
        //Проверка формы регистрации с заполнением всех полей
    void successRegistrationAllFilldsTest() {
        registrationPage.openPage()
                .bannersRemove()
                .setFirstName("Julia")
                .setLastName("Amel")
                .setGender("Female")
                .setEmail("amel@car.ca")
                .setPhoneNumber("7982123212")
                .setDateOfBirth("2005", "July", "23")
                .setSubjects("Math")
                .setHobbies("Reading")
                .setPicture("photo.jpg")
                .setCurrentAddress("New street 1")
                .setState("Uttar Pradesh")
                .setCity("Lucknow")
                .buttonClick();


        summaryTable.shouldAppear()
                .checkFields("Student Name", "Julia Amel")
                .checkFields("Student Email", "amel@car.ca")
                .checkFields("Gender", "Female")
                .checkFields("Mobile", "7982123212")
                .checkFields("Date of Birth", "23 July,2005")
                .checkFields("Subjects", "Maths")
                .checkFields("Hobbies", "Reading")
                .checkFields("Picture", "photo.jpg")
                .checkFields("Address", "New street 1")
                .checkFields("State and City", "Uttar Pradesh Lucknow");
    }

    @Test
        //Проверка формы регистрации с заполнением только обязательных полей
    void successRegistrationRequiredFilldsTest() {
        registrationPage.openPage()
                .bannersRemove()
                .setFirstName("Julia")
                .setLastName("Amel")
                .setGender("Female")
                .setPhoneNumber("7982123212")
                .buttonClick();


        summaryTable.shouldAppear()
                .checkFields("Student Name", "Julia Amel")
                .checkFields("Gender", "Female")
                .checkFields("Mobile", "7982123212");

    }

    @Test
        //Проверка на то, что форма регистрации не отправляется если не заполнены обязательные поля
    void negativeRegistrationTest() {
        registrationPage.openPage()
                .bannersRemove()
                .buttonClick();

        summaryTable.shouldNotAppear();
    }
}

