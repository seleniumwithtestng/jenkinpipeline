pipeline {
    agent any

    tools {
        maven 'Mavenn-3-6-1'
    }
    
    stages{
        stage('SonarQube Analysis'){
            steps{
            withSonarQubeEnv('SonarQube5.3') {
                sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
                }
            }
        }
    
    }
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean test'
            }
        }
        
    }
}
