package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100004];
		for (i = 0;i < 100004;i++)
		{
			sz[i] = 0;
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
			for (j = 2 * a;j <= 2 * b;j++)
			{
				sz[j] = 1;
			}
		}
		for (i = 0;i < 100004;i++)
		{
			if (sz[i] == 1)
			{
				if (sz[i - 1] == 0)
				{
					a = i / 2;
					c++;
				}
				if (sz[i + 1] == 0)
				{
					b = i / 2;
				}
			}
		}
		if (c == 1)
		{
			System.out.printf("%d %d\n",a,b);
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;
	}

}

