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


wait Until Element is located in page
  wait until element passed is Located in page     ${shop_page_load}


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