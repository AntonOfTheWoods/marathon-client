package mesosphere.marathon.client.model.v2;

public class Task extends BaseTask {
    private String state;
    public String getState() { return state; }

    public void setState(String state) { this.state = state; }
}
