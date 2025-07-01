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

WebUI.click(findTestObject('AturanCuti/Tambah/Nama Aturan Cuti_field'))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Nama Aturan Cuti_field'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Nama Aturan Cuti_field'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Nama Aturan Cuti_field'), 'Aturan Cuti Tahunan')

WebUI.click(findTestObject('AturanCuti/Tambah/Eligible Pengaturan Cuti (Bulan)_field'))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Eligible Pengaturan Cuti (Bulan)_field'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Eligible Pengaturan Cuti (Bulan)_field'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Eligible Pengaturan Cuti (Bulan)_field'), '1')

WebUI.click(findTestObject('AturanCuti/Tambah/Tanggal Batas Sisa Cuti_field'))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Tanggal Batas Sisa Cuti_field'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Tanggal Batas Sisa Cuti_field'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/AturanCuti/Tambah/Tanggal Batas Sisa Cuti_field'), '1')

WebUI.click(findTestObject('AturanCuti/Tambah/Bulan Batas Sisa Cuti_field'))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Bulan Batas Sisa Cuti_field'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Bulan Batas Sisa Cuti_field'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/AturanCuti/Tambah/Bulan Batas Sisa Cuti_field'), '1')

WebUI.click(findTestObject('AturanCuti/Tambah/Maksimal Sisa Cuti_field'))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Maksimal Sisa Cuti_field'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Maksimal Sisa Cuti_field'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/AturanCuti/Tambah/Maksimal Sisa Cuti_field'), '1')

WebUI.click(findTestObject('AturanCuti/Tambah/Jumlah Bulan Kerja Sisa Cuti_field'))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Jumlah Bulan Kerja Sisa Cuti_field'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Jumlah Bulan Kerja Sisa Cuti_field'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('AturanCuti/Tambah/Jumlah Bulan Kerja Sisa Cuti_field'), '1')

WebUI.click(findTestObject('AturanCuti/Tambah/button_Tambahkan'))

WebUI.verifyTextPresent('Sukses Membuat', true)

