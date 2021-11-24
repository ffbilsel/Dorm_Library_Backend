import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class BooksApiMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Title : ");
        String title = scanner.nextLine();
        System.out.print("Author : ");
        String author = scanner.nextLine();
        BooksApiController controller = new BooksApiController();
        BooksApiTarget target = new BooksApiTarget();
        target.setTitle(title);
        target.setAuthor(author);
        controller.sendQuery(target);
        HashMap<String, BooksApiResult> result = controller.getResult();
        Gson gson = new Gson();
        int counter = 0;
        String id = "";
        for (BooksApiResult resItem: result.values()){
            System.out.println(gson.toJson(resItem));
            counter++;
            if (counter == 3){
                id = resItem.getId();
                System.out.println("###" + resItem.getSelfLink());
            }
        }

        System.out.println("!!!!!!");
        System.out.println(gson.toJson(controller.findExactBook(id)));

    }
}
