package <missing>;

public class GlobalMembers
{
	public static int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int suan(int h, int d)
	{
		int i;
		if (h == 1)
		{
			return d;
		}
		else
		{
			for (i = 1; i < h; i++)
			{
				d += m[i];
			}
			return d;
		}
	}
	public static int Main()
	{
		int a1;
		int a2;
		int b1;
		int b2;
		int c1;
		int c2;
		int sum = 0;
		a1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		if ((a2 % 4 == 0 && a2 % 100 != 0) || a2 % 400 == 0)
		{
		m[2] = 29;
		}
		sum += suan(b2, c2);
		m[2] = 28;
		if ((a1 % 4 == 0 && a1 % 100 != 0) || a1 % 400 == 0)
		{
		m[2] = 29;
		}
		sum -= suan(b1, c1);
		if (a1 == a2)
		{
			System.out.print(sum);
		}
		else
		{
			for (i = a1; i < a2; i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
				{
					sum += 366;
				}
				else
				{
					sum += 365;
				}
			}
			System.out.print(sum);
		}
		return 0;
	}
}

