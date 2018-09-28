package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int s;
		int d;
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
		if (b == 1)
		{
			s = 0;
		}
		else if (b == 2)
		{
			s = 31;
		}
		else if (b == 3)
		{
			if (a % 4 == 0 || a % 400 == 0)
			{
				s = 31 + 29;
			}
			else
			{
				s = 31 + 28;
			}
		}
		else if (b == 4)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				s = 31 + 29 + 31;
			}
			else
			{
				s = 31 + 28 + 31;
			}
		}
		else if (b == 5)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				s = 31 + 29 + 31 + 30;
			}
			else
			{
				s = 31 + 28 + 31 + 30;
			}
		}
		else if (b == 6)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				s = 31 + 29 + 31 + 30 + 31;
			}
			else
			{
				s = 31 + 28 + 31 + 30 + 31;
			}
		}
		else if (b == 7)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				s = 31 + 29 + 31 + 30 + 31 + 30;
			}
			else
			{
				s = 31 + 28 + 31 + 30 + 31 + 30;
			}
		}
		else if (b == 8)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				s = 31 + 29 + 31 + 30 + 31 + 30 + 31;
			}
			else
			{
				s = 31 + 28 + 31 + 30 + 31 + 30 + 31;
			}
		}
		else if (b == 9)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				s = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
			}
			else
			{
				s = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			}
		}
	   else if (b == 10)
	   {
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				s = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			}
			else
			{
				s = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			}
	   }
		else if (b == 11)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				s = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			}
			else
			{
				s = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			}
		}
		else if (b == 12)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				s = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			}
			else
			{
				s = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			}
		}
		a--;
		d = a + a / 4 + a / 400 - a / 100;
		y = (s + c + d) % 7;
		if (y == 1)
		{
			System.out.print("Mon.");
		}
		else if (y == 2)
		{
			System.out.print("Tue.");
		}
		else if (y == 3)
		{
			System.out.print("Wed.");
		}
		else if (y == 4)
		{
			System.out.print("Thu.");
		}
		else if (y == 5)
		{
			System.out.print("Fri.");
		}
		else if (y == 6)
		{
			System.out.print("Sat.");
		}
		else if (y == 0)
		{
			System.out.print("Sun.");
		}

		return 0;
	}
}

