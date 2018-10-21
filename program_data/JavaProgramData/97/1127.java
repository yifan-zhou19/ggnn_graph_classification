package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = {0, 0, 0, 0, 0, 0};
	int[] b = {100, 50, 20, 10, 5, 1};
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i <= 5;i++)
	{
	while (n >= 0)
	{
	n = n - b[i];
	a[i]++;
	}
	n = n + b[i];
	a[i] = a[i] - 1;
	}
	for (i = 0;i <= 5;i++)
	{
	System.out.print(a[i]);
	System.out.print("\n");
	}
	return 0;
	}
}

