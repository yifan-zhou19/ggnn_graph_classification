package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int n;
	public static int prime(int a)
	{
		for (i = 2;i * i <= a;i++)
		{
			if (a % i == 0)
			{
				return (0);
			}
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 2;j <= n / 2;j++)
		{
			if (prime(j) * prime(n - j) != 0)
			{
				System.out.print(j);
				System.out.print(" ");
				System.out.print(n - j);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

