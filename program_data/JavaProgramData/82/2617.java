package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] p = new int[100][2];
		int i;
		int j;
		int a = 0;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i][0] >= 90 && p[i][0] <= 140 && p[i][1] >= 60 && p[i][1] <= 90)
			{
				a++;
			}
			else
			{
				if (a > x)
				{
					x = a;
					a = 0;
				}
				else
				{
					a = 0;
				}
			}
		}
		if (a > x)
		{
			x = a;
		}
		System.out.printf("%d",x);
		return 0;
	}


}

