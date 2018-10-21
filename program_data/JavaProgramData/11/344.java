package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int y;
		int m;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			if (m == 1)
			{
				System.out.printf("%d",d);
			}

	if (m == 2)
	{
				System.out.printf("%d",d + 31);
	}
	if (m == 3)
	{
				System.out.printf("%d",d + 31 + 29);
	}
	if (m == 4)
	{
				System.out.printf("%d",d + 31 + 29 + 31);
	}
	if (m == 5)
	{
				System.out.printf("%d",d + 31 + 29 + 31 + 30);
	}
				if (m == 6)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 30 + 31);
				}
				if (m == 7)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 30 + 31 + 30);
				}
				if (m == 8)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 30 + 31 + 30 + 31);
				}
				if (m == 9)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31);
				}
				if (m == 10)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30);
				}
				if (m == 11)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 31 + 30 + 30 + 31 + 31 + 30 + 31);
				}
				if (m == 12)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 31 + 30 + 30 + 31 + 31 + 30 + 31 + 30);
				}
		}
		else
		{
		if (m == 1)
		{
				System.out.printf("%d",d);
		}

	if (m == 2)
	{
				System.out.printf("%d",d + 31);
	}
	if (m == 3)
	{
				System.out.printf("%d",d + 31 + 28);
	}
	if (m == 4)
	{
				System.out.printf("%d",d + 31 + 28 + 31);
	}
	if (m == 5)
	{
				System.out.printf("%d",d + 31 + 29 + 30 + 30);
	}
				if (m == 6)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 30 + 30);
				}
				if (m == 7)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 30 + 30 + 30);
				}
				if (m == 8)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 30 + 31 + 30 + 30);
				}
				if (m == 9)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 30);
				}
				if (m == 10)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 29);
				}
				if (m == 11)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 31 + 30 + 30 + 31 + 31 + 30 + 30);
				}
				if (m == 12)
				{
					System.out.printf("%d",d + 31 + 29 + 31 + 31 + 30 + 30 + 31 + 31 + 30 + 31 + 29);
				}
		}
	}
}

