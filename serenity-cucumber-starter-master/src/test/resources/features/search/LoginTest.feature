#Autor: Andres Felipe Algarra Reyes
# Usuario: correo@correo.com

#@SQV-3879 Este es el id del test execution de xray
Feature: Automatizacion login

  @RunAll
  @LoginExitoso
  Scenario: Validacion login exitoso
    Given Que deseo ingresar a la pagina de prueba
    When Se ingrese a la URL https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    Then se deben ingresar el Username "Admin"
    And se deben ingresar el Password "admin123"
    And al dar enter el loggeo debe ser exitoso