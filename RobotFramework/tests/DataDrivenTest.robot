*** Setting ***
Documentation     To validate the Login Form
Library           Selenium2Library
Library           DataDriver           file=resources/datacsv.csv       encoding=UTF-8        dialect=excel
Test Setup        Open the browser with Mortage page
#Test Teardown     close browser session
Test Template      Validate Unsuccesful Login
Resource          Generic.robot

#Resources
*** Variables ***
${Error_Message_Loggin}   xpath://div[@class='alert alert-danger col-md-12']
${shop_page_load}         xpath://h1[@class='my-4']


*** Test Cases ***

Login with user ${username}and password ${password}



*** Keywords ***

Validate Unsuccesful Login
   [Arguments]         ${username}       ${password}
   Fill the login form    ${username}        ${password}
   wait Until Element is located in page    ${Error_Message_Loggin}
   verify error message is correct



Open the browser with Mortage page

   create_webdriver  ${browser}    executable_path=${executable_path}
   go to              ${url}


Fill the login form
  [arguments]    ${username}          ${password}

    input text          id:username          ${username}
    input password      id:password          ${password}
    click button        id:signInBtn



wait Until Element is located in page
   [arguments]              ${element}
  wait until element is visible    ${element}


verify error message is correct
   ${result} =  get text       ${Error_Message_Loggin}
   Should Be Equal As Strings    ${result}            Incorrect username/password.
   #this below line does exact same thing above line do in much optimzed way :)
   element text should be      ${Error_Message_Loggin}        Incorrect username/password.






