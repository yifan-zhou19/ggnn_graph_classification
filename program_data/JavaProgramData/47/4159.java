package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int x;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n / 2;i++)
		{
			x = a[i];
			a[i] = a[n - i + 1];
			a[n - i + 1] = x;
		}
		for (i = 1;i <= n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n]);
		return 0;
	}

}

