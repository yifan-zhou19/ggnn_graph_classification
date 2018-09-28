package <missing>;

public class GlobalMembers
{
	public static int run(int y)
	{
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			return 1;
		}
		return 0;
	}
	public static void xingqi(int x)
	{
			switch (x)
			{
			case 0:
				System.out.print("Sun.\n");
				break;
			case 1:
				System.out.print("Mon.\n");
				break;
			case 2:
				System.out.print("Tue.\n");
				break;
			case 3:
				System.out.print("Wed.\n");
				break;
			case 4:
				System.out.print("Thu.\n");
				break;
			case 5:
				System.out.print("Fri.\n");
				break;
			case 6:
				System.out.print("Sat.\n");
				break;
			}
	}

	public static int Main()
	{
		int[] days = {0, 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		int y;
		int m;
		int d;
		int w;
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
		w = y % 7 + (y / 4 - y / 100 + y / 400) - 1;
		w += d;
		if (run(y) != 0)
		{
			w--;
			days[2]++;
		}
		for (i = 1;i < m;i++)
		{
			w += days[i];
		}
		xingqi(w % 7);
		return 0;
	}

}

