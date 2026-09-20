import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.triggers.vcs
import javax.net.ssl.SSLContext

version = "2024.03"

project {
    buildType(Build)
}

object Build: BuildType({
    name = "Build and test"
    vcs {
        root(DslContext.settingsRoot)
    }
    steps {
        maven {
            goals = "clean test"
            pomLocation = "pom.xml"
        }
    }

    triggers = {
        vcs {}
    }
})