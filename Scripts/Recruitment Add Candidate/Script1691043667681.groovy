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

'Menunggu halaman dashboard sampai tampil'
WebUI.waitForElementVisible(findTestObject('Recruitment Add Candidates/label_dashboard'), 0)

'Memastikan halaman dashboard sudah tampil'
WebUI.verifyElementVisible(findTestObject('Recruitment Add Candidates/button_recruitmentMenu'))

'Menekan menu Recruitment'
WebUI.click(findTestObject('Recruitment Add Candidates/button_recruitmentMenu'))

'Melakukan screenshoot pada halaman Recruitment'
WebUI.takeScreenshot()

'Memastikan tombol add sudah tampil'
WebUI.verifyElementVisible(findTestObject('Recruitment Add Candidates/button_addCandidates'))

'Menekan tombol add'
WebUI.click(findTestObject('Recruitment Add Candidates/button_addCandidates'))

'Melakukan screenshoot pada halaman Add Candidate'
WebUI.takeScreenshot()

'Memastikan label firstname sudah tampil'
WebUI.verifyElementVisible(findTestObject('Recruitment Add Candidates/textbox_firstname'))

'Custom keyword untuk menjadikan awalan nama depan menjadi huruf kapital'
awal = CustomKeywords.'orangeHRM.addCandidate.firstname'('adira')

'menampilkan hasil dari nama depan yang sudah di custom keywrod'
println(awal)

'Melakukan screenshoot pada halaman add candidate yang sudah diisi'
WebUI.takeScreenshot()

'Memastikan label middlename sudah tampil'
WebUI.verifyElementVisible(findTestObject('Recruitment Add Candidates/textbox_middlename'))

'Custom keyword untuk menjadikan awalan nama tengah menjadi huruf kapital'
tengah = CustomKeywords.'orangeHRM.addCandidate.middlename'('multi')

'menampilkan hasil dari nama tengah yang sudah di custom keywrod'
println(tengah)

'Melakukan screenshoot pada halaman add candidate yang sudah diisi'
WebUI.takeScreenshot()

'Memastikan label lastname sudah tampil'
WebUI.verifyElementVisible(findTestObject('Recruitment Add Candidates/textbox_lastname'))

'Custom keyword untuk menjadikan awalan nama belakang menjadi huruf kapital'
akhir = CustomKeywords.'orangeHRM.addCandidate.lastname'('finance')

'menampilkan hasil dari nama belakang yang sudah di custom keywrod'
println(akhir)

'Melakukan screenshoot pada halaman add candidate yang sudah diisi'
WebUI.takeScreenshot()

'Menekan dropdown vacancy'
WebUI.click(findTestObject('Recruitment Add Candidates/dropdown_vacancy'))

'Menunggu pilihan dropdown vacancy sampai tampil'
WebUI.waitForElementVisible(findTestObject('Recruitment Add Candidates/dropdown_selectedVacancy'), 0)

'Menekan pilihan dropdown vacancy'
WebUI.click(findTestObject('Recruitment Add Candidates/dropdown_selectedVacancy'))

'Memastikan label email sudah tampil'
WebUI.verifyElementVisible(findTestObject('Recruitment Add Candidates/textbox_email'))

'Memasukan email'
WebUI.setText(findTestObject('Recruitment Add Candidates/textbox_email'), 'ayufitriani@adira.com')

'Memastikan label no telepon sudah tampil'
WebUI.verifyElementVisible(findTestObject('Recruitment Add Candidates/textbox_phone'))

'Custom keyword untuk menjadikan ni telepon setelah 08 adalah angka random dengan jumlah angka selanjutnya setelah 08 berdasarkan dari inputan'
jumlah = CustomKeywords.'orangeHRM.addCandidate.generateRandomPhoneNumber'(11)

'menampilkan hasil dari no telepon yang sudah di custom keyword'
println(jumlah)

'Melakukan screenshoot pada halaman add candidate yang sudah diisi'
WebUI.takeScreenshot()

'Memastikan label keyword sudah tampil'
WebUI.verifyElementVisible(findTestObject('Recruitment Add Candidates/textbox_keywords'))

'Memasukan keyword'
WebUI.setText(findTestObject('Recruitment Add Candidates/textbox_keywords'), '')

'Memastikan label notes sudah tampil'
WebUI.verifyElementVisible(findTestObject('Recruitment Add Candidates/textbox_notes'))

'Custom keyword untuk menjadikan notes menjadi huruf kapital semua'
note = CustomKeywords.'orangeHRM.addCandidate.notes'('ini adalah candidate bernama adira multi finance')

'menampilkan hasil dari notes yang sudah di custom keyword'
println(note)

'Melakukan screenshoot pada halaman add candidate yang sudah diisi'
WebUI.takeScreenshot()

'Menekan checkbox consent'
WebUI.check(findTestObject('Recruitment Add Candidates/checkbox_consent'))

'Melakukan screenshoot pada halaman add candidate yang sudah diisi'
WebUI.takeScreenshot()

'Memastikan tombol save sudah tampil'
WebUI.verifyElementVisible(findTestObject('Recruitment Add Candidates/button_save'))

'Memastikan tombol save enable untuk ditekan'
WebUI.verifyElementClickable(findTestObject('Recruitment Add Candidates/button_save'))

'Menekan tombol save'
WebUI.click(findTestObject('Recruitment Add Candidates/button_save'))

'Melakukan screenshoot pada halaman setelah berhasil add candidate'
WebUI.takeScreenshot()

'Menutup browser'
WebUI.closeBrowser()

