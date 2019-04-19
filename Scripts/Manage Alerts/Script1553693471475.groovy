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

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/div_Messages  Alerts'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/div_Manage Alerts'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/span_Secure Message Alert_toggle__switch'))

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/span_Name of alert type Change in Contact Info Alert'))

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/span_Email'))

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/button_Save changes'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/label_Email'))

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/button_Save changes'))

WebUI.doubleClick(findTestObject('Object Repository/Messages/Page_Dashboard/div_Transaction Size Alert          Transaction Size Alert            Add another Transaction Size Alert         Save changes   Cancel'))

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/span_Transaction Size Alert_icon icon-nav-arrow-right'))

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/span_Add another Transaction Size Alert'))

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/label_Below'))

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/span_Income and Expenses'))

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/li_Just Expense'))

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/label_Specific source'))

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/span_Check'))

WebUI.click(findTestObject('Object Repository/Messages/Page_Dashboard/button_Save changes'))

