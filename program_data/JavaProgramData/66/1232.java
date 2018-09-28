package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int total = 0;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		total = (a - 1) * 1 + (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400;


		for (int i = 1;i < b;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				total += 30;
			}
			else if (i == 2)
			{
				if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
				{
					total += 29;
				}
				else
				{
					total += 28;
				}
			}
		}
		d = (total + c) % 7;

		switch (d)
		{
		case 0:
			System.out.print("Sun.");
			break;
		case 1:
			System.out.print("Mon.");
			break;
		case 2:
			System.out.print("Tue.");
			break;

		case 3:
			System.out.print("Wed.");
			break;
		case 4:
			System.out.print("Thu.");
			break;
		 case 5:
			System.out.print("Fri.");
			break;
		  case 6:
			System.out.print("Sat.");
			break;
		}
		return 0;
	}

}

