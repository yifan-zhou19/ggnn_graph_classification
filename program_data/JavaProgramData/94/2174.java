package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 == 1)
			{
				j++;
			}
			else
			{
				a[i] = 0;
			}
		}
		sort(a,a + n);
		for (i = n - j;i < n;i++)
		{
			if (i == n - j)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(",");
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

