Feature: SignUp

  Scenario: create a new user is succesfully
    Given la pagina "http://todo.ly/" este abierta
    When yo quiero crear una nueva cuenta
      | FullName | Aranibar R Amilcar  |
      | Email    | enzoAR@maestria.com |
      | Password | 123ABC              |
    Then la cuenta deberia estar creada
    Then quiero cambiar el password
      | PasswordOld | 123ABC |
      | PasswordNew | ABC123 |
