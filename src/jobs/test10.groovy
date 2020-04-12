import com.test.ci.BaseConfig
import javaposse.jobdsl.dsl.Job

BaseConfig config = BaseConfig.GetInstance()

Job checkDiskUsageBuildNode1 = job("${config.jobFolderPrefix}disk-usage-buildnode1") {
    label(config.jenkinsSlaveNode)
}
