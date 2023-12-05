pipeline {
    agent any

    stages {
        stage('Fetch from Repository') {
            steps {
                // Replace the repository URL with your actual repository URL
                git 'https://github.com/N090/AgileSoftWare.git'
            }
        }

        stage('Build Project') {
            steps {
                // You can replace the following command with your build commands
                sh 'mvn clean install'
            }
        }
    }
}
