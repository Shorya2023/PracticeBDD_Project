pipeline{
agent any
stages{
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
			bat "mvn Test"
			}
		}



stage('Deploy')
		{
			steps  {
		 	echo "Deploying the code****************************************************************"
			
			}
		}
}

}


