package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int[] b = new int[101];
		int n;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - m + 1;i <= n;i++) //???????
		{
			b[i - n + m] = a[i];
		}
		for (i = n - m;i >= 1;i--) //??????
		{
			a[m + i] = a[i];
		}
		for (i = 1;i <= m;i++) //???m???
		{
			a[i] = b[i];
		}
		for (i = 1;i < n;i++) //????
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n]);
		return 0;
	}

}

