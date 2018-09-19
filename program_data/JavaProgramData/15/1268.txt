package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int a;
		int b;
		a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] zl = new int[A][A];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(zl[i][j]) = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 1;i < (n - 1);i++)
		{
			for (j = 1;j < (n - 1);j++)
			{
				if ((zl[i][j]) == 0)
				{
					a++;
				}
			}
		}
		b = (((a * a) / 16) - (a / 2) + 1);
		System.out.printf("%d\n",b);
		return 0;
	}

}

