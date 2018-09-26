package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		b = 0;
		i = 0;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if ((x == 0) && (y == 1))
			{
				a = a + 1;
			}
			else if ((x == 0) && (y == 2))
			{
				b = b + 1;
			}
			else if ((x == 1) && (y == 0))
			{
				b = b + 1;
			}
			else if ((x == 1) && (y == 2))
			{
				a = a + 1;
			}
			else if ((x == 2) && (y == 0))
			{
				a = a + 1;
			}
			else if ((x == 2) && (y == 1))
			{
				b = b + 1;
			}
			i = i + 1;
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (a < b)
		{
			System.out.print("B");
		}
		if ((a = b) != 0)
		{
			System.out.print("Tie");
		}
	return 0;
	}

}

