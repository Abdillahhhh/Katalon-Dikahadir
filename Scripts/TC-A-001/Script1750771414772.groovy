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

WebUI.navigateToUrl('https://magang.dikahadir.com/management/location-point')

WebUI.click(findTestObject('Object Repository/Page_AbsenPoint/button_Tambahkan'))

WebUI.setText(findTestObject('Object Repository/Page_AbsenPoint/Field_Nama'), 'Tower42')

WebUI.setText(findTestObject('Object Repository/Page_AbsenPoint/Field_Latitude'), '-6.579845389001726')

WebUI.setText(findTestObject('Object Repository/Page_AbsenPoint/Field_Longitude'), '106.81901261381575')

WebUI.setText(findTestObject('Object Repository/Page_AbsenPoint/Field_Maksimal_Radius'), '15')

WebUI.setText(findTestObject('Object Repository/Page_AbsenPoint/Field_Description'), 'Kantor Kuningan City')

WebUI.click(findTestObject('Object Repository/Page_AbsenPoint/button_Tambah'))

WebUI.verifyElementVisible(findTestObject('Page_AbsenPoint/div_Berhasil Tambah Location Point'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AbsenPoint/div_Berhasil Tambah Location Point'), 'Berhasil Tambah Location Point')

WebUI.delay(2)

