package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] daysa = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] daysb = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y;
		int m;
		int d;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		int i;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			for (i = 1;i <= m - 1;i++)
			{
				num = num + daysa[i - 1];
			}
			num = num + d;
		}
		else
		{
			for (i = 1;i <= m - 1;i++)
			{
				num = num + daysb[i - 1];
			}
			num = num + d;
		}
		System.out.printf("%d\n",num);
		return 0;
	}

}

