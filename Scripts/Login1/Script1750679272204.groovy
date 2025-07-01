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

WebUI.openBrowser('')

WebUI.maximizeWindow()

'Akses halaman login\r\n'
WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

'Masukan email\r\n'
WebUI.setText(findTestObject('Login/Email_field'), 'admin@hadir.com')

'Masukan password\r\n'
WebUI.setEncryptedText(findTestObject('Login/Password_fied'), 'KQScaJbfjNMJXZCQ/auLWFkJtbSG6Xl8')

'klik tombol login\r\n'
WebUI.click(findTestObject('Login/button_Masuk'))

WebUI.verifyElementVisible(findTestObject('Day Off/Management_Dayoff/Dashboard_menu'))

WebUI.delay(2)

