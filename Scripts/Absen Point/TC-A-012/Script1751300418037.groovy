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

WebUI.executeJavaScript('window.scrollBy({top: 500, behavior: "smooth"})', null)

WebUI.delay(1 // beri delay agar efek scroll smooth terlihat
    )

WebUI.click(findTestObject('Absen_Point/Page_AbsenPoint/button_next'))

String rowInfo = WebUI.getText(findTestObject('Absen_Point/Page_AbsenPoint/p_11-20 of 220'))

WebUI.verifyMatch(getPartBeforeOf(rowInfo), '11-20', false)

//WebUI.click(findTestObject('Absen_Point/Page_AbsenPoint/button_Previous'))
//
//rowInfo = WebUI.getText(findTestObject('Absen_Point/Page_AbsenPoint/p_1-10 of 220'))
//
//WebUI.verifyMatch(getPartBeforeOf(rowInfo), '1-10', false)

String getPartBeforeOf(String originalText) {
    if (originalText == null) {
    }
    
    String lowerCaseText = originalText.toLowerCase()

    int indexOfOf = lowerCaseText.indexOf(' of ')

    if (indexOfOf != -1) {
        return originalText.substring(0, indexOfOf).trim()
    } else {
        return originalText
    }
}


