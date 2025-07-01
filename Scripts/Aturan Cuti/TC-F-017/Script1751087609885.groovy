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

WebUI.navigateToUrl('https://magang.dikahadir.com/management/unit-leave')

WebUI.click(findTestObject('AturanCuti/Delete-Edit-View/Page_Edit/svg_Aksi_feather feather-more-vertical'))

WebUI.waitForElementVisible(findTestObject('AturanCuti/Delete-Edit-View/Page_View/li_View'), 5)

WebUI.click(findTestObject('AturanCuti/Delete-Edit-View/Page_View/li_View'))

WebUI.click(findTestObject('AturanCuti/Delete-Edit-View/Page_View/button_Tambahkan Detail Aturan Cuti'))

WebUI.setText(findTestObject('AturanCuti/Delete-Edit-View/Page_View/input_Minimal Bulan Bekerja_total_month_greater'), '12')

WebUI.setText(findTestObject('AturanCuti/Delete-Edit-View/Page_View/input_Total Cuti_total_leave'), '14')

WebUI.click(findTestObject('AturanCuti/Delete-Edit-View/Page_View/button_Tambahkan'))

WebUI.verifyTextPresent('Sukses', true)

