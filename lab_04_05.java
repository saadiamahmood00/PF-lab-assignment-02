import java.util.Scanner;
public class lab_04_05 {

// MatrixOperations 


    //  Matrix Multiplication
    static void matrixMultiply(int[][] A, int[][] B, int r1, int c1, int c2) {
        int[][] C = new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    C[i][j] += A[i][k] * B[k][j];  
                }
            }
        }
        System.out.println("Matrix Multiplication Result:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }

    // Multiply Row by Constant
    static void multiplyRowByConstant(int[][] A, int row, double constant, int columns){
        for(int k=0; k<columns; k++){
            A[row][k] = (int)(A[row][k] * constant);  // cast to int if needed
        }
        System.out.println("After multiplying row "+row+" by "+constant+":");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<columns;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }

    //  Row Operation Ri -> Ri - Rj
    static void rowSubtract(int[][] A, int rowi, int rowj, int columns){
        for(int k=0;k<columns;k++){
            A[rowi][k] = A[rowi][k] - A[rowj][k];
        }
        System.out.println("After row operation R"+rowi+" -> R"+rowi+" - R"+rowj+":");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<columns;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input matrix A
        System.out.println("Enter rows and columns of matrix A:");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] A = new int[row1][col1];
        System.out.println("Enter elements of matrix A:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                A[i][j] = sc.nextInt();
            }
        }

        // Input matrix B
        System.out.println("Enter rows and columns of matrix B:");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        if(col1 != row2){
            System.out.println("Matrix multiplication not possible!");
            return;
        }
        int[][] B = new int[row2][col2];
        System.out.println("Enter elements of matrix B:");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                B[i][j] = sc.nextInt();
            }
        }

        // Call Matrix Multiply
        matrixMultiply(A,B,row1,col1,col2);

        // Call Multiply Row by Constant (example: first row * 2)
        multiplyRowByConstant(A,0,2,col1);

        // Call Row Subtraction (example: R2 -> R2 - R1)
        if(row1 >= 2)
            rowSubtract(A,1,0,col1);
    }
public class DayCalculator{
    //lab 05 1.You have to write a program in which you have to take input from user date
    // month and year and it will give the day on that day.
    public static void main(String[]agrs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the date");
        int date=sc.nextInt();
        System.out.println("enter the month");
        int month=sc.nextInt();
        System.out.println("enter the year");
        int year=sc.nextInt();
        if (month == 1 ||month== 2)
        {
             month = month + 12;
             year = year - 1;
    }
    int K = year % 100;
    int J = year / 100;
  int h = ( date + (13 * (month + 1)) / 5 + K + (K/4) + (J/4) + 5*J ) % 7;
  switch(h) {
    case 0: System.out.println("SATURDAY");
    break;
        case 1:System.out.println("SUNDAY");
    break;
        case 2:System.out.println("MONDAY");
    break;
        case 3:System.out.println("TUESDAY");
    break;    
        case 4:System.out.println("WEDNESDAY");
    break;    
        case 5:System.out.println("THURSDAY");
    break;    
        case 6:System.out.println("FRIDAY");
    break;   
}
    }
}
}