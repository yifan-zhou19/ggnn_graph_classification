package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[501];
		int number;
		int k = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (number % 2 == 1)
			{
				a[k] = number;
				k++;
			}
		}
		for (int m = 1; m <= k - 2; m++)
		{
			int p = m;
			for (int l = m + 1; l <= k - 1; l++)
			{
				if (a[p] > a[l])
				{
				int t = a[l];
				a[l] = a[p];
				a[p] = t;
				}
			}

		}
		for (int n = 1; n <= k - 1; n++)
		{
			if (n == 1)
			{
				System.out.print(a[n]);
			}
			else
			{
				System.out.print(",");
				System.out.print(a[n]);
			}
		}
		return 0;
	}



}

