package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e = 0;
		int y = 0;
		int c = 0;
		int g = 0;
		int[] qs = new int[50000];
		int[] zz = new int[50000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(qs[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(zz[i]) = Integer.parseInt(tempVar3);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(qs[n - 1]) = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			(zz[n - 1]) = Integer.parseInt(tempVar5);
		}
		for (int j = 0;j < n;j++)
		{
			if (qs[j] < qs[e])
			{
				e = j;
			}
		}
		for (int r = 0;r < n;r++)
		{
			if (zz[r] > zz[y])
			{
				y = r;
			}
		}
		for (double x = qs[e];x >= qs[e] != 0 && x <= zz[y];x += 0.1)
		{
			for (int s = 0;s < n;s++)
			{
				if (x >= qs[s] != 0 && x <= zz[s])
				{
					break;
				}
			c += 1;
			}
			if (c == n)
			{
				g = 1;
				break;
			}
			else
			{
				c = 0;
			}


		}
		if (g == 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",qs[e],zz[y]);
		}

	return 0;
	}


}

