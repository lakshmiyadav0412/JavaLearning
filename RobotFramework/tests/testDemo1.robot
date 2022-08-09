*** Setting ***
Documentation     To validate the Login Form
Library           Selenium2Library
Library           Collections
Test Setup          Open the browser with Mortage page      Chrome
#Test Teardown     close browser session
Resource          ../PageObject/Generic.robot
Resource         ../PageObject/LandingPage.robot
Resource         ../PageObject/ShopPage.robot
Resource         ../PageObject/CheckoutPage.robot
Resource         ../PageObject/ConfirmationPage.robot

#Resources
*** Variables ***
${Error_Message_Loggin}   xpath://div[@class='alert alert-danger col-md-12']
${shop_page_load}         xpath://h1[@class='my-4']


*** Test Cases ***

Validate Unsuccesful Login

  Fill the login form    ${user_name}        ${invalid_password}
  wait Until Element is located in page    ${Error_Message_Loggin}
  verify error message is correct



Validate cards display in the Shopping Page
   [Tags]                   SMOKE
   Fill the login form     ${Validusername}       ${Valid_password}
   wait Until Element is located in page           ${shop_page_load}
   Verify the Cart title on shop page
   Select the cart            Blackberry




Select the form and navigate to child window

     Fill the login form and select user option

Selecting the checkBox

   Selecting the checkBox


*** Keywords ***
Fill the login form
  [arguments]     ${user_name}   ${password1}

    input text          id:username        ${user_name}
    input password      id:password        ${password1}
    click button        id:signInBtn

#wait until it checks and display error message
   #   wait until element is visible   ${Error_Message_Loggin}

wait Until Element is located in page
   [arguments]              ${element}
  wait until element is visible    ${element}


verify error message is correct
   ${result} =  get text       ${Error_Message_Loggin}
   Should Be Equal As Strings    ${result}            Incorrect username/password.
   #this below line does exact same thing above line do in much optimzed way :)
   element text should be      ${Error_Message_Loggin}        Incorrect username/password.


Verify the Cart title on shop page
     @{expectedList} =  Create List      iphone X      Samsung Note 8       Nokia Edge      Blackberry
     ${listofElements} =   get webelements     xpath: //*[@class='card-body']/h4[@class='card-title']/descendant::a
     @{actualList} =   Create List
       FOR   ${ele}  IN   @{listofElements}:

              ${text} =  get element attribute      xpath://*[@class='card-body']/h4[@class='card-title']/descendant::a    text
               Log  ${text}
               append to list    ${actualList}     ${text}


       END
       lists should be equal    ${expectedList}     ${actualList}

Select the cart

  [arguments]       ${cartname}

  ${elements} = get webelements     css: .card-title
  ${index}=   Set Variable  1

  FOR   ${element} IN  ${elements}
    Exit For Loop If  ${cartname} == ${element.text}
    ${index} = Evaluate ${index} + 1

  END
   click button    xpath:(//*[@class='card-footer'])[${index}]/button


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








