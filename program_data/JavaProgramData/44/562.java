package <missing>;

public class GlobalMembers
{
	public static void echo(int n)
	{
		System.out.print(n % 10);
		n = n / 10;
		if (n > 0)
		{
		echo(n);
		}

	}
	public static int Main()
	{
		int i;
		int[] a = new int[10];
		for (i = 0;i < 6;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			while (a[i] % 10 == 0)
			{
				a[i] = a[i] / 10;
			}
			if (a[i] >= 0)
			{
			echo(a[i]);
			}
			if (a[i] < 0)
			{
			System.out.print("-");
			echo(-a[i]);
			}
		System.out.print("\n");
		}

		return 0;
	}
}

