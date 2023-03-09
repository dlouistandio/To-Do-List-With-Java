public class ViewAddTodoList {
    static ToDoList toDoList;
    public static void viewAddList(){
        System.out.println("Menambah To Do List");
        String todo = toDoList.input("Todo (x Jika Batal)");

        if(todo.equals("x")){
            //batal
        }else {
            AddTodoList.addList(todo);
        }
    }
}
