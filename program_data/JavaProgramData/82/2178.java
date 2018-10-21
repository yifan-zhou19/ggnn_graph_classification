package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 1;
		int[][] xy = new int[100][2];
		int[] zc = new int[100];
		int k;
		int max;
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
				xy[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				xy[i][2] = Integer.parseInt(tempVar3);
			}
		}
		zc[1] = 0;
		for (i = 0;i < n;i++)
		{
			if (xy[i][1] >= 90 && xy[i][1] <= 140 && xy[i][2] >= 60 && xy[i][2] <= 90)
			{
			  zc[j]++;
			}
			else
			{
			  j++;
			  zc[j] = 0;
			}
		}

		max = zc[1];
		for (k = 2;k <= j;k++)
		{
			if (max < zc[k])
			{
				max = zc[k];
			}
		}
		System.out.printf("%d",max);

		return 0;
	}
}

