package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m; //?? ?????????????????
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[2 * n]; //????
		for (i = 0;i < n;i++) //??????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = n - m;j < n;j++) //??m??????m???
		{
			a[j + m] = a[j];
		}
		for (k = 0;k < n - m;k++) //??n-m??????m+n?
		{
			a[k + m + n] = a[k];
		}
		for (j = n;j < 2 * n - 1;j++) //???2n-1?
		{
			System.out.print(a[j]);
			System.out.print(" ");
		}
		System.out.print(a[2 * n - 1]);
	return 0;
	}
}

