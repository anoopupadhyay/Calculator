pipeline {
  agent any
  tools{
maven 'maven 3'
jdk 'java 8'
}
  stages {
    stage('checkout') {
      steps {
        echo 'get code'
        git(url: 'https://github.com/DIGITALAPPLICATION/Calculator.git', branch: 'master')
      }
    }
    stage('build') {
      steps {
       
         sh 'mvn clean install
        echo 'build'
      }
    }
    stage('Report') {
      steps {
        echo 'report'
      }
    }
  }
}
