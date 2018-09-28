package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n;
		int p = 0;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n / 2;i++)
		{
		  p = a[i];
		  a[i] = a[n - 1 - i];
		  a[n - 1 - i] = p;
		  p = 0;
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

