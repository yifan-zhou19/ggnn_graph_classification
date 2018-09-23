package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		int[] xroute = new int[20];
		int[] yroute = new int[20];
		xroute[0] = x;
		yroute[0] = y;
		int i;
		int j;
		int a;
		int b;
		for (i = 1; i < 20; i++)
		{
			if (xroute[i - 1] == 1)
			{
				break;
			}
			if (xroute[i - 1] % 2 == 0)
			{
				xroute[i] = xroute[i - 1] / 2;
			}
			else
			{
				xroute[i] = (xroute[i - 1] - 1) / 2;
			}
		}
		a = i - 1;
		for (i = 1; i < 20; i++)
		{
			if (yroute[i - 1] == 1)
			{
				break;
			}
			if (yroute[i - 1] % 2 == 0)
			{
				yroute[i] = yroute[i - 1] / 2;
			}
			else
			{
				yroute[i] = (yroute[i - 1] - 1) / 2;
			}
		}
		b = i - 1;
		for (i = 0; i <= a; i++)
		{
			for (j = 0; j <= b; j++)
			{
				if (xroute[i] == yroute[j])
				{
					System.out.printf("%d\n",xroute[i]);
					return 1;
				}
			}
		}
		return 0;
	}
}

