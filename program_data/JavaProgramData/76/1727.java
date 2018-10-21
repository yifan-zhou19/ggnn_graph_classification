package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int min;
		int max;
		int k;
		int[][] sz = new int[50000][2];
		int[] gh = new int[10000];
		int i = 0;
		int j = 0;
		int r = 0;
		int o = 0;
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
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			if (sz[i][0] < sz[j][0])
			{
				j = i;
			}
		}
		min = sz[j][0];
		j = 0;
		for (i = 1;i < n;i++)
		{
			if (sz[i][1] > sz[j][1])
			{
				j = i;
			}
		}
		max = sz[j][1];
		for (k = min;(k + 0.5) <= max;k = k++)
		{
			gh[k] = 0;
			for (i = 0;i < n;i++)
			{
				if ((k + 0.5) >= sz[i][0] != 0 && (k + 0.5) <= sz[i][1])
				{
					gh[k] = 1;
				}
			}
		}
		for (k = min;(k + 0.5) <= max;k = k++)
		{
			if (gh[k] == 0)
			{
				o = 1;
			}
			if (gh[k] == 1)
			{
				r++;
			}
		}
		if (r == max - min)
		{
			System.out.printf("%d %d",min,max);
		}
		if (o == 1)
		{
			System.out.print("no");
		}
		return 0;
	}

}

