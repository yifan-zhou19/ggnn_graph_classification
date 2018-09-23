package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int p;
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
		if (y % 4 == 0)
		{
			if (y % 100 == 0)
			{
				if (y % 400 == 0)
				{
					p = 29;
				}
				else
				{
					p = 28;
				}
			}
			else
			{
				p = 29;
			}
		}
		else
		{
			p = 28;
		}

		switch (m)
		{
		case 1:
		{
				System.out.printf("%d",d);
			break;
		}
		case 2:
		{
				System.out.printf("%d", d + 31);
				break;
		}
		case 3:
		{
				System.out.printf("%d", d + 31 + p);
				break;
		}
		case 4:
		{
				System.out.printf("%d", d + 31 * 2 + p);
				break;
		}
		case 5:
		{
				System.out.printf("%d", d + 31 * 2 + p + 30);
				break;
		}
		case 6:
		{
				System.out.printf("%d", d + 31 * 3 + p + 30);
				break;
		}
		case 7:
		{
				System.out.printf("%d", d + 31 * 3 + p + 30 * 2);
				break;
		}
		case 8:
		{
				System.out.printf("%d", d + 31 * 4 + p + 30 * 2);
				break;
		}
		case 9:
		{
				System.out.printf("%d", d + 31 * 5 + p + 30 * 2);
				break;
		}
		case 10:
		{
				System.out.printf("%d", d + 31 * 5 + p + 30 * 3);
				break;
		}
		case 11:
		{
				System.out.printf("%d", d + 31 * 6 + p + 30 * 3);
				break;
		}
		default:
		{
				System.out.printf("%d", d + 31 * 6 + p + 30 * 4);
		}
		}

		return 0;
	}

}

