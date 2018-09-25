package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int time;
		int max;
		time = 0;
		max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		for (i = 1;i <= n;i++)
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
			time++;
				if (time > max)
				{
				max = time;
				}
				else
				{
				max = max;
				}

			}
			else
			{
				if (time > max)
				{
				max = time;
				}
				else
				{
				max = max;
				time = 0;
				}
			}
		}
		System.out.printf("%d",max);
		return 0;
	}
}

