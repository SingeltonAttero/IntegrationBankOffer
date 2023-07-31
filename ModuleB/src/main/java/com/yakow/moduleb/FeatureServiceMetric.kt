package com.yakow.moduleb


/**
 * Общие метрики приложения
 * */
interface FeatureServiceMetric {
    fun metrics()

    companion object {
        /*
        * Интеграция
        * */
        fun newFeature(): FeatureServiceMetric = FeatureMetric()
    }
}