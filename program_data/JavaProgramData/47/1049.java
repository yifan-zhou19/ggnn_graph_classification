package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000];
		int[] b = new int[1000];
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - 1;i >= 1;i--)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[0]);
		System.out.print("\n");
		return (0);
	}

}

