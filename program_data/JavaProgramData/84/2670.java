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
		int lmax;
		int temp;
		int i = 0;
		if (n <= 1 || n >= 100)
		{
		return 0;
		}


		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			temp = Integer.parseInt(tempVar2);
		}
			max = temp;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			temp = Integer.parseInt(tempVar3);
		}
		if (temp > max)
		{
			lmax = max;
			max = temp;
		}
		else
		{
			lmax = temp;
		}

		i += 2;

		while (i < n)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				temp = Integer.parseInt(tempVar4);
			}
			i++;
			if (temp > max)
			{
				lmax = max;
				max = temp;
			}
			else if (temp > lmax)
			{
				lmax = temp;
			}
		}
		System.out.printf("%d\n", max);
		System.out.printf("%d\n", lmax);
		return 0;
	}
}

