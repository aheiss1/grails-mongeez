/*
 * Copyright 2012 David M. Carr, Commerce Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

grails.project.source.level = 1.6
grails.project.target.level = 1.6

grails.project.dependency.resolution = {
    inherits('global')
    repositories {
        grailsCentral()
        mavenCentral()
    }
    dependencies {
        compile('org.mongeez:mongeez:0.9.3') {
            excludes('commons-logging')
        }
        compile('org.apache.commons:commons-lang3:3.1') // TODO: remove this when mongeez fixes their POM
        compile('org.reflections:reflections:0.9.8')
        compile('org.mongodb:mongo-java-driver:2.11.2')
    }
    plugins {
        build(":tomcat:$grailsVersion",
              ":release:2.1.0") {
            export = false
        }
    }
}
