// file: build.gradle.kts (Project Level - Root)

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false

    // Gunakan alias yang merujuk ke plugin Secrets Gradle
    // Alias ini berasal dari libs.versions.toml
    alias(libs.plugins.google.android.libraries.mapsplatform.secrets.gradle.plugin) apply false

    // HAPUS alias yang menyebabkan error (seperti compose dan secrets yang ambigu):
    // alias(libs.plugins.kotlin.compose) apply false
    // alias(libs.plugins.secrets.gradle.plugin) apply false
}