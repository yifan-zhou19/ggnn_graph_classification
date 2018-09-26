package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i <= n - 1 ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[n - i - 1] = a[i];
		}
		for (i = 0 ; i <= n - 2 ; i++)
		{
			System.out.print(b[i]);
			System.out.print(" ");
		}
		System.out.print(b[n - 1]);
		System.out.print("\n");
		return 0;
	}

}

