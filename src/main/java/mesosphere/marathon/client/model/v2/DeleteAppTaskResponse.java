package mesosphere.marathon.client.model.v2;

import mesosphere.client.common.ModelUtils;

public class DeleteAppTaskResponse {
	private DeleteTask task;

	public DeleteTask getTask() {
		return task;
	}

	public void setTask(DeleteTask task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}

}
