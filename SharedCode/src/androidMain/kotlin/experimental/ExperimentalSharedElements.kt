package com.jetbrains.handson.mpp.mobile.experimental

// Global property.
actual val experimentalGlobalProperty = "android global property"

// Global function.
actual fun experimentalGlobalFunction(): String {
    return "android global function"
}

// Global class.
actual class ExperimentalGlobalClass {
    override fun toString(): String {
        return "android global class"
    }
}

// Global object.
actual object ExperimentalGlobalObject {
    override fun toString(): String {
        return "android global object"
    }
}