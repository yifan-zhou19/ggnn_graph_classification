package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int max;
		int[] f = new int[100];
		int[] g = new int[100];
		int[] k = new int[100];
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
				f[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				g[i] = Integer.parseInt(tempVar3);
			}
		}
		j = 0;
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (f[i] >= 90 && f[i] <= 140 && g[i] >= 60 && g[i] <= 90)
			{
				j = j + 1;
				k[i] = j;
			}
			else
			{
				k[i] = j;
				  j = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (k[i] > k[max])
			{
				max = i;
			}
		}
		System.out.printf("%d\n",k[max]);
		return 0;
	}

}

