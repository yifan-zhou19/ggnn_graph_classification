package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] sz1 = new int[100000];
		int[] sz2 = new int[100000];
		int i;
		int j;
		int x;
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
				sz1[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		x = 0;
		for (i = 0;i < n;i++)
		{
			if (sz1[i] == k)
			{
				x++;
			}
			if (sz1[i] != k)
			{
				j = i - x;
				sz2[j] = sz1[i];
			}
		}
		for (j = 0;j < n - x - 1;j++)
		{
			System.out.printf("%d ",sz2[j]);
		}
		if (j == (n - x - 1))
		{
			System.out.printf("%d\n",sz2[j]);
		}
	return 0;
	}
}

