package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = 0;
		int submax = 0;
		int i;
		int n;
		int x;
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
				x = Integer.parseInt(tempVar2);
			}
		if (i == 0)
		{
			max = x;
			submax = x;

		}
		else if (i == 1)
		{
			if (x > max)
			{
				submax = max;
				max = x;
			}
			else
			{
				submax = x;
			}
		}
		else
		{
			if (x > max)
			{
				submax = max;
				max = x;
			}
		else if (x > submax)
		{
				submax = x;
		}

		}
		}
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",submax);
		return 0;
	}
}

