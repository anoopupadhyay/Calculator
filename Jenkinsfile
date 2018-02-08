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
        sh '''
     echo "PATH = ${PATH}"
    echo "M2_HOME = ${M2_HOME}"
   '''
         sh 'mvn clean verify
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
