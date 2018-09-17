package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
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
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			switch (m)
			{
			case 1:
				n = d;
				break;
			case 2:
				n = 31 + d;
				break;
			case 3:
				n = d + 31 + 29;
				break;
			case 4:
				n = d + 31 * 2 + 29;
				break;
			case 5:
				n = d + 29 + 31 * 2 + 30;
				break;
			case 6:
				n = d + 29 + 31 * 3 + 30;
				break;
			case 7:
				n = d + 29 + 31 * 3 + 30 * 2;
				break;
			case 8:
				n = d + 29 + 31 * 4 + 30 * 2;
				break;
			case 9:
				n = d + 29 + 31 * 5 + 30 * 2;
				break;
			case 10:
				n = d + 29 + 31 * 5 + 30 * 3;
				break;
			case 11:
				n = d + 29 + 31 * 6 + 30 * 3;
				break;
			case 12:
				n = d + 29 + 31 * 6 + 30 * 4;
				break;

			}
		}
		else
		{
			switch (m)
			{
			case 1:
				n = d;
				break;
			case 2:
				n = 31 + d;
				break;
			case 3:
				n = d + 31 + 28;
				break;
			case 4:
				n = d + 31 * 2 + 28;
				break;
			case 5:
				n = d + 28 + 31 * 2 + 30;
				break;
			case 6:
				n = d + 28 + 31 * 3 + 30;
				break;
			case 7:
				n = d + 28 + 31 * 3 + 30 * 2;
				break;
			case 8:
				n = d + 28 + 31 * 4 + 30 * 2;
				break;
			case 9:
				n = d + 28 + 31 * 5 + 30 * 2;
				break;
			case 10:
				n = d + 28 + 31 * 5 + 30 * 3;
				break;
			case 11:
				n = d + 28 + 31 * 6 + 30 * 3;
				break;
			case 12:
				n = d + 28 + 31 * 6 + 30 * 4;
				break;

			}

		}
		System.out.printf("%d",n);
		return 0;
	}
}

