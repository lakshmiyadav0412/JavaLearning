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
Enter the country name and select terms&condition
   [arguments]         ${country}
    input text         id:country                   ${country}
    wait until element passed is Located in page          xpath://a[text()='${country}']
    click element              xpath://a[text()='${country}']
    click element              css:.checkbox label

Purchase the product and Confirm the Purchase
    click button             css:.btn-success
    page should contain       Success!