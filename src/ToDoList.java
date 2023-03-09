import java.util.Scanner;

public class ToDoList {
    static Scanner scanner = new Scanner(System.in);
    public static String[] data = new String[10];

    public static void main(String[] args) {
        ViewShowTodoList.viewShowTodoList();
    }

    public static String input(String info){
        System.out.println(info + ":");
        String data = scanner.nextLine();
        return data;
    }
}
