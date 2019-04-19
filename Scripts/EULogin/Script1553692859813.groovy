import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ofmvipqa03.orpheusdev.net/Login')

WebUI.verifyElementAttributeValue(findTestObject('Page_Orpheus - ofmvipqa03 - ofmvipqa03/input_Username_UserName'), 'id', 
    'UserName', 0)

WebUI.setText(findTestObject('Page_Orpheus - ofmvipqa03 - ofmvipqa03/input_Username_UserName'), username)

WebUI.click(findTestObject('Object Repository/Page_Orpheus - ofmvipqa03 - ofmvipqa03/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Orpheus - ofmvipqa03 - ofmvipqa03 - Provide your password/input_Password_Password'), 
    password)

WebUI.click(findTestObject('Object Repository/Page_Orpheus - ofmvipqa03 - ofmvipqa03 - Provide your password/button_Continue'))

