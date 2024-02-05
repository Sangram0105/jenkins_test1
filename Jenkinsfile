pipeline {
    agent any

       environment {
        DOCKER_IMAGE = 'sdsankpal7812/javaproj'
    }
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

     

   
        stage('Build docker image ') {
            steps {
                script {
                    // Build the Docker image
                    bat 'docker build -t $DOCKER_IMAGE -f Dockerfile .'
                }
            }
        }

        stage('Push') {
            steps {
                script {
                    // Log in to Docker Hub
                    withCredentials([usernamePassword(credentialsId: 'Sangram-DockerHub1', passwordVariable: 'DOCKERHUB_PASSWORD', usernameVariable: 'DOCKERHUB_USERNAME')]) {
                        bat "docker login -u $DOCKERHUB_USERNAME -p $DOCKERHUB_PASSWORD"
                    }

                    // Push the Docker image to Docker Hub
                    bat "docker push ${env.DOCKER_IMAGE}"
                }
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