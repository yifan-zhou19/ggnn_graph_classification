package <missing>;

public class GlobalMembers
{
	/*???????
	1000010098
	???*/
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'sum', so pointers on this parameter are left unchanged:
	public static void change(int[][] a, int n, int step, int * sum)
	{
		int i;
		int j;
		int min;
		int g;
		for (i = 0; i < n; i++)
		{
			g = 0;
			if (i >= 1 && i < step)
			{
			continue;
			}
			for (j = 0; j < n; j++)
			{
				if (j >= 1 && j < step)
				{
					continue;
				}
				if (a[i][j] == 0)
				{
					g = 1;
					break;
				}
				if (j == 0)
				{
					min = a[i][j];
				}
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			if (g == 1)
			{
				continue;
			}
			for (j = 0; j < n; j++)
			{
				if (j >= 1 && j < step)
				{
					continue;
				}
				a[i][j] -= min;
			}
		}
		for (i = 0; i < n; i++)
		{
			g = 0;
			if (i >= 1 && i < step)
			{
			continue;
			}
			for (j = 0; j < n; j++)
			{
				if (j >= 1 && j < step)
				{
					continue;
				}
				if (a[j][i] == 0)
				{
					g = 1;
					break;
				}
				if (j == 0)
				{
					min = a[j][i];
				}
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
			if (g == 1)
			{
				continue;
			}
			for (j = 0; j < n; j++)
			{
				if (j >= 1 && j < step)
				{
					continue;
				}
				a[j][i] -= min;
			}
		}
		*sum += a[step][step];
		return;
	}




	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,40000);
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 1; j < n; j++)
			{
				change(a, n, j, sum);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}


}

