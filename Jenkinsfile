pipeline{
	agent any
		stages	{
		stage('Build')
		{
		steps  {
	 			echo "building the code****************************************************************"
				bat "mvn clean install"
			}
		}

stage('Compile')
		{
		steps  {
 		echo "Compile the code****************************************************************"
		bat "mvn Compile"
			}
		}


stage('Test')
		{
	steps  {
		     echo "Testing the code****************************************************************"
			bat "mvn Verify"
			}
		}

stage('Test')
		{
	steps  		{
		     	echo "deploy the code****************************************************************"
			bat "mvn Deploy"
			}
		}





stage('Cucumber Reports')
		{
			steps  {
		 		cucumber buildStatus: "UNSTABLE",
				fileIncludePattern: "**/cucumber.json",
				jsonReportDirectory: 'target'
			
			}
		}
}

}


