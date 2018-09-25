package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] l = new int[100];
		int[] r = new int[100];
		int[] wa = new int[100];
		int z = 0;
		int max;
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
				l[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				r[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (l[i] >= 90 && l[i] <= 140 && r[i] >= 60 && r[i] <= 90)
			{
				wa[z]++;
			}
			else
			{
				z++;
			}
		}
		if (l[n - 1] >= 90 && l[n - 1] <= 140 && r[n - 1] >= 60 && r[n - 1] <= 90)
		{
			z++;
		}
		for (i = 0;i < z;i++)
		{
			if (i == 0 || max < wa[i])
			{
				max = wa[i];
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}

}

