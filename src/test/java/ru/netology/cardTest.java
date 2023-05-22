package ru.netology;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class cardTest {
    @Test
    public void ShouldSendForm() {
        open("http://localhost:9999/");
        SelenideElement form = $("[data-test-id=app-order-form]");
        $("[type=text]").setValue("Зубенко Михаил");
        $("[type=tel]").setValue("+79887829686");
        $(".checkbox__box").click();
        $(".button__content").click();
        $("[data-test-id=order-success]").shouldHave(exactText(" Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }
}
