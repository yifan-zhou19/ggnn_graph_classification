package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int i;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		while (m > 0)
		{
		b = a[n - 1];
		for (i = n - 1;i > 0;i--)
		{
			a[i] = (a + i - 1);
		}
		a[0] = b;
		m--;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print((a + i));
			System.out.print(" ");
		}
		System.out.print((a + n - 1));

	}
}

