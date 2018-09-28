package <missing>;

public class GlobalMembers
{
	public static void sort(int[] sz, int n)
	{
		int k;
		int e;
		int i;
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (sz[i] < sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}
	}
	public static int Main()
	{
		while (true)
		{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			break;
		}
		int[] tian = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tian[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] king = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				king[i] = Integer.parseInt(tempVar3);
			}
		}
		sort(tian, n);
		sort(king, n);
		int win = 0;
		int twin = 0;
		int even = 0;
		int teven = 0;
		int lose = 10000;
		int tlose = 0;
		int temp;
		for (i = 0;i < n; i++)
		{
			temp = i;
			i = 0;
			for (j = temp;j < n;j++,i++)
			{
				if (tian[i] > king[j])
				{
					twin++;
				}
				else if (tian[i] < king[j])
				{
					tlose++;
				}
				else
				{
					teven++;
				}
			}
			tlose += temp;
			if ((twin - tlose) > (win - lose))
			{
				win = twin;
				lose = tlose;
				even = teven;
			}
			i = temp;
			twin = 0;
			tlose = 0;
			teven = 0;
		}
		System.out.printf("%d\n",200 * (win - lose));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(tian);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(king);
		}
		return 0;
	}

}

