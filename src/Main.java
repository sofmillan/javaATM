import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User sofia = new User("Sofia",17,123,1,111);
        User carmen = new User("Carmen",50,456,2,222);
        ArrayList<Bill> available = new ArrayList<>();
        ArrayList<User> users = new ArrayList<User>();
        users.add(sofia);
        users.add(carmen);
        ATM atm = new ATM();

      //  atm.requestBill(available);
        atm.start(available,users);

    }




}