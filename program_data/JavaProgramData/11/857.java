package <missing>;

public class GlobalMembers
{
	public static int rn(int y)
	{
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
		int res = 0;
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int i;
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

		for (i = 0;i < m;i++)
		{
			res = res + day[i];
		}
		if (rn(y) == 1)
		{
			if (m >= 3)
			{
				System.out.printf("%d\n",res + d + 1);
			}
			else
			{
				System.out.printf("%d\n",res + d);
			}
		}
		if (rn(y) == 0)
		{
			System.out.printf("%d\n",res + d);
		}
		return 0;
	}



}

