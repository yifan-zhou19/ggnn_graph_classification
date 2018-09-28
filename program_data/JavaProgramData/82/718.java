package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int j = 0;
		int k = 0;
		int l;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 100;i++)
		{
			sz[i] = 0;
		}
		for (i = 1;i <= n + 1;i++)
		{
			if (i <= n)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					b = Integer.parseInt(tempVar3);
				}
			}
			if (i == n + 1)
			{
				a = 1;
				b = 1;
			}
				if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
				{
				j++;
				}
			else if (j >= 1)
			{
				sz[k] += j;
				k++;
				j = 0;
			}
		}
		for (l = 0;l <= 98;l++)
		{
			if (sz[l + 1] <= sz[l])
			{
							a = sz[l + 1];
							sz[l + 1] = sz[l];
							sz[l] = a;
			}
		}
		System.out.printf("%d",sz[99]);
		return 0;
	}
}

