pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Executando build no container...'
                sh 'docker build -t temp-build -f Dockerfile.build .'
                sh 'docker run --rm temp-build'
            }
        }

        stage('Test') {
            steps {
                echo 'Executando testes no container...'
                sh 'docker build -t temp-test -f Dockerfile.test .'
                sh 'docker run --rm temp-test'
            }
        }
    }

    post {
        success {
            echo 'Pipeline finalizado com sucesso!'
        }
        unstable {
            echo 'Pipeline finalizado com falhas nos testes.'
        }
        failure {
            echo 'Pipeline falhou durante o build ou testes.'
        }
    }
}
