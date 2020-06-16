import java.util.Scanner;

public class Car {
    public String ManufacturerName;
    public int EngineCC;
    public float CarWeight;
    public float FuelAmount;


    public void CompanyName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Company name : ");
        ManufacturerName = in.nextLine();
        String Company_1 = "BMW";
        if (ManufacturerName.equals(Company_1)){
            System.out.println("Thanks for trusting us sir ");
        }
        else {
            System.out.println("Try again");
            CompanyName();
        }

    }

    public float presentFuelAmount(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your fuel amount : ");
        FuelAmount = in.nextInt();
        int i = 20;
        float result=0;
        while(i<FuelAmount){
            result = FuelAmount*10-i;
            i--;
        }
        System.out.println("You can go with "+result+"km by using that much fuel");

        if (result< 50){
            System.out.println("you should take more fuel ");
            presentFuelAmount();
        }
        else System.out.println("Okay with that");

        return FuelAmount;
    }

    public int CCcheck(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your needed cc : ");
        EngineCC = in.nextInt();
        if (EngineCC > 220){
            System.out.println("More than 220 cc is not allowed");
            CCcheck();
        }
        else System.out.println("Thank you ");
        return EngineCC;
    }

    public float Weightcheck(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the possible wight : ");
        CarWeight = in.nextFloat();
        if (CarWeight > 2000 || CarWeight<0){
            System.out.println("you are not allowed");
            Weightcheck();
        }
        else System.out.println("Thank you sir");
        return CarWeight;
    }
}
