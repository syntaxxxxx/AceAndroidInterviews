plugins {
    id(com.aej.buildsrc.Plugins.androidLibrary)
    id(com.aej.buildsrc.Plugins.kotlinAndroid)
}

android {
    compileSdk = (com.aej.buildsrc.DefaultConfig.compileSdk)

    defaultConfig {
        minSdk = (com.aej.buildsrc.DefaultConfig.minSdk)
        targetSdk = (com.aej.buildsrc.DefaultConfig.targetSdk)

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
}