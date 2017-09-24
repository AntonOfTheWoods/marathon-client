package mesosphere.marathon.client.model.v2;

import java.util.Collection;

import mesosphere.client.common.ModelUtils;

public class DeleteAppTasksResponse {
	private Collection<DeleteTask> tasks;

	public Collection<DeleteTask> getTasks() {
		return tasks;
	}

	public void setTasks(Collection<DeleteTask> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}

}
