package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int d;
		int w;
		int i;
		int y;
		int sum;
		String nian = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nian = tempVar.charAt(0);
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
		n = nian.length();
		y = 0;
		if (n > 5)
		{
			for (i = n - 5;i < n;i++)
			{
			   y = y * 10 + nian.charAt(i) - '0';
			}
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				y = y * 10 + nian.charAt(i) - '0';
			}
		}
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
		{
			sum = 365 * (y - 1) + y / 4 - y / 100 + y / 400 - 1;
			if (m == 1)
			{
				sum += 0;
			}
			if (m == 2)
			{
				sum += 31;
			}
			if (m > 2 && m <= 7)
			{
				sum = sum + (m - 1) * 30 + (m - 2) / 2;
			}
			if (m >= 8 && m <= 12)
			{
				sum = sum + (m - 1) * 30 + (m - 1) / 2;
			}
		}
		else
		{
			sum = 365 * (y - 1) + y / 4 - y / 100 + y / 400;
			if (m == 1)
			{
				sum += 0;
			}
			if (m == 2)
			{
				sum += 31;
			}
			if (m > 2 && m <= 7)
			{
				sum = sum + (m - 1) * 30 + (m - 2) / 2 - 1;
			}
			if (m >= 8 && m <= 12)
			{
				sum = sum + (m - 1) * 30 + (m - 1) / 2 - 1;
			}
		}

		sum = sum + d;
		w = sum % 7;
		if (w == 1)
		{
			System.out.print("Mon.");
		}
		if (w == 2)
		{
			System.out.print("Tue.");
		}
		if (w == 3)
		{
			System.out.print("Wed.");
		}
		if (w == 4)
		{
			System.out.print("Thu.");
		}
		if (w == 5)
		{
			System.out.print("Fri.");
		}
		if (w == 6)
		{
			System.out.print("Sat.");
		}
		if (w == 0)
		{
			System.out.print("Sun.");
		}
	}
}

