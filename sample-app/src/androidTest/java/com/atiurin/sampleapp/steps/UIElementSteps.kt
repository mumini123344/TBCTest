package com.atiurin.sampleapp.steps


import android.util.Log
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.data.Data.friendName
import com.atiurin.sampleapp.data.Data.greetingChatText
import com.atiurin.sampleapp.helper.isTextOnScreen
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.UIElementPage
import com.atiurin.ultron.core.espresso.UltronEspresso.closeSoftKeyboard
import com.atiurin.ultron.extensions.perform
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText


object UIElementSteps{


    fun isDashboardLoaded(){
        with(UIElementPage){
            recyclerFriends.isViewDisplayed()
            Log.d("AssertionLog","Friends list is displayed")

        }
    }

    fun openChat() {
        with(UIElementPage) {
            nameRoss.isViewDisplayed()
            nameRoss.tap()
        }
    }


    fun enterText(text: String) {
        with(UIElementPage) {
            textInput.typeText(text)
        }
    }

    fun sendText(){
        with(UIElementPage){
            sendButton.tap()
            messageInputText.isViewDisplayed()
            closeSoftKeyboard()
        }
    }

    fun isChatCorrect(){
        with(UIElementPage){
//            name.assertIsViewDisplayed()
//            nameRoss.isViewDisplayed()
            Espresso.onView(ViewMatchers.withId(R.id.toolbar_title))
                .check(ViewAssertions.matches(ViewMatchers.withText(friendName)))
            Log.d("AssertionLog","Assertion is completed '$friendName'")
        }
    }

//    fun checkEnteredText(){
//        with(UIElementPage){
//            isTextOnScreen(greetingChatText)
//            Log.d("AssertionLog", "Text is on screen '$greetingChatText'")
//        }
//    }

    fun isSentTextCorrect() {
        with(UIElementPage) {
            sentText.matches(ViewMatchers.withText(greetingChatText))
            Log.d("AssertionLog", "Text is on screen '$greetingChatText'")
        }
    }





}