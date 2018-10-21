package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d = 0;
		int m = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (scanf(",%d", c) == '\n')
		{
			System.out.print("No");
		}
		else
		{
		while (scanf(",%d", b) != 0)
		{
			m = 0;
			n = b;
			if (a != b || a != c || b != c)
			{
				d = 1;
			}
			if (m <= a)
			{
				m = a;
			}
			if (m <= b)
			{
				m = b;
			}
			if (m <= c)
			{
				m = c;
			}
			if (n >= a)
			{
				n = a;
			}
			if (n >= b)
			{
				n = b;
			}
			if (n >= c)
			{
				n = c;
			}
			if (a > n && a < m)
			{
				c = a;
			}
			else
			{
				if (b > n && b < m)
				{
				c = b;
				}
			else
			{
				if (c > n && c < m)
				{
				c = c;
				}
			else
			{
				c = n;
			}
			}
			}
			a = m;
		}
		if (d == 1)
		{
		System.out.printf("%d",c);
		}
		else
		{
			System.out.print("No");
		}
		}
		return 0;
	}


}

