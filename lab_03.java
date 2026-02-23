import java.util.Scanner;
public class lab_03 {
    public static void main(String[]agrs){
        //addition of two matrices.
        Scanner ki=new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];
        int i, j;
        System.out.println("enter the value of matrix A");
        for(j=0;j<3;j++)
            {
                for(i=0;i<3;i++)
                {
                    A[j][i] = Integer.parseInt(ki.nextLine());
                }
        }
        System.out.println("enter matrix B");
       for(j=0;j<3;j++)
            {
                for(i=0;i<3;i++)
                {
                    B[j][i] = Integer.parseInt(ki.nextLine());
                }
        }
        for(j=0;j<3;j++)
        {
            for(i=0;i<3;i++)
            {
            C[j][i]= A[j][i]  + B[j][i];
            }
        }
        System.out.println("resultant matrix C(A+B)");
        for( j=0;j<3;j++)
        {
            for(i=0;i<3;i++)
            {
                System.out.print(C[j][i]+" ");
            }
            System.out.println();
        }
        ki.close();

    }
    
    
}
