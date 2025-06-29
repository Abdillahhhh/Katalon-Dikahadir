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

WebUI.callTestCase(findTestCase('Login1'), [:], FailureHandling.STOP_ON_FAILURE)

'klik ke menu Management, agar terbuka menunya'
WebUI.click(findTestObject('Day Off/Management_Dayoff/Management_menu'))

'klik untuk buka keseluruhan management day off'
WebUI.click(findTestObject('Day Off/Management_Dayoff/Management_dayoff'))

WebUI.delay(3)

'verifikasi header Cuti Bersama'
WebUI.verifyElementPresent(findTestObject('Day Off/Management_Dayoff/additional/Dayoff_menu'), 0)

'validasi header cuti bersama\r\n'
WebUI.verifyElementPresent(findTestObject('Day Off/Cuti Bersama/h2_Cuti Bersama'), 0)

WebUI.comment('✅ Header \'Cuti Bersama\' ditemukan.')

WebUI.delay(2)

'Tutup browser setelah menemukan validasi headernya'
WebUI.closeBrowser()

