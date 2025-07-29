package com.example.data.utils

import android.content.Context
import android.content.SharedPreferences

object SharedPreferencesUtils {

    private const val PREF_NAME = "app_preferences"
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    fun saveBoolean(key: String, value: Boolean) {
        preferences.edit().putBoolean(key, value).apply()
    }

    fun getBoolean(key: String, defaultValue: Boolean = false): Boolean {
        return preferences.getBoolean(key, defaultValue)
    }

    fun clear() {
        preferences.edit().clear().apply()
    }

    fun remove(key: String) {
        preferences.edit().remove(key).apply()
    }
}
