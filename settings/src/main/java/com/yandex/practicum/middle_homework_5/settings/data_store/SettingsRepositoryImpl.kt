package com.yandex.practicum.middle_homework_5.settings.data_store

import com.yandex.practicum.middle_homework_5.settings.ui.contract.SettingsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SettingsRepositoryImpl : SettingsRepository {

    override val settingData: StateFlow<SettingContainer> = MutableStateFlow(SettingContainer(0, 0))

    override suspend fun saveSetting(periodic: Long, delayed: Long) {
        (settingData as MutableStateFlow).value = SettingContainer(periodic, delayed)
    }
}
