package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t = 0;
		int s = 0;
		int[] sz = new int[100];
		int[][] xueya = new int[100][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			for (int a = 0;a < 2;a++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					xueya[i][a] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (int b = 0;b < n;b++)
		{
			if (xueya[b][0] >= 90 && xueya[b][0] <= 140 && xueya[b][1] >= 60 && xueya[b][1] <= 90)
			{
				sz[t]++;
			}
			else
			{
					t++;
			}
		}
		for (int g = 0;g < 100;g++)
		{
			if (sz[g] > s)
			{
				s = sz[g];
			}
		}
		System.out.printf("%d",s);
		return 0;
	}

}

