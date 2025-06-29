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

'klik tombbol \'tambahkan\''
WebUI.click(findTestObject('Object Repository/Jadwal/Tambah Jadwal/Hari Kerja/Daftar Jadwal/button_Tambahkan'))

'klik tombol dropdown pada tipe jadwal'
WebUI.click(findTestObject('Jadwal/Tipe_Jadwal Option/dropdown tipe jadwal'))

WebUI.delay(1)

'pilih dropdown tipe jadwal'
WebUI.click(findTestObject('Jadwal/Tipe_Jadwal Option/option Jadwal kerja tetap'))

WebUI.delay(1)

// Fokus ke input date-nya
'klik kolom tanggal'
WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Alert/input_Tanggal Effective'))

// Select all isi dari input (Ctrl + A)
'select kolom tanggal menggunakan CONTROL+A'
WebUI.sendKeys(findTestObject('Jadwal/Tambah Jadwal/Alert/input_Tanggal Effective'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.delay(1)

// Hapus isinya (Delete)
'hapus isi kolom tanggal menggunakan Space'
WebUI.sendKeys(findTestObject('Jadwal/Tambah Jadwal/Alert/input_Tanggal Effective'), Keys.chord(Keys.BACK_SPACE))

// (Opsional) Jika ingin ganti dengan tanggal baru:
'isi tanggal baru'
WebUI.sendKeys(findTestObject('Jadwal/Tambah Jadwal/Alert/input_Tanggal Effective'), '02/12/2027')

WebUI.delay(1)

WebUI.setText(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/input_NamaJadwal'), '2testingkel')

WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/btn_HariKerja'))

'klik untuk mengisi hari senin'
WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/input_HariSenin'))

WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/Daftar Jadwal/IT Support'))

'klik untuk mengisi hari selasa'
WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/input_HariSelasa'))

WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/Daftar Jadwal/IT Support'))

'klik untuk mengisi hari rabu'
WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/input_HariRabu'))

WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/Daftar Jadwal/Security Shift Malam'))

'klik untuk mengisi hari kamis'
WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/input_HariKamis'))

WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/Daftar Jadwal/Security Shift Malam'))

'klik untuk mengisi hari juumat'
WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/input_HariJumat'))

WebUI.click(findTestObject('Jadwal/Tambah Jadwal/Hari Kerja/Daftar Jadwal/Shift Pagi (BCA Jaktim)'))

WebUI.delay(1)

WebUI.click(findTestObject('Jadwal/Tambah Jadwal/button_Terapkan'))

'masukan toleransi keterlambatan'
WebUI.setText(findTestObject('Jadwal/Tambah Jadwal/input_ToleransiKeterlambatan'), '1')

WebUI.click(findTestObject('Jadwal/Delete-Update-View/Page_View/button_Batal'))

'Validasi ulang halaman jadwall setelah klik batal'
WebUI.verifyElementPresent(findTestObject('Jadwal/Tipe_Jadwal Option/Page_HADIR/th_NAMA'), 0)

WebUI.comment('✅ Vallidasi ulang halaman Jadwal.')

WebUI.delay(1)

WebUI.closeBrowser()

