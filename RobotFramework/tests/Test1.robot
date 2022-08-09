*** Setting ***
Documentation    To validate the Login Form
Library             Selenium2Library
Test Teardown      Close Browser
Test Setup          Open the browser with Mortage page      Chrome
#Test Teardown     close browser session
Resource          ../PageObject/Generic.robot
Resource         ../PageObject/LandingPage.robot
Resource         ../PageObject/ShopPage.robot
Resource         ../PageObject/CheckoutPage.robot
Resource         ../PageObject/ConfirmationPage.robot


*** Variables ***

${Error_Message_Loggin}     css:.alert-danger
*** Test Cases ***

Validate succesful Login
   [Tags]             SMOKE
   Fill the login form
   wait until it checks and display error message
   verify error message is correct

*** Keywords ***

Fill the login form
    input text          id:username  lakshmiyadav
    input password      id:password  12345677
    click button        id:signInBtn

wait until it checks and display error message
      wait until element is visible   ${Error_Message_Loggin}

verify error message is correct
   ${result} =  get text       ${Error_Message_Loggin}
   Should Be Equal As Strings    ${result}            Incorrect useme/password.
   #this below line does exact same thing above line do in much optimzed way :)
   element text should be      ${Error_Message_Loggin}        Incorrect useme/password.









