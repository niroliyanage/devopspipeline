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

A user has been created to access the "Organisation" that i created on buildkite. ( Apologies i should have done this before )
```
https://buildkite.com/
email: buildkitemyob@gmail.com
password: XSz7FKRdSN22HEme
```
You will be able to see the Helloworld1 pipeline


The deployable artifact will end up here

Docker Hub URL

```
https://hub.docker.com/r/nirothegreat/niros/ tag:release_build 

docker pull nirothegreat/niros:release_build

```

