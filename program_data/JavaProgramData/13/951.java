package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= n - m;i++)
		{
			for (j = i + 1;j <= n - m;j++)
			{
				if (a[j] == a[i])
				{
					m = m + 1; //??????
					for (k = j;k <= n - m;k++) //??????????????????
					{
						a[k] = a[k + 1];
					}
						 j = j - 1;
				}
			}
		}
		for (i = 0;i < n - m - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - m - 1]);
		System.out.print("\n");
		return 0;
	}
}

