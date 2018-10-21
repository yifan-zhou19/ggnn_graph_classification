package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int m;
		int n;
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
		m = a - 1 + (a - 1) / 400 * 97 + (a - 1) % 400 / 4 - (a - 1) % 400 / 100;
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
		{
			if (b == 1)
			{
				n = c;
			}
			if (b == 2)
			{
				n = 3 + c;
			}
			if (b == 3)
			{
				n = 4 + c;
			}
			if (b == 4)
			{
				n = c;
			}
			if (b == 5)
			{
				n = 2 + c;
			}
			if (b == 6)
			{
				n = 5 + c;
			}
			if (b == 7)
			{
				n = c;
			}
			if (b == 8)
			{
				n = 3 + c;
			}
			if (b == 9)
			{
				n = 6 + c;
			}
			if (b == 10)
			{
				n = 1 + c;
			}
			if (b == 11)
			{
				n = 4 + c;
			}
			if (b == 12)
			{
				n = 6 + c;
			}
		}
		else
		{
			if (b == 1)
			{
				n = c;
			}
			if (b == 2)
			{
				n = 3 + c;
			}
			if (b == 3)
			{
				n = 3 + c;
			}
			if (b == 4)
			{
				n = 6 + c;
			}
			if (b == 5)
			{
				n = 1 + c;
			}
			if (b == 6)
			{
				n = 4 + c;
			}
			if (b == 7)
			{
				n = 6 + c;
			}
			if (b == 8)
			{
				n = 2 + c;
			}
			if (b == 9)
			{
				n = 5 + c;
			}
			if (b == 10)
			{
				n = c;
			}
			if (b == 11)
			{
				n = 3 + c;
			}
			if (b == 12)
			{
				n = 5 + c;
			}
		}
		if ((m + n) % 7 == 1)
		{
			System.out.print("Mon.");
		}
		if ((m + n) % 7 == 2)
		{
			System.out.print("Tue.");
		}
		if ((m + n) % 7 == 3)
		{
			System.out.print("Wed.");
		}
		if ((m + n) % 7 == 4)
		{
			System.out.print("Thu.");
		}
		if ((m + n) % 7 == 5)
		{
			System.out.print("Fri.");
		}
		if ((m + n) % 7 == 6)
		{
			System.out.print("Sat.");
		}
		if ((m + n) % 7 == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}

}

