package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] days2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int total = 0;
		int y;
		int m;
		int d;
		int n;
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
		y = (int)(y % 2000);
		if (y == 0)
		{
			y = 2000;
		}
		for (i = 1;i < y;i++)
		{
			if ((i % 4 == 0) && (i % 100 != 0))
			{
				total = total + 366;
			}
			else
			{
				if (i % 400 == 0)
				{
					total = total + 366;
				}
				else
				{
					total = total + 365;
				}
			}
		}
		for (i = 0; i < m - 1;i++)
		{
			if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
			{

				total = total + days2[i];
			}

			else
			{
				total = total + days1[i];
			}
		}
	   total = total + d;
		n = (int)(total % 7);
		switch (n)
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
		return 0;
	}


}

