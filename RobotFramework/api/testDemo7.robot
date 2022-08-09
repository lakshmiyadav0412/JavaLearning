*** Settings ***
Documentation    Suite description
Library           Collections
Library           RequestsLibrary

*** Variables ***
${base_url}         https://rahulshettyacademy.com
${Bookid}
${book_name}          RobotFrmwk
*** Keywords ***


*** Test Cases ***


Play around Dictionary
     &{data}=    Create Dictionary      name=Rahulshetty    course=robot     website=rahulshettyacademy.com
     log    ${data}
     Dictionary Should Contain Key       ${data}        name
     log   ${data}[name]
    ${url}=  Get From Dictionary       ${data}        website
     log  ${url}






Add Book to Library DataBase

    &{Add_Json}=      Create Dictionary   name=${book_name}   isbn=Am0231  aisle=Lak0231   author=lakshmiyadav
   ${response}=     POST          ${base_url}/Library/Addbook.php           json=${Add_Json}       expected_status=200

    log   ${response.json()}
    Dictionary Should Contain Key     ${response.json()}         ID
   ${Bookid} =  get from dictionary      ${response.json()}     ID
     Set Global Variable      ${Bookid}
   log  ${Bookid}
    log   ${response.json()}[Msg]
    Should Be Equal As Strings       successfully added         ${response.json()}[Msg]
    status should be     200      ${response}

Get the Book Details
        ${GET_response}=     GET                    ${base_url}/Library/GetBook.php         params=${Bookid}   expected_status=200
          log  ${GET_response.json()}
        Should be Equal as String             ${book_name}         ${GET_response.json()}[0][book_name]

Delete the Book Details
               &{Delete_jsonCreated}=    Create Dictionary   ID=${Bookid}
               ${Delete_response}=    POST         ${base_url}/Library/DeleteBook.php        json=${Delete_jsonCreated}
               log     ${Delete_response.json()}
               Should be Equal As Strings          book is successfully deleted       ${Delete_response.json()}[msg]