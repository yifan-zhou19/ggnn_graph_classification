package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int[] a = new int[3];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n % 3 == 0)
	{
		a[m++] = 3;
	}
	if (n % 5 == 0)
	{
		a[m++] = 5;
	}
	if (n % 7 == 0)
	{
		a[m++] = 7;
	}
	if (m == 0)
	{
		System.out.print("n");
	}
	else
	{
	int i;
	for (i = 0;i < m - 1;i++)
	{
		System.out.print(a[i]);
		System.out.print(' ');
	}
	System.out.print(a[m - 1]);
	}
	return 0;
	}
}

