package <missing>;

public class GlobalMembers
{
	/*??5 ??
	  ?? ????
	  ?? ??? ?? 1300012989*/
	public static int Main()
	{
		int[] a = new int[201];
		int n;
		int m;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n - m;i++) //??m???n?m?
		{
			a[n + i] = a[i];
		}
		for (i = 1;i <= m;i++) //??m????m?
		{
			a[i] = a[n - m + i];
		}
		for (i = 1;i <= n - m;i++)
		{
			a[m + i] = a[n + i];
		}
		for (i = 1;i <= n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[n]);
		System.out.print("\n");
		return 0;
	}



}

