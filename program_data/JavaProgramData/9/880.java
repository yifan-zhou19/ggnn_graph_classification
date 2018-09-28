package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] bh = new char[999][999];
		int[] nl = new int[999];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bh[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				nl[i] = Integer.parseInt(tempVar3);
			}
		}
		int[] pd = new int[999];
		int k = 0;
		for (i = 1;i <= n;i++)
		{
			if (nl[i] >= 60)
			{
				k++;
				pd[k] = i;
			}
		}
		int e;
		for (i = 1;i < k;i++)
		{
			for (j = 1;j <= k - i;j++)
			{
				if (nl[pd[j]] < nl[pd[j + 1]])
				{
					e = pd[j + 1];
					pd[j + 1] = pd[j];
					pd[j] = e;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (nl[i] < 60)
			{
				k++;
				pd[k] = i;
			}
		}
		for (i = 1;i <= k;i++)
		{
			System.out.printf("%s\n",bh[pd[i]]);
		}
		return 0;
	}
}

