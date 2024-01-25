package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.CoreMatchers
import org.hamcrest.Matcher
import org.hamcrest.Matchers


object CustomClicksPage {


    val mainManuBtn: Matcher<View> by lazy {
        Matchers.allOf(
            ViewMatchers.withId(R.id.toolbar),
            ViewMatchers.withClassName(CoreMatchers.`is`("android.widget.ImageButton"))
        )


    }


}