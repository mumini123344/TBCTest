package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers


object CustomClicksPage {
    val mainManuBtn: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.toolbar)) }
    val customClicksNav: Matcher<View> by lazy {
        Matchers.allOf(ViewMatchers.withId(R.id.custom_clicks_nav_item))
    }
    val imageView: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.imageView)) }
    val bottomLeft: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.rB_bottom_left)) }
    val topLeft: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.rB_top_left)) }
    val topRight: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.rB_top_right)) }
    val bottomRight: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.rB_bottom_right)) }


}