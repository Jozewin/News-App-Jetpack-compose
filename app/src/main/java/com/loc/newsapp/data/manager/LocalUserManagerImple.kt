package com.loc.newsapp.data.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.loc.newsapp.domain.manager.LocalUserManager
import com.loc.newsapp.util.Constants
import com.loc.newsapp.util.Constants.USER_SETTINGS
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class LocalUserManagerImple(
    private val context : Context
) : LocalUserManager {
    override suspend fun saveAppEntry() {
        context.dataStore.edit {settings ->
            settings[PreferencesKeys.APP_ENTRY] = true
        }
    }

    override  fun readAddEntry(): Flow<Boolean> {
        return context.dataStore.data.map {preferences ->
            preferences[PreferencesKeys.APP_ENTRY]?:false
        }
    }
}

private val readOnlyProperty  = preferencesDataStore(name = USER_SETTINGS)

val Context.dataStore: DataStore<Preferences> by readOnlyProperty

private object PreferencesKeys {
    val APP_ENTRY = booleanPreferencesKey(Constants.APP_ENTRY)
}