package <missing>;

public class GlobalMembers
{
	//*************************
	//??? 2.????????
	//??  ??? 1200062705
	//??    2012-11-3
	//*************************
	public static int Main()
	{
		int[] a = new int[100001];
		int n;
		int i;
		int j;
		int k;
		int number;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = number;
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1; j <= n; j++)
		{
			if (a[j] == k)
			{
				for (; j <= n; j++)
				{
					a[j] = a[j + 1];
				}
				j = 0;
				n = n - 1;
			}
		}
		for (i = 1; i < n; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n]);
	}

}

