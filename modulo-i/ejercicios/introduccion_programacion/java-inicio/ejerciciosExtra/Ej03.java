import java.util.Scanner;

public class Ej03{
 public static void main(String[] arg) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Dame numero si te atreves:");
   int numero = sc.nextInt();
System.out.println("numero:"+numero);
   boolean seguir=true;
   int suma=0;

   while(seguir){
      int cifra=numero%10;
      numero/=10;
      System.out.println("cifra:"+cifra);
      System.out.println("numero:"+numero);
      suma+=cifra;
      seguir=numero!=0;   
   }
System.out.println("suma:"+suma);
   sc.close();
 }
}