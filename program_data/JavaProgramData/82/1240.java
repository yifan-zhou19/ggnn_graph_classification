package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c = 0;
		int i = 0;
		int j = 0;
		int m = 0;
		int[] sz = new int[72];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
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
			if (a <= 140 && a >= 90 && b <= 90 && b >= 60)
			{
				j += 1;
			}
			else
			{
				sz[m] = j;
				j = 0;
				if (c < sz[m])
				{
					c = sz[m];
				}
				m += 1;
			}
			i += 1;
		}
		if (c < j)
		{
			c = j;
		}
		System.out.printf("%d",c);
		return 0;
	}

}

