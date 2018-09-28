package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int i;
		int[] a = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			a[0] += (n - 1);
			for (i = 1;i <= n;i++)
			{
				if (a[i - 1] % (n - 1) != 0)
				{
					break;
				}
				else
				{
				a[i] = a[i - 1] * n / (n - 1) + k;
				}

			}
		} while ((i - 1) < n);
		System.out.print(a[n]);
		return 0;
	}

}

