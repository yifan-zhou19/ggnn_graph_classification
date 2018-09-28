package <missing>;

public class GlobalMembers
{
	public static int[] dd = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 344};

	public static int Main()
	{
		int y;
		int m;
		int d;
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

		int l = (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;


		if (m > 2 && y % 4 == 0)
		{
			if (y % 100 == 0)
			{
				if (y % 400 == 0)
				{
					l++;
				}
			}
			else
			{
				l++;
			}
		}

		int mod = (((y - 1) * (365 % 7)) % 7 + l + dd[m] + d) % 7;

		switch (mod)
		{
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
		case 0:
			System.out.print("Sun.\n");
			break;
		}

		return 0;
	}
}

