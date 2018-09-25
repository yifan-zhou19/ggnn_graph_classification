package <missing>;

public class GlobalMembers
{
	/*
	 *????1062 ???
	 *?????
	 *??: 2010-11-21
	 */

	public static int i;
	public static int j;
	public static int x;
	public static int y;
	public static int f(int n,int x)
	{
		if (n == 1)
		{
			return x;
		}
		else
		{
			return (f(n - 1, x) - f(n - 1, x) % 2) / 2; //?????????
		}
	}
	public static int Main()
	{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < 15;i++)
		{
			for (j = 1;j < 15;j++)
			{
			if (f(i, x) == f(j, y))
			{ //?????????????????????
				System.out.print(f(i, x));
				i = 15;
				j = 15; //????
			}
			}
		}
		return 0;
	}
}

