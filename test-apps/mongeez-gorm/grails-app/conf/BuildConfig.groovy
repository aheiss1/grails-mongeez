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
    dependencies {
        compile('org.mongeez:mongeez:0.9.3')
    }

    plugins {
        runtime ":mongodb:1.2.0"
        build ":tomcat:$grailsVersion"
    }
}
