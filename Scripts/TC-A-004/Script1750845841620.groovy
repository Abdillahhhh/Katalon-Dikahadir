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

WebUI.click(findTestObject('Object Repository/Page_AbsenPoint/Icon_Lainnya'))

WebUI.click(findTestObject('Object Repository/Page_AbsenPoint/Edit'))

// Fungsi generate random 6 huruf
// Generate random 6 huruf
String randomText = getRandomString(6)

// Isi field dengan random text
WebUI.setText(findTestObject('Object Repository/Page_AbsenPoint/input_Nama_name'), randomText)

WebUI.click(findTestObject('Object Repository/Page_AbsenPoint/button_Simpan'))

WebUI.setText(findTestObject('Object Repository/Page_AbsenPoint/Field_Absen_Point_Search'), randomText)

WebUI.click(findTestObject('Object Repository/Page_AbsenPoint/button_Search'))

WebUI.verifyElementText(findTestObject('Page_AbsenPoint/h6_Tower18'), randomText)

WebUI.delay(2)

String getRandomString(int length) {
    String chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'

    String result = ''

    Random rand = new Random()

    for (int i = 0; i < length; i++) {
        result += chars.charAt(rand.nextInt(chars.length()))
    }
    
    return result
}

