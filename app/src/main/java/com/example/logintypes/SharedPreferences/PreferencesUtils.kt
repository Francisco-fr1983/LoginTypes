package com.example.logintypes.SharedPreferences

import android.content.Context

class PreferencesUtils(context: Context) {
    val prefs = context.getSharedPreferences(KEY_email, Context.MODE_PRIVATE)

    companion object {
        const val KEY_email = "com.example.logintypes"
        const val Default = 0
    }
    fun loadEmail() : Int {
        return prefs.getInt(KEY_email, Default)
    }
    fun saveEmail(email: Int?) {
        with(prefs.edit()) {
            putInt(KEY_email, email ?: 0)
            commit()
        }
    }
}