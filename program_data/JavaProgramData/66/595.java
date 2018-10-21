package <missing>;

public class GlobalMembers
{
	public static int y;
	public static int m;
	public static int d;
	public static int ny;
	public static int nm;
	public static int date;

	public static int Main()
	{

		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		t = ((y - 1) - (y - 1) % 4) / 4 - ((y - 1) - (y - 1) % 100) / 100 + ((y - 1) - (y - 1) % 400) / 400;

		ny = (y - 1) * (365 % 7) + t;
			if (m == 1)
			{
				nm = 0;
			}
			if (m == 2)
			{
				nm = 31;
			}
			if (m == 3)
			{
				if (y % 4 == 0)
				{
					nm = (31 + 29);
				}
				else
				{
					nm = (31 + 28);
				}
			}
			if (m == 4)
			{
				if (y % 4 == 0)
				{
					nm = 31 * 2 + 29;
				}
				else
				{
					nm = 31 * 2 + 28;
				}
			}
			if (m == 5)
			{
				if (y % 4 == 0)
				{
					nm = 31 * 2 + 30 + 29;
				}
				else
				{
					nm = 31 * 2 + 30 + 28;
				}
			}
			if (m == 6)
			{
				if (y % 4 == 0)
				{
					nm = 31 * 3 + 30 + 29;
				}
				else
				{
					nm = 31 * 3 + 30 + 28;
				}
			}
			if (m == 7)
			{
				if (y % 4 == 0)
				{
					nm = 31 * 3 + 30 * 2 + 29;
				}
				else
				{
					nm = 31 * 3 + 30 * 2 + 28;
				}
			}
			if (m == 8)
			{
				if (y % 4 == 0)
				{
					nm = 31 * 4 + 30 * 2 + 29;
				}
				else
				{
					nm = 31 * 4 + 30 * 2 + 28;
				}
			}
			if (m == 9)
			{
				if (y % 4 == 0)
				{
					nm = 31 * 5 + 30 * 2 + 29;
				}
				else
				{
					nm = 31 * 5 + 30 * 2 + 28;
				}
			}
			if (m == 10)
			{
				if (y % 4 == 0)
				{
					nm = 31 * 5 + 30 * 3 + 29;
				}
				else
				{
					nm = 31 * 5 + 30 * 3 + 28;
				}
			}
			if (m == 11)
			{
				if (y % 4 == 0)
				{
					nm = 31 * 6 + 30 * 3 + 29;
				}
				else
				{
					nm = 31 * 6 + 30 * 3 + 28;
				}
			}
			if (m == 12)
			{
				if (y % 4 == 0)
				{
					nm = 31 * 6 + 30 * 4 + 29;
				}
				else
				{
					nm = 31 * 6 + 30 * 4 + 28;
				}
			}
		date = ny % 7 + nm % 7 + d % 7;
			if (date % 7 == 1)
			{
				System.out.print("Mon.\n");
			}
			if (date % 7 == 2)
			{
				System.out.print("Tue.\n");
			}
			if (date % 7 == 3)
			{
				System.out.print("Wed.\n");
			}
			if (date % 7 == 4)
			{
				System.out.print("Thu.\n");
			}
			if (date % 7 == 5)
			{
				System.out.print("Fri.\n");
			}
			if (date % 7 == 6)
			{
				System.out.print("Sat.\n");
			}
			if (date % 7 == 0)
			{
				System.out.print("Sun.\n");
			}
		return 0;
	}

}

