public class ShowTodoList {
    static ToDoList toDoList;
    public static void showList(){
        for(int i = 0; i < toDoList.data.length; i++){
            String todo = toDoList.data[i];
            int no = i + 1;

            if(todo != null){
                System.out.println(no + "." + todo);
            }
        }
    }

    public static void testShowTodoList(){
        toDoList.data[0] = "Todo 1";
        toDoList.data[1] = "Todo 2";
        toDoList.data[2] = "Todo 2";
        showList();
    }
}
