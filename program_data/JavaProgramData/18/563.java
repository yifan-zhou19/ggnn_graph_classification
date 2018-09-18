package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[] sum = new int[100];
		int n;
		int i;
		int j;
		int k;
		int l;
		int min;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		   sum[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			  for (j = 0;j < n;j++)
			  {
				for (k = 0;k < n;k++)
				{
				a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			  }
			  for (j = 0;j < n - 1;j++)
			  {
					for (k = 0;k < n - j;k++)
					{
					   min = a[k][0];
					   for (l = 0;l < n - j;l++)
					   {
					   if (min > a[k][l])
					   {
						   min = a[k][l];
					   }
					   }
					   for (l = 0;l < n - j;l++)
					   {
						  a[k][l] = a[k][l] - min;
					   }
					}
					for (k = 0;k < n - j;k++)
					{
						min = a[0][k];
						for (l = 0;l < n - j;l++)
						{
						if (a[l][k] < min)
						{
							min = a[l][k];
						}
						}
						for (l = 0;l < n - j;l++)
						{
						a[l][k] = a[l][k] - min;
						}
					}
					sum[i] = sum[i] + a[1][1];
					for (k = 0;k < n - j;k++)
					{
					   for (l = 1;l < n - j - 1;l++)
					   {
					   a[k][l] = a[k][l + 1];
					   }
					}
					for (k = 0;k < n - j - 1;k++)
					{
					   for (l = 1;l < n - j - 1;l++)
					   {
					   a[l][k] = a[l + 1][k];
					   }
					}
			  }
		}
		for (i = 0;i < n;i++)
		{
		   System.out.print(sum[i]);
		   System.out.print("\n");
		}
		return 0;
	}


}

