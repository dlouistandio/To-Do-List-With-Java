public class ViewRemoveTodoList {
    static ToDoList toDoList;
    public static void viewRemoveList(){
        System.out.println("Menghaous To Do List");

        String number = toDoList.input("Nomor yang ingin dihapus(x Jika Batal)");
        if(number.equals("x")){
            //batal
        }else {
            boolean success = RemoveTodoList.removeList(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }

    }
}
