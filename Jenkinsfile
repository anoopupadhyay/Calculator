pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        echo 'get code'
        git(url: 'https://github.com/DIGITALAPPLICATION/Calculator.git', branch: 'master')
      }
    }
    stage('build') {
      steps {
        echo 'build'
        build 'mvn clean install'
      }
    }
    stage('deploy') {
      steps {
        echo 'deployed'
      }
    }
  }
}