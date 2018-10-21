package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int num;
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
		switch (m)
		{
		case 1:
			num = d;
			break;
		case 2:
			num = 31 + d;
			break;
		case 3:
			num = 59 + d;
			break;
		case 4:
			num = 90 + d;
			break;
		case 5:
			num = 120 + d;
			break;
		case 6:
			num = 151 + d;
			break;
		case 7:
			num = 181 + d;
			break;
		case 8:
			num = 212 + d;
			break;
		case 9:
			num = 243 + d;
			break;
		case 10:
			num = 273 + d;
			break;
		case 11:
			num = 304 + d;
			break;
		case 12:
			num = 334 + d;
			break;
		}
		if (((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) && (m > 2))
		{
			num = num + 1;
		}
			 System.out.printf("%d\n",num);
		return 0;
	}


}

