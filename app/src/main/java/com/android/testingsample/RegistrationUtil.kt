package com.android.testingsample

object RegistrationUtil {

    private val existingUsers = listOf("Behroz", "Bahram", "Raika")

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2){
            return false
        }
        return true
    }
}