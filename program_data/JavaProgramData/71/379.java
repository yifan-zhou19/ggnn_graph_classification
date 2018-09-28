package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int i;
		int j;
		int m1;
		int m2;
		int[] r = new int[13];
		int[] p = new int[13];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1;i < 13;i++)
		{
			p[i] = (p[i - 1] + a[i - 1]) % 7;
		}
		for (i = 1;i < 13;i++)
		{
			a[2] = 29;
			r[i] = (r[i - 1] + a[i - 1]) % 7;
		}
		for (i = 1;i <= n;i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0))
			{
				if (p[m1] == p[m2])
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
			else
			{
				if (r[m1] == r[m2])
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
		}
		return 0;
	}
}

