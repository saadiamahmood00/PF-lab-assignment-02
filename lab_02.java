public class lab_02 {
    public static void main(String[]agrs){
        //Q1 print the output:*****
        for(int i=0; i<5; i++)
        {
            System.out.print("*");
        }
    }
    
}
 class q2{
    public static void main(String[]agrs){
        //Q2 print the output:*****
        //                    *****
        //                    *****
        for( int j=0; j<3; j++)
        {
            for(int i=0;i<5;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
class q3{
    public static void main(String[]agrs){
        //Q3 print the following output:
        //          * 
        //          ** 
        //          *** 
        //          **** 
        //          ***** 
        for(int j=0;j<=5; j++)
        {
            for(int i=0;i<j;i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
class q4{
    public static void main(String[]agrs){
        //print the following output:
        //          * 
        //          ** 
        //          *** 
        //          **** 
        //          ***** 
        //          ****
        //          *** 
        //          **
        //          *
        
            for(int j=0;j<=5; j++)
        {
            for(int i=0;i<j;i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int j=0;j<=5;j++){
            for(int i=4;i>j;i--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
class q5{
    public static void main(String[]agrs){
        // Q5.1 print the cumulative series to 7 terms 
        // output: 1,1,2,4,7,11,16
        int diff=0;
        int term=1;
        int n2=7; //range given by user
        System.out.print(term+",");
        while(term<=n2)
        {
        
            term=term+diff;
             System.out.print(term+",");
              diff++;
            
        }
    }
}
class q5_prt2{
    public static void main(String[]agrs){
            //Q5.2 print the cumulative series till the last value is less then 25 
        // output: 1,1,2,4,7,11,16,22
        int a=1;
        int b=1;
        int n2=25;   //last number given ny user
        
        System.out.print(a+","+b);
        int nextnum=2;
        int increase=2;
        while(nextnum<n2){
            System.out.print(","+nextnum);
            nextnum=nextnum+increase;
            increase++;

        }

    }
}
class Fabonaciseries{
    public static void main(String[]agrs){
        //prunt fabbonacci series upto 8 terms.
        // output: 1,1,2,3,5,8,13,21
        int a=1;
        int b=1;
        int diff=1;
        System.out.print(a+","+b);
        int n2=8 ;//number of inputs  given by user
        while(diff<=n2-2)
        {
               int result=a+b;
                System.out.print(","+result);
                a=b;
                b=result;
                diff++;

            }

    }
}