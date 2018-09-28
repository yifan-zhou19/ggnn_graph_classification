package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1000]);
		int m;
		int i;
		int j;
		int[] a = new int[1000];
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 2;
		if (m != 0)
		{
		for (i = 1;i < 1000;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j <= 1000;j++)
			{
				a[j] = a[j] * 2;
			}
			for (j = 0;j < 1000;j++)
			{
				if (a[j] > 9)
				{
					a[j] = a[j] % 10;
					a[j + 1]++;
				}
			}
		}
		i = 999;
		while (a[i] == 0)
		{
			i--;
		}
		for (k = i;k >= 0;k--)
		{
			System.out.print(a[k]);
		}
		System.out.print("\n");
		}
		else
		{
			System.out.print("1");
			System.out.print("\n");
		}
		return 0;
	}
}

