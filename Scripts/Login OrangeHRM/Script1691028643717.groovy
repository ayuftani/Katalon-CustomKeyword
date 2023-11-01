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

'Membuka Browser'
WebUI.openBrowser('')

'Mengakses website OrangeHRM'
WebUI.navigateToUrl(GlobalVariable.url)

'Melakukan maximize windows browser yang sedang dibuka'
WebUI.maximizeWindow()

'Melakukan screenshoot pada halaman Login'
WebUI.takeScreenshot()

'Memastikan label username sudah tampil'
WebUI.verifyElementVisible(findTestObject('Login OrangeHRM/textbox_username'))

'Mengisi username'
WebUI.setText(findTestObject('Login OrangeHRM/textbox_username'), GlobalVariable.username)

'Memastikan label password sudah tampil'
WebUI.verifyElementVisible(findTestObject('Login OrangeHRM/textbox_password'))

'Mengisi password'
WebUI.setText(findTestObject('Login OrangeHRM/textbox_password'), GlobalVariable.password)

'Melakukan screenshoot pada halaman Login yang sudah diisi'
WebUI.takeScreenshot()

'Memastikan tombol login sudah tampil'
WebUI.verifyElementVisible(findTestObject('Login OrangeHRM/button_login'))

'Memastikan tombol login enable untuk di klik '
WebUI.verifyElementClickable(findTestObject('Login OrangeHRM/button_login'))

'Menekan tombol login'
WebUI.click(findTestObject('Login OrangeHRM/button_login'))

'Melakukan screenshoot pada halaman setelah melakukan login'
WebUI.takeScreenshot()

