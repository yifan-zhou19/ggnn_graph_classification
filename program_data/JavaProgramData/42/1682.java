package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100000];
	public static int n;
	public static void del_a(int x)
	{
		for (int i = x;i < n - 1;i++)
		{
			a[i] = a[i + 1];
		}
		a[n - 1] = 0;
		n = n - 1;

	}
	public static int Main()
	{
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
	a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	}
	int t;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
	if (a[i] == t)
	{
	del_a(i);
	i = i - 1;
	}
	}
	for (int i = 0;i < n - 1;i++)
	{
	System.out.print(a[i]);
	System.out.print(" ");
	}
	System.out.print(a[n - 1]);
	return 0;
	}
}

