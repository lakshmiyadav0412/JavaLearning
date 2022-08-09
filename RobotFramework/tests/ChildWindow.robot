*** Setting ***
Documentation     To validate the Login Form
Library           Selenium2Library
Library           Collections
Library           String
Test Setup        Open the browser with Mortage page
#Test Teardown     close browser session
Resource          Generic.robot

#Resources
*** Variables ***

*** Test Cases ***
Validate child window functionality
     Select the link of child window
     Verify the user is switched to child window
     Grab the Email id from child window
     Switch to parent window and enter the email





*** Keywords ***


Select the link of child window
        click element          css:.blinkingText
        sleep         5

Verify the user is switched to child window
        switch window       NEW
        element text should be      css:h1         DOCUMENTS REQUEST

Grab the Email id from child window

  ${text}=   get text       css:.red
  @{words}=  Split String    ${text}     at
  # get the element on index 1

  ${text_split}=   get from list     ${words}    1
  Log  ${text_split}
    @{email_list}=    Split String    ${text_split}
    ${emailid}=   get from list    ${email_list}      0
     Log  ${emailid}

     Set Global Variable     ${emailid}
#setting email as global variable so it can  be used below


Switch to parent window and enter the email
    switch window          MAIN
   title should be               LoginPage Practise | Rahul Shetty Academy
     input text          id:username        ${emailid}



