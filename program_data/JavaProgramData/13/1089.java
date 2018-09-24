package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int n;
		int t = 0;
		int b;
		int p;
		int[] a = new int[20000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n - t;j++)
		{
				for (k = j + 1;k < n - t;)
				{
				if (a[k] == a[j])
				{
					for (p = k;p < n - t;p++)
					{
				   a[p] = a[p + 1];
					}
				   t++;
				}
				else
				{
					k++;
				}
				}
		}
		for (b = 0;b < n - 1 - t;b++)
		{
			System.out.print(a[b]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1 - t]);
		System.out.print("\n");
		return 0;
	}

}

