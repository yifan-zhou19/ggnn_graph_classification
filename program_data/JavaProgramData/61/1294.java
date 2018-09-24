package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];

	public static int f(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		a[n] = f(n - 1) + f(n - 2);
		return a[n];
	}

	public static int Main()
	{
		a[1] = a[2] = 1;
		int n;
		int i;
		int maxnumber = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[20];
		for (i = 0; i < n; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b[i] > maxnumber)
			{
				maxnumber = b[i];
			}
		}
		int x = f(maxnumber);
		for (i = 0; i < n; i++)
		{
			System.out.print(a[b[i]]);
			System.out.print("\n");
		}
		return 0;
	}
}

