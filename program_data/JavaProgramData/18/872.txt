package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[110][110];
		int i;
		int j;
		int x;
		int min = 10000;
		int sum = 0;
		int k;
		int[] p = a;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (k = 1;k <= x;k++)
	{
		sum = 0;
		for (i = 1;i <= x;i++)
		{
		 for (j = 1;j <= x;j++)
		 {
		  *(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
		 }
		}
	for (n = x;n >= 2;n--)
	{
		for (i = 1;i <= n;i++)
		{
			min = 100000;
		 for (j = 1;j <= n;j++)
		 {
			 if (*(p[i] + j) < min)
			 {
				 min = (p[i] + j);
			 }
		 }
		 for (j = 1;j <= n;j++)
		 {
			 *(p[i] + j) = *(p[i] + j) - min;
		 }
		}
		 for (j = 1;j <= n;j++)
		 {
		 min = 100000;
		 for (i = 1;i <= n;i++)
		 {
			 if (*(p[i] + j) < min)
			 {
				 min = (p[i] + j);
			 }
		 }
		  for (i = 1;i <= n;i++)
		  {
			  *(p[i] + j) = *(p[i] + j) - min;
		  }
		 }
		 sum = sum + *(p[2] + 2);
		 for (i = 2;i <= n - 1;i++)
		 {
		  for (j = 1;j <= n;j++)
		  {
			  *(p[i] + j) = *(p[i + 1] + j);
		  }
		 }
		 for (j = 2;j <= n - 1;j++)
		 {
		  for (i = 1;i <= n;i++)
		  {
			  *(p[i] + j) = *(p[i] + j + 1);
		  }
		 }
	}
	System.out.print(sum);
	System.out.print("\n");
	}
	}
}

