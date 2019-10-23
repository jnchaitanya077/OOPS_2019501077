class ToDo {
    private String taskName;
    private String taskDescription;
    private String dueDate;
    private String status;

    ToDo(String taskName, String taskDescription, String dueDate, String status) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
        this.status = status;
    }

    // setters
    public void setTask(String taskName) {
        this.taskName = taskName;

    }

    public void setDescription(String taskDescription) {
        this.taskDescription = taskDescription;

    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;

    }

    public void setStatus(String status) {
        this.status = status;

    }

    // toString()
    public String toString() {
        return "Task Name: " + this.taskName + "\n" + "Description: " + this.taskDescription + "\n" + "Due Date: "
                + this.dueDate + "\n" + "Status: " + this.status;

    }

    // getters
    public String getTask() {
        return this.taskName;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public String getDescription() {
        return this.taskDescription;
    }

    public String getStatus() {
        return this.status;
    }

}