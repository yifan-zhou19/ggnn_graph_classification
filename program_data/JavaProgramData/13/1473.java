package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz1 = new int[20000];
		int[] sz2 = new int[20000];
		int i;
		int j;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 1;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz1[i] = Integer.parseInt(tempVar2);
			}
		}
		sz2[0] = sz1[0];
		for (i = 1;i <= n - 1;i++)
		{
			for (k = i - 1;k >= 0;k--)
			{
				if (sz1[i] == sz2[k])
				{
					break;
				}
				if (k == 0)
				{
					sz2[j] = sz1[i];
					j = j + 1;
				}
			}
		}
		for (i = 0;i <= j - 1;i++)
		{
			if (i == j - 1)
			{
				System.out.printf("%d",sz2[i]);
			}
			else
			{
				System.out.printf("%d ",sz2[i]);
			}
		}
		return 0;
	}

}

