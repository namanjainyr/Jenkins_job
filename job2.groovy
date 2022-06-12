job('NodeJS example 2') {
    scm {
        git('https://github.com/namanjainyr/ChatApp.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('Naman Jain')
            node / gitConfigEmail('namanjainyr@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
