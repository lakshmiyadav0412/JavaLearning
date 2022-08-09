*** Setting ***
Documentation     To validate the Login Form
Library           Selenium2Library
Library           Collections
Library           ../customLibraraies/Shop.py
Test Setup        Open the browser with Mortage page
#Test Teardown     close browser session
Resource           resource.robot

*** Variables ***

${Error_Message_Loggin}   xpath://div[@class='alert alert-danger col-md-12']


*** Keywords ***


Fill the login form
  [arguments]     ${user_name}   ${password1}

    input text          id:username        ${user_name}
    input password      id:password        ${password1}
    click button        id:signInBtn

verify error message is correct
   ${result} =  get text       ${Error_Message_Loggin}
   Should Be Equal As Strings    ${result}            Incorrect username/password.
   #this below line does exact same thing above line do in much optimzed way :)
   element text should be      ${Error_Message_Loggin}        Incorrect username/password.



Fill the login form and select user option
           input text          id:username        rahulshettyacademy
           input password      id:password        learning
           #radio btn handling below
           click element        xpath://input[@value='user']
           wait until element is visible      css:.modal-content
           click button         xpath://button[@id='okayBtn']
           click button         xpath://button[@id='okayBtn']
           #selecting the drop down below
           wait until element is not visible         css:.modal-content
           select from list by value           css:select.form-control      teach
           select checkbox        id:terms
           checkbox should be selected     id:terms

Selecting the checkBox
           wait until element is not visible         css:.modal-content
           select from list by value           css:select.form-control      teach
           select checkbox        id:terms
           checkbox should be selected     id:terms
