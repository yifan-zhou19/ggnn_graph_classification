package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int i;
		int j;
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] == k)
			{
				for (j = i;j <= n - 2;j++)
				{
					a[j] = a[j + 1];
				}
				n--;
				i--;
			}
		}
		System.out.print(a[0]);
		for (i = 1;i <= n - 1;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;

	}

}

