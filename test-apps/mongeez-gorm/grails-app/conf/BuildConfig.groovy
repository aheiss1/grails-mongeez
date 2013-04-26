grails.project.work.dir = "target"

grails.project.dependency.resolution = {
    inherits("global")

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
    }

    plugins {
        runtime ":mongodb:1.2.0"
        runtime ":mongeez:0.2.2-SNAPSHOT"
        build ":tomcat:$grailsVersion"
    }
}
