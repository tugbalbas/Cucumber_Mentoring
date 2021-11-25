Feature: DataTable Practise

  Scenario: DataTable Register

    Given Navigate to Practice Website

    When Fill all areas
      | -Fields-        | -Values-         |
      | First Name      | asdf             |
      | Last Name       | asdfff           |
      | Email           | asd@asd.com      |
      | Mobile          | 123123123        |
      | Current Address | Landberg Str. 12 |


    Then Verify Register Page's Url

    #DataTable değiştirilebilecek veriler için yazılır