*** Setting ***
Documentation    Learning robot resource features
Library             Selenium2Library




*** Variables ***

${Error_Message_Loggin}     css:.alert-danger
${browser}                  Firefox
${url}                      https://rahulshettyacademy.com/loginpagePractise/
${Validusername}              rahulshettyacademy
${invalid_password}           1234455
${Valid_password}             learning
${user_name}                   lakshmi
${ebayUrl}                    https://www.ebay.com/
${ebayname}                   Lakshmi
${ebaylast}                    Yadav
${ebayemail}                   lakshmiyadav1881@gmail.com
${ebaypass}                    pass@12234


*** Keywords ***

close browser session
       Close Browser

Open the browser with Mortage page
   [arguments]           ${browser_name}

   create_webdriver      ${browser_name}     executable_path=C://Users//LakshmiYadav//IdeaProjects//RobotFramework//tests//resources//${browser_name}
   go to                 ${url}





Open the browser with Url
   [arguments]           ${browser_name}
   IF  "${browser_name}" == "Chrome"
   create_webdriver      ${browser_name}     executable_path = RobotFramework//tests//resources//chromedriver.exe
   ELSE IF  "${browser_name}" == "FireFox"
   create_webdriver      ${browser_name}     executable_path = RobotFramework//tests//resources//geckodriver.exe
   END
   go to                 ${url}

wait until element passed is Located in page
    [arguments]           ${page_locator}
   wait until element is visible         ${page_locator}





