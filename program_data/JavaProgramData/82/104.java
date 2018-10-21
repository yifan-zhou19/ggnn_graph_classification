package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a >= 90 && a <= 140 && b <= 90 && b >= 60)
			{
				sz[i] = 1;
			}
			else
			{
				sz[i] = 0;
			}
		}
		int k;
		int c;
		int d = 0;
		int m = 0;
		for (k = m;k < n;k++)
		{
			c = 0;
			if (sz[k] == 1)
			{
				for (i = k;i < n;i++)
				{
					if (sz[i] == 1)
					{
						c++;
					}
					else
					{
						m = i;
						break;
					}
				}
			}
			if (c > d)
			{
				d = c;
			}
		}
		System.out.printf("%d",d);
		return 0;
	}
}

