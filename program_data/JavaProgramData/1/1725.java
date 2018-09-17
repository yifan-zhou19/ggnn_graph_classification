package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int n;
	public static int k;

	public static int work(int p,int n)
	{
		if (n == 1)
		{
			k++;
		}
		for (int i = p;i <= n;i++)
		{
			if (n % i == 0)
			{
				work(i, n / i);
			}
		}
	}
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m > 0)
		{
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 k = 0;
		 work(2, n);
						System.out.print(k);
						System.out.print("\n");
						m--;
		}
		return 0;
	}

}

