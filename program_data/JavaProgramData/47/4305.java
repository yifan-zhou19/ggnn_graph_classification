package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int j;
		int i;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		if (n == 1)
		{
		System.out.print(a[0]);
		}
			else
			{
		System.out.print(a[n - 1]);
			for (i = n - 2;i >= 0;i--)
			{
		System.out.print(' ');
		System.out.print(a[i]);
			}
			}
			return 0;
	}
}

