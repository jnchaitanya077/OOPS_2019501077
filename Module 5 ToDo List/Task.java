
class Task {

    int taskCount;
    ToDo myTasks[];

    Task() {
        this.myTasks = new ToDo[10];
        this.taskCount = 0;
    }

    public void addTask(ToDo t) {
        myTasks[taskCount] = t;
        taskCount++;
    }

    /**
     * removeTask() method takes a string and delete that particular task that
     * matches the given String.
     * 
     * @param s it takes String Tasks name.
     * @return boolean true if present false if no there.
     */
    public boolean removeTask(String s) {
        for (int i = 0; i < taskCount; i++) {
            if (myTasks[i].getTask().equals(s)) {
                for (int j = i + 1; j < taskCount; j++) {
                    myTasks[i] = myTasks[j];
                    i++;
                }
                myTasks[i] = null;
                taskCount--;
                return true;
            }
        }
        return false;
    }

    /**
     * updateTask() takes a old task name and new task name which need to updated.
     * 
     * @param taskName old task name which is String.
     * @param s        new task name which also a String type.
     */

    public void updateTask(String taskName, String s) {
        for (int i = 0; i < taskCount; i++) {
            if (myTasks[i].getTask() == taskName) {
                myTasks[i].setTask(s);
            }
        }
    }

    /**
     * pendingTask() method takes a String p which is incomplete/pending and display
     * all those taskes.
     * 
     * @param p takes String.
     */

    public void pendingTask(String p) {
        for (int i = 0; i < taskCount; i++) {
            String s = myTasks[i].getStatus();
            String s2 = myTasks[i].getStatus();
            if (s.toLowerCase().equals("incomplete") || s2.toLowerCase().equals("pending")) {
                System.out.println(myTasks[i].toString());
            }
        }
    }

    /**
     * allTasks()
     * 
     * @param date
     */
    public void allTasks(String date) {
        for (int i = 0; i < taskCount; i++) {
            if (myTasks[i].getDueDate().equals(date)) {
                System.out.println(myTasks[i].toString());
            }
        }
    }

    /**
     * taskName() method takes String which is task name and print out that task.
     * 
     * @param taskName it will take String, task name.
     */

    public void taskName(String taskName) {
        for (int i = 0; i < taskCount; i++) {
            if (myTasks[i].getTask().equals(taskName)) {
                System.out.println(myTasks[i]);
            }
        }
    }

    /**
     * displayAll() method displays all the taskes. It doesnt take any parameters.
     */
    public void displayAll() {
        for (int i = 0; i < taskCount; i++) {
            System.out.println(myTasks[i] + "\n");
        }
    }

}