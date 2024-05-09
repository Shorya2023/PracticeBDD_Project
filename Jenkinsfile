pipeline{
agent any
stages{
stage('Compile Stage')
	{
	steps  {
 			echo "building the code****************************************************************"
			bat "mvn clean install"
		}
	}

	
stage('Test')
	{
	steps  {
		     echo "Testing the code****************************************************************"
			bat "mvn Test"
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


