package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i;
		int product = 1;
		for (i = 2;i * i <= n;i++)
		{
			if (n % i == 0)
			{
				product = 0;
			}
		}
		return (product);
	}
	public static int Main()
	{
		int N;
		int j;
		int check;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 3;j <= N / 2;j++)
		{
			check = prime(j) * prime(N - j);
			if (check > 0)
			{
				System.out.print(j);
				System.out.print(' ');
				System.out.print(N - j);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

