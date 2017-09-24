package mesosphere.marathon.client.model.v2;

public class TaskState {
    private String activeSince;
    private TaskCondition condition;
    private String since;

    public String getActiveSince() {
        return activeSince;
    }

    public void setActiveSince(String activeSince) {
        this.activeSince = activeSince;
    }

    public TaskCondition getCondition() {
        return condition;
    }

    public void setCondition(TaskCondition condition) {
        this.condition = condition;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }
}
