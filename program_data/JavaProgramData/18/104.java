package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int s = 0;
		int t = 0;
		int k = 0;
		int i = 0;
		int j = 0;
		int m = 0;
		int q = 0;
		int min = 0;
		int r = 0;
		int h = 0;
		int w = 0;
		int v = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (r = 1;r <= n;r++)
		{
		   int number = 0;
		   final int p = n;
		   int[][] a = new int[p + 1][p + 1];
		   for (i = 1;i <= p;i++)
		   {
				  for (j = 1;j <= p;j++)
				  {
					  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  }
		   }
		   for (k = 1;k <= p - 1;k++)
		   {
			   for (s = k;s <= p;s++)
			   {
				   min = a[s][k];
				   for (t = k;t <= p;t++)
				   {
					   if (a[s][t] < min)
					   {
					   min = a[s][t];
					   }
				   }
				   for (m = k;m <= p;m++)
				   {
					   a[s][m] -= min;
				   }
			   }
			   for (h = k;h <= p;h++)
			   {
				   min = a[k][h];
				   for (w = k;w <= p;w++)
				   {
					   if (a[w][h] < min)
					   {
					   min = a[w][h];
					   }
				   }
				   for (q = k;q <= p;q++)
				   {
					  a[q][h] -= min;
				   }
			   }
			   number += a[k + 1][k + 1];
			   a[k + 1][k + 1] = a[k][k];
			   for (v = k + 2;v <= p;v++)
			   {
				  a[k + 1][v] = a[k][v];
				  a[v][k + 1] = a[v][k];
			   }
		   }
		   System.out.print(number);
		   System.out.print("\n");
		}
		   return 0;
	}
}

