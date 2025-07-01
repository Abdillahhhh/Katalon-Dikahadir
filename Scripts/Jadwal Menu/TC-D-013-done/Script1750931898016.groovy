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

WebUI.navigateToUrl('https://magang.dikahadir.com/management/schedule')

WebUI.setText(findTestObject('Jadwal/Search-Rows/field_Search'), 'Kelompok2PTG')

WebUI.click(findTestObject('Jadwal/Search-Rows/button_Search'))

WebUI.delay(1)

String namaJadwal = WebUI.getText(findTestObject('Jadwal/Search-Rows/column_Nama'))

WebUI.verifyMatch(namaJadwal, 'Kelompok2PTG', false)

// validasi munculnya row 1-1 of 1 sebagai verifikasi keberhasilan field search
// String rowInfo = WebUI.getText(findTestObject('Jadwal/Search-Rows/rows_1-1 of 1'))
// WebUI.verifyMatch(rowInfo, '1-1 of', false)
WebUI.delay(1)

