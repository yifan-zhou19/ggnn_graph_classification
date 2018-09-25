package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static void count(int m,int j)
	{
		int i;
		if (m == 1)
		{
			num++;
		}
		for (i = j;i <= m;i++)
		{
			if (m % i == 0)
			{
				count(m / i, i);
			}
			else
			{
				continue;
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = 0;
			count(m, 2);
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}

}

