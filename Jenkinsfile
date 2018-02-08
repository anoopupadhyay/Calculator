pipeline {
  agent any
  
  stages {
    stage('checkout stage') {
      steps {
        echo 'get code'
        git(url: 'https://github.com/DIGITALAPPLICATION/Calculator.git', branch: 'master')
      }
    }
    stage('build stage') {
      steps {
       
         echo 'build'
      }
    }
    
    stage('deploy stage') {
      steps {
         echo 'deploy'
      }
    }
    stage('Report stage') {
      steps {
        echo 'report'
      }
    }
  }
}
