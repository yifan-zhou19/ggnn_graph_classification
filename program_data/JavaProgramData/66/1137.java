package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
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
	int i = 1;
	int sum;
					sum = a - 1 + (a - 1) / 4 + (a - 1) / 400 - (a - 1) / 100;
					i = 1;
					for (i = 1;i <= b - 1;i++)
					{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum += 3;
			}
	if (i == 4 || i == 6 || i == 9 || i == 11)
	{
		sum += 2;
	}
	if (i == 2)
	{
		sum += 0;
	}
	if (i == 2 && ((a % 4 == 0 && a % 100 != 0) || a != 0 & 400 == 0))
	{
		sum += 1;
	}
					}
	sum += c;
	int t;
	t = sum % 7;
	if (t == 1)
	{
		System.out.print("Mon.");
	}
	if (t == 2)
	{
		System.out.print("Tue.");
	}
	if (t == 3)
	{
		System.out.print("Wed.");
	}
	if (t == 4)
	{
		System.out.print("Thu.");
	}
	if (t == 5)
	{
		System.out.print("Fri.");
	}
	if (t == 6)
	{
		System.out.print("Sat.");
	}
	if (t == 0)
	{
		System.out.print("Sun.");
	}
			return 0;
	}
}

