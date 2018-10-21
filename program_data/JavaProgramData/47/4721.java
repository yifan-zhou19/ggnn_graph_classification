package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100001];
	public static void swap(int n,int m)
	{
		int t = a[n];
		a[n] = a[m];
		a[m] = t;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1,j = n;i <= j;i++,j--)
		{
		swap(i, j);
		}
		for (i = 1;i < n;i++)
		{
		System.out.print(a[i]);
		System.out.print(' ');
		}
		System.out.print(a[n]);
		return 0;
	}

}

