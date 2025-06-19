@Suite @Login
Feature: CP01 - Iniciar sesion

  Background: Validar inicio sesion con credenciales validas e invalidades

    Given el usuario ingresa a la pagina web

@ValidCredentials
  Scenario: 1 - Validar inicio de sesión con credenciales validas
    When ingresa usuario y contraseña validas
    Then la pagina debe ingresar a la pagina principal de la aplicación
    And el usuario debe cerrar sesion exitosamente

@InValidCredentials
  Scenario: 2 - Validar inicio de sesión con credenciales invalidas
    When ingresa usuario y contraseña invalidas
    Then la pagina deberia mostrar un mensaje de error


