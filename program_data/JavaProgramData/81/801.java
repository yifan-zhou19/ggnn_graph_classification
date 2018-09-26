package <missing>;

public class GlobalMembers
{
	public static int judge(int a,int b)
	{
		if (a >= 0 && a < 5 && b >= 0 && b < 5)
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int tmp;
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][3] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[i][4] = Integer.parseInt(tempVar5);
			}
		}
		int n;
		int m;
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			n = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			m = Integer.parseInt(tempVar7);
		}
		if (judge(n, m) == 0)
		{
			System.out.print("error");
		}
		if (judge(n, m) != 0)
		{
			for (j = 0;j < 5;j++)
			{
				tmp = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = tmp;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j != 4)
					{
						System.out.printf("%d ",a[i][j]);
					}
					if (j == 4)
					{
						System.out.printf("%d\n",a[i][j]);
					}
				}
			}

		}
		return 0;
	}
}

