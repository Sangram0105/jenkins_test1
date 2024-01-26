pipeline{
    
agent none
stages{

    stage("BUILd"){

        steps{
            sh 'javac JavaProj.java'
            sh 'java JavaProj'
        }
    }
    stage("test"){
        steps{
            sh 'java --version'

            sh 'mvn --version'

           
        }
    }
}

}