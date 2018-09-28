package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[5];
	int j;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i <= 4;i++)
	{
	if (n == 0)
	{
	break;
	}
	a[i] = n % 10;
	n = (n - a[i]) / 10;
	}
	for (j = 0;j <= i - 1;j++)
	{
	n = 10 * n + a[j];
	}
	System.out.print(n);
	System.out.print("\n");
	return 0;
	}
}

