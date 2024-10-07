plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.finix.paywall"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.finix.paywall"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // Add these dependencies for CardView and GridLayout
    implementation("androidx.cardview:cardview:1.0.0") // CardView dependency
    implementation("androidx.gridlayout:gridlayout:1.0.0") // GridLayout dependency

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
