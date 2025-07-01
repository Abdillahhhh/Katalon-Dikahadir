import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.navigateToUrl('https://magang.dikahadir.com/management/schedule')

WebUI.executeJavaScript('window.scrollBy({top: 400, behavior: "smooth"})', null)

WebUI.delay(1)

WebUI.click(findTestObject('Jadwal/Search-Rows/field_10Row'))

WebUI.waitForElementPresent(findTestObject('Jadwal/Search-Rows/Option_25'), 5)

WebUI.click(findTestObject('Jadwal/Search-Rows/Option_25'))

WebUI.delay(2 // tunggu datanya berubah
    )

List<WebElement> rows = WebUI.findWebElements(findTestObject('Object Repository/Jadwal/Search-Rows/field_AllRows'), 5)

WebUI.comment('Jumlah baris ditemukan: ' + rows.size())

WebUI.verifyEqual(rows.size(), 25)

