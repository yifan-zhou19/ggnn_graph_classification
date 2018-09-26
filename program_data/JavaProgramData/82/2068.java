package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] p = new int[N];
		int[] q = new int[N];
		int i;
		int j;
		int s;
		int x;
		int y;
		x = 0;
		y = 0;
		s = 0;
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
				p[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
				if (p[i] >= 90 && p[i] <= 140 && q[i] >= 60 && q[i] <= 90)
				{
						x = x + 1;
						if (x > s)
						{
							s = x;
						}
				}
				else
				{
						x = 0;
				}
		}
		System.out.printf("%d",s);
		return 0;
	}

}

