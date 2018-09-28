package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int max;
		int[][] sz = new int[100][2];
		s = 0;
		max = 0;
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
		for (i = 0;i < n;i++)
		{
			if (sz[i][0] >= 90 && sz[i][0] <= 140 && sz[i][1] >= 60 && sz[i][1] <= 90)
			{
				s += 1;
			}
			else
			{
				if (s > max)
				{
					max = s;
				}
				s = 0;
			}
		}
		if (s > max)
		{
			max = s;
		}
		System.out.printf("%d",max);
		return 0;
	}

}

