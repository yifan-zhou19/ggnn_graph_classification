package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[200];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 100;i < n + 100;i++)
		{
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - m + 100;i < n + 100;i++)
		{
			a[i - n] = a[i];
		}
		for (i = 100 - m;i < n + 100 - m - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n + 100 - m - 1]);
		System.out.print("\n");
		return 0;
	}



}

