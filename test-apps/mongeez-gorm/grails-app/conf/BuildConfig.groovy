grails.project.work.dir = "target"

grails.plugin.location.mongeez='../..'

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
        build ":tomcat:$grailsVersion"
    }
}
