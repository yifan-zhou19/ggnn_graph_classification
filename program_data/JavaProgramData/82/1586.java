package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		int y = 0;
		int max = 0;
		for (int i = 0;i < x;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		{
			y++;
		if (y >= max)
		{
			max = y;
		}
		}

		else
		{
			y = 0;
		}
		}
		System.out.printf("%d",max);
		return 0;
	}
}

