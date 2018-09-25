package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int t;
		int k;
		int e;
		int f;
		int max;
		int g;
		int max1;
		int[] hz = new int[50000];
		int[] sz = new int[50000];
		t = 0;
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
			hz[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sz[i] = Integer.parseInt(tempVar3);
		}
		}
		for (k = 1;k <= n;k++)
		{
		for (i = 0;i < n - k;i++)
		{
				if (hz[i] > hz[i + 1])
				{
						e = hz[i + 1];
						f = sz[i + 1];
						hz[i + 1] = hz[i];
						hz[i] = e;
						sz[i + 1] = sz[i];
						sz[i] = f;
				}
		}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (g = 0;g <= i;g++)
			{
				if (g == 0)
				{
				max = sz[g];
				}
			else if ((sz[g] > max))
			{
			max = sz[g];
			}
			}
		if ((hz[i + 1] > max))
		{
			t = 1;
		}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				max1 = sz[i];
			}
			else if ((sz[i] > max1))
			{
			max1 = sz[i];
			}
		}
		if (t == 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",hz[0],max1);
		}
		return 0;
	}
}

