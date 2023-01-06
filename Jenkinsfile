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

				always{
					emailext attachLog: true, to: "barnettalexandre@gmail.com",
					subject: "jenkins build:${currentBuild.currentResult}-${BUILD_NUMBER}: ${env.JOB_NAME}",
					body: "${currentBuild.currentResult}: Job ${env.JOB_NAME}\n.Check the attachement to view the details."
					}

			}
            }
	  


   }

}
