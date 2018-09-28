package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000000];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int as = 0;
		int b = 0;
		int num = 0;
		for (int i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				as = b;
				b = i;
				num = num + 1;
				if (num != 1 && (b - as) != 1)
				{
					for (int p = as + 1;p < b;p++)
					{
					  a[p + 1 - num] = a[p];
					}
				}
			}
		}
		if (b != (n - 1))
		{
			for (int i = b + 1;i < n;i++)
			{
			a[i - num] = a[i];
			}
		}
		System.out.print(a[0]);
		for (int i = 1;i < n - num;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}

}

