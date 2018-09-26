package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int i;
		int j;
		int m;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			a = 1;
			b = 1;
			if (n == 1 || n == 2)
			{
				c = 1;
			}
			else if (n >= 3)
			{
				for (i = 3;i <= n;i++)
				{
					c = a + b;
					a = b;
					b = c;
				}
			}
			sz[j] = c;
		}
		for (j = 0;j < m;j++)
		{
			System.out.printf("%d\n",sz[j]);
		}
		return 0;
	}

}

