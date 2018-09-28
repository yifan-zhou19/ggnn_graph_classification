package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sz = new int[100];
		int[] ss = new int[100];
		int[] cx = new int[100];
		int k;
		int s;
		int e;
		int p = 0;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				ss[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] >= 90 && sz[i] <= 140 && ss[i] >= 60 && ss[i] <= 90)
			{
			p = 1;
			break;
			}
		}

		for (i = 0;i < n;i++)
		{
			cx[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			if ((sz[i - 1] <= 90 || sz[i - 1] >= 140 || ss[i - 1] <= 60 || ss[i - 1] >= 90) && sz[i] >= 90 && sz[i] <= 140 && ss[i] >= 60 && ss[i] <= 90 && sz[i + 1] >= 90 && sz[i + 1] <= 140 && ss[i + 1] >= 60 && ss[i + 1] <= 90)
			{
			s = i;
			for (e = s + 1;sz[e] >= 90 && sz[e] <= 140 && ss[e] >= 60 && ss[e] <= 90;e++)
			{
				cx[i]++;
			}
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (cx[i] > cx[i + 1])
				{
			e = cx[i + 1];
			cx[i + 1] = cx[i];
			cx[i] = e;
				}
			}
		}
		if (p == 1)
		{
			System.out.printf("%d",cx[n - 1]);
		}
		else
		{
			System.out.print("0");
		}
		return 0;
	}
}

