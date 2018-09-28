package <missing>;

public class GlobalMembers
{
	public static int Main()


	{

		int i;
		int n;
		int j;
		int t;
		int[] a = new int[100];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i <= n - 1;i++)
		{

			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = 0;i <= (n - 1) / 2;i++)

		{

			t = a[i];

			a[i] = a[n - i - 1];

			a[n - i - 1] = t;

		}

		for (j = 0;j <= n - 2;j++)
		{

			System.out.print(a[j]);
			System.out.print(" ");
		}

		System.out.print(a[n - 1]);

	return 0;

	}
}

