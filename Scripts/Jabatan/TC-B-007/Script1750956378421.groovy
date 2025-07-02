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

WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

WebUI.setText(findTestObject('Object Repository/Jabatan/input_Email_email'), 'admin@hadir.com')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/Jabatan/input_Password_password'), 'KQScaJbfjNMJXZCQ/auLWFkJtbSG6Xl8')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Jabatan/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Jabatan/div_Management'))

WebUI.click(findTestObject('Object Repository/Jabatan/div_Jabatan'))

WebUI.setText(findTestObject('Object Repository/Jabatan/input_Admin Hadir_search'), '92')

WebUI.click(findTestObject('Object Repository/Jabatan/button_Search'))

WebUI.click(findTestObject('Object Repository/Jabatan/button_Jangan Dihapus ya_MuiButtonBase-root_ea5a16'))

WebUI.click(findTestObject('Object Repository/Jabatan/li_Delete'))

WebUI.click(findTestObject('Object Repository/Jabatan/button_Tidak'))

WebUI.closeBrowser()

