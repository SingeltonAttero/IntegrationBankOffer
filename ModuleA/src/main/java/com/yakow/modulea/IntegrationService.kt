package com.yakow.modulea

/**
 * Банковская система логирования для все приложения
 */
interface IntegrationService {
    fun testA()

    companion object {
        /**
         * Создания нового сервиса для интеграции
         * */
        fun newServiceLog(): IntegrationService = IntegrationLogsService()
    }
}