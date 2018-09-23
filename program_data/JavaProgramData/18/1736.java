package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[][] a = new int[100][100];
	   int i;
	   int j;
	   int k;
	   int c;
	   int d;
	   int l;
	   int[] sum = new int[100];
	   int min1;
	   int min2;
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
			for (l = 0;l < n - 1;l++)
			{
				for (i = 0;i < n - l;i++)
				{
					min1 = a[i][0];
					for (j = 0;j < n - l;j++)
					{

						if (a[i][j] < min1)
						{
							min1 = a[i][j];
						}
					}
					for (j = 0;j < n - l;j++)
					{
						a[i][j] = a[i][j] - min1;
					}
				}

				for (j = 0;j < n - l;j++)
				{
					min2 = a[0][j];
					for (i = 0;i < n - l;i++)
					{

						if (a[i][j] < min2)
						{
							min2 = a[i][j];
						}
					}
					for (i = 0;i < n - l;i++)
					{
						a[i][j] = a[i][j] - min2;
					}
				}

				sum[k] = sum[k] + a[1][1];
				if (l == n - 2)
				{
					break;
				}
				else
				{
					for (c = 0;c < n - l;c++)
					{
						for (d = 2;d < n - l;d++)
						{
						a[c][d - 1] = a[c][d];
						}
					}
					for (c = 2;c < n - l;c++)
					{
						for (d = 0;d < (n - 1 - l);d++)
						{
						a[c - 1][d] = a[c][d];
						}
					}
				}
			}


			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = 0;
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

