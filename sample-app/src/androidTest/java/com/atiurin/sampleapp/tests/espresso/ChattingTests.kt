package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.Data.greetingChatText
import com.atiurin.sampleapp.data.Data.screenText
import com.atiurin.sampleapp.helper.isTextOnScreen
import com.atiurin.sampleapp.steps.CustomClicksSteps
import com.atiurin.sampleapp.steps.UIElementSteps
import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests : BaseTest() {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)


    @Before
    fun beforeTest() {
        with(UIElementSteps) {
            isDashboardLoaded()
        }

    }

    @Test
    fun textWithMyFriend() {
        with(UIElementSteps) {
            isTextOnScreen(screenText)
            openChat()
            isChatCorrect()
            enterText(greetingChatText)
            isChatCorrect()
            sendText()
            isSentTextCorrect()
            Thread.sleep(5000)

        }
    }

//    @Test
//    fun customClicksTest() {
//        with(CustomClicksSteps){
//            tapBurgerMenu()
//        }




//    }


}