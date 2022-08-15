package com.aej.buildsrc

object Plugins {
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
}

object DefaultConfig {
    const val applicationId = "com.aej.starter"
    const val compileSdk = 32
    const val minSdk = 23
    const val targetSdk = 32
    const val versionCode = 1
    const val versionName = "1.0"
}

object Kotlin {

}

object Android {

    private const val composeVersion = "1.2.0"

    private const val coreKtxVersion = "1.7.0"
    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
    const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.1"

    object Compose {
        const val composeUi = "androidx.compose.ui:ui:$composeVersion"
        const val composeMaterial = "androidx.compose.material:material:$composeVersion"
        const val composeUiTooling = "androidx.compose.ui:ui-tooling:$composeVersion"
        const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
        const val activityCompose = "androidx.activity:activity-compose:1.4.0"
    }

    object TestLibs {
        const val junit = "junit:junit:4.13.2"
        const val extJunit = "androidx.test.ext:junit:1.1.3"
        const val espressoCore = "androidx.test.espresso:espresso-core:3.4.0"
        const val uiTestJunit = "androidx.compose.ui:ui-test-junit4:$composeVersion"
        const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$composeVersion"
    }

    object Network {
        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val retrofitAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2"
        const val okhttp = "com.squareup.okhttp3:okhttp:4.10.0"
        const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.10.0"
        const val moshi = "com.squareup.moshi:moshi:1.13.0"
        const val chuckerDebug = "com.github.chuckerteam.chucker:library:3.5.2"
        const val chuckerRelease = "com.github.chuckerteam.chucker:library-no-op:3.5.2"
    }

    object Database {
        private const val roomVersion = "2.4.3"
        const val room = "androidx.room:room-ktx:$roomVersion"
        const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
        const val roomKtx = "androidx.room:room-ktx:$roomVersion"
    }

    object ReactiveX {
        private const val coroutinesVersion = "2.4.3"
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
    }

    object DI {
        private const val daggerVersion = "2.18"
        const val dagger = "com.google.dagger:dagger:$daggerVersion"
        const val coroutinesCore = "com.google.dagger:dagger-compiler:$daggerVersion"
    }

    object Logger {
        private const val timberVersion = "4.7.1"
        const val timber = "com.jakewharton.timber:timber:$timberVersion"
    }

}