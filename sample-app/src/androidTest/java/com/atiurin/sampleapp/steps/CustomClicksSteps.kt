package com.atiurin.sampleapp.steps


import android.util.Log
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.CustomClicksPage
import com.atiurin.ultron.extensions.clickTopLeft
import com.atiurin.ultron.extensions.tap


object CustomClicksSteps {


    fun tapBurgerMenu() {
        with(CustomClicksPage) {
            mainManuBtn.clickTopLeft()
        }
    }

    fun tapCustomClicksNav() {
        with(CustomClicksPage) {
            customClicksNav.tap()
        }
    }

    fun isCustomClickPageDisplayed() {
        with(CustomClicksPage) {
            imageView.isViewDisplayed()
            Log.d("AssertionLog", "View is displayed")
        }
    }

    fun tapBottomLeft() {
        with(CustomClicksPage) {
            bottomLeft.tap()
        }
    }

    fun tapTopLeft() {
        with(CustomClicksPage) {
            topLeft.tap()
        }
    }

    fun tapTopRight() {
        with(CustomClicksPage) {
            topRight.tap()
        }
    }

    fun tapBottomRight() {
        with(CustomClicksPage) {
            bottomRight.tap()
        }
    }

    fun checkboxes() {
        with(CustomClicksPage) {
            val checkboxCorners = arrayOf(
                bottomLeft,
                topLeft,
                topRight,
                bottomRight
            )

            for (i in checkboxCorners) {
                i.tap()
                val isChecked = i.isChecked()
                require(isChecked) {
                    "Checkbox should be checked"
                }

                if (isChecked) {
                    println("Checkbox is checked")
                } else {
                    println("Checkbox is not checked")
                }
            }

            Log.d("AssertionLog", "All Checkboxes are checked")
        }


    }

}




