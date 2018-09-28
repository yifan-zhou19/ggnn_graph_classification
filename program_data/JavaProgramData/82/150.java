package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c = 0;
		int e;
		int n;
		int i;
		int k;
		int[] sz = new int[100];
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
		sz[c]++;
			}
			else
			{
			c++;
			}
		}
		for (i = 0;i < 99;i++)
		{
			for (k = 0;k < 99 - i;k++)
			{
				if (sz[k] > sz[k + 1])
				{
					e = sz[k];
					sz[k] = sz[k + 1];
					sz[k + 1] = e;
				}
			}
		}
		System.out.printf("%d",sz[99]);


		return 0;
	}
}

