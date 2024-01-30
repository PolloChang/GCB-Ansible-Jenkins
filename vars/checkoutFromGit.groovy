#!/usr/bin/env groovy

def call(Map config) {
    echo "更新git,本次版號為: ${env.BUILD_NUMBER}"
    checkout([$class: 'GitSCM', branches: [[name: "${config.branch}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], 
                userRemoteConfigs: [[credentialsId: "${config.credentialId}", url: "${config.url}"]]]) 
}