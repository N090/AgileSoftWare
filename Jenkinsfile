<<<<<<< HEAD
pipeline {
   agent any

   tools {
       maven 'M3'
   }
   environment {
       JAVA_HOME = "C:\\Users\\Nojus\\Downloads\\jdk-21_windows-x64_bin\\jdk-21.0.1"
   }

   stages {
       stage('Checkout') {
           steps {
               echo 'Checking out..'
               // Specify the branch to checkout
               git branch: 'main', url: 'https://github.com/N090/AgileSoftWare.git'
           }
       }

       stage('Build') {
           steps {
               // Using 'mvn clean package' to compile and package the code
               bat 'mvn clean package -Dmaven.test.failure.ignore=true'
           }
       }

   }

   post {
       always {
           echo 'The build process has completed.'
       }
       success {
           echo 'Build was successful.'
       }
       failure {
           echo 'Build failed. Check the logs for details.'
       }
   }
}
=======
<<<<<<<< HEAD:Jenkinsfile
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
                bat 'javac -d bin -cp ./lib/junit-platform-console-standalone-1.9.3.jar src/Student.java src/StudentTest.java'
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
========
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
>>>>>>>> fa50bcf6fca55abcd9117b6622068ba7bff219b3:Jenkinsfile.groovy
>>>>>>> fa50bcf6fca55abcd9117b6622068ba7bff219b3
