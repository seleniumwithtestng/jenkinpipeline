pipeline {
    agent any

    tools {
        maven 'Mavenn-3-6-1'
    }
    

    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean test'
            }
        }
        
    }
}
