Feature: ChangePassword

  Scenario: Change old password to a new password
    Given la pagina "http://todo.ly/" este abierta
    And yo quiero realizar el login
      | email    | enzoAR@maestria.com |
      | password | ABC123              |

    Then quiero cambiar el password de mi session
      | PasswordOld | ABC123 |
      | PasswordNew | 123ABC |
    Then mis Password esta actualizado
