package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int max = 0;
		int max2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		max = a,max2 = a;
		for (i = 2;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			if (a > max)
			{
				max = a;
			}
			else
			{
				if (a > max2)
				{
					max2 = a;
				}
			}
		}
		System.out.printf("%d\n%d",max,max2);
		return 0;
	}

}

