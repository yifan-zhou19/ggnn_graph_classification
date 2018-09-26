package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m1;
		int m2;
		int p;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[1] = 28;
			s = 0;
			if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
			{
				a[1] = 29;
			}
			if (m2 < m1)
			{
				p = m1;
				m1 = m2;
				m2 = p;
			}
			for (int j = m1;j < m2;j++)
			{
				s = s + a[j - 1];
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

