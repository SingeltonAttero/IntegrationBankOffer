package com.yakow.moduleintegration

import com.yakow.modulea.IntegrationService
import com.yakow.moduleb.FeatureServiceMetric

/**
 * Прокси для доступа
 */
internal class BankIntegrationImpl : BankIntegration {

    /**
     * @author Yakow
     * @return
     * */
    override fun logService(): IntegrationService {
        return IntegrationService.newServiceLog()
    }

    override fun metricsService(): FeatureServiceMetric {
        return FeatureServiceMetric.newFeature()
    }


}