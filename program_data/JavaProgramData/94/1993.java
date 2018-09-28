package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; // x???????
		int x = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int k = -1;
		for (int i = 0 ; i < n ; i++) // ????????????
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x % 2 == 1)
			{
				k++;
				a[k] = x;
			}
		}
		int t = 0; // t ?????????
		for (int i = 0 ; i <= k ; i++) // ???????????????
		{
			for (int j = 0 ; j < k - i ; j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		System.out.print(a[0]);
		for (int i = 1 ; i <= k ; i++)
		{
			System.out.print(",");
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

