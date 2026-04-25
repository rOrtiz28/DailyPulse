package com.petros.efthymiou.dailypulse

import android.content.res.Resources
import android.os.Build
import android.os.Build.VERSION.SDK_INT
import android.util.Log
import kotlin.math.round


actual class Platform {
    actual val osName: String
        get() = "Android"
    actual val osVersion: String
        get() = "${SDK_INT}"
    actual val deviceModel: String
        get() = "${Build.MANUFACTURER} ${Build.MODEL}"
    actual val density: Int
        get() = round(Resources.getSystem().displayMetrics.density).toInt()

    actual fun logSystemInfo() {
        Log.d(
            "Daily Pulse",
            "($osName, $osVersion, $deviceModel, $density)"
        )
    }
}