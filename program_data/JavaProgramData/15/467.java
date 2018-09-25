package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					k = Integer.parseInt(tempVar2);
				}
				if (k == 0)
				{
					c = i;
					d = j;
					if (a == 0 && b == 0)
					{
						a = i;
						b = j;
					}
				}
			}
		}
		m = (c - a - 1) * (d - b - 1);
		System.out.printf("%d\n",m);
		return 0;
	}



}

