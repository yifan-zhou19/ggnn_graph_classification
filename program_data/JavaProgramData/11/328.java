package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int y;
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
		if ((a % 4 == 0) && (a % 100 != 0))
		{
			if (b == 1)
			{
				y = c;
			}
			if (b == 2)
			{
				y = 31 + c;
			}
			if (b == 3)
			{
				y = 31 + 29 + c;
			}
			if (b == 4)
			{
				y = 31 + 29 + 31 + c;
			}
			if (b == 5)
			{
				y = 31 + 29 + 31 + 30 + c;
			}
			if (b == 6)
			{
				y = 31 + 29 + 31 + 30 + 31 + c;
			}
			if (b == 7)
			{
				y = 31 + 29 + 31 + 30 + 31 + 30 + c;
			}

			if (b == 8)
			{
				y = 31 + 29 + 31 + 30 + 31 + 30 + 31 + c;
			}
			if (b == 9)
			{
				y = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + c;
			}
			if (b == 10)
			{
				y = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + c;
			}

			if (b == 11)
			{
				y = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + c;
			}

			if (b == 12)
			{
				y = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + c;
			}
			System.out.printf("%d",y);
		}

		else if (a % 400 == 0)
		{
			if (b == 1)
			{
				y = c;
			}
			if (b == 2)
			{
				y = 31 + c;
			}
			if (b == 3)
			{
				y = 31 + 29 + c;
			}
			if (b == 4)
			{
				y = 31 + 29 + 31 + c;
			}
			if (b == 5)
			{
				y = 31 + 29 + 31 + 30 + c;
			}
			if (b == 6)
			{
				y = 31 + 29 + 31 + 30 + 31 + c;
			}
			if (b == 7)
			{
				y = 31 + 29 + 31 + 30 + 31 + 30 + c;
			}

			if (b == 8)
			{
				y = 31 + 29 + 31 + 30 + 31 + 30 + 31 + c;
			}
			if (b == 9)
			{
				y = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + c;
			}
			if (b == 10)
			{
				y = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + c;
			}

			if (b == 11)
			{
				y = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + c;
			}

			if (b == 12)
			{
				y = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + c;
			}
			System.out.printf("%d",y);
		}
		else
		{
			if (b == 1)
			{
				y = c;
			}
			if (b == 2)
			{
				y = 31 + c;
			}
			if (b == 3)
			{
				y = 31 + 28 + c;
			}
			if (b == 4)
			{
				y = 31 + 28 + 31 + c;
			}
			if (b == 5)
			{
				y = 31 + 28 + 31 + 30 + c;
			}
			if (b == 6)
			{
				y = 31 + 28 + 31 + 30 + 31 + c;
			}
			if (b == 7)
			{
				y = 31 + 28 + 31 + 30 + 31 + 30 + c;
			}

			if (b == 8)
			{
				y = 31 + 28 + 31 + 30 + 31 + 30 + 31 + c;
			}
			if (b == 9)
			{
				y = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + c;
			}
			if (b == 10)
			{
				y = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + c;
			}

			if (b == 11)
			{
				y = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + c;
			}

			if (b == 12)
			{
				y = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + c;
			}
			System.out.printf("%d",y);
		}
	return 0;
	}
}

