package <missing>;

public class GlobalMembers
{
	// 1134 ?? 1000062708
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] a = new int[16];
		int m;
		for (i = 0;a[0] != -1;i++)
		{
			int s = 0;
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1)
			{
				break;
			}
			for (j = 1;j < 16;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[j] == 0)
			{
				break;
			}
			}
			for (k = 0;a[k] != 0;k++)
			{
				m = 2 * a[k];
				for (j = 0;a[j] != 0;j++)
				{
					if (a[j] == m)
					{
							s++;
					}
				}
			}
		System.out.print(s);
		System.out.print("\n");
		}
		return 0;
	}

}

