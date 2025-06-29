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

'klik burger dot disebelah tanggall efektif'
WebUI.click(findTestObject('Jadwal/Delete-Update-View/Page_View/View_option'))

'klilk delette option'
WebUI.click(findTestObject('Jadwal/Delete-Update-View/Page_View/Edit_option'))

WebUI.verifyElementPresent(findTestObject('Jadwal/Delete-Update-View/Page_EditJadwal/h2_Edit Data Jadwal'), 0)

WebUI.click(findTestObject('Jadwal/Delete-Update-View/Page_EditJadwal/input_Nama Jadwal Kerja'))

'select kolom Nama Jadwal menggunakan CONTROL+A'
WebUI.sendKeys(findTestObject('Jadwal/Delete-Update-View/Page_EditJadwal/input_Nama Jadwal Kerja'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.delay(1)

// Hapus isinya (Delete)
'hapus isi kolom Nama Jadwal menggunakan Space'
WebUI.sendKeys(findTestObject('Jadwal/Delete-Update-View/Page_EditJadwal/input_Nama Jadwal Kerja'), Keys.chord(Keys.BACK_SPACE))

// (Opsional) Jika ingin ganti dengan tanggal baru:
'isi Nama Jadwal baru'
WebUI.sendKeys(findTestObject('Jadwal/Delete-Update-View/Page_EditJadwal/input_Nama Jadwal Kerja'), '2newtesting1')

WebUI.delay(1)

WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/btn_HariKerja'))

'klik untuk mengisi hari senin'
WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/input_HariSenin'))

WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/Daftar Jadwal/Security Shift Malam'))

WebUI.click(findTestObject('Jadwal/Tambah Jadwal/button_Terapkan'))

WebUI.delay(1)

WebUI.click(findTestObject('Jadwal/Delete-Update-View/Page_EditJadwal/input_Toleransi Keterlambatan'))

'select kolom Nama Jadwal menggunakan CONTROL+A'
WebUI.sendKeys(findTestObject('Jadwal/Delete-Update-View/Page_EditJadwal/input_Toleransi Keterlambatan'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.delay(1)

// Hapus isinya (Delete)
'hapus isi kolom Nama Jadwal menggunakan Space'
WebUI.sendKeys(findTestObject('Jadwal/Delete-Update-View/Page_EditJadwal/input_Toleransi Keterlambatan'), Keys.chord(Keys.BACK_SPACE))

'isi Nama Jadwal baru'
WebUI.sendKeys(findTestObject('Jadwal/Delete-Update-View/Page_EditJadwal/input_Toleransi Keterlambatan'), '20')

WebUI.click(findTestObject('Jadwal/Delete-Update-View/Page_View/Edit_Simpan'))

// validasi disini akan mengubah nama dan search by nama yang telah diubah, yang berarti pengeditan disimpan
'Validasi ulang halaman jadwall setelah klik simpan'
WebUI.verifyElementPresent(findTestObject('Jadwal/Tipe_Jadwal Option/Page_HADIR/th_NAMA'), 0)

WebUI.comment('✅ Vallidasi ulang halaman Jadwal.')

WebUI.setText(findTestObject('Jadwal/Search-Rows/field_Search'), '2newtesting1')

WebUI.click(findTestObject('Jadwal/Search-Rows/button_Search'))

WebUI.delay(1)

