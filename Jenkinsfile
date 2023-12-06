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
