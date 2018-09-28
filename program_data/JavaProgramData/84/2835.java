package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i = 1;
		int max = 0;
		int max2 = 0;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a >= max)
			{
				max2 = max;
				max = a;
				continue;
			}
			else if ((a < max) && (a >= max2))
			{
				max2 = a;
				continue;
			}
			else
			{
				continue;
			}
		}
		System.out.printf("%d\n%d\n",max,max2);
	}
}

