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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

WebUI.setText(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_HADIR/input_Email_email'), 'admin@hadir.com')

WebUI.setEncryptedText(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_HADIR/input_Password_password'), 'KQScaJbfjNMJXZCQ/auLWFkJtbSG6Xl8')

WebUI.click(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_HADIR/button_Masuk'))

WebUI.click(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_HADIR/button_A_MuiButtonBase-root MuiIconButton-r_496560'))

WebUI.click(findTestObject('Sidebar/p_Management'))

WebUI.click(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_HADIR/p_Aturan Cuti'))

WebUI.click(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_Aturan Cuti/div_Logout_MuiBackdrop-root MuiModal-backdr_bf49d3'))

WebUI.click(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_Aturan Cuti/button_Aksi_MuiButtonBase-root MuiIconButto_5ee4e8'))

WebUI.click(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_Aturan Cuti/li_Edit'))

WebUI.setText(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_Aturan Cuti/input_Nama Aturan Cuti_name'), 'Aturan Dummy Edit Total')

WebUI.setText(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_Aturan Cuti/input_Eligible Pengaturan Cuti (Bulan)_elig_9860f4'), 
    '12')

WebUI.setText(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_Aturan Cuti/input_Tanggal Batas Sisa Cuti_mui-9'), 
    '3')

WebUI.setText(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_Aturan Cuti/input_Bulan Batas Sisa Cuti_mui-10'), 
    '3')

WebUI.setText(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_Aturan Cuti/input_Maksimal Sisa Cuti_max_carry_forward'), 
    '3')

WebUI.setText(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_Aturan Cuti/input_Jumlah Bulan Kerja Sisa Cuti_carry_fo_08b2bb'), 
    '3')

WebUI.click(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_Aturan Cuti/button_Simpan'))

WebUI.click(findTestObject('Object Repository/AturanCuti/TC-F-011/Page_Aturan Cuti/div_Sukses Mengubah Aturan Cuti'))

WebUI.closeBrowser()

