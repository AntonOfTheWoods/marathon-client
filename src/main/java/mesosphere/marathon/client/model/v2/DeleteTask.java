package mesosphere.marathon.client.model.v2;

public class DeleteTask extends BaseTask {
    private TaskState state;
    public TaskState getState() { return state; }

    public void setState(TaskState state) { this.state = state; }
}
