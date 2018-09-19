package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int q;
		int i;
		int j;
		int[] min1 = new int[100];
		int[] min2 = new int[100];
		int[][] a = new int[100][100];
		int d;
		int w;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		w = n;
		for (q = 0;q < w;q++)
		{

			d = 0;
			n = w;
			for (i = 0;i < w;i++)
			{
				for (j = 0;j < w;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}while (n >= 2)
			{
				for (i = 0;i < n;i++)
				{
					min1[i] = 1000;
				}
				for (i = 0;i < n;i++)
				{
					min2[i] = 1000;
				}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (min1[i] > a[i][j])
					{
						min1[i] = a[i][j]; //cout<<min1[i]<<endl;
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] -= min1[i];
				}
			}
			for (j = 0;j < n;j++)
			{
				for (i = 0;i < n;i++)
				{
					if (min2[j] > a[i][j])
					{
						min2[j] = a[i][j]; //cout<<min2[j]<<endl;
					}
				}
			}
			for (j = 0;j < n;j++)
			{
				for (i = 0;i < n;i++)
				{
					a[i][j] -= min2[j];
				}
			}
			d += a[1][1];
			for (j = 0;j < n;j++)
			{
				for (i = 2;i < n;i++)
				{
					a[i - 1][j] = a[i][j];
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 2;j < n;j++)
				{
					a[i][j - 1] = a[i][j];
				}
			}
			n--;
		}
			System.out.print(d);
			System.out.print("\n");
		}







	return 0;
	}
}

