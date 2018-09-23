package <missing>;

public class GlobalMembers
{
	// ??-??.cpp : ??????????????
	//2012.10.29




	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[15];
		int x = 0;
		int i;
		int y = 0;
		while (y != 1)
		{
		for (m = 0;;m++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n != 0 && n != -1)
			{
				a[m] = n;
				continue;
			}
			if (n == 0)
			{
				break;
			}
			if (n == -1)
			{
				y = 1;
				break;
			}
		}
		if (y == 1)
		{
			break;
		}
		for (m = 0;m <= 15;m++)
		{
			for (i = 0;i <= 15;i++)
			{
				if (a[m] * 2 == a[i] && a[m] != 0)
				{
					x = x + 1;
				}
			}
		}
		for (m = 0;m <= 15;m++)
		{
			a[m] = 0;
		}
		System.out.print(x);
		System.out.print("\n");
		x = 0;
		}
		return 0;
	}

}

