public class AddTodoList {
    static ToDoList toDoList;
    static ShowTodoList showTodoList;
    public static void addList(String todoName){
        boolean isFull = true;
        for(int i = 0; i < toDoList.data.length; i++){
            if(ToDoList.data[i] == null){
                isFull = false;
                break;
            }
        }

        if(isFull){
            String[] temp = toDoList.data;
            toDoList.data = new String[toDoList.data.length * 2];

            for(int i = 0; i < temp.length; i++){
                toDoList.data[i] = temp [i];
            }
        }

        for(int i = 0; i < ToDoList.data.length; i++){
            if(toDoList.data[i] == null){
                toDoList.data[i] = todoName;
                break;
            }
        }
    }

    public static void  testAddTodoList(){
        for (int i = 0; i < 25; i++){
            addList("Todo ke. " + i);
        }
        showTodoList.showList();
    }
}
