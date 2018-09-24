package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int day;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		a--;
		day = a;
		day = a + a / 4 + a / 400 - a / 100;
		a++;
		if (b == 1)
		{
			day += c;
		}
		else
		{
			if (b == 2)
			{
				day = day + c + 31;
			}
			else
			{
					if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0) && (a % 3200 != 0))
					{
						   day = day + 31 + 29 + c;
					}
					else
					{
						   day = day + 31 + 28 + c;
					}
					for (i = 3;i < b;i++)
					{
					if ((i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10))
					{
						day += 31;
					}
					else
					{
						day += 30;
					}
					}
			}
		}
		day = day % 7;
		switch (day)
		{
		case 1:
		{
			System.out.print("Mon.");
			break;
		}
		case 2:
		{
			System.out.print("Tue.");
			break;
		}
		case 3:
		{
			System.out.print("Wed.");
			break;
		}
		case 4:
		{
			System.out.print("Thu.");
			break;
		}
		case 5:
		{
			System.out.print("Fri.");
			break;
		}
		case 6:
		{
			System.out.print("Sat.");
			break;
		}
		case 0:
		{
			System.out.print("Sun.");
			break;
		}
		}
		return 0;
	}

}

