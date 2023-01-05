pipeline {
          agent any
          tools{
            maven:'maven'
          }

          stages{

            stage('new .jar ') {

                steps {
                   sh 'mvn clean install -DskipTests'
                      }
            }
             stage('Sonarqube') { 

                 steps {  
                 sh 'mvn sonar:sonar -Dsonar.projectKey=demo -Dsonar.projectName=demo  -Dsonar.host.url=http://127.0.0.1:9000 -Dsonar.login=84c1486e0dbdbabaa697c819a9df36eea758c449'
                       }
             }

   }

}
