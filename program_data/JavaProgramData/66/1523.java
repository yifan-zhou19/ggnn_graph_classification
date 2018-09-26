package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j;
		int k;
		int m;
		int n = 0;
		int a;
		int b;
		int c;
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

		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
		{
			m = (a - 1 + a / 4 - a / 100 + a / 400) % 7;
			for (i = 1;i < b;i++)
			{
				n += day[i];
			}
			n = n + c;
			if (b >= 3)
			{
				m = m + n;
			}
			else
			{
				m = m + n - 1;
			}
			if (m % 7 == 0)
			{
				System.out.print("Sun.");
			}
			if (m % 7 == 1)
			{
				System.out.print("Mon.");
			}
			if (m % 7 == 2)
			{
				System.out.print("Tue.");
			}
			if (m % 7 == 3)
			{
				System.out.print("Wed.");
			}
			if (m % 7 == 4)
			{
				System.out.print("Thu.");
			}
			if (m % 7 == 5)
			{
				System.out.print("Fri.");
			}
			if (m % 7 == 6)
			{
				System.out.print("Sat.");
			}
		}
		else
		{
			m = (a + a / 4 - a / 100 + a / 400) % 7;
			for (i = 1;i < b;i++)
			{
				n += day[i];
			}
			n = n + c;
			m = m + n - 1;
			if (m % 7 == 0)
			{
				System.out.print("Sun.");
			}
			if (m % 7 == 1)
			{
				System.out.print("Mon.");
			}
			if (m % 7 == 2)
			{
				System.out.print("Tue.");
			}
			if (m % 7 == 3)
			{
				System.out.print("Wed.");
			}
			if (m % 7 == 4)
			{
				System.out.print("Thu.");
			}
			if (m % 7 == 5)
			{
				System.out.print("Fri.");
			}
			if (m % 7 == 6)
			{
				System.out.print("Sat.");
			}
		}
		return 0;
	}
}

