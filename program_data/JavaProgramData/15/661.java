package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int cur;
		int s = 0;
		int sq;
		int starow;
		int stacol;
		int endrow;
		int endcol;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				cur = Integer.parseInt(tempVar2);
			}
			if (s == 0 && cur == 0)
			{
				s = 1;
				starow = (i - 1) / n;
				stacol = i % n;
			}
			else if (s == 1 && cur == 0)
			{
				endrow = (i - 1) / n;
				endcol = i % n;
			}
		}
		sq = (endrow - starow - 1) * (endcol - stacol - 1);
		System.out.printf("%d\n",sq);
		return 0;
	}
}

