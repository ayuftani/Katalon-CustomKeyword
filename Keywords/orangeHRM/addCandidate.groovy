package orangeHRM

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.util.Random

import internal.GlobalVariable

public class addCandidate {

	@Keyword
	def firstname(String firstname){
		if (firstname) {
			String first = firstname.capitalize()
			WebUI.setText(findTestObject('Object Repository/Recruitment Add Candidates/textbox_firstname'), first)
			return first
		}
	}

	@Keyword
	def middlename(String middlename){
		if (middlename) {
			String middle = middlename.capitalize()
			WebUI.setText(findTestObject('Object Repository/Recruitment Add Candidates/textbox_middlename'), middle)
			return middle
		}
	}

	@Keyword
	def lastname(String lastname){
		if (lastname) {
			String last = lastname.capitalize()
			WebUI.setText(findTestObject('Object Repository/Recruitment Add Candidates/textbox_lastname'), last)
			return last
		}
	}

	@Keyword
	def generateRandomPhoneNumber(int jumlahangka) {
		def random = new Random()
		String phoneNumber = "08"

		if (jumlahangka >= 8 && jumlahangka <= 11) {
			for (int i = 0; i < jumlahangka; i++) {
				phoneNumber += random.nextInt(10).toString()
			}
			WebUI.setText(findTestObject('Object Repository/Recruitment Add Candidates/textbox_phone'), phoneNumber);
		} else {
			println('no telepon tidak valid')
		}
		return phoneNumber
	}

	@Keyword
	def notes(String notes){
		if (notes) {
			String kalimat = notes.toUpperCase()
			WebUI.setText(findTestObject('Object Repository/Recruitment Add Candidates/textbox_notes'), kalimat)
			return kalimat
		}
	}
}

