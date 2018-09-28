package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] xy = new int[100][2];
		int i;
		int j;
		int k;
		int t;
		int[] xs = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xy[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				xy[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 0;k < 100;k++)
		{
			xs[k] = 0;
		}
		if (xy[0][0] >= 90 && xy[0][0] <= 140 && xy[0][1] >= 60 && xy[0][1] <= 90)
		{
			xs[0] = 1;
		}
		for (i = 1;i < n;i++)
		{
			if (xy[i][0] >= 90 && xy[i][0] <= 140 && xy[i][1] >= 60 && xy[i][1] <= 90)
			{
				if (xs[i - 1] + 1 > xs[i])
				{
					xs[i] = xs[i - 1] + 1;
				}
			}
		}
		for (j = n - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
				if (xs[i] > xs[i + 1])
				{
					t = xs[i];
					xs[i] = xs[i + 1];
					xs[i + 1] = t;
				}
			}
		}
		System.out.printf("%d\n",xs[n - 1]);
		return 0;
	}







}

