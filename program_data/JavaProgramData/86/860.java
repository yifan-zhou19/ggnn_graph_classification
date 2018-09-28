package <missing>;

public class GlobalMembers
{
	/*
	 * file    homework 9_6
	 * author  ??
	 * date    2010-11-24
	 * description
	           ?????????????????
	*/



	public static int Main()
	{
		int n;
		int m;
		int s;
		int i;
		int[] a = new int[15];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n -- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
				continue;
			}
			for (i = 0; i < m; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < m; i++)
			{
				if (a[i] + i * 3 >= 60)
				{
					s = 60 - i * 3;
					break;
				}
				if (a[i] + i * 3 + 3 >= 60)
				{
					s = a[i];
					break;
				}
			}
			if (i == m)
			{
				s = 60 - m * 3;
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}

}

