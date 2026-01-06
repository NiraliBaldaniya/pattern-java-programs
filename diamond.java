import java.util.Scanner;

class diamond{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n =sc.nextInt();

        int  st=n/2+1;
        int sp=1;

        for(int i=1;i<=n;i++) 
        {
            for (int j = 1; j <= st; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= sp; j++)
            {
                System.out.print("*");
            }

            if(i<=n/2)
            
            {
                sp+=2;
                st--;
            }

            else
            {
                sp-=2;
                st++;
            }


            System.out.println();
        }
    }

}
