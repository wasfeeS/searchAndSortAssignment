
public class Main {
    public static void main(String[] args) throws Exception {
        lapTimeList lapTimes = new lapTimeList();
        lapTimes.collectData(); 
        System.out.println("Welcome to Formula One Lap Time Statistics");
        sortAlg.sortData(lapTimes.getData());
        searchAlg.search(lapTimes.getData());
        lapTimes.closeScanner();
    }
}