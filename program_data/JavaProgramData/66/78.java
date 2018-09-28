package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int a;
		int b;
		int c = 0;
		int i;
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		for (;year > 10000;)
		{
			year = year - 10000;
		}
		a = year / 4 - year / 100 + year / 400;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			a--;
			d[1]++;
		}
		b = (year - 1) * 365 + a + day;
		for (i = 0;i < month - 1;i++)
		{
			c += d[i];
		}
		c += b;
		int e = c % 7;
		if (e == 1)
		{
			System.out.print("Mon.");
		}
		else if (e == 2)
		{
			System.out.print("Tue.");
		}
		else if (e == 3)
		{
			System.out.print("Wed.");
		}
		else if (e == 4)
		{
			System.out.print("Thu.");
		}
		else if (e == 5)
		{
			System.out.print("Fri.");
		}
		else if (e == 6)
		{
			System.out.print("Sat.");
		}
		else
		{
			System.out.print("Sun.");
		}
		return 0;
	}

}

