package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int i = 1;
		int max = 0;
		int time = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if (x >= 90 && x <= 140 && y >= 60 && y <= 90)
			{
				time += 1;
				if (time >= max)
				{
					max = time;
				}
			}
			else
			{
				time = 0;
			}
		}
		System.out.printf("%d",max);
		return 0;
	}

}

