package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int b;
		int s = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 1;i <= n;i++)
		{
		a[i - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int p = 1;p <= n;p++)
		{
		b = k - a[p - 1];
		for (int q = 1;q <= n;q++)
		{
		if (a[q - 1] == b && a[p - 1] != b)
		{
		s++;
		}
		}
		}
		if (s == 1)
		{
		System.out.print("no");
		}
		if (s != 1)
		{
		System.out.print("yes");
		}
		return 0;
	}
}

