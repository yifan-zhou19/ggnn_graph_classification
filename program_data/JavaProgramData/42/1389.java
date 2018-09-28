package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100002];
		int n;
		int k;
		int i;
		int m;
		int num = 0;
		int d = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		for (i = 0; i <= n - 1; i++)
		{
			if (a[i] == k) //?????????
			{
				num++;
				for (m = i; m <= n; m++)
				{
					if (a[m + d] == k)
					{
						num++;
						continue;
					}
					a[m - num + 1] = a[m + 1];
				}
				break;
			}

		}
		for (i = 0; i <= n - 2 - num; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1 - num]);
		System.out.print("\n");
		return 0;
	}
}

