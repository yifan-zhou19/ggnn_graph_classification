package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[120];
		int n;
		int i;
		a[0] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n -- != 0)
		{
			for (i = 0; i < 100; i++)
			{
				a[i] = a[i] * 2;
			}
			for (i = 0; i < 100; i++)
			{
				if (a[i] > 9)
				{
					a[i + 1] += 1;
					a[i] = a[i] % 10;
				}
			}
		}

		for (i = 100; i >= 0; i--)
		{
			if (a[i] != 0)
			{
				break;
			}
		}
		for (; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		return 0;
	}

}

