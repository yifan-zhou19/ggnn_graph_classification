package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000]; //?????1000???a
		int i; //????????i???????i?j? ?????q?
		int j = 1;
		int p;
		int q;
		int n; //????????n?????k??????m
		int k;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //????
		{
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a[i] = m; //?m???a[i]
		}
		while (j < n) //????????
		{
						p = j + 1;
						while (p <= n)
						{
										   q = a[j] + a[p];
										   if (q == k)
										   {
											   break; //????k?????
										   }
										   else
										   {
											   p = p + 1;
										   }
						}
						if (p <= n)
						{
							break;
						}
						else
						{
							j = j + 1;
						}
		}
		if (j == n && p == n + 1) //??????????
		{
		System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
		return 0;
	}


}

