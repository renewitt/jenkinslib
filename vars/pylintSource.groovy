#!/usr/bin/env groovy

// Pylint source files. This functionality is provided separately to testing,
// because some projects require that the tests be run on minified code and
// running pylint on minified code is useless.

// This function uses the pylintrc file in the resources folder.

def call() {
    echo "Running pylint on source."
    projectName = sh(returnStdout: true, script: 'python setup.py --name').trim()
    sh """
    pylint ${projectName} --rcfile=/home/terry/projects/jenkinslib/resources/pylintrc --output-format=colorized --reports=y | tee pylint.out
    """
}
