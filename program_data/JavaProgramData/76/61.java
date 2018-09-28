package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int a;
		int b;
		int min;
		int[] sz = new int[50000];
		int[] sc = new int[50000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		min = n - 1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sc[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j >= i;j--)
			{
				if (sz[j] < sz[min])
				{
					min = j;
				}
			}
			a = sz[i];
			sz[i] = sz[min];
			sz[min] = a;
			b = sc[i];
			sc[i] = sc[min];
			sc[min] = b;
			min = n - 1;
		}
		for (k = 1;k < n;k++)
		{
			if (sz[k] <= sc[k - 1])
			{
				if (sc[k] < sc[k - 1])
				{
					sc[k] = sc[k - 1];
				}
			}
			else
			{
				b = 1;
				System.out.print("no\n");
				break;
			}
		}
		if (b != 1)
		{
			System.out.printf("%d %d\n",sz[0],sc[n - 1]);
		}
		return 0;
	}
}

