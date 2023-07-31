package com.yakow.integrationbankoffer

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.yakow.moduleintegration.BankIntegration

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BankIntegration.integrator.logService().testA()
        BankIntegration.integrator.metricsService().metrics()

    }
}
