package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b = 0;
		int c = 0;
		int d = 0;
		int i;
		int k;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (k = 1;k <= n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				if (a == 0)
				{
					b++;
					d++;
				}
			}
			if (d != 0)
			{
					c++;
					d = 0;
			}
		}
		max = ((b - 2 * c) / 2) * (c - 2);
		System.out.printf("%d\n",max);
		return 0;
	}
}

