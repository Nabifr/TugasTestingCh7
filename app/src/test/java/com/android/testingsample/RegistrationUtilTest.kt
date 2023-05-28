package com.android.testingsample

import org.junit.Assert.*
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun validUsernameAndCorrectlyRepeated_return_true() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Reno",
            "12",
            "12"
        )
        assertEquals("ok", result, true)
    }

    @Test
    fun usernameEmpty(){
        val user = "qwerty"
        val result = RegistrationUtil.validateRegistrationInput(user, "1234", "1234")
        assertEquals("oke", result, true)
    }

    @Test
    fun existingUsername(){
        val user = "Bahram"
        val result = RegistrationUtil.validateRegistrationInput(user, "1234", "1234")
        assertEquals("usernameexist", result, true)
    }
}