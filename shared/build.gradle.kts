import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    val xcfName = "KmpTestCommon"

    fun KotlinNativeTarget.configure() {
        binaries.framework {
            baseName = xcfName
            // 正直必要なのか不明ですが、これを設定しないと
            // Swift側で認識されなかったので追加しています。
            isStatic = true
        }
    }

    // 実機
    iosArm64 { configure() }
    // シミュレーター
    iosSimulatorArm64 { configure() }
    // Intel Mac向けなので事実上不要そうですが、ビルドできなかったので追加
    iosX64 { configure() }

    sourceSets {
        commonMain { dependencies {} }

        iosMain { dependencies {} }
    }
}