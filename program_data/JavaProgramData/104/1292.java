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
		int[] xp = new int[12];
		int[] yp = new int[12];
		xp[0] = x;
		yp[0] = y;
		int xstp = 0;
		int ystp = 0;
		int i;
		for (i = 1;x > 1;i++)
		{
			x = x / 2;
			xp[i] = x;
			xstp += 1;
		}
		for (i = 1;y > 1;i++)
		{
			y = y / 2;
			yp[i] = y;
			ystp += 1;
		}
		for (i = 0;;i++)
		{
			if (xp[0] == yp[0])
			{
				System.out.printf("%d",xp[0]);
				break;
			}
			if (xp[xstp - i - 1] != yp[ystp - i - 1] && xp[xstp - i] == yp[ystp - i])
			{
				System.out.printf("%d",xp[xstp - i]);
				break;
			}
		}
		return 0;
	}

}

