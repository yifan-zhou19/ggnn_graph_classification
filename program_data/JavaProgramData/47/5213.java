package <missing>;

public class GlobalMembers
{
	/*???????????????*/

	public static int Main()
	{
		int n;
		int m;
		int i;
		int t;
		int j;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;n - 1 - i > i;i++) //???????????
		{
			t = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = t;
		}
		for (i = 0;i <= n - 2;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[n - 1]);
		System.out.print("\n");
		return 0;
	}
}

