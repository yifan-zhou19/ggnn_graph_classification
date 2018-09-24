package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[][] a = new int[100][100];
	public static void hang(int m)
	{
		int min = 10000;
		for (int i = 0;i < n;i++)
		{
				if (a[m][i] < min)
				{
					min = a[m][i];
				}
		}
		for (int i = 0;i < n;i++)
		{
			a[m][i] -= min;
		}
	}
	public static void lie(int m)
	{
		 int min = 10000;
		 for (int i = 0;i < n;i++)
		 {
				if (a[i][m] < min)
				{
					min = a[i][m];
				}
		 }
		 for (int i = 0;i < n;i++)
		 {
			 a[i][m] -= min;
		 }
	}
	public static void del(int[][] a)
	{
		 int i;
		 int j;
		 for (i = 1;i < n - 1;i++)
		 {
			  for (j = 0;j < n;j++)
			  {
				   a[i][j] = a[i + 1][j];
			  }
		 }
		 for (i = 1;i < n - 1;i++)
		 {
			  for (j = 0;j < n;j++)
			  {
				   a[j][i] = a[j][i + 1];
			  }
		 }
	}
	public static int Main()
	{
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int l = 0;l < n;l++)
		{
		   for (int i = 0;i < n;i++)
		   {
			  for (int j = 0;j < n;j++)
			  {
					 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
		   }
		   int k = 0;
		   int sum = 0;
		   while (k < n - 1)
		   {
			  for (i = 0;i < n;i++)
			  {
				  hang(i);
			  }
			  for (i = 0;i < n;i++)
			  {
				  lie(i);
			  }
			  sum += a[1][1];
			  del(a);
			  k++;
		   }
		   System.out.print(sum);
		   System.out.print("\n");
		}
		return 0;
	}

}

