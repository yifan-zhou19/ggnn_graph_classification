package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz1 = new int[50000];
		int[] sz2 = new int[50000];
		int n;
		int i;
		double m;
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
				sz1[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz2[i] = Integer.parseInt(tempVar3);
			}
		}
		int x = sz1[0];
		int y = 0;
		for (i = 0;i < n;i++)
		{
			if (x > sz1[i])
			{
				x = sz1[i];
			}
			if (y <= sz2[i])
			{
				y = sz2[i];
			}
		}
		for (m = x + 0.1;m < y;m++)
		{
			for (i = 0;i < n;i++)
			{
				if (m <= sz2[i] != 0 && m> sz1[i])
				{
					break;
				}
				else
				{
					continue;
				}
			}
			if (i < n)
			{
				continue;
			}
			else
			{
				System.out.print("no");
			return 0;
			}
		}
		System.out.printf("%d %d",x,y);
		return 0;
	}

}

