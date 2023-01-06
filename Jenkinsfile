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
                      
                      post{

				failure{
					emailext attachLog: true, to: "amine.mezghich@gmail.com",
					subject: "jenkins build:${currentBuild.currentResult}-${BUILD_NUMBER}: ${env.JOB_NAME}",
					body: "${currentBuild.currentResult}: Job ${env.JOB_NAME}\n.Check the attachement to view the details."
					}

			}
            }
             stage('Sonarqube') { 

                 steps {  
                 sh 'mvn sonar:sonar -Dsonar.projectKey=demoSonarJenkins -Dsonar.host.url=http://192.168.92.1:9000 -Dsonar.login=5f4f36a3c36e56b4fc8930608d50096bef9f11f4'
                       }
             }
                    
                    always{

				
					emailext attachLog: true, to: "amine.mezghich@gmail.com",
					subject: "jenkins build:${currentBuild.currentResult}-${BUILD_NUMBER}: ${env.JOB_NAME}",
					body: "${currentBuild.currentResult}: Job ${env.JOB_NAME}\n.Check the attachement to view the details."
				

			}

   }

}
