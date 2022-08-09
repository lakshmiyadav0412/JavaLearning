from robot.api.deco import library, keyword
from robot.libraries.BuiltIn import BuiltIn


# writing customized libraray


@library
class Shop:

    def __init__(self):
        self.selLib = BuiltIn().get_library_instance("Selenium2Library")

    @keyword
    def hello_world(self):
        print("hello")

    @keyword
    def add_items_to_cart_and_checkout(self, productList):
        # Get Webelement
        i = 1
        ProductsTitles = self.selLib.get_webelements("css: .card-title")

        for producttitles in ProductsTitles:
            if producttitles.text in productList:
                self.selLib.click_button("xpath:(//*[@class='card-footer'])[" + str(i) + "]/button")
            i = i + 1
        self.selLib.click_link("css:li.active a")

