podTemplate(label: 'runInPodWithRetention', podRetention: always(), containers: [
        containerTemplate(name: 'busybox', image: 'busybox', ttyEnabled: true, command: '/bin/cat'),
    ]) {

    node ('runInPodWithRetention') {
      stage('Run') {
        container('busybox') {
          sh """
            echo "Running pod with retention"
          """
        }
      }
    }
}