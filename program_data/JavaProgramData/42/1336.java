package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[100001];
	public static int k;
	public static int Main()
	{
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1; j <= n; ++j)
		{
			a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		for (j = 1; j <= n; ++j) //?i?????????k????????a[j]???i?????k??a[j]?????i?
		{
			if (a[j] == k)
			{
				++i;
			}
			else
			{
				a[j - i] = a[j];
			}
		}
		for (j = n - i, i = 1; i < j; ++i) //??
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[i]);
		System.out.print("\n");
		return 0;
	}

}

