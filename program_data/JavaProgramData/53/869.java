package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int a = 0;
		int count = 0;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;
		int[] sz = new int[n];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			for (int t = 0;t < i;t++)
			{
				if (sz[i] == sz[t])
				{
					a = 1;
				}
			}
			if (a == 1)
			{
				sz[i] = 0;
				m--;
			}
			a = 0;
		}
		for (int k = 0;k < n;k++)
		{
			if (sz[k] != 0)
			{
				System.out.printf("%d,",sz[k]);
				count++;
				num = k;
			}
			if (count == (m - 1))
			{
				break;
			}
		}
		for (int j = num + 1;j < n;j++)
		{
			if (sz[j] != 0)
			{
				System.out.printf("%d",sz[j]);
				break;
			}
		}
		return 0;
	}
}

