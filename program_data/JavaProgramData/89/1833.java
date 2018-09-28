package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[k];
		int[] b = new int[k];
		for (m = 0;m < k;m++)
		{
			a[m] = 0;
			b[m] = 0;
		}
		while (true)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
				a[i] += 1;
				b[j] += 1;
			}
		}
		for (n = 0;n < k;n++)
		{
			if (a[n] == 0 && b[n] == k - 1)
			{
					System.out.print(n);
					System.out.print("\n");
					break;
			}
		}
		if (n == k)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

