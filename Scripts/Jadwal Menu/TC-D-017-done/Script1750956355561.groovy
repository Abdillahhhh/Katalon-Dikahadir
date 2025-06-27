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

'bbuuka menu management'
WebUI.click(findTestObject('Day Off/Management_Dayoff/Management_menu'))

'buuka menu jadwal'
WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Jadwal_menu'))

WebUI.executeJavaScript('window.scrollBy({top: 200, behavior: "smooth"})', null)

WebUI.delay(1 // beri delay agar efek scroll smooth terlihat
    )

WebUI.click(findTestObject('Jadwal/Search-Rows/Button_LastPage'))

WebUI.delay(1)

// validasi munculnya row 1-10 of 86 sebagai verifikasi keberhasilan kembali ke tampilan utama
String rowInfoLast = WebUI.getText(findTestObject('Object Repository/Jadwal/Search-Rows/rows-_full'))

WebUI.verifyMatch(rowInfoLast, '81-87 of 87', false)

WebUI.delay(1)

WebUI.executeJavaScript('window.scrollBy({top: 200, behavior: "smooth"})', null)

WebUI.delay(1 // beri delay agar efek scroll smooth terlihat
    )

WebUI.click(findTestObject('Jadwal/Search-Rows/Button_FirstPage'))

WebUI.delay(1)

// validasi munculnya row 1-10 of 86 sebagai verifikasi keberhasilan kembali ke tampilan utama
String rowInfoFirst = WebUI.getText(findTestObject('Object Repository/Jadwal/Search-Rows/rows-_full'))

WebUI.verifyMatch(rowInfoFirst, '1-10 of 87', false)

WebUI.executeJavaScript('window.scrollBy({top: 200, behavior: "smooth"})', null)

WebUI.delay(2)

