#!/usr/bin/env groovy

Contains unavoidable global environment definitions and sets up resource files.

def call(Map config) {

    echo "Starting build.."
    echo "Working on branch: ${env.BRANCH_NAME}"

    echo "Copying library pylintrc file.."
    writeFile(
        file: 'pylintrc',
        text: "${libraryResource('pylintrc')}"
    )
}
