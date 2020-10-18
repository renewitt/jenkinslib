#!/usr/bin/env groovy

def call(Map config) {
    /*
    This config map allows custom parameters to be passed to this step,
    which means you can override build variables fairly easily in your
    project's Jenkinsfile like this:
        defaultPipeline {
            projectName = 'mycoolproject'
        }

    Then, those parameters can be accessed with config.propertyName
        eg. config.projectName
    */

    stage('Init Build') {
        step {
            initBuild
        }
    }
}
