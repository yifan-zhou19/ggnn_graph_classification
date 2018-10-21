package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int n;
		int m = 0;
		int p = -1;
		int k = 0;
		int[] sz = new int[150];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		{
			p = 0;
		}
			else
			{
				p = -1;
			}
		}
		if (n > 1)
		{
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b = Integer.parseInt(tempVar5);
			}
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				sz[i] = 1;
			}
			if (i > 0)
			{
				if (sz[i - 1] == 1 && sz[i] == 1)
				{
					m++;
					if (m > p)
					{
					p = m;
					}
				}
				else
				{
					m = 0;
				}

			}

		}
		}
		if (p == -1)
		{
		for (i = 0;i < n;i++)
		{
			if (sz[i] == 1)
			{
				k++;
			}
		}
		if (k != 0)
		{
			p = 0;
		}
		}
		System.out.printf("%d",p + 1);
		return 0;
	}
}

