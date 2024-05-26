

public class Main {
    public static void main(String[] args) throws Exception {
        new groceryList(); 
        System.out.println("Welcome to Grocery Checker");        
        searchAlg.searchAlgo(groceryList.grocery); 
        System.out.println("Here is the list in alphabetical order: ") ;
        sortAlg.sortAlgo(groceryList.grocery);
    }
}
