package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
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
		d = a + (a - 1) / 4 + (a - 1) / 400 - (a - 1) / 100 - 1;
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			if (b == 1)
			{
				e = (c + d) % 7;
			}
			if (b == 2)
			{
				e = (c + d + 3) % 7;
			}
			if (b == 3)
			{
				e = (c + d + 4) % 7;
			}
			if (b == 4)
			{
				e = (c + d) % 7;
			}
			if (b == 5)
			{
				e = (c + d + 2) % 7;
			}
			if (b == 6)
			{
				e = (c + d + 5) % 7;
			}
			if (b == 7)
			{
				e = (c + d) % 7;
			}
			if (b == 8)
			{
				e = (c + d + 3) % 7;
			}
			if (b == 9)
			{
				e = (c + d + 6) % 7;
			}
			if (b == 10)
			{
				e = (c + d + 1) % 7;
			}
			if (b == 11)
			{
				e = (c + d + 4) % 7;
			}
			if (b == 12)
			{
				e = (c + d + 6) % 7;
			}
		}
		else
		{
			if (b == 1)
			{
				e = (c + d) % 7;
			}
			if (b == 2)
			{
				e = (c + d + 3) % 7;
			}
			if (b == 3)
			{
				e = (c + d + 3) % 7;
			}
			if (b == 4)
			{
				e = (c + d - 1) % 7;
			}
			if (b == 5)
			{
				e = (c + d + 1) % 7;
			}
			if (b == 6)
			{
				e = (c + d + 4) % 7;
			}
			if (b == 7)
			{
				e = (c + d - 1) % 7;
			}
			if (b == 8)
			{
				e = (c + d + 2) % 7;
			}
			if (b == 9)
			{
				e = (c + d + 5) % 7;
			}
			if (b == 10)
			{
				e = (c + d) % 7;
			}
			if (b == 11)
			{
				e = (c + d + 3) % 7;
			}
			if (b == 12)
			{
				e = (c + d + 5) % 7;
			}
		}
		if (e == 1)
		{
			System.out.print("Mon.");
		}
		if (e == 2)
		{
			System.out.print("Tue.");
		}
		if (e == 3)
		{
			System.out.print("Wen.");
		}
		if (e == 4)
		{
			System.out.print("Tur.");
		}
		if (e == 5)
		{
			System.out.print("Fri.");
		}
		if (e == 6)
		{
			System.out.print("Sat.");
		}
		if (e == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}

}

