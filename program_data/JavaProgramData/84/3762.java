package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] sz = new int[k];
		int i;
		int a;
		int b;
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		a = sz[0];
		for (i = 0;i < k;i++)
		{
			if (sz[i] > a)
			{
				a = sz[i];
			}
		}
		b = sz[0];
		for (i = 0;i < k;i++)
		{
			if (sz[i] > b && sz[i] < a)
			{
				b = sz[i];
			}
		}
		System.out.printf("%d\n%d\n",a,b);
		return 0;
	}
}

