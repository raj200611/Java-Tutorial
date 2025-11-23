import java.util.Scanner;

public class rcb {
    public static void main(String[] args) {

        Scanner rcb=new Scanner(System.in);

        String the=rcb.nextLine();

        if(the.equals("win"))
        {
        
            System.out.println("virat kohli");
        }
        else{
            System.out.println("pota kohli");
        }
        rcb.close();
    }
    
}
