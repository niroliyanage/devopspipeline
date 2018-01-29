# devopspipeline by niro

This repo contains a simple Helloworld App that is written in Java. A commit to this repo will trigger a pipeline. 
The code would be checked out from github and built on a buildkite agent that is running on AWS
The artifact will then be pushed to packagecloud 
A vanilla image from my docker repository will be downloaded and the artifact will be deployed from package cloud onto this docker container
A simple test will be run on the docker intsance to confirm that the Application is healthy
Once confirmed a final deployable docker image will be pushed to my docker hub.

## Technologies Used 

```
Java, Spring Boot, Docker, Buildkite
```

##To Kick off Automated Build and deploy

Push a change to the github project 

```
git clone https://github.com/niroliyanage/devopspipeline.git
echo "testing commit" >> README.md
git add README.md
git commit -m "testing pipeline"
```


Login to Buildkite to check the progress 

Unfortunately I cannot grant read access to the pipeline as this feature is still being developed at buildkite. If I can get someone's email address I can invite them to the project just so they can see the pipeline

```
Docker Hub Url
```


The deployable artifact will end up here

```
https://hub.docker.com/r/nirothegreat/niros/ tag:release_build 

docker pull nirothegreat/niros:release_build

```

