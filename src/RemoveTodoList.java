public class RemoveTodoList {
    static ToDoList toDoList;
    static AddTodoList addTodoList;
    static ShowTodoList showTodoList;
    public static boolean removeList(int number){
        if((number-1) >= toDoList.data.length){
            return false;
        }else if(toDoList.data[number - 1] == null){
            return false;
        }else {
            for (int i = (number - 1); i < toDoList.data.length; i++){
                if (i == (toDoList.data.length - 1)){
                    toDoList.data[i] = null;
                }else {
                    toDoList.data[i] = toDoList.data[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList(){
        addTodoList.addList("1");
        addTodoList.addList("2");
        addTodoList.addList("3");

        boolean result = removeList(15);
        System.out.println(result);

        result = removeList(4);
        System.out.println(result);

        result = removeList(2);
        System.out.println(result);

        showTodoList.showList();
    }
}
