package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int m;
		int d;
		int i;
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] c = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int s = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 4 != 0 || (a % 100 == 0 && a % 400 != 0))
		{
			for (i = 1;i < m;i++)
			{
				s += b[i];
			}
		}
		else
		{
			for (i = 1;i < m;i++)
			{
				s += c[i];
			}
		}
		System.out.print(s + d);
		return 0;
	}
}

