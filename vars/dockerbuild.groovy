def call(String ProjectName, String ImageTag, String dockerHubCreUser){
      sh "docker build -t ${dockerHubCreUser}/${ProjectName}:${ImageTag} ."
}
