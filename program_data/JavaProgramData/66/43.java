package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int total;
		int i;
		int[] mday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		total = 0;
		for (i = 1; i < month; i++)
		{
		total = total + mday[i - 1];
		}
		if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month > 2)
		{
				  total = total + 1;
		}
		total = total + day;
		int b;
		if (year % 400 != 0)
		{
			b = year % 400;
		}
		else
		{
			b = 400;
		}
		int a;
		int n;
		int n1;
		int n2;
		for (n1 = 0,a = 1;a < b;a++)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				n1++;
			}
		}
		n2 = (b - 1) - n1;
		n = 365 * n2 + 366 * n1;
		total = total + n;
		if (total % 7 == 0)
		{
			System.out.print("Sun.");
		}
		else if (total % 7 == 1)
		{
			System.out.print("Mon.");
		}
		else if (total % 7 == 2)
		{
			System.out.print("Tue.");
		}
		else if (total % 7 == 3)
		{
			System.out.print("Wed.");
		}
		else if (total % 7 == 4)
		{
			System.out.print("Thu.");
		}
		else if (total % 7 == 5)
		{
			System.out.print("Fri.");
		}
		else
		{
			System.out.print("Sat.");
		}
		return 0;
	}
}

