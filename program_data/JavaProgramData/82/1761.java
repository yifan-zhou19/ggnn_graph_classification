package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int hours1 = 0;
		int hours2 = 0;
		int max;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
			hours1 = hours1 + 1;
			}
			else
			{
				if (hours2 <= hours1)
				{
					hours2 = hours1;
					hours1 = 0;
				}
				else
				{
					hours1 = 0;
				}
			}
		}
		if (hours1 > hours2)
		{
		max = hours1;
		}
		else
		{
		max = hours2;
		}
		System.out.printf("%d",max);
		return 0;
	}
}

