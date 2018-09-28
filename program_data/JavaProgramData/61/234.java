package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
	if (a == 1 || a == 2)
	{
	return 1;
	}
	else
	{
	return (f(a - 1) + f(a - 2));
	}
	}
	public static int Main()
	{
	int[] a = new int[100];
	int n;
	int i;
	int j;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n <= 100)
	{
	for (i = 0;i < n;i++)
	{
	a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i < n;i++)
	{
	if (a[i] >= 1 && a[i] <= 20)
	{
	System.out.print(f(a[i]));
	System.out.print("\n");
	}
	}
	}
	return 0;
	}
}

