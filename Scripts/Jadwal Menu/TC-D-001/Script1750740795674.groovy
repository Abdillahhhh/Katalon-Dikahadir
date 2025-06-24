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

'Login'
WebUI.callTestCase(findTestCase('Login1'), [:], FailureHandling.STOP_ON_FAILURE)

'Klik menu Management'
WebUI.click(findTestObject('Day Off/Management_Dayoff/Management_menu'), FailureHandling.STOP_ON_FAILURE)

'Klik menu Jadwal'
WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Jadwal_menu'))

'Verify Button \'Tambahkan\' dimenu Jadwal'
WebUI.verifyElementPresent(findTestObject('Jadwal/Tambah Jadwal/button_Tambahkan'), 0)

'klik button \'Tambahkan\''
WebUI.click(findTestObject('Jadwal/Tambah Jadwal/button_Tambahkan'))

'Verify header saat button \'Tambahkan\' di klik'
WebUI.verifyElementPresent(findTestObject('Jadwal/Tambah Jadwal/h2_Tambah Data Jadwal'), 0)

WebUI.delay(1)

