import java.util.Scanner;
public class WRMTester {
    public static void main(String[] args) {
        System.out.println("** Welcome to Waiting Room Management System **");
        Scanner user_input = new Scanner(System.in);
        Boolean stop = true;
        WRM s1 = new WRM();
        while (stop) {
            System.out.println("== Choose an Option ==");
            System.out.println("1. RegisterPatient()");
            System.out.println("2. ServePatient");
            System.out.println("3. CancelAll");
            System.out.println("4. CanDoctorGoHome");
            System.out.println("5. ShowAllPatient");
            System.out.println("6. ReverseTheLine");
            System.out.println("7. exit");
            System.out.println("======================");
            System.out.print("Enter your choice: ");
            int x = user_input.nextInt();
            if(x==7){
                stop = false;
            }
            else if(x==1){
                System.out.print("Enter ID: ");
                int id = user_input.nextInt();
                System.out.print("Enter Name: ");
                String name = user_input.next();
                System.out.print("Enter Age: ");
                int age = user_input.nextInt();
                System.out.print("Enter Blood Group: ");
                String bloodGroup = user_input.next();
                s1.registerPatient(id, name, age, bloodGroup);
            }
            else if(x==3){
                s1.cancelAll();
            }
            else if(x==4){
                System.out.println(s1.canDoctorGoHome());
            }
            else if(x==2){
                s1.servePatient();
            }
            else if(x==5){
                s1.showAllPatient();
            }
            else if(x==6){
                s1.reverseTheLine();
            }
            else{
                System.out.println("Invalid Inputs");
            }
        }
        user_input.close();
    }
}
