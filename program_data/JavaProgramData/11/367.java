package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int x;
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
		if ((y % 4 != 0) || (y % 4 == 0 && y % 100 == 0 && y % 400 != 0))
		{
			switch (m)
			{
			case 1:
				x = d;
				break;
			case 2:
				x = 31 + d;
				break;
			case 3:
				x = 31 + 28 + d;
				break;
			case 4:
				x = 31 + 28 + 31 + d;
				break;
			case 5:
				x = 31 + 28 + 31 + 30 + d;
				break;
			case 6:
				x = 31 + 28 + 31 + 30 + 31 + d;
				break;
			case 7:
				x = 31 + 28 + 31 + 30 + 31 + 30 + d;
			case 8:
				x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + d;
				break;
			case 9:
				x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d;
				break;
			case 10:
				x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
				break;
			case 11:
				x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
				break;
			case 12:
				x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
				break;
			}
		}
		else
		{
			switch (m)
			{
			case 1:
				x = d;
				break;
			case 2:
				x = 31 + d;
				break;
			case 3:
				x = 31 + 29 + d;
				break;
			case 4:
				x = 31 + 29 + 31 + d;
				break;
			case 5:
				x = 31 + 29 + 31 + 30 + d;
				break;
			case 6:
				x = 31 + 29 + 31 + 30 + 31 + d;
				break;
			case 7:
				x = 31 + 29 + 31 + 30 + 31 + 30 + d;
			case 8:
				x = 31 + 29 + 31 + 30 + 31 + 30 + 31 + d;
				break;
			case 9:
				x = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + d;
				break;
			case 10:
				x = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
				break;
			case 11:
				x = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
				break;
			case 12:
				x = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
				break;
			}
		}
		System.out.printf("%d\n",x);
		return 0;
	}
}

