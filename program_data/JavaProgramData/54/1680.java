package <missing>;

public class GlobalMembers
{
	/*************************
	??cpp1
	?????
	???
	2013/12/4
	**************************/
	public static int m;
	public static int n;
	public static int k;
	public static int f(int x, int y)
	{
		if (y == 1)
		{
			if (x >= n + k && (x - k) % n == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		if ((x - k) % n != 0)
		{
			return 0;
		}
		x = x - k - (x - k) / n;
		return f(x, y - 1);
	}
	public static int Main()
	{

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = 1;
		while (true)
		{
			if (f(m, n) != 0)
			{
				break;
			}
			m++;
		}
		System.out.print(m);
		return 0;
	}



}

