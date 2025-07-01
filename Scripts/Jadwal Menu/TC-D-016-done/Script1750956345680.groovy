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

WebUI.executeJavaScript('window.scrollBy({top: 500, behavior: "smooth"})', null)

WebUI.delay(1 // beri delay agar efek scroll smooth terlihat
    )

WebUI.click(findTestObject('Jadwal/Search-Rows/Button_Next'))

WebUI.delay(1)

// validasi munculnya row 1-10 of 86 sebagai verifikasi keberhasilan kembali ke tampilan utama
String rowInfo = WebUI.getText(findTestObject('Object Repository/Jadwal/Search-Rows/rows-_full'))

String getPartBeforeOf(String originalText) {
	if (originalText == null) {
		return null;
	}

	String lowerCaseText = originalText.toLowerCase();
	int indexOfOf = lowerCaseText.indexOf(" of ");

	if (indexOfOf != -1) {
		return originalText.substring(0, indexOfOf).trim();
	} else {
		return originalText;
	}
}

WebUI.verifyMatch(getPartBeforeOf(rowInfo), '11-20', false)

WebUI.delay(1)