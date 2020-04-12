import com.test.ci.BaseConfig
import javaposse.jobdsl.dsl.Job

BaseConfig config = BaseConfig.GetInstance()

folder("${config.jobFolderPrefix}") {
    description 'This example shows how to create jobs using Job builders.'
}


Job checkDiskUsageBuildNode1 = job("${config.jobFolderPrefix}/disk-usage-buildnode1") {
    label(config.jenkinsSlaveNode)
}
