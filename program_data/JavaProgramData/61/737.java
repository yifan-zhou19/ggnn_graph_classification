package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 1;
		int b = 1;
		int[] sz = new int[20];
		int i;
		int c = 0;
		int j;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 2)
			{
				b = 1;
				System.out.printf("%d\n",b);
			}
			else
			{
				for (j = 0;j < sz[i] - 2;j++)
				{
					c = b;
					b = a + b;
					a = c;
				}
				System.out.printf("%d\n",b);
			}
			a = 1;
			b = 1;
		}
		return 0;

	}
}

