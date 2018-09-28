package <missing>;

public class GlobalMembers
{
	public static void function(int[][] num, int n, int m)
	{
		int i;
		int j;
	if ((n < 5 && n >= 0) && (m < 5 && n >= 0))
	{
	for (i = 0;i <= 4;i++)
	{
		if (i == n)
		{
			for (j = 0;j <= 3;j++)
			{
			System.out.printf("%d ",num[m][j]);
			}
			System.out.printf("%d\n",num[m][4]);
		}
		else if (i == m)
		{
			for (j = 0;j <= 3;j++)
			{
			System.out.printf("%d ",num[n][j]);
			}
			System.out.printf("%d\n",num[n][4]);
		}
		else
		{
			for (j = 0;j <= 3;j++)
			{
			System.out.printf("%d ",num[i][j]);
			}
			System.out.printf("%d\n",num[i][4]);
		}
	}
	}
	else
	{
		System.out.print("error\n");
	}
	}
	public static void Main()
	{
		int[][] num = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					num[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		function(num, n, m);
	}
}

