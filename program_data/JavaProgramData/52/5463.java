package <missing>;

public class GlobalMembers
{
	public static int Main()


	{

		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int[] a = new int[200];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < n;i++)
		{

		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (j = n - 1;j >= 0;j--)
		{

		  a[j + m] = a[j];
		}

		for (k = n;k <= n + m - 1;k++)
		{

			a[k - n] = a[k];
		}

			for (i = 0;i < n - 1;i++)
			{

				 System.out.print(a[i]);
				 System.out.print(" ");
			}

			System.out.print(a[n - 1]);

	return 0;

	}
}

