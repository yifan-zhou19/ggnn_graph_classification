package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k;
		int a;
		int[][] xy = new int[101][2];
		int[] xs = new int[101];
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
		for (i = 0;i < n;i++)
		{
			if (xy[i][0] >= 90 && xy[i][0] <= 140 && xy[i][1] >= 60 && xy[i][1] <= 90)
			{
				xs[j]++;
			}
			else
			{
				j++;
			}
		}
		for (i = 1;i <= 100;i++)
		{
			for (k = 0;k <= 100 - i;k++)
			{
			  if (xs[k] > xs[k + 1])
			  {
								a = xs[k];
								xs[k] = xs[k + 1];
								xs[k + 1] = a;
			  }
			}
		}
		System.out.printf("%d",xs[100]);

		return 0;
	}

}

