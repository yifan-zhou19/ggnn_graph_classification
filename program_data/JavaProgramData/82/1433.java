package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		int i;
		int max;
		int[] ss = new int[99];
		int[] sz = new int[99];
		int[] jg = new int[99];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				ss[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
			if ((ss[i] >= 90) && (ss[i] <= 140) && (sz[i] >= 60) && (sz[i] <= 90))
			{
				jg[i] = 1;
			}
			else
			{
				jg[i] = 0;
			}
		}
		e = 0;
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (jg[i] == 1)
			{
				e++;
			}
			if ((e != 0 && jg[i] == 0) || i == n - 1)
			{
					if (e >= max)
					{
						max = e;
					}
					e = 0;
			}
		}
		System.out.printf("%d",max);
		return 0;
	}

}

