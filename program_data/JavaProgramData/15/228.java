package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n * n;
		int i;
		int j = 0;
		int k;
		int x = 0;
		int a;
		int b;
		int c;
		int d;
		int e;
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			if (i % n == 1)
			{
				j++;
			}
			k = i % n;
			while (x == 0)
			{
				if (p == 0)
				{
					a = j;
				 b = k;
				 x = 1;
				}
				else
				{
					break;
				}
			}

			if (p == 0)
			{
				c = j;
				d = k;
			}
		}
		e = (c - a - 1) * (d - b - 1);
		System.out.printf("%d\n",e);
		return 0;
	}

}

