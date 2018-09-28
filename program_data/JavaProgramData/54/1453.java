package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000];
		a[n] = k;
		while (i > 1)
		{
			a[n] = a[n] + n;
			for (i = n;i > 1;i--)
			{
				if (a[i] % (n - 1) != 0)
				{
					break;
				}
				else
				{
					a[i - 1] = a[i] * n / (n - 1) + k;
				}
			}
		}
		System.out.print(a[1]);
		return 0;
	}
}

