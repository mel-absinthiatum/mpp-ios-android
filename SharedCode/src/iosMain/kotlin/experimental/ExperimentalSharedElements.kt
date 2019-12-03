package com.jetbrains.handson.mpp.mobile.experimental

// Global property.
actual val experimentalGlobalProperty = "ios global property"

// Global function.
actual fun experimentalGlobalFunction(): String {
    return "ios global function"
}

// Global class.
actual class ExperimentalGlobalClass {
    override fun toString(): String {
        return "ios global class"
    }
}

// Global object.
actual object ExperimentalGlobalObject {
    override fun toString(): String {
        return "ios global object"
    }
}