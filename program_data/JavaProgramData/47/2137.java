package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= n - 1;i++)
		{
		b[i] = a[n - 1 - i];
		}
		for (i = 0;i <= n - 2;i++)
		{
			System.out.print(b[i]);
			System.out.print(" ");
		}
		System.out.print(b[n - 1]);
		return 0;
	}
}

