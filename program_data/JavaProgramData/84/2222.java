package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int a;
		int b;
		int max = 0;
		int smax = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			if (b > max)
			{
				smax = max;
				max = b;
			}
			else if (b > smax)
			{
				smax = b;
			}
			else
			{
				;
			}
		}
		System.out.printf("%d\n",max);
		System.out.printf("%d",smax);
		return 0;
	}

}

