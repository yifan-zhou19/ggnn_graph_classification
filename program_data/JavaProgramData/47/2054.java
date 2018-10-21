package <missing>;

public class GlobalMembers
{
	/*??? 1200012866
	2012.9.28
	????*/
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int r;
		float n2;
		if (n % 2 == 0)
		{
			n2 = n / 2;
		}
		else
		{
			n2 = (n - 1) / 2;
		}
		for (int j = 0;j < n;j++)
		{
			a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n2;i++)
		{
			r = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = r;
		}
		for (int j = 0;j < n - 1;j++)
		{
			System.out.print(a[j]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);

	return 0;
	}
}

