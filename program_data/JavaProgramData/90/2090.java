package <missing>;

public class GlobalMembers
{
	public static int devide(int m, int n)
	{
		return enb(m, n) + unb(m, n);
	}
	public static int enb(int m, int n)
	{
		if (n == 2)
		{
			return 1;
		}
		else
		{
			return devide(m, n - 1);
		}
	}
	public static int unb(int m, int n)
	{
		if (m < n)
		{
			return 0;
		}
		else
		{
			return devide(m - n, n);
		}
	}
	public static int Main()
	{
		int t;
		int i;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n != 1)
			{
				System.out.print(devide(m, n));
				System.out.print("\n");
			}
			else
			{
				System.out.print("1");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

