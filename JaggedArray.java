import java.util.Scanner;
class JaggedArray{
    public static void main(String args[]){
        int[][] jaggedArray;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows for jagged array");
        int numrows=sc.nextInt();
        jaggedArray = new int[numrows][];
        for(int i=0;i<numrows;i++)
        {
            System.out.println("Enter no. columns for rows"+i+"?");
            int numcols = sc.nextInt();
            jaggedArray[i]=new int[numcols];
        }
        for(int i=0;i<numrows;i++)
        {
            for(int j=0;j<jaggedArray[i].length;j++)
            {
                System.out.println("Enter the elements of at ["+i+"]["+j+"]:");
                jaggedArray[i][j]=sc.nextInt();
            }
        }
        System.out.println("JaggedArray is:");
        for(int i=0;i<numrows;i++)
        {
            for(int j=0;j<jaggedArray[i].length;j++)
            {
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}