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
		int[] sz2 = new int[100];
		int i;
		int j;
		int flag = 0;
		int e;
		int max;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i][0] >= 90 && sz[i][0] <= 140 && sz[i][1] >= 60 && sz[i][1] <= 90)
			{
				flag = flag + 1;
			}
			else
			{
				flag = 0;
			}
			sz2[i] = flag;
		}
		for (i = 0;i < n - 1;i++)
		{
			if (sz2[i] > sz2[i + 1])
			{
				e = sz2[i + 1];
				sz2[i + 1] = sz2[i];
				e = sz2[i];
			}
		}
		max = sz2[n - 1];
		System.out.printf("%d",max);
		return 0;
	}








}

