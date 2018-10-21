package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] a = new int[n];
	int[] b = new int[n];
	for (int i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (int j = 0;j < n;j++)
	{
		b[j] = a[n - j - 1];
	}
	System.out.print(b[0]);
	for (int k = 1;k < n;k++)
	{
		System.out.print(" ");
		System.out.print(b[k]);
	}
		return 0;
	}
}

