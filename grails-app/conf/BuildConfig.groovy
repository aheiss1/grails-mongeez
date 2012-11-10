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
        mavenRepo('https://oss.sonatype.org/content/repositories/snapshots')
    }
    dependencies {
        compile('org.mongeez:mongeez:0.9.2-SNAPSHOT') {
            excludes('commons-logging')
        }
        compile('org.reflections:reflections:0.9.8')
        compile('org.mongodb:mongo-java-driver:2.9.2')
    }
    plugins {
        build(":tomcat:$grailsVersion",
              ":release:2.0.4") {
            export = false
        }
    }
}
