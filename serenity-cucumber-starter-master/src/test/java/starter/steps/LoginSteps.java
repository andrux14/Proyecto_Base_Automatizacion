package starter.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

public class LoginSteps extends PageObject {
    @Step
    public void abrirNavegador() throws InterruptedException {
        openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
    }
}
