import java.util.*;

public class searchAlg {
    public static void searchAlgo(ArrayList<String> grocery){
        Scanner inp =  new Scanner(System.in);
        String choice = null;
        do{
            int i = 0;
            System.out.print("Item Name: ");
            String item = inp.nextLine();
            while(i < grocery.size() && !item.equalsIgnoreCase(grocery.get(i))){
                i++;
            }
            if (i < grocery.size()) {
                System.out.println(item + " found! They are number " + (i + 1) + " on the list!");
                choice = inp.nextLine();
            } 
            else {
                System.out.print(item + " not found.\nWould you like to add said item? (Y/N): ");
                String YN = inp.nextLine();
                if (YN.equalsIgnoreCase("yes")||YN.equalsIgnoreCase("y")){
                    grocery.add(item);
                    System.out.print("Want to look and edit more? (Y/N): ");
                    choice = inp.nextLine();
                }
                else{
                    System.out.print("Want to look and edit more? (Y/N): ");
                    choice = inp.nextLine();
                }
            }
        }while(choice.equalsIgnoreCase("yes")||choice.equalsIgnoreCase("y"));
        System.out.println("Here is your new list: " + grocery);
        inp.close();
    }
}