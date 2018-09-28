package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int r;
		int k;
		int i;
		int sum = 0;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = Integer.parseInt(tempVar3);
		}
		n = n % 2800;
		for (i = 1;i < n;i++)
		{
			if (i % 100 != 0 && i % 4 == 0 || i % 400 == 0)
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		for (k = 1;k < y;k++)
		{
			if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
			{
				sum += 31;
			}
			if (k == 4 || k == 6 || k == 9 || k == 11)
			{
				sum += 30;
			}
			if (k == 2)
			{
				if (n % 100 != 0 && n % 4 == 0 || n % 400 == 0)
				{
					sum += 29;
				}
				else
				{
					sum += 28;
				}
			}
		}
		sum += r;
		switch (x = sum % 7)
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

