from appium import webdriver
from appium.options.android import UiAutomator2Options
from appium.webdriver.common.appiumby import AppiumBy
import time

options = UiAutomator2Options()

options.platform_name = "Android"
options.automation_name = "UiAutomator2"
options.device_name = "emulator-5554"

# Thông tin app Swag Labs
options.app_package = "com.swaglabsmobileapp"
options.app_activity = ".SplashActivity"

driver = webdriver.Remote(
    "http://127.0.0.1:4723",
    options=options
)

try:
    print("Da ket noi Appium + Emulator")
    print("Da mo ung dung Swag Labs")

    time.sleep(5)

    # Tim o Username
    username = driver.find_element(
        AppiumBy.ACCESSIBILITY_ID,
        "test-Username"
    )

    username.send_keys("standard_user")

    print("Da nhap username thanh cong")

    time.sleep(2)

finally:
    driver.quit()
    print("Da dong ung dung")