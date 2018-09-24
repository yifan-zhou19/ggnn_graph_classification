package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		1 < n < 100;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= n - 2;i++)
		{
			b[i] = a[n - i - 1];
			System.out.print(b[i]);
			System.out.print(" ");
		}
		   b[n - 1] = a[0];
		   System.out.print(b[n - 1]);
			return 0;
	}

}

