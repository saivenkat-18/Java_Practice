import java.util.Scanner;
class naturalnumbers{
  public static void main(String args[])
  {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("all the numbers ");
    n=sc.nextInt();
    int i=1;
    while (i<=n){
      System.out.println(i);
      i++;
    }
  }
}