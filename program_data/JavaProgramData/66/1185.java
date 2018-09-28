package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int total;
		int n;
		int m;
		int l;
		int a;
		int b;
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
		n = year - 1;
		total = n;
		l = (year - 1) / 4;
		b = (year - 1) / 100;
		a = (year - 1) / 400;
		total = total + l - b + a;
		for (m = 1;m < month;m++)
		{
			if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) || (m == 10) || (m == 12))
			{
				total += 3;
			}
			else if ((m == 4) || (m == 6) || (m == 9) || (m == 11))
			{
				total += 2;
			}
			if (m == 2)
			{
				if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
				{
					total = total + 1;
				}
				else
				{
					total = total + 0;
				}
			}
		}
		total = total + day;
		if (total % 7 == 1)
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
		else if (total % 7 == 6)
		{
			System.out.print("Sat.");
		}
		else if (total % 7 == 0)
		{
			System.out.print("Sun.");
		}
	  return 0;
	}


}

