package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object UIElementPage {


    val nameRoss: Matcher<View> by lazy {
        Matchers.allOf(
            withId(R.id.tv_name),
            withText("Ross Geller")
        )
    }
    val messageInputText: Matcher<View> by lazy {
        Matchers.allOf(
            withId(R.id.message_input_text),
            withText("Enter text")
        )
    }
    val textInput: Matcher<View> by lazy { Matchers.allOf(withId(R.id.message_input_text)) }
    val sendButton: Matcher<View> by lazy { Matchers.allOf(withId(R.id.send_button)) }


    val sentText: Matcher<View> by lazy { Matchers.allOf(withId(R.id.message_text)) }
    val recyclerFriends: Matcher<View> by lazy { Matchers.allOf(withId(R.id.recycler_friends)) }


}