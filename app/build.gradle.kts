plugins {
    id(com.aej.buildsrc.Plugins.androidApplication)
    id(com.aej.buildsrc.Plugins.kotlinAndroid)
}

android {
    compileSdk = (com.aej.buildsrc.DefaultConfig.compileSdk)

    defaultConfig {
        applicationId = (com.aej.buildsrc.DefaultConfig.applicationId)
        minSdk = (com.aej.buildsrc.DefaultConfig.minSdk)
        targetSdk = (com.aej.buildsrc.DefaultConfig.targetSdk)
        versionCode = (com.aej.buildsrc.DefaultConfig.versionCode)
        versionName = (com.aej.buildsrc.DefaultConfig.versionName)

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = rootProject.extra["compose_version"] as String
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(com.aej.buildsrc.Android.coreKtx)
    implementation(com.aej.buildsrc.Android.lifecycleRuntimeKtx)
    implementation(com.aej.buildsrc.Android.Compose.composeUi)
    implementation(com.aej.buildsrc.Android.Compose.composeMaterial)
    implementation(com.aej.buildsrc.Android.Compose.composeUiTooling)
    implementation(com.aej.buildsrc.Android.Compose.composeUiToolingPreview)
    implementation(com.aej.buildsrc.Android.Compose.activityCompose)
    implementation(com.aej.buildsrc.Android.TestLibs.junit)
    implementation(com.aej.buildsrc.Android.TestLibs.extJunit)
    implementation(com.aej.buildsrc.Android.TestLibs.espressoCore)
    implementation(com.aej.buildsrc.Android.TestLibs.uiTestJunit)
    implementation(com.aej.buildsrc.Android.TestLibs.uiTestManifest)
}