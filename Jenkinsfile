pipeline {
    agent any

    tools {
        maven 'Mavenn-3-6-1'
    }
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean verify'
            }
        }
        
        stage ('SonarQube Analysis'){
steps{
dir("project_templates/java_project_template"){
withSonarQubeEnv('SonarQube5.3') {
sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
}
}
}
}
    }
    
    
    
   

    stages {
        stage('test') {
            steps {
                sh 'mvn  test'
            }
        }
    }
}
