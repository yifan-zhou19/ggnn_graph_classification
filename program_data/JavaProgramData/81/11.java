package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int n;
	public static int m;
	public static int jiaohuan(int[][] a, int n, int m)
	{
		int i;
		int[] b = new int[5];
		if (n < 0 || n >= 5 || m < 0 || m >= 5)
		{
			return 0;
		}
		else
		{
			for (i = 0;i <= 4;i++)
			{
				b[i] = a[n][i];
			a[n][i] = a[m][i];
			a[m][i] = b[i];
			}
		}
		return 1;
	}
	public static int Main()
	{
		int i = 0;
		int temp;
		int j = 0;
		 for (i = 0;i < 5;i++)
		 {
			 for (j = 0;j < 5;j++)
			 {
			   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
		 }
			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 temp = jiaohuan(a, n, m);
			 if (temp == 0)
			 {
				 System.out.print("error");
				 System.out.print("\n");
			 }
			 else
			 {
				 for (i = 0;i < 5;i++)
				 {
					  for (j = 0;j < 4;j++)
					  {
						  System.out.print(a[i][j]);
						  System.out.print(" ");
					  }
					  System.out.print(a[i][4]);
					  System.out.print("\n");
				 }
			 }
			 return 0;
	}




}

