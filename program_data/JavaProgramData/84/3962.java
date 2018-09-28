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
		if (n <= 1 || n >= 100)
		{
			return 0;
		}

		int temp;
		int max;
		int lmax;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			max = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			lmax = Integer.parseInt(tempVar3);
		}
		if (lmax > max)
		{
			temp = lmax;
			lmax = max;
			max = temp;
		}

		int i = 3;
		while (i <= n)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				temp = Integer.parseInt(tempVar4);
			}
			if (temp > max)
			{
				lmax = max;
				max = temp;
			}
			else if (temp > lmax)
			{
				lmax = temp;
			}
			i++;
		}
		System.out.printf("%d\n", max);
		System.out.printf("%d", lmax);
		return 0;
	}
}

