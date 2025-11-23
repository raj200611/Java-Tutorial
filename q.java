import java.util.Scanner;


 class q {
    public static void main(String[] args) 
{
    Scanner scan=new Scanner (System.in);
    String name=scan.nextLine();
    double score=scan.nextDouble();
    scan.nextLine();
    String dept =scan.nextLine();
    System.out.println ("my name is:"+name);
    System.out.println ("my score is "+score/10 +"/10");
    System.out.println ("my dept is:"+dept);
    scan.close();
}
}