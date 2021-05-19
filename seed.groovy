pipelinejob('frontend-ci') {
    configure {flowdefinition ->
    floedefinition << delegate. 'definition'(class:'org.jenkinsci-plugins.workflow.cps.CpsScmFlowDefinition' ,plugin: 'workflow-cps') {
        'scm'(class:'hudson.plugins.git.GITSCM:git) {
        'userRemoteConfigs' {
            'hudson.plugins.git.UserRemoteConfig' {
                'url ('https://github.com/shivarkzs/frontend.git.)
            }
        }
        'branches' {
            'hudson.plugin.git.BranchSpec' {
                'name' ('*/main')
            }
        }
    }
    'ScriptPath'('jenkinsfile')
    'lightweight'(true)
    }
 }
}