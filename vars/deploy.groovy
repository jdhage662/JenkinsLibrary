def call(String projectName, String projectTag){
 echo "This is pushing the image to docker hub"
 withCredentials([usernamePassword('credentialsId':"dockerHubCre",
   'passwordVariable':"dockerHubCrePass",
  'usernameVariable':"dockerHubCreUser")]){
   sh "docker login -u ${env.dockerHubCreUser} -p ${env.dockerHubCrePass}"
   sh "docker image tag ${projectName}:${projectTag} ${dockerHubCreUser}/${projectName}:${projectTag}"
   sh "docker push ${dockerHubCreUser}/${projectName}:${projectTag}"

} 
