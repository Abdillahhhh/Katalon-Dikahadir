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

'klik burger dot disebelah tanggall efektif'
WebUI.click(findTestObject('Jadwal/Delete-Update-View/Page_View/View_option'))

'klilk delette option'
WebUI.click(findTestObject('Jadwal/Delete-Update-View/Page_View/Delete_option'))

'batalkan delete dengan mengkllik \'tidak\''
WebUI.click(findTestObject('Jadwal/Delete-Update-View/Page_View/Delete_Tidak'))

'validasi lagi layar jadwal utama ketika sudah klik \'tidak\''
WebUI.verifyElementPresent(findTestObject('Jadwal/Tipe_Jadwal Option/Page_HADIR/th_NAMA'), 0)

WebUI.comment('✅ Vallidasi halaman Jadwal.')

WebUI.delay(1)

