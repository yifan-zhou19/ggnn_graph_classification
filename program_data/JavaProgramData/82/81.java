package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[100][2];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
		}
		int a = 0;
		int b = 0;
		int[] sub = new int[100];
		for (int j = 0;j < n;j++)
		{
			if (sz[j][0] >= 90 && sz[j][0] <= 140 && sz[j][1] >= 60 && sz[j][1] <= 90)
			{
				sub[a]++;
			}
			else
			{
				a++;
			}
		}
		int e;
		for (int k = 1;k < a + 1;k++)
		{
			for (int m = 0;m < a + 1 - k;m++)
			{
				if (sub[m] < sub[m + 1])
				{
						e = sub[m + 1];
						sub[m + 1] = sub[m];
						sub[m] = e;
				}
			}
		}
		System.out.printf("%d",sub[0]);
		return 0;
	}

}

