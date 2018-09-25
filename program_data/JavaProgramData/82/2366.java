package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
		int max = 0;
		int[][] a = new int[100][2];
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
					(a[i][j]) = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] >= 90 && a[i][0] <= 140 && a[i][1] >= 60 && a[i][1] <= 90)
			{
				t++;
				if (max < t)
				{
					max = t;
				}
			}
			else
			{
				t = 0;
			}
		}

		System.out.printf("%d",max);
		return 0;
	}
}

