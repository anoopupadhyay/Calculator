pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        echo 'hello world'
      }
    }
    stage('build') {
      steps {
        build 'Calculator'
      }
    }
    stage('deploy') {
      steps {
        echo 'deployed'
      }
    }
  }
}