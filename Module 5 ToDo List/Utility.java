class Utility {
    public static void main(String[] args) {
        ToDo task1 = new ToDo("Module 5 Assignment 1", "Need to finish ToDoList Assignment.", "24/09/2019",
                "incomplete");
        ToDo task2 = new ToDo("Module 5 Assignment 1 Date Objects", "Understand how Date should be handled.",
                "23/09/2019", "incomplete");
        ToDo task3 = new ToDo("Module 4 Assignment 1 Library Card Catalog",
                "Understand how array of objects to be handled.", "23/09/2019", "in process");
        ToDo task4 = new ToDo("Dummy Task", "Task Description", "11/11/2019", "incomplete");

        Task task = new Task();

        // Adding Tasks.
        task.addTask(task1);
        task.addTask(task2);
        task.addTask(task3);
        task.addTask(task4);

        // printout all the tasks.
        task.displayAll();

        // printing out particular task.
        task.taskName("Module 5 Assignment 1 Date Objects");

        // printing tasks with that date.
        // enter the date format(DD/MM/YYY).
        task.allTasks("23/09/2019");

        // displays all the pending tasks
        task.pendingTask("Incomplete");

        // updates a paticular task name.
        // task.updateTask("Dummy Task", "Task Completed");
        // task.displayAll();

        // removes the paticular task.
        task.removeTask("Dummy Task");
        task.displayAll();

    }
}