pipeline {
          agent any
          tools{
            maven 'maven'
          }

          stages{

            stage('new .jar ') {

                steps {
                   sh 'mvn clean install -DskipTests'
                      }
            }
             stage('Sonarqube') { 

                 steps {  
                 sh 'mvn sonar:sonar -Dsonar.projectKey=test -Dsonar.host.url=http://127.0.0.1:9000 -Dsonar.login=630060b5d8f93c04c5190b111643808433107f28'
                       }
             }

   }

}
