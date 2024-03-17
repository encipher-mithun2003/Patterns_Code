import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
