package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int[] b = new int[20000];
		int n;
		int i;
		int j;
		int t;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0;m <= n - 1;m++)
		{
			a[m] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
				b[i] = 1;
				}
			}
		}
		System.out.print(a[0]);
		for (t = 1;t <= n - 1;t++)
		{
			if (b[t] == 0)
			{
			System.out.print(" ");
			System.out.print(a[t]);
			}

		}
		return 0;
	}

}

