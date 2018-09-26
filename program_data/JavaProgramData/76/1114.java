package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int e;
		int l;
		int[] ai = new int[50000];
		int[] bi = new int[50000];

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
				(ai[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(bi[i]) = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n - 1;i++)
		{
			for (k = 0;k < n - i - 1;k++)
			{
				if (ai[k] > ai[k + 1])
				{
					e = ai[k + 1];
					ai[k + 1] = ai[k];
					ai[k] = e;

					e = bi[k + 1];
					bi[k + 1] = bi[k];
					bi[k] = e;
				}
			}
		}
		i = 0;
		l = 0;
		while (i < n - 1)
		{
			for (k = l + 1;k < n;k++)
			{
				if (bi[i] <= bi[k])
				{
					break;
				}
			}

			if (bi[i] < ai[k])
			{
				System.out.print("no");
				break;
			}
			l = k;
			i = l;
			if (bi[i] > bi[n - 1])
			{
				System.out.printf("%d %d",ai[0],bi[i]);
			}
			else if (i == n - 1)
			{
				System.out.printf("%d %d",ai[0],bi[n - 1]);
			}
		}
	return 0;
	}
}

