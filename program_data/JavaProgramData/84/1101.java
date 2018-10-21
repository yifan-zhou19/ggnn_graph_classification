package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int max2;
		int n;
		int now;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max = max2 = -10000;
		while (n - .0.getValue() != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				now = Integer.parseInt(tempVar2);
			}
			if (now > max)
			{
				max2 = max;
				max = now;
			}
			else
			{
				if (now == max)
				{
					max2 = max;
				}
					else
					{
						if (now > max2)
						{
							max2 = now;
						}
					}
			}
		}
		System.out.printf("%d\n%d",max,max2);
		return 0;
	}
}

