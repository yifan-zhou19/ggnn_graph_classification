package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k;
		int sum;
		while (n != 0)
		{
			n--;
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1; i <= k; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (a[k] + 3 * k <= 60)
			{
				sum = 60 - 3 * k;
			}
			if (a[k] + 3 * k > 60)
			{
				for (j = 1; j <= k; j++)
				{
					if ((a[j] + 3 * j <= 60) && (a[j + 1] + 3 * (j + 1) > 60))
					{
					if ((60 - 3 * j) > a[j + 1])
					{
						sum = a[j + 1];
					}
					if ((60 - 3 * j) <= a[j + 1])
					{
						sum = 60 - 3 * j;
					}
					}
				}
			}
				System.out.print(sum);
				System.out.print("\n");
		}
		return 0;
	}

}

