job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/alealbaladejo/nodejsapp.git', 'master') { node ->
            node / gitConfigName('alealbaladejo')
            node / gitConfigEmail('alealbaladejo29s@gmail.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
}
