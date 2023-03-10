import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ATM {
    Scanner scan = new Scanner(System.in);
    int request5,request10,request20,request50,request100;
    int acum5=0,acum10=0,acum20=0,acum50=0,acum100=0;
    int sum=0;

    public void start(ArrayList<Bill> available, ArrayList<User> users){
        System.out.println("Enter your id");
        int id = scan.nextInt();

        List<User> foundList = users.stream()
                .filter(user->user.getId()==id)
                .toList();
        if(foundList.size()>0){
            User found = foundList.get(0);
            System.out.println("User found");
            System.out.println("Enter your password");
            int password = scan.nextInt();

            if(found.getPassword()==password){
                System.out.println("Password found");
                if(found.getCategory()==1){
                    available.removeAll(available);
                    requestBill(available);
                }
                if(found.getCategory()==2){
                    if(available.size()>0){
                        withdrawMoney(available);
                    }else{
                        System.out.println("Atm unavailable at the moment");
                        start(available,users);
                    }
                }
            }else{
                System.out.println("Incorrect password, try again later");
            }
        }else{
            System.out.println("User not found");
        }

    }

    public void requestBill(ArrayList<Bill> atm){
        System.out.println("Amount of $100 bills");
        request100 = scan.nextInt();
        acum100 += request100;
        atm.add(new Bill(100,acum100));

        System.out.println("Amount of $50 bills");
        request50 = scan.nextInt();
        acum50 += request50;
        atm.add(new Bill(50,acum50));

        System.out.println("Amount of $20 bills");
        request20 = scan.nextInt();
        acum20 += request20;
        atm.add(new Bill(20,acum20));

        System.out.println("Amount of $10 bills");
        request10 = scan.nextInt();
        acum10 += request10;
        atm.add(new Bill(10,acum10));

        System.out.println("Amount of $5 bills");
        request5 = scan.nextInt();
        acum5 += request5;
        atm.add(new Bill(5,acum5));

        sumF(atm);
    }

    public  void sumF(ArrayList<Bill> atm) {
        for(Bill bill:atm){
            int product = bill.getAmount() * bill.getDenomination();
            System.out.println("Total in "+bill.getDenomination()+" bills -> "+product);
            sum+=product;
        }
        System.out.println("Total "+sum);
        sum=0;
        if(atm.size()>0){
            acum100=atm.get(0).getAmount();
            acum50=atm.get(1).getAmount();
            acum20=atm.get(2).getAmount();
            acum10=atm.get(3).getAmount();
            acum5=atm.get(4).getAmount();
        }

    }

    public void withdrawMoney(ArrayList<Bill> atm) {
    }
    }
