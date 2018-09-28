package <missing>;

public class GlobalMembers
{
	public static int runnian(int a)
	{
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int n;
		int i;
		int j;
		int y;
		int m1;
		int m2;
		int result1 = 0;
		int result2 = 0;
		int[][] month =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			for (i = 0;i < m1 - 1;i++)
			{
				result1 += month[runnian(y)][i];
			}
			for (i = 0;i < m2 - 1;i++)
			{
				result2 += month[runnian(y)][i];
			}
			if (Math.abs(result2 - result1) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			result1 = result2 = 0;
		}
	}




}

