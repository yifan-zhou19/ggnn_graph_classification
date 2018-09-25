package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int t;
	   int k;
	   int i;
	   int j;
	   int n;
	   int[][] a = new int[101][101];
	   int sum;
	   int min;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (k = 0;k < n;k++)
	   {
		  for (i = 0;i < n;i++)
		  {
			 for (j = 0;j < n;j++)
			 {
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
		  }
		  t = n;
		  sum = 0;
		  while (t > 1)
		  {
			 for (i = 0;i < t;i++)
			 {
				min = a[i][0];
				for (j = 0;j < t;j++)
				{
				   if (a[i][j] < min)
				   {
					  min = a[i][j];
				   }
				}
				for (j = 0;j < t;j++)
				{
				   a[i][j] = a[i][j] - min;
				}
			 }
			 for (j = 0;j < t;j++)
			 {
				min = a[0][j];
				for (i = 0;i < t;i++)
				{
				   if (a[i][j] < min)
				   {
					  min = a[i][j];
				   }
				}
				for (i = 0;i < t;i++)
				{
				   a[i][j] = a[i][j] - min;
				}
			 }
			 sum = sum + a[1][1];
			 for (i = 1;i < t - 1;i++)
			 {
				for (j = 0;j < t;j++)
				{
				   a[i][j] = a[i + 1][j];
				}
			 }
			 for (j = 1;j < t - 1;j++)
			 {
				for (i = 0;i < t + 1;i++)
				{
				   a[i][j] = a[i][j + 1];
				}
			 }
			 t--;
		  }
		  System.out.print(sum);
		  System.out.print("\n");
	   }
	   return 0;
	}
}

