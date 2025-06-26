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

WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

WebUI.setText(findTestObject('Page_Login/Email Field'), 'admin@hadir.com')

WebUI.setEncryptedText(findTestObject('Page_Login/Password Field'), 'KQScaJbfjNMJXZCQ/auLWFkJtbSG6Xl8')

WebUI.click(findTestObject('Page_Login/Login Button'))

WebUI.click(findTestObject('Object Repository/Page_DashboardMenu/Menu_Management'))

WebUI.click(findTestObject('Object Repository/Page_DashboardMenu/Menu_Absen_Point'))

WebUI.setText(findTestObject('Object Repository/Page_AbsenPoint/Field_Absen_Point_Search'), 'Tower11')

WebUI.click(findTestObject('Object Repository/Page_AbsenPoint/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_AbsenPoint/Icon_Lainnya'))

WebUI.click(findTestObject('Object Repository/Page_AbsenPoint/Edit'))

WebUI.setText(findTestObject('Object Repository/Page_AbsenPoint/input_Nama_name'), '')

WebUI.click(findTestObject('Object Repository/Page_AbsenPoint/button_Simpan'))

TestObject errorTooltip = findTestObject('Object Repository/Page_AbsenPoint/Field_Nama')

boolean isVisible = WebUI.verifyElementVisible(errorTooltip, FailureHandling.OPTIONAL)

if (isVisible) {
	WebUI.comment('Validasi muncul: Harap isi bidang ini')
} else {
	WebUI.comment('Validasi TIDAK muncul: Harap isi bidang ini')
}

WebUI.delay(2)

WebUI.closeBrowser()

