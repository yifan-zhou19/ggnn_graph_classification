package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			b[i] = a[n - i - 1]; //??
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(' ');
		}
		System.out.print(b[n - 1]);
		return 0;
	}

}

