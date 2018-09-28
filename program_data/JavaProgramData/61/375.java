package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[101];
	int i;
	int j;
	int k;
	a[1] = 1;
	a[2] = 1;
	for (i = 3;i <= 100;i++)
	{
	a[i] = a[i - 1] + a[i - 2];
	}
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (j = 1;j <= n;j++)
	{
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(a[k]);
	System.out.print("\n");
	}
	return 0;
	}
}

