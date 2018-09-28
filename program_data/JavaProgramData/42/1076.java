package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
	int i;
	int j;
	int[] a = new int[100000];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < 100000;i++)
	{
		a[100000] = 0;
	}
	for (i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		if (a[i] == k)
		{
		for (j = i;j < n - 1;j++)
		{
		a[j] = a[j + 1];
		}
	i = i - 1;
	n = n - 1;
		}
	}
	for (i = 0;i < n - 1;i++)
	{
		System.out.print(a[i]);
		System.out.print(" ");
	}
	System.out.print(a[n - 1]);
	return 0;
	}

}

