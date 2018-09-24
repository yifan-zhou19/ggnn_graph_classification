package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i = i + 1)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b[n - 1 - i] = a[i];
	}
	for (j = 0;j < n;j = j + 1)
	{
		if (j == 0)
		{
			System.out.print(b[j]);
		}
	else
	{
		System.out.print(' ');
		System.out.print(b[j]);
	}
	}

	return 0;
	}
}

