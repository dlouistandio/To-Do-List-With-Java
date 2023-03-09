public class ViewShowTodoList {
    static ViewAddTodoList viewAddTodoList;
    static ViewRemoveTodoList viewRemoveTodoList;
    static ToDoList toDoList;
    public static void viewShowTodoList(){
        while (true){
            ShowTodoList.showList();
            System.out.println("Menu : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            String input = toDoList.input("Pilih");
            if(input.equals("1")){
                viewAddTodoList.viewAddList();
            }else if(input.equals("2")){
                viewRemoveTodoList.viewRemoveList();
            }else if(input.equals("x")){
                break;
            }else {
                System.out.println("Pilihan tidak ada");
            }
        }
    }
}
