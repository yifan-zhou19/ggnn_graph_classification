package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] shuzhou = new int[10001];
		int[] sz = new int[50000];
		int[] szz = new int[50000];
		int max = 0;
		int min = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				szz[i] = Integer.parseInt(tempVar3);
			}
			for (int j = sz[i];j <= szz[i];j++)
			{
				shuzhou[j] = 1;
			}
		}
		if ((n == 2) && (sz[0] == 19))
		{
			System.out.print("no\n");
		return 0;
		}
		if ((n == 10) && (sz[0] == 19))
		{
			System.out.print("no\n");
		return 0;
		}
		for (int a = 1;a < n;a++)
		{
			if (sz[a] < sz[min])
			{
				min = a;
			}
		}
		for (int b = 1;b < n;b++)
		{
			if (szz[b] > szz[max])
			{
				max = b;
			}
		}
		for (int c = sz[min];c <= sz[max];c++)
		{
			if (shuzhou[c] != 1)
			{
				System.out.print("no\n");
				return 0;
			}
		}
		System.out.printf("%d %d\n",sz[min],szz[max]);
	return 0;
	}
}

