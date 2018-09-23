package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int day;
		int m;
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
		if (a % 4 == 0 && a % 100 != 0 || a % 4 == 0 && a % 400 == 0)
		{
			m = 29;
		}
		else
		{
			m = 28;
		}
		switch (b)
		{
			case 1:
				day = c;
				break;
			case 2:
				day = 31 + c;
				break;
			case 3:
				day = 31 + m + c;
				break;
			case 4:
				day = 31 + m + 31 + c;
				break;
			case 5:
				day = 31 + m + 31 + 30 + c;
				break;
			case 6:
				day = 31 + m + 31 + 30 + 31 + c;
				break;
			case 7:
				day = 31 + m + 31 + 30 + 31 + 30 + c;
				break;
			case 8:
				day = 31 + m + 31 + 30 + 31 + 30 + 31 + c;
				break;
			case 9:
				day = 31 + m + 31 + 30 + 31 + 30 + 31 + 31 + c;
				break;
			case 10:
				day = 31 + m + 31 + 30 + 31 + 30 + 31 + 31 + 30 + c;
				break;
			case 11:
				day = 31 + m + 31 + 30 + 31 + 30 + 31 + 31 + 31 + 30 + c;
				break;
			case 12:
				day = 31 + m + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 30 + 31 + c;
				break;
		}
		System.out.printf("%d",day);
		return 0;
	}
}

