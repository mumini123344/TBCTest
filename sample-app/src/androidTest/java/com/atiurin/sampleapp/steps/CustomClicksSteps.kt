package com.atiurin.sampleapp.steps



import com.atiurin.sampleapp.pages.CustomClicksPage
import com.atiurin.ultron.extensions.tap


object CustomClicksSteps {

    fun tapBurgerMenu() {
        with(CustomClicksPage) {
            mainManuBtn.tap()

        }

    }





}