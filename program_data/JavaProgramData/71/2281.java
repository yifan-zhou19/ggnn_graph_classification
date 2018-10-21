package <missing>;

public class GlobalMembers
{
	public static int f(int y, int m1, int m2)
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		int i;
		for (i = m1;i <= m2 - 1;i++)
		{
			sum = sum + a[i];
		}

			if (m1 <= 2 && ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)))
			{
				sum = sum + 1;
			}

			if (sum % 7 == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}


	}

	public static void Main()
	{
		int n;
		int y;
		int m1;
		int m2;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 > m2)
			{
				m = m1;
				m1 = m2;
				m2 = m;
			}
			if (f(y, m1, m2) != 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}
}

