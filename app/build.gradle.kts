plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
}

android {
    namespace = "com.example.amplus"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.amplus"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.navigation:navigation-fragment:2.7.7")
    implementation("androidx.navigation:navigation-ui:2.7.7")
    implementation("com.google.android.gms:play-services-maps:17.0.0")
    implementation("com.google.firebase:firebase-messaging:23.4.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //rxJava file
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.9")

    //Firebase Ui
    implementation ("com.firebaseui:firebase-ui-auth:8.0.2")

    //Material Library
//    implementation ("com.google.android.material:material:1.1.0")

    //ButterKinfe Libray
    implementation ("com.jakewharton:butterknife:10.2.3")
//    annotationProcessor ("com.jakewharton:butterknife-compiler:10.2.3")

    implementation("com.google.firebase:firebase-database")
    implementation(platform("com.google.firebase:firebase-bom:32.7.4"))

    // Dexter
    implementation ("com.karumi:dexter:6.2.2")

    //Location
    implementation("com.google.android.gms:play-services-location:17.0.0")

    //GeoFire
    implementation ("com.firebase:geofire-android:3.2.0")

    //Ciclr image
    implementation("de.hdodenhof:circleimageview:3.1.0")

    //Firebase storage
    implementation("com.google.firebase:firebase-storage")

    //Glide
    implementation("com.github.bumptech.glide:glide:4.11.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.11.0")

    implementation("com.google.firebase:firebase-iid:+")

}