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
		int[][] sz = new int[50000][2];
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

	//??????
		int min = sz[0][0];
		int max = sz[0][1];
		for (int a = 0;a < n;a++)
		{
			if (sz[a][0] < min)
			{
				min = sz[a][0];
			}
			if (sz[a][1] > max)
			{
				max = sz[a][1];
			}
		}

	//??
		int[] qj = new int[10000];
		int e = min;
		for (int b = 0;b < max - min + 1;b++)
		{
			qj[b] = e;
			e++;
		}
		for (int t = 0;t < max - min;t++)
		{
			for (int c = 0;c < n;c++)
			{
				if (sz[c][0] <= qj[t] != 0 && sz[c][1] >= qj[t + 1])
				{
					qj[t] = 0;
				}
			}
		}
		int w = 0;
		for (int d = 0;d < max - min;d++)
		{
			if (qj[d] != 0)
			{
				w++;
			}

		}
		if (w == 0)
		{
			System.out.printf("%d %d",min,max);
		}
		if (w != 0)
		{
			System.out.print("no");
		}
	return 0;
	}


}

