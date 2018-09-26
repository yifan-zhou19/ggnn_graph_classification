package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int t = 0;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - m ; i < n ; i++)
		{
				t = a[i];
				System.out.print(t);
				System.out.print(" ");
		}
		for (i = 0 ; i < n - m - 1 ; i++)
		{
				t = a[i];
				System.out.print(t);
				System.out.print(" ");
		}
			System.out.print(a[n - m - 1]);
			System.out.print("\n");
	}

}

