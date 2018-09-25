package <missing>;

public class GlobalMembers
{
	public static int f(int m, int j)
	{
		int num = 1;
		for (int i = j;i <= Math.sqrt(m);i++)
		{
			if (m % i == 0)
			{
				num += f(m / i, i);
			}
		}
		return num;
	}
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(m, 2));
			System.out.print("\n");
		}
		return 0;
	}

}

