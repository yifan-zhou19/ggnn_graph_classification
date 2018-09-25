package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int a;
		int b;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			switch (a)
			{
			case 0:
			case 1:
				m = 0;
				break;
			case 2:
				m = 1;
				break;
			case 3:
				m = 0;
				break;
			case 4:
				m = 1;
				break;
			case 5:
				m = 1;
				break;
			case 6:
				m = 2;
				break;
			case 7:
				m = 2;
				break;
			case 8:
				m = 3;
				break;
			case 9:
				m = 4;
				break;
			case 10:
				m = 4;
				break;
			case 11:
				m = 5;
				break;
			case 12:
				m = 5;
				break;
			}
			n = 30 * (a - 1) + m + b;
		}
		else
		{
			switch (a)
			{
			case 0:
					  case 1:
						  m = 0;
						  break;
			case 2:
				m = 1;
				break;
			case 3:
				m = -1;
				break;
			case 4:
				m = 0;
				break;
			case 5:
				m = 0;
				break;
			case 6:
				m = 1;
				break;
			case 7:
				m = 1;
				break;
			case 8:
				m = 2;
				break;
			case 9:
				m = 3;
				break;
			case 10:
				m = 3;
				break;
			case 11:
				m = 4;
				break;
			case 12:
				m = 4;
				break;
			}
			n = 30 * (a - 1) + m + b;
		}
		System.out.printf("%d\n",n);
		return 0;
	}
}

