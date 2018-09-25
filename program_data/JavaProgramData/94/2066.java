package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int k = 0;
		int j = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] a = new int[n];
	for (i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] % 2 != 0)
		{
	a[k++] = a[i];
		}
	}
	for (i = 0;i < k;i++)
	{
		for (j = i;j < k;j++)
		{
		if (a[i] > a[j])
		{
		n = a[i];
	a[i] = a[j];
	a[j] = n;
		}
		}
	}
	for (i = 0;i < k;i++)
	{
		System.out.print(a[i]);
	if (i != k - 1)
	{
		System.out.print(",");
	}
	}
	return 0;
	}
}

