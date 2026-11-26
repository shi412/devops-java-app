

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn -B clean verify'
            }
        }

        stage('Package') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Deploy') {
            steps {
                sh 'install -m 0644 target/*.jar /opt/devops-java-app/app.jar'
                sh 'java -jar /opt/devops-java-app/app.jar'
            }
        }
    }
}
