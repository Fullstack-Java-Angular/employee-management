pipeline {
    agent { dockerfile true }
    stages {
        stage('Deploy') {
            steps {
                echo 'Hi Management Employee Pipeline'
            }
        }
   }

   post {
        always {
            echo "ALWAYS I'M RUNNING"
        }
   }
}