package <missing>;

public class GlobalMembers
{
	public static final int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static final int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int is_run(int x)
	{
		if ((x % 100 != 0 && x % 4 == 0) || (x % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int[][] f1 = new int[13][13];
		int[][] f2 = new int[13][13];
		int i;
		int j;
		int k;
		int n;
		int year;
		int mon1;
		int mon2;
		int sum;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(f1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(f2, 0, (Integer.SIZE / Byte.SIZE));
		for (i = 1; i <= 12; i++)
		{
			for (j = i + 1; j <= 12; j++)
			{
					sum = 0;
					for (k = i; k <= j - 1; k++)
					{
						sum += a[k];
					}
					if (sum % 7 == 0)
					{
						f1[i][j] = 1;
					}
			}
		}
		for (i = 1; i <= 12; i++)
		{
			f1[i][i] = 1;
		}
		for (i = 1; i <= 12; i++)
		{
			for (j = 1; j <= i - 1; j++)
			{
				f1[i][j] = f1[j][i];
			}
		}
		for (i = 1; i <= 12; i++)
		{
			for (j = i + 1; j <= 12; j++)
			{
					sum = 0;
					for (k = i; k <= j - 1; k++)
					{
						sum += b[k];
					}
					if (sum % 7 == 0)
					{
						f2[i][j] = 1;
					}
			}
		}
		for (i = 1; i <= 12; i++)
		{
			f2[i][i] = 1;
		}
		for (i = 1; i <= 12; i++)
		{
			for (j = 1; j <= i - 1; j++)
			{
				f2[i][j] = f2[j][i];
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				mon1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				mon2 = Integer.parseInt(tempVar4);
			}
			if (is_run(year) == 1)
			{
				if (f2[mon1][mon2] == 1)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				if (f1[mon1][mon2] == 1)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
		}
		return 0;
	}

}

