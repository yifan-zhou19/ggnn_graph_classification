package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int y;
	int r;
	int i;
	int result = 0;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		r = Integer.parseInt(tempVar3);
	}
	s = (n - 1) % 400 + 1;
	for (i = 1;i < s;i++)
	{
		if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
		{
		result += 2;
		}
	else
	{
		result++;
	}
	}
	for (i = 1;i < y;i++)
	{
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		{
		result += 3;
		}
	if (i == 4 || i == 6 || i == 9 || i == 11)
	{
		result += 2;
	}
	if (i == 2)
	{
		if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0)
		{
		result++;
		}
	}
	}
	result += r;
	if (result % 7 == 0)
	{
		System.out.print("Sun.");
	}
	if (result % 7 == 1)
	{
		System.out.print("Mon.");
	}
	if (result % 7 == 2)
	{
		System.out.print("Tue.");
	}
	if (result % 7 == 3)
	{
		System.out.print("Wed.");
	}
	if (result % 7 == 4)
	{
		System.out.print("Thu.");
	}
	if (result % 7 == 5)
	{
		System.out.print("Fri.");
	}
	if (result % 7 == 6)
	{
		System.out.print("Sat.");
	}
	return 0;
	}

}

