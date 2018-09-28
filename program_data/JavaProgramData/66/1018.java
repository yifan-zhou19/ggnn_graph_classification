package <missing>;

public class GlobalMembers
{
	public static int fun2(int a)
	{
		if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0))
		{
			return 1;
		}
		return 0;

	}
	public static int fun3(int a,int b)
	{
		switch (a)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 3;
		case 2:
			if ((b % 400 == 0) || (b % 4 == 0 && b % 100 != 0))
			{
				  return 1;
			}
				 else
				 {
				  return 0;
				 }
		default:
			return 2;
		}
	}
	public static void print(int a)
	{
		switch (a)
		{
		case 1:
			System.out.print("Mon.\n");
			break;
		case 2:
			System.out.print("Tue.\n");
			break;
		case 3:
			System.out.print("Wed.\n");
			break;
		case 4:
			System.out.print("Thu.\n");
			break;
		case 5:
			System.out.print("Fri.\n");
			break;
		case 6:
			System.out.print("Sat.\n");
			break;
		case 0:
			System.out.print("Sun.\n");
			break;


		}
	}
	public static void Main()
	{


		int year;
		int month;
		int day;
		int i;
		int d = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		for (i = (year - (year - 1) % 400);i < year;i++)
		{
			if (fun2(i) != 0)
			{
				d += 2;
			}
			else
			{
				d += 1;
			}
		}
		for (i = 1;i < month;i++)
		{
			d += fun3(i, year);
		}
		 d += day;
		d %= 7;
		print(d);

	}

}

