package com.jetbrains.handson.mpp.mobile.experimental

// Global property.
actual val experimentalGlobalProperty = "android global property"

// Global function.
actual fun experimentalGlobalFunction(): String {
    return "android global function"
}

// Global class.
actual class ExperimentalGlobalEmptyClass {
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

// Global Annotation class.
actual annotation class ExperimentalAnnotationClass


/* Hierarchical elements. */

// Global class with fields.
actual class ExperimentalGlobalClass {
    actual val nestedProperty = 12
    actual fun nestedFunction(): String {
        return "android nested function"
    }

    actual class nestedClass {
        actual fun tooDeepFunction(): String {
            return "android too deep function"
        }
    }
}


/* Typealiases usage. */

// Global class with fields.
actual typealias ExperimentalTypealiasedClass = ExperimentalGlobalClass

// Typealiased object.
actual typealias ExperimentalTypealiasedObject = ExperimentalGlobalObject


