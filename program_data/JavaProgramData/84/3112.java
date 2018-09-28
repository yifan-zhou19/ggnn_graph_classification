package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int max1 = -10000;
		int max2 = -10000;
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
				a = Integer.parseInt(tempVar2);
			}
			if (a > max1)
			{
				max2 = max1;
				max1 = a;
			}
			else if (a < max1 && a> max2)
			{
				max2 = a;
			}
			else if (a < max2)
			{
				;
			}
		}
		System.out.printf("%d\n%d",max1,max2);
		return 0;
	}
}

