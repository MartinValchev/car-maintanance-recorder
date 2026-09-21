import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.triggers.vcs

version = "2024.03"

project {
    buildType(Build)
}

object Build : BuildType({
    name = "Build and Test"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        maven {
            name = "Maven Build and Test"
            goals = "clean test"
            pomLocation = "CarMaintananceRecorder/pom.xml"
            jvmArgs = "-Xmx512m"
        }
    }

    triggers {
        vcs {
            branchFilter = "+:*"
        }
    }
})