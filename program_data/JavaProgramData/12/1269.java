package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int b;
		int j;
		int k;
		int m;
		a[1] = 1;
		while (a[1] != -1)
		{
			i = 1;
			m = 0;
			while ((b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				a[i] = b;
				if (a[i] == 0 || a[i] == -1)
				{
				break;
				}
				i = i + 1;
			}
			for (j = 1;j <= i - 1;j++)
			{
				for (k = 1;k <= i - 1;k++)
				{
					if (a[j] == 2 * a[k])
					{
						m++;
					}
				}
			}
			if (a[i] != -1)
			{
			System.out.print(m);
			System.out.print("\n");
			}
		}
		return 0;
	}

}

