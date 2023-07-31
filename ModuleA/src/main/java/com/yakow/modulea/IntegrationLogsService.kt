package com.yakow.modulea

import android.util.Log

/**
 * Общая реализация системы логирования
 */
internal class IntegrationLogsService : IntegrationService {
    override fun testA() {
        Log.d("integration", "integration success")
    }
}