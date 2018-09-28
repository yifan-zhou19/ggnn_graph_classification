package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1010];

	public static void f(int n)
	{
		int i;
		int u = 1000;
		int temp = 0;
		while (a[u] == 0)
		{
			u--;
		}
		if (n == 0)
		{
			for (i = u; i >= 1; i--)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
			return;
		}
		for (i = 1; i <= u + 1; i++)
		{
			a[i] = a[i] * 2 + temp;
			temp = 0;
			if (a[i] >= 10)
			{
				a[i] = a[i] - 10;
				temp = 1;
			}
		}
		f(n - 1);
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = 1;
		f(n);
		return 0;
	}
}

