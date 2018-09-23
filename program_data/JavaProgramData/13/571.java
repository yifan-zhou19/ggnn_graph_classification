package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int m = 0;
	int[] a = new int[20001];
	int[] b = new int[20001];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
	a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= i - 1;j++)
	{
	if (a[i] == a[j])
	{
	break;
	}
	}
	if (i == j)
	{
	m = m + 1;
	b[m] = a[i];
	}
	}
	for (i = 1;i <= m - 1;i++)
	{
	System.out.print(b[i]);
	System.out.print(" ");
	}
	System.out.print(b[m]);
	System.out.print("\n");
	return 0;
	}
}

