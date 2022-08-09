*** Setting ***
Documentation     To validate the Login Form
Library           Selenium2Library
Library           Collections
Library           ../customLibraraies/Shop.py
Test Setup          Open the browser with Mortage page      Chrome
#Test Teardown     close browser session
Resource          ../PageObject/Generic.robot
Resource         ../PageObject/LandingPage.robot
Resource         ../PageObject/ShopPage.robot
Resource         ../PageObject/CheckoutPage.robot
Resource         ../PageObject/ConfirmationPage.robot


#Resources
*** Variables ***


@{listofProducts}         Blackberry     Nokia Edge
${country}                 India


*** Test Cases ***

Validate cards display in the Shopping Page
     [Tags]                  SMOKE     REGRESSION
    LandingPage.Fill the login form       ${Validusername}         ${Valid_password}
    ShopPage.wait Until Element is located in page
   # ShopPage.Verify the Cart title on shop page
    add items to cart and checkout            ${listofProducts}
    CheckoutPage.Verify the checkoutItem on checkoutpage and proceed
   # Select the cart            Blackberry
    ConfirmationPage.Enter the country name and select terms&condition          ${country}
    ConfirmationPage.Purchase the product and Confirm the Purchase



*** Keywords ***

























