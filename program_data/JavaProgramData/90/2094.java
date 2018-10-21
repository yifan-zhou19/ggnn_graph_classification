package <missing>;

public class GlobalMembers
{
	public static void apple(int m,int n)
	{
		int[][] a;
		int i;
		int j;
		a = new int[(m + 1)];
		for (i = 0;i <= m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a[i] = (int)malloc((n + 1) * (Integer.SIZE / Byte.SIZE));
		}
		for (i = 1;i <= m;i++)
		{
			a[i][1] = 1;
		}
		for (i = 1;i <= n;i++)
		{
			a[1][i] = 1;
		}
		for (i = 2;i <= m;i++)
		{
			for (j = 2;j <= n;j++)
			{
				if (i > j)
				{
					a[i][j] = a[i][j - 1] + a[i - j][j];
				}
				else if (i == j)
				{
					a[i][j] = a[i][j - 1] + 1;
				}
				else
				{
					a[i][j] = a[i][j - 1];
				}
			}
		}
		System.out.printf("%d\n",a[m][n]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
	}

	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			apple(m, n);
		}
	}
}

