package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int i;
		int k;
		int n;
		int t;
		int m;
		int b = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1;t <= 100;t++)
		{
			for (i = 0;i <= n - 1;i++)
			{
				if (a[i] == k)
				{
					b++;
					for (m = i;m <= n - 1;m++)
					{
						a[m] = a[m + 1];
					}
				}
			}
		}
		System.out.print(a[0]);
		for (i = 1;i <= n - b - 1;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}
}

