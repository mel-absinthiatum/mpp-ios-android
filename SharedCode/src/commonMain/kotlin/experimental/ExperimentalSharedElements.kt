package com.jetbrains.handson.mpp.mobile.experimental

/* Global plain elements. */

// Global property.
expect val experimentalGlobalProperty: String

// Global function.
expect fun experimentalGlobalFunction(): String

// Global class.
expect class ExperimentalGlobalEmptyClass

// Global object.
expect object ExperimentalGlobalObject

// Global Annotation class.
expect annotation class ExperimentalAnnotationClass


/* Different file. */

// Different file global property.
expect val experimentalDifferentFileProperty: String


/* Hierarchical elements. */

// Global class with fields.
expect class ExperimentalGlobalClass {
    val nestedProperty: Int
    fun nestedFunction(): String

    class nestedClass {
        fun tooDeepFunction(): String
    }
}


/* Typealiases usage. */

// Typealiased class with fields.
expect class ExperimentalTypealiasedClass {
    val nestedProperty: Int
    fun nestedFunction(): String

    class nestedClass {
        fun tooDeepFunction(): String
    }
}

// Typealiased object.
expect object ExperimentalTypealiasedObject