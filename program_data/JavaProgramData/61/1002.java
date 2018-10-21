package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int n;
		int c;
		int b;

	for (i = 2;i <= 20;i++)
	{
		a[i] = a[i - 1] + a[i - 2];
	}
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(a[c - 1]);
		System.out.print('\n');
	}

	return 0;
	}
}

