import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //SimpleCalculator
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

        //Person
//        Person person = new Person();
//        person.setFirstName("");
//        person.setLastName("");
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");
//        person.setAge((18));
//        System.out.println("fullName= " +person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");
//        System.out.println("fullName= " + person.getFullName());

        //BankAccount
//        BankAccount bankAccount1 = new BankAccount();//"11111",2000.22,"Bob", "bob@test.com", "07314635145");
//
//        System.out.println("Customer name is: " + bankAccount1.getName());
//        System.out.println(bankAccount1.getName() + " has balance: " + bankAccount1.getBalance());
//        System.out.println("balance is after deposit: " + bankAccount1.deposit(1000));
//        System.out.println("balance is after withdraw 10000: " + bankAccount1.withdraw(10000));

        //VipCustomer
        VipCustomer janeVip = new VipCustomer();
        System.out.println("VIP's name: " + janeVip.getName());
        System.out.println("VIP's email: " + janeVip.getEmail());

        VipCustomer helenVip = new VipCustomer("Helen", "vip", "helen@test.com");
        System.out.println("VIP's name: " + helenVip.getName());
        System.out.println("VIP's email: " + helenVip.getEmail());

        VipCustomer heVip = new VipCustomer("He", "vip");
        System.out.println("VIP's name: " + heVip.getName());
        System.out.println("VIP's email: " + heVip.getEmail());




    }
}
