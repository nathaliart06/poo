import java.util.Scanner;

public class Lab1 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite el peso");
        int peso = sc.nextInt();
        if (peso < 40){
            System.out.println("menos de 40 kg");
        }else{
            if (peso >= 40 && peso < 50){
                System.out.println("entre 40 y 50 kg");
            }else{
                if (peso >= 50 && peso < 60){
                    System.out.println("más de 50 kg y menos de 60 kg");
                }else{
                    System.out.println( "más o igual a 60 kg");
                }
            
            }
                        
        }

        sc.close();
    }
}
