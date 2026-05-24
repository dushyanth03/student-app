pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                url: 'https://github.com/dushyanth03/student-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {

        success {

            mail(
                to: 'dshnthr@gmail.com',
                subject: 'Jenkins Build SUCCESS',
                body: 'Student App pipeline completed successfully.'
            )
        }

        failure {

            mail(
                to: 'dshnthr@gmail.com',
                subject: 'Jenkins Build FAILED',
                body: 'Student App pipeline failed.'
            )
        }
    }
}
