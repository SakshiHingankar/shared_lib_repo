def call(reponame){
  pipeline{
    tools {
      jdk 'myjava'
      maven 'mymaven'
    }
    agent any
    stages{
      stage('Checkout'){
        steps{
          echo 'cloning..'
          git "${reponame}"
        }
      }
      stage('compile'){
        steps{
          echo 'compiling..'
          sh 'mvn compile'
        }
      }
    }
  }
}
          
      
