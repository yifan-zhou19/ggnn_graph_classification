package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[][] xy = new int[100][2];
		int m;
		int z = 0;
		int[] k = new int[100];
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
			if ((xy[i][0] <= 140 && xy[i][0] >= 90) && (xy[i][1] <= 90 && xy[i][1] >= 60))
			{
				z++;
				k[i] = z;
			}
			else
			{
				z = 0;
				k[i] = z;
			}
		}
		int e;
		for (m = 1;m < n;m++)
		{
			for (i = 0;i < n - m;i++)
			{
				if (k[i] > k[i + 1])
				{
					e = k[i + 1];
					k[i + 1] = k[i];
					k[i] = e;
				}
			}
		}
		System.out.printf("%d",k[n - 1]);

		return 0;
	}
}

