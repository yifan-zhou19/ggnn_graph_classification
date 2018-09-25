package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i1 = 0;i1 < n;i1++)
		{
			a[i1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int j = 0;
		for (int i1 = 0;i1 < n;i1++)
		{
			j = i1 + 1;
			for (int i2 = i1 + 1;i2 < n;i2++)
			{
				if (a[i2] != a[i1])
				{
					a[j] = a[i2];
					j++;
				}
			}
			n = j;
		}
		for (int i1 = 0;i1 < n;i1++)
		{
		System.out.print(a[i1]);
		if (i1 != n - 1)
		{
			System.out.print(" ");
		}
		}
		return 0;
	}
}

