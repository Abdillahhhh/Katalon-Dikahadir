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

WebUI.setText(findTestObject('Jadwal/Search-Rows/field_Search'), '2testing1')

TestObject inputSearch = findTestObject('Jadwal/Search-Rows/field_Search')

// Klik titik X di sisi kanan input (misal: 120px ke kanan dari kiri input)
WebUI.clickOffset(inputSearch, 100, 5)

WebUI.delay(1)

// Ambil isi kolom pencarian setelah diklik X
String currentValue = WebUI.getAttribute(inputSearch, 'value')

// Validasi bahwa kolom pencarian sudah kosong (tidak ada teks lagi)
WebUI.verifyMatch(currentValue, '', false)

WebUI.delay(1)

