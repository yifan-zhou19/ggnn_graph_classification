package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int b;
	int c;
	int leap = 0;
	int day = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
	{
		leap = 1;
	}
	b--;
	while (b != 0)
	{
		if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12)
		{
			b--;
			day += 31;
		}
			if (b == 2)
			{
			b--;
			day += 28 + leap;
			}
			if (b == 4 || b == 6 || b == 9 || b == 11)
			{
			b--;
			day += 30;
			}
	}
	day += c;
	System.out.printf("%d",day);
	}
}

