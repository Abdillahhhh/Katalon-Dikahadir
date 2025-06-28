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

WebUI.setText(findTestObject('Page_HADIR/input_Email_email'), 'admin@hadir.com')

WebUI.setEncryptedText(findTestObject('Page_HADIR/input_Password_password'), 'KQScaJbfjNMJXZCQ/auLWFkJtbSG6Xl8')

WebUI.click(findTestObject('Page_HADIR/button_Masuk'))

WebUI.click(findTestObject('Page_HADIR/button_A_MuiButtonBase-root MuiIconButton-r_496560'))

WebUI.click(findTestObject('Page_HADIR/p_Management'))

WebUI.click(findTestObject('Page_HADIR/p_Aturan Cuti'))

WebUI.click(findTestObject('Page_Aturan Cuti/div_Logout_MuiBackdrop-root MuiModal-backdr_bf49d3'))

WebUI.click(findTestObject('Page_Aturan Cuti/button_Aksi_MuiButtonBase-root MuiIconButto_5ee4e8'))

WebUI.click(findTestObject('Page_Aturan Cuti/li_View'))

WebUI.click(findTestObject('Object Repository/AturanCuti/Page_Detil Aturan Cuti/button_Tambahkan Detail Aturan Cuti'))

WebUI.setText(findTestObject('Object Repository/AturanCuti/Page_Detil Aturan Cuti/input_Minimal Bulan Bekerja_total_month_greater'), 
    '12')

WebUI.setText(findTestObject('Object Repository/AturanCuti/Page_Detil Aturan Cuti/input_Total Cuti_total_leave'), '14')

WebUI.click(findTestObject('Object Repository/AturanCuti/Page_Detil Aturan Cuti/button_Tambahkan'))

WebUI.closeBrowser()

