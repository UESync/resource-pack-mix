import java.io.*;
import java.util.*;

class make {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todo = new ArrayList<String>();
        String s = scanner.nextLine();

        while(!s.equals("q"))  {
            todo.add(s);
            s = scanner.nextLine();
        }

        for(String food : todo)  {
            FileWriter fw = new FileWriter(food + ".json");

            fw.write("{\"model\":{\"type\":\"minecraft:model\",\"model\":\"chefsdream:item/" + food + "\"}}");

            fw.close();
        }

        scanner.close();
    }
}