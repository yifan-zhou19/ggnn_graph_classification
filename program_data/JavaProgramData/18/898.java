package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] m = new int[100][100];
		int min = 100000;
		int sum = 0;
		int r;
		int[] p = new int[100];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = m;
		int i;
		int j;
		int time;
		for (time = 1; time <= n;time++)
		{
			sum = 0;
			for (i = 0; i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					m[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (r = n;r > 1;r--)
			{
				for (i = 0; i < r;i++)
				{
					min = 100000;
					for (j = 0; j < r;j++)
					{
						if (*(p[i] + j) < min)
						{
							min = (p[i] + j);
						}
					}
					for (j = 0; j < r;j++)
					{
						*(p[i] + j) -= min;
					}
				}
				for (i = 0; i < r;i++)
				{
					min = 100000;
					for (j = 0; j < r;j++)
					{
						if (*(p[j] + i) < min)
						{
							min = (p[j] + i);
						}
					}
					for (j = 0; j < r;j++)
					{
						*(p[j] + i) -= min;
					}
				}
				sum += *(p[1] + 1);
				for (j = 0; j < r;j++)
				{

					for (i = 2; i < r;i++)
					{
						*(p[j] + i - 1) = *(p[j] + i);
					}
				}
				for (j = 2; j < r;j++)
				{
					for (i = 0; i < r;i++)
					{
						*(p[j - 1] + i) = *(p[j] + i);
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}




}

