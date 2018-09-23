package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int l;
	public static int s = 0;
	public static int[][] jz = new int[100][100];
	public static int f()
	{
		int i;
		int j;
		int k;
		int min = 10000;
		if (n == 1)
		{
			System.out.print(s);
			System.out.print("\n");
			s = 0;
			n = l;
			return 0;
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j <= n;j++)
				{
				if (j < n)
				{
					if (jz[i][j] < min)
					{
				min = jz[i][j];
					}
				}
			else
			{
				for (k = 0;k < n;k++)
				{
					jz[i][k] = jz[i][k] - min;
				}
				min = 10000;
			}
				}
			}
			for (i = 0;i < n;i++)
			{
						for (j = 0;j <= n;j++)
						{
						if (j < n)
						{
							if (jz[j][i] < min)
							{
						min = jz[j][i];
							}
						}
					else
					{
						for (k = 0;k < n;k++)
						{
							jz[k][i] = jz[k][i] - min;
						}
						min = 10000; //????
					}
						}
			}
			s = s + jz[1][1];
			for (i = 0;i < n;i++)
			{
				for (j = 1;j < n - 1;j++)
				{
				jz[i][j] = jz[i][j + 1];
				}
			}
			for (i = 0;i < n;i++)
			{
						for (j = 1;j < n - 1;j++)
						{
						jz[j][i] = jz[j + 1][i]; //????
						}
			}
			n = n - 1;
			f();
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = n;
		for (i = 1;i <= l;i++)
		{
			for (j = 0;j < l;j++)
			{
				for (k = 0;k < l;k++)
				{
					jz[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			f();
		}
	return 0;
	}

}

