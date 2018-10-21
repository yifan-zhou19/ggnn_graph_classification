package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 1;i <= n;i++)
	 {
	  int row;
	  int line;
	  int a;
	  int b;
	  int[][] A = new int[101][101];
	  int sum = 0;
	  row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  line = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (a = 1;a <= row;a++)
	  {
	   for (b = 1;b <= line;b++)
	   {
		 A[a][b] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	  }
	   for (a = 1;a <= row;a++)
	   {
		   sum += A[a][1];
	   }
	   for (b = 2;b <= line;b++)
	   {
		   sum += A[row][b];
	   }
	   for (a = row - 1;a >= 1;a--)
	   {
		   sum += A[a][line];
	   }
	   for (b = line-1;b >= 2;b--)
	   {
		   sum += A[1][b];
	   }
	   System.out.print(sum);
	   System.out.print("\n");
	 }


	}
}

