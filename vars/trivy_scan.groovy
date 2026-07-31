def call(String severity = "HIGH,CRITICAL") {
    sh "trivy fs --severity ${severity} --exit-code 1 ."
}
