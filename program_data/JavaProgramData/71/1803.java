package <missing>;

public class GlobalMembers
{
	public static int[] MM = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static void YY(int x)
	{
		if (x % 400 == 0 || (x % 4 == 0 && x % 100 != 0))
		{
			MM[2] = 29;
			return;
		}
		MM[2] = 28;
	}

	public static int Main()
	{
		int n;
		int yy;
		int m1;
		int m2;
		int i;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			yy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = 0;
			YY(yy);
			if (m1 > m2)
			{
				m1 = m1 ^ m2;
				m2 = m1 ^ m2;
				m1 = m1 ^ m2;
			}
			for (i = m1;i < m2;i++)
			{
				s += MM[i];
			}
			if (s % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

