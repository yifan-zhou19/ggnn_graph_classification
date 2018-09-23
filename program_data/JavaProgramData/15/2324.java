package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int tmp1;
		int tmp2;
		int m = 0;
		int l = 0;
		int i;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		tmp1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (tmp1 == 0)
		{
			m++;
			l++;
		}
		for (i = 1; i < n * n; i++)
		{
			tmp2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			l += (tmp2 == 0);
			m += (tmp2 == 0);
			if (tmp2 == 255 && tmp1 == 0)
			{
				break;
			}
			tmp1 = tmp2;
		}
		for (int j = i; j < n * n; j++)
		{
			tmp2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			l += (tmp2 == 0);
		}
		s = (m - 2) * (l - 2 * m) / 2;
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}
}

