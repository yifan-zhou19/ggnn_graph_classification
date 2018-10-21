package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[30];
	public static int fibo(int n)
	{
		if (a[n] != 0)
		{
			return a[n];
		}
		return fibo(n - 1) + fibo(n - 2);
	}
	public static int Main()
	{
		a[1] = 1;
		a[2] = 1;

		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int k;
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fibo(k));
			System.out.print("\n");
		}
		return 0;
	}
}

