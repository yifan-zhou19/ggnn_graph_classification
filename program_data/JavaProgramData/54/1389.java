package <missing>;

public class GlobalMembers
{
	public static int f(int i, int t)
	{
	 return (t == 1?i:(i % (n - 1)?-1:(f((i * n / (n - 1) + k), t - 1))));
	}

	public static int n;
	public static int k;

	public static int Main()
	{
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	 int m = 0;

	 for (int i = n + k;(m = f(i, n)) == -1;i += n)
	 {
	 }

	 System.out.print(m);

	 return 0;
	}
}

