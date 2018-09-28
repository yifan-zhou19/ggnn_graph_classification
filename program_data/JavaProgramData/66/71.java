package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int y1;
		int t;
		int n;

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

		y1 = (y - 1) % 400;
		t = 0;

		if (m > 2 && (y % 4 == 0 && y % 100 != 0 || y % 400 == 0))
		{
				t += 1;
		}

		for (;y1 > 0;y1--)
		{
			if (y1 % 4 == 0 && y1 % 100 != 0 || y1 % 400 == 0)
			{
				t += 366;
			}
			else
			{
				t += 365;
			}
		}

		for (m--;m > 0;m--)
		{
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			{
				t += 31;
			}
			else if (m == 2)
			{
				t += 28;
			}
			else
			{
				t += 30;
			}
		}

		t += d;

		n = t % 7;

		switch (n)
		{
			case 0:
			{
					System.out.print("Sun.");
					break;
			}
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
		}

		return 0;
	}
}

