package <missing>;

public class GlobalMembers
{
	public static int[][] num = new int[9][9];
	public static int[][] flag = new int[9][9];
	public static int m;
	public static int Main()
	{
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		void fun(int);
		num[4][4] = m;
		fun(n);
		return 0;
	}
	public static void fun(int n)
	{
		 if (n == 0)
		 {
			  int i;
			  int j;
			  for (i = 0; i < 9; i++)
			  {
				  System.out.print(num[i][0]);
				  for (j = 1; j < 9; j++)
				  {
					  System.out.print(" ");
					  System.out.print(num[i][j]);
				  }
				  System.out.print("\n");
			  }
		 }
		 else
		 {
			 int i;
			 int j;
			 for (i = 0; i < 9; i++)
			 {
				 for (j = 0; j < 9; j++)
				 {
					 if (num[i][j] != 0)
					 {
						  flag[i][j - 1] += num[i][j];
						  flag[i][j + 1] += num[i][j];
						  flag[i + 1][j] += num[i][j];
						  flag[i - 1][j] += num[i][j];
						  flag[i + 1][j - 1] += num[i][j];
						  flag[i - 1][j - 1] += num[i][j];
						  flag[i + 1][j + 1] += num[i][j];
						  flag[i - 1][j + 1] += num[i][j];
						  flag[i][j] += num[i][j];
					 }
				 }
			 }
			 for (i = 0; i < 9; i++)
			 {
				 for (j = 0; j < 9; j++)
				 {
					 num[i][j] += flag[i][j];
				 }
			 }
			 for (i = 0; i < 9; i++)
			 {
				 for (j = 0; j < 9; j++)
				 {
					 flag[i][j] = 0;
				 }
			 }
			 fun(n - 1);
		 }
	}
}

