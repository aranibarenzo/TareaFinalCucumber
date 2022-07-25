Feature: ChangePassword

  Scenario: Change old password to a new password
    Given la pagina "http://todo.ly/" este abierta
    And yo quiero realizar el login
      | email    | aranibare@maestria.com |
      | password | 654321                 |
    When yo quiero cambiar el Password de Mi session
    Then cuando Acutalizo el "Password0" antigua por el  nuevo "Password1"
    Then mis credenciles estan actualizadas
