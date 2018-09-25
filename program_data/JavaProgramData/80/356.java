package <missing>;

public class GlobalMembers
{
	public static int judge(int x)
	{
		if (x % 400 == 0 || (x % 4 == 0 && x % 100 != 0))
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		int n = 0;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = y1 + 1;i < y2;i++)
		{
			if (judge(i) != 0)
			{
				n++;
			}
		}
		if (y1 == y2 && m1 == m2 && d1 == d2)
		{
			sum = 0;
		}
		else if (y1 == y2 && m1 == m2)
		{
			sum = d2 - d1;
		}
		else if (y1 == y2)
		{
			for (int i = m1 + 1;i < m2;i++)
			{
				sum = sum + a[i];
			}
			sum = sum + a[m1] - d1 + d2;
			if (judge(y1) != 0 && (m1 <= 2) && (m2>2))
			{
				sum++;
			}
		}
		else if (y1 != y2)
		{
			for (int i = m1 + 1;i <= 12;i++)
			{
				sum = sum + a[i];
			}
			for (int i = 1;i < m2;i++)
			{
				sum = sum + a[i];
			}
			sum = sum + a[m1] - d1 + d2;
			if (judge(y1) != 0 && m1 <= 2)
			{
				sum++;
			}
			if (judge(y2) != 0 && m2 > 2)
			{
				sum++;
			}
			sum = sum + 365 * (y2 - y1 - 1) + n;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

