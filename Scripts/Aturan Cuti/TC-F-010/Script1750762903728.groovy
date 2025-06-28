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

WebUI.sendKeys(findTestObject('Login/Password_field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Login/button_A_MuiButtonBase-root MuiIconButton-r_496560'))

WebUI.click(findTestObject('Sidebar/div_Management'))

WebUI.click(findTestObject('Object Repository/Sidebar/div_Aturan Cuti'))

WebUI.click(findTestObject('Default-Search-Clear-Reset/dashboard'))

WebUI.click(findTestObject('AturanCuti/Delete-Edit-View/Page_Edit/button_Option'))

WebUI.click(findTestObject('AturanCuti/Delete-Edit-View/Page_Edit/option_Edit'))

WebUI.click(findTestObject('AturanCuti/Tambah/Nama Aturan Cuti_field'))

WebUI.click(findTestObject('AturanCuti/Delete-Edit-View/Page_Edit/div_Sunting Aturan CutiNama Aturan CutiElig_ffc2b7'))

WebUI.setText(findTestObject('AturanCuti/Tambah/Nama Aturan Cuti_field'), 'Aturan Dummy Diperbarui')

WebUI.click(findTestObject('AturanCuti/Delete-Edit-View/Page_Edit/button_Simpan'))

WebUI.click(findTestObject('AturanCuti/Delete-Edit-View/Page_Edit/div_Sukses Mengubah Aturan Cuti'))

WebUI.closeBrowser()

