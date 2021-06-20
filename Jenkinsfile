@Library('JenkinsSLB@master')_
pipeline{
    agent any
    parameters {
        string defaultValue: 'abhishek', name: 'FNAME', trim: true
    }
    stages{
        stage('Build'){
            steps{
                sample("${FNAME}")
            }
        }
    }
}