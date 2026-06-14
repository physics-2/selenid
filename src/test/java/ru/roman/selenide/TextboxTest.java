package ru.roman.selenide;

import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

@Epic("Обучение allure")
@Feature("TextBox")
public class TextboxTest {

    public static void setup(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "920x180";
        Configuration.timeout = 5000;
    }

    @DisplayName("Сложение двух чисел")
    @Description("Тест проверяет что пользователь будет добавлен по имени пользователя,email ")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Roma")
    @Story("Окно регистрации пользователя")
    @Test
    public void fillTextbox(){
        open("https://demoqa.com/text-box");
        setUsername("Test");
        $("#userEmail").setValue("Test@gmial.ru");
        $("#currentAddress").setValue("Test");
        $("#permanentAddress").setValue("Test");

        $("#submit").scrollTo().click();

        $("#output").shouldHave(text("Test"));

        SelenideElement element = $("#output");
        System.out.println(element.getText());
        System.out.println(element.getValue());
        $x("//input[@id='userName']").setValue("Test2");

        $("#userName").shouldBe(visible);
        $("#userName").shouldBe(enabled);
        sleep(1000);
    }

    @Step("Устанавливаем имя пользователя")
    public void setUsername(String username){

        $("#userName").setValue(username);
    }


}
