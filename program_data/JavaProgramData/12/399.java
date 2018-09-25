package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i;
		int j;
		int n;
		int k;
		while (true)
		{
		n = 0;
		a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a[1] != -1)
		{
		for (i = 2;a[i - 1] != 0;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1;j < i - 1;j++)
		{
			for (k = 1;k < i - 1;k++)
			{
				if (a[k] == 2 * a[j])
				{
					n = n + 1;
				}
			}
		}
		System.out.print(n);
		System.out.print("\n");
		}
		else
		{
			break;
		}
		}
		return 0;
	}

}

