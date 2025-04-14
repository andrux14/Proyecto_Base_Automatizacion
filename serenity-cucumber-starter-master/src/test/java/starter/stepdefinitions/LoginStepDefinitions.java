package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import starter.steps.LoginSteps;

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginsteps;

    @Given("Que deseo ingresar a la pagina de prueba")
    public void que_deseo_ingresar_a_la_pagina_de_prueba() throws InterruptedException {
        loginsteps.abrirNavegador();

    }
    @When("Se ingrese a la URL https:\\/\\/opensource-demo.orangehrmlive.com\\/web\\/index.php\\/auth\\/login")
    public void se_ingrese_a_la_url_https_opensource_demo_orangehrmlive_com_web_index_php_auth_login() {

    }
    @Then("se deben ingresar el Username {string}")
    public void se_deben_ingresar_el_username(String userName) {

    }
    @And("se deben ingresar el Password {string}")
    public void se_deben_ingresar_el_password(String password) {

    }
    @And("al dar enter el loggeo debe ser exitoso")
    public void al_dar_enter_el_loggeo_debe_ser_exitoso() {

    }

}
