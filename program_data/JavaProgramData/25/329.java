package <missing>;

public class GlobalMembers
{
	/*??????????N(N<=100)???2?N?????
	????
	??????????N?
	????
	??2?N?????
	????
	5
	????
	32
	??
	?????
	*/
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int l = 1;
		int i;
		int j;
		a[1] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= l;j++)
			{
			a[j] = 2 * a[j];
			}
			for (j = 1;j < l;j++)
			{
				if (a[j] >= 10)
				{
					a[j + 1] = a[j + 1] + 1;
					a[j] = a[j] - 10;
				}
			}
			if (a[l] >= 10)
			{
				a[l] = a[l] - 10;
				a[l + 1] = 1;
				l++;
			}
		}
		for (i = l;i >= 1;i--)
		{
			System.out.print(a[i]);
		}
		return 0;
	}

}

