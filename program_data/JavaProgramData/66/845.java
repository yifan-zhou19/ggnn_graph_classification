package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int year;
	int month;
	int day;
	int i;
	int sum = 0;
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
	year = (year - 1) % 400 + 1;
	for (i = 1;i < year;i++)
	{
		if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
		{
			sum += 2;
		}
	else
	{
		sum += 1;
	}
	}
	for (i = 1; i < month; i++)
	{
	if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
	{
		sum += 3;
	}
	else if (i == 4 || i == 6 || i == 9 || i == 11)
	{
		sum += 2;
	}
	else if (i == 2 && (year % 4 == 0 && i % 100 != 0 || i % 400 == 0))
	{
		sum += 1;
	}
	}
	for (i = 1; i <= day;i++)
	{
		sum++;
	}
	if (sum % 7 == 0)
	{
		System.out.print("Sun.");
	}
	else if (sum % 7 == 1)
	{
		System.out.print("Mon.");
	}
	else if (sum % 7 == 2)
	{
		System.out.print("Tue.");
	}
	else if (sum % 7 == 3)
	{
		System.out.print("Wed.");
	}
	else if (sum % 7 == 4)
	{
		System.out.print("Thu.");
	}
	else if (sum % 7 == 5)
	{
		System.out.print("Fri.");
	}
	else if (sum % 7 == 6)
	{
		System.out.print("Sat.");
	}
	return 0;
	}
}

