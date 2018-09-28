package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //j???n???????
		int j;
		int k;
		int l;
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = i;
		int[] a = new int[n + 1]; //a[i]???i???????
		for (j = 1,a[1] = 0;a[1] == 0;j++)
		{
			a[n] = j * n + k;
			for (l = n - 1;l > 0;l--)
			{
				if (a[l + 1] % (n - 1) == 0)
				{
					a[l] = a[l + 1] / (n - 1) * n + k;
				}
				else
				{
					break;
				}
			}
		}
		System.out.print(a[1]);
		return 0;
	}
}

