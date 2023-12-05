pipeline {
    agent any

    stages {
        stage('Fetch') {
            steps {
                script {
                    // Check if the directory exists
                    if (fileExists('AgileSoftWare')) {
                        // If it exists, perform a git pull with --allow-unrelated-histories
                        bat 'cd AgileSoftWare && git pull --allow-unrelated-histories origin main'
                    } else {
                        // If it doesn't exist, perform a git clone
                        bat 'git clone -b main https://github.com/N090/AgileSoftWare.git'
                    }
                }
            }
        }
        stage('Build') {
            steps {
                // Compile files with JUnit package
                bat 'javac -d bin src/Student.java src/StudentTest.java --class-path ./lib/junit-platform-console-standalone-1.9.3.jar'
            }
        }
        stage('Test') {
            steps {
                // Run tests
                bat 'java -jar lib/junit-platform-console-standalone-1.9.3.jar --class-path bin --select-class StudentTest'
            }
        }
    }
}
