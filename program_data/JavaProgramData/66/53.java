package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int d;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int y,i,date=0;
		int y;
		int i;
		int date = 0;
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
		y = y - (y / 2800 - 1) * 2800;
		for (i = 1;i < y;i++)
		{
			if (i % 100 != 0 && i % 4 == 0 || i % 400 == 0)
			{
				date += 2;
			}
			else
			{
				date += 1;
			}
		}
		for (i = 1;i < m;i++)
		{
			if (i == 2)
			{
				if (y % 100 != 0 && y % 4 == 0 || y % 400 == 0)
				{
					date += 1;
				}
				continue;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				date += 2;
				continue;
			}
			date += 3;
		}
		date += d;
		switch (date % 7)
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

