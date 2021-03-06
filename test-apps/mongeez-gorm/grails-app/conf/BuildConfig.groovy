grails.project.work.dir = "target"

grails.project.dependency.resolution = {
    inherits("global")

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
        mavenLocal()
    }

    plugins {
        runtime ":mongodb:1.2.0"
        runtime ":mongeez:0.2.3-SNAPSHOT"
        build ":tomcat:$grailsVersion"
    }
}
