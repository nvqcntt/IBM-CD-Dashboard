package ibm_cd_dashboard

class BuildTestMetrics {

    static belongsTo = [build:Build]

    static constraints = {
    }
    long commitPhaseTestingTime
}
