*** Setting ***
Documentation     To validate the Login Form
Library           Selenium2Library
Library           Collections
Library           ../customLibraraies/Shop.py
Test Setup        Open the browser with Mortage page
#Test Teardown     close browser session
Resource          resource.robot
Resource          Generic.robot

*** Variables ***
${shop_page_load}         xpath://h1[@class='my-4']



*** Keywords ***
Verify the checkoutItem on checkoutpage and proceed
      click button          css:.btn-success
