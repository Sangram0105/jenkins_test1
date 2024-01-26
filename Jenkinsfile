pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // This step checks out your code from version control
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // This step compiles your Java program
                bat 'javac JavaProj.java'
            }
        }

        stage('Run') {
            steps {
                // This step runs your Java program
                bat 'java JavaProj'
            }
        }

        stage('Cleanup') {
            steps {
                // Optionally, you can clean up any temporary files or artifacts
                bat 'del *.class'
            }
        }
    }

    post {
        success {
            echo 'The Java program executed successfully!'
        }

        failure {
            echo 'There was an error during the execution of the Java program.'
        }
    }
}
