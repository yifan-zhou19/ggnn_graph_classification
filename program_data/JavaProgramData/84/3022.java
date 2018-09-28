package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int max;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			max = Integer.parseInt(tempVar2);
		}
		int lmax;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			lmax = Integer.parseInt(tempVar3);
		}
		if (max < lmax)
		{
			max = lmax;
			lmax = max;
		}
		int a;
		int i;
		for (i = 0;i < (n - 2);i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			if (a > max)
			{
				lmax = max;
				 max = a;
			}
			else if (a > lmax)
			{
				 lmax = a;
			}
		}
		System.out.printf("%d\n", max);
		System.out.printf("%d", lmax);
		return 0;
	}
}

