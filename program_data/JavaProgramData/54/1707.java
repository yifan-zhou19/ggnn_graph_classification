package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int Main()
	{
		int k;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int apple = new int(int a,int b,int c);
		for (i = 1;;i++)
		{
			if (apple(i, n, k) == 1)
			{
				System.out.print(i);
				break;
			}
		}
		return 0;
	}
	public static int apple(int a,int b,int c)
	{
		int f;
		f = (a - c) / n;
		if (b == 0)
		{
			return 1;
		}
		else if (f == 0)
		{
			return 0;
		}
		else if ((a - c) % n != 0)
		{
			return 0;
		}
		else
		{
			return apple(a - c - f, b - 1, c);
		}
	}
}

