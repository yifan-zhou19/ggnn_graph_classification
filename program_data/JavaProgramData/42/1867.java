package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int i;
		int j;
		int l;
		int u;
		int num;
		int k = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j < n; j++)
		{
			if (a[j] == num)
			{
				k++;
				for (l = j; l < n - k; l++)
				{
					a[l] = a[l + 1];
				}
				j = j - 1;
				a[n - k] = num - 1;

			}

		}

		for (u = 0; u < n - k - 1; u++)
		{
			System.out.print(a[u]);
			System.out.print(" ");
		}
		System.out.print(a[n - k - 1]);
			return 0;
	}

}

