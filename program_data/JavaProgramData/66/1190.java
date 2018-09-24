package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		int j;
		int s = 0;
		int n = 0;
		int y;
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

		A = (a - 1) / 4;
		B = A / 25;
		C = B / 4;
		s = A + C - B;
		n = 2 * s + 1 * (a - 1 - s);

	for (j = 1;j < b;j++)
	{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
			{
				n += 31;
			}
			else if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				n += 30;
			}
			else
			{
				if ((a % 400 == 0) || (a % 4 == 0) && (a % 100 != 0))
				{
					n += 29;
				}
				else
				{
					n += 28;
				}
			}
	}
		n += c;
		y = n % 7;
		switch (y)
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

