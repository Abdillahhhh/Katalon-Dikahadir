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

WebUI.setText(findTestObject('Login/Email_field'), 'admin@hadir.com')

WebUI.setEncryptedText(findTestObject('Login/Password_field'), 'KQScaJbfjNMJXZCQ/auLWFkJtbSG6Xl8')

WebUI.click(findTestObject('Login/button_Masuk'))

WebUI.click(findTestObject('Sidebar/svg_A_feather feather-menu'))

WebUI.click(findTestObject('Sidebar/p_Management'))

WebUI.click(findTestObject('Sidebar/p_Aturan Cuti'))

WebUI.navigateToUrl('https://magang.dikahadir.com/management/unit-leave')

WebUI.click(findTestObject('AturanCuti/Delete-Edit-View/Page_View/svg_Aksi_feather feather-more-vertical'))

WebUI.click(findTestObject('AturanCuti/Delete-Edit-View/Page_View/li_View'))

WebUI.click(findTestObject('AturanCuti/Delete-Edit-View/Page_View/div_Delete_MuiBackdrop-root MuiBackdrop-inv_a34963'))

WebUI.click(findTestObject('Object Repository/AturanCuti/Delete-Edit-View/Page_View/li_25'))

elements = WebUI.findWebElement(findTestObject('List_Data'))

WebUI.verifyEqual(elements.size(), 25)

WebUI.closeBrowser()

WebUI.comment('bug row')

