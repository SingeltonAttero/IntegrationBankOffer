package com.yakow.moduleb

import android.util.Log

/**
 * Реализация метрик
 */
internal class FeatureMetric : FeatureServiceMetric {

    override fun metrics() {
        Log.d("integration", "metrics successful")
    }

}