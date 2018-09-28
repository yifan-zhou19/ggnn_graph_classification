package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[500];
	int i;
	int j;
	int m = 0;
	int[] b = new int[500];
	int k;
	int sum = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

	for (j = 1;j <= 499;j = j + 2)
	{
		for (i = 1;i <= n;i++)
		{
		if (a[i] == j)
		{
			m++;
			b[m] = j;
		}
		}
	}
	for (k = 1;k < m;k++)
	{
	System.out.print(b[k]);
	System.out.print(",");
	}
	System.out.print(b[m]);
	return 0;

	}

}

