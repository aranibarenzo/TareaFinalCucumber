Feature: SignUp

  Scenario: create a new user is succesfully
    Given la pagina "http://todo.ly/" este abierta
    When yo quiero crear una nueva cuenta
      | FullName | Aranibar R Amilcar  |
      | Email    | enzoAR@maestria.com |
      | Password | ABC123              |
    Then la cuenta deberia estar creada

