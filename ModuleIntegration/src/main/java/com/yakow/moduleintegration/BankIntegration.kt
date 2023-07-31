package com.yakow.moduleintegration

import com.yakow.modulea.IntegrationService
import com.yakow.moduleb.FeatureServiceMetric

/**
 * Общие сервисы
 */
interface BankIntegration {
    fun logService(): IntegrationService

    fun metricsService(): FeatureServiceMetric


    companion object {
        /**
         * Доступ к общим сервисам
         **/
        val integrator: BankIntegration = BankIntegrationImpl()
    }
}